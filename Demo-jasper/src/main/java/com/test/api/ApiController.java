package com.test.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.CalcList.CalcList;
import com.test.masterdata.model.JsonMappingForSI;
import com.test.masterdata.model.MasterdataModel;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@RestController
public class ApiController {
	
	@PostMapping("/testsi")
	public SIModelBase testSI(@Validated @RequestBody SIModelBase data) {
		return data; 
	}
	
	@PostMapping("/testmaster")
	public JsonMappingForSI testgetmasterdata(@Validated @RequestBody SIModelBase data) throws JsonMappingException, JsonProcessingException {
		String json = data.siModel.masterdata.SMH;
		System.out.println(json);
		
		ObjectMapper mapper = new ObjectMapper();
		
		MasterdataModel json2= mapper.readValue(json,MasterdataModel.class);
		System.out.println(json2);

		JsonMappingForSI json3= mapper.readValue(json2.JsonMappingForSI,JsonMappingForSI.class);
		System.out.println(json3);
			
		System.out.println("Master Generated!");
		return json3;
	}

	@PostMapping("/testcalc")
	public List<CalcList> testgetcalcTableJsonStringify(@Validated @RequestBody SIModelBase data) throws JsonMappingException, JsonProcessingException {
		String json = data.calcTableJsonStringify;
		ObjectMapper mapper = new ObjectMapper();
		
		String json3 = mapper.readTree(json).findValue("CalcList").toString();
		System.out.println(json3);
		
		List<CalcList> list = mapper.readerForListOf(CalcList.class).readValue(json3);
        System.out.println(list);
        
        System.out.println("Calc Generated!");
        
		return list;
	}
	
	@PostMapping("/getsi")
	public ResponseEntity<byte[]>  getSI(@Validated @RequestBody SIModelBase SIModelBase )throws JRException, IOException{
		
		Map<String, Object> parameter = new HashMap<String, Object>();
		
		String Calcjson = SIModelBase.calcTableJsonStringify;
//		String MasterLHDjson = SIModelBase.siModel.masterdata.LHD;
		ObjectMapper mapper = new ObjectMapper();	
		
		String Calcjson3 = mapper.readTree(Calcjson).findValue("CalcList").toString();
		
		List<CalcList> listCalc = mapper.readerForListOf(CalcList.class).readValue(Calcjson3);
		System.out.println(listCalc);
		
//		MasterdataModel MasterLHD = mapper.readValue(MasterLHDjson,MasterdataModel.class);
//		NHSExtraCarePlusModel listMasterLHD = mapper.readValue(MasterLHD.JsonMappingForSI,NHSExtraCarePlusModel.class);

//		var json = SIModelBase.siModel;
//		System.out.println(json);
		
		JRBeanCollectionDataSource SIModelBaseCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase));
		JRBeanCollectionDataSource siModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase.siModel));
		
		JRBeanCollectionDataSource benefittermModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase.siModel.benefitTerm));
		JRBeanCollectionDataSource premiumtermModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase.siModel.premiumTerm));
		JRBeanCollectionDataSource riderModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase.siModel.rider));
		JRBeanCollectionDataSource masterModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase.siModel.masterdata));
		
		JRBeanCollectionDataSource CalcModelCollectionDataSource = new JRBeanCollectionDataSource(listCalc);
//		JRBeanCollectionDataSource masterLHDModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(listMasterLHD));
		
		parameter.put("SIModelBaseDataSource", SIModelBaseCollectionDataSource);
		parameter.put("siModelDataSource", siModelCollectionDataSource);
		
		parameter.put("benefittermModelDataSource", benefittermModelCollectionDataSource);
		parameter.put("premiumtermModelDataSource", premiumtermModelCollectionDataSource);
		parameter.put("riderModelDataSource", riderModelCollectionDataSource);
		parameter.put("masterModelDataSource", masterModelCollectionDataSource);
		
		parameter.put("CalcModelDataSource", CalcModelCollectionDataSource);
//		parameter.put("masterLHDModelDataSource", masterLHDModelCollectionDataSource);
		
		JasperReport jasperDesign = JasperCompileManager
				.compileReport(new FileInputStream("src/main/resources/SI000000.jrxml"));
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperDesign, parameter, new JREmptyDataSource());
		
		byte data[] = JasperExportManager.exportReportToPdf(jasperPrint);
		System.err.println(data);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=demoSI.pdf");

		System.out.println("Report Generated!");
		
		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
	}
}
