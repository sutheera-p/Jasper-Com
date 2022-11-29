package com.test.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Benefitterm;

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
//	@Autowired
//	private DBRepository dbRepo;
//	
//	@GetMapping("/user")
//	public List<DbModel> getuser(){
//		//long id = 3594;
//		//DbModel singleDb = dbRepo.findAllById(id);
//		return dbRepo.findAll();
//	}
//	@PostMapping("/user")
//	public DbModel postuser(@Validated @RequestBody DbModel user) {
//		return dbRepo.save(user);
//	}
	
	@GetMapping("/getpoke")
	public static ResponseEntity<byte[]> downloadInvoice() throws JRException, IOException{
		
		Map<String, Object> parameter = new HashMap<String, Object>();
		
		JRBeanCollectionDataSource pokemonCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(

				new Poke(1, "Bulbasaur", "Grass"),
				new Poke(2, "Ivysaur", "Grass"),
				new Poke(3, "Charmander", "Grass")

		), false);
		
	
		JasperReport jasperDesign = JasperCompileManager
				.compileReport(new FileInputStream("src/main/resources/pokemon.jrxml"));
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperDesign, parameter, pokemonCollectionDataSource);
		
		byte data[] = JasperExportManager.exportReportToPdf(jasperPrint);
		System.err.println(data);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=pokemontest.pdf");

		System.out.println("Report Generated!");
		
		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
	}
	
	@PostMapping("/testsi")
	public SIModelBase testSI(@Validated @RequestBody SIModelBase data) {
		return data;
	}
	
	@PostMapping("/getsi")
	public ResponseEntity<byte[]>  getSI(@Validated @RequestBody SIModelBase SIModelBase )throws JRException, IOException{
		
		Map<String, Object> parameter = new HashMap<String, Object>();
		
		Benefitterm si = SIModelBase.siModel.benefitTerm;
		System.out.println(si);
		
		JRBeanCollectionDataSource SIModelBaseCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase));
		JRBeanCollectionDataSource siModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase.siModel));
		
		JRBeanCollectionDataSource benefittermModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase.siModel.benefitTerm));
		JRBeanCollectionDataSource premiumtermModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase.siModel.premiumTerm));
		JRBeanCollectionDataSource riderModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase.siModel.rider));
		JRBeanCollectionDataSource masterModelCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(SIModelBase.siModel.masterdata));
		
		
		parameter.put("SIModelBaseDataSource", SIModelBaseCollectionDataSource);
		parameter.put("siModelDataSource", siModelCollectionDataSource);
		
		parameter.put("benefittermModelDataSource", benefittermModelCollectionDataSource);
		parameter.put("premiumtermModelDataSource", premiumtermModelCollectionDataSource);
		parameter.put("riderModelDataSource", riderModelCollectionDataSource);
		parameter.put("masterModelDataSource", masterModelCollectionDataSource);
		
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