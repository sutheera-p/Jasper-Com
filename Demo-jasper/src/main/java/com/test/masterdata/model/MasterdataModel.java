package com.test.masterdata.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRawValue;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MasterdataModel {
	public String PlanCode;
	public String BaseCode;
	public String MagnumCode;
	public String DiscountUnit;
	public String MaxGradeCode;
	public String MinGradeCode;
	public String PlanAcptGen;
	public String PlanCommEn;
	public String PlanCommTh;
	public String PlanCoverFix;
	public String PlanCoverMax;
	public String PlanCoverMin;
	public long PlanCoverTerm;
	public String PlanCoverType;
	public String PlanDescEn;
	public String PlanDescTh;
	public String PlanEffDate;
	public String PlanExpDate;
	public long PlanInsMaxAge;
	public long PlanInsMinAge;
	public String PlanLimitAge;
	public String PlanMaxPrem;
	public long PlanMaxSa;
	public String PlanMinPrem;
	public String PlanMinPremiumTerm;
	public long PlanMinSa;
	public String PlanMonthlyRate;
	public String PlanNameEn;
	public String PlanNameTh;
	public String PlanOrdDisp;
	public String PlanPayMaxAge;
	public String PlanPayMinAge;
	public String PlanPremiumFix;
	public long PlanPremiumTerm;
	public String PlanPremiumType;
	public String PlanQuarterlyRate;
	public long PlanSafix;
	public String PlanSatype;
	public String PlanSemiannuallyRate;
	public String PlanShortNameEn;
	public String PlanShortNameTh;
	public String PlanStartSa;
	public String PlanSumStart;
	public String PremUnit;
	public String ProdCode;
	public String SelectType;
	public String SiModel;
	public String MinTopup;
	public long DefaultPaymentModeCode;
	public String AnnualPaymentMode;
	public String QuarterlyPaymentMode;
	public String MonthlyPaymentMode;
	public String SemiAnnualPaymentMode;
	public String SinglePaymentMode;
	public String PlanPaymentTerm;
	public String DescriptionInsuredAgeTh;
	public String DescriptionInsuredAgeEn;
	public String DescriptionCoverageTermTh;
	public String DescriptionCoverageTermEn;
	public String DescriptionPaymentTermTh;
	public String DescriptionPaymentTermEn;
	public String GuaranteedMaturityValue;
	public String GuaranteedMinimumReturnRatePerYear;
	public String ExtraPlanNameEn;
	public String ExtraPlanNameTh;
	public String ExtraPlanShortNameEn;
	public String ExtraPlanShortNameTh;
	public String IsForFNA;
	public String IsForSMP;
	public String IsForEAPP;
	public String IsForILP;
	public String PlanGroupCode;
	public String PlanCalCoverTermFlag;
	public String PlanCalPremiumTermFlag;
	public String IsAF;
	public String IsSaleTool;
	@JsonRawValue
	public String JsonMappingForSI;
	public String Channel;
	public String IsActive;
	

	
	public String getPlanCode() {
		return PlanCode;
	}
	public void setPlanCode(String planCode) {
		PlanCode = planCode;
	}
	public String getBaseCode() {
		return BaseCode;
	}
	public void setBaseCode(String baseCode) {
		BaseCode = baseCode;
	}
	public String getMagnumCode() {
		return MagnumCode;
	}
	public void setMagnumCode(String magnumCode) {
		MagnumCode = magnumCode;
	}
	public String getDiscountUnit() {
		return DiscountUnit;
	}
	public void setDiscountUnit(String discountUnit) {
		DiscountUnit = discountUnit;
	}
	public String getMaxGradeCode() {
		return MaxGradeCode;
	}
	public void setMaxGradeCode(String maxGradeCode) {
		MaxGradeCode = maxGradeCode;
	}
	public String getMinGradeCode() {
		return MinGradeCode;
	}
	public void setMinGradeCode(String minGradeCode) {
		MinGradeCode = minGradeCode;
	}
	public String getPlanAcptGen() {
		return PlanAcptGen;
	}
	public void setPlanAcptGen(String planAcptGen) {
		PlanAcptGen = planAcptGen;
	}
	public String getPlanCommEn() {
		return PlanCommEn;
	}
	public void setPlanCommEn(String planCommEn) {
		PlanCommEn = planCommEn;
	}
	public String getPlanCommTh() {
		return PlanCommTh;
	}
	public void setPlanCommTh(String planCommTh) {
		PlanCommTh = planCommTh;
	}
	public String getPlanCoverFix() {
		return PlanCoverFix;
	}
	public void setPlanCoverFix(String planCoverFix) {
		PlanCoverFix = planCoverFix;
	}
	public String getPlanCoverMax() {
		return PlanCoverMax;
	}
	public void setPlanCoverMax(String planCoverMax) {
		PlanCoverMax = planCoverMax;
	}
	public String getPlanCoverMin() {
		return PlanCoverMin;
	}
	public void setPlanCoverMin(String planCoverMin) {
		PlanCoverMin = planCoverMin;
	}
	public long getPlanCoverTerm() {
		return PlanCoverTerm;
	}
	public void setPlanCoverTerm(long planCoverTerm) {
		PlanCoverTerm = planCoverTerm;
	}
	public String getPlanCoverType() {
		return PlanCoverType;
	}
	public void setPlanCoverType(String planCoverType) {
		PlanCoverType = planCoverType;
	}
	public String getPlanDescEn() {
		return PlanDescEn;
	}
	public void setPlanDescEn(String planDescEn) {
		PlanDescEn = planDescEn;
	}
	public String getPlanDescTh() {
		return PlanDescTh;
	}
	public void setPlanDescTh(String planDescTh) {
		PlanDescTh = planDescTh;
	}
	public String getPlanEffDate() {
		return PlanEffDate;
	}
	public void setPlanEffDate(String planEffDate) {
		PlanEffDate = planEffDate;
	}
	public String getPlanExpDate() {
		return PlanExpDate;
	}
	public void setPlanExpDate(String planExpDate) {
		PlanExpDate = planExpDate;
	}
	public long getPlanInsMaxAge() {
		return PlanInsMaxAge;
	}
	public void setPlanInsMaxAge(long planInsMaxAge) {
		PlanInsMaxAge = planInsMaxAge;
	}
	public long getPlanInsMinAge() {
		return PlanInsMinAge;
	}
	public void setPlanInsMinAge(long planInsMinAge) {
		PlanInsMinAge = planInsMinAge;
	}
	public String getPlanLimitAge() {
		return PlanLimitAge;
	}
	public void setPlanLimitAge(String planLimitAge) {
		PlanLimitAge = planLimitAge;
	}
	public String getPlanMaxPrem() {
		return PlanMaxPrem;
	}
	public void setPlanMaxPrem(String planMaxPrem) {
		PlanMaxPrem = planMaxPrem;
	}
	public long getPlanMaxSa() {
		return PlanMaxSa;
	}
	public void setPlanMaxSa(long planMaxSa) {
		PlanMaxSa = planMaxSa;
	}
	public String getPlanMinPrem() {
		return PlanMinPrem;
	}
	public void setPlanMinPrem(String planMinPrem) {
		PlanMinPrem = planMinPrem;
	}
	public String getPlanMinPremiumTerm() {
		return PlanMinPremiumTerm;
	}
	public void setPlanMinPremiumTerm(String planMinPremiumTerm) {
		PlanMinPremiumTerm = planMinPremiumTerm;
	}
	public long getPlanMinSa() {
		return PlanMinSa;
	}
	public void setPlanMinSa(long planMinSa) {
		PlanMinSa = planMinSa;
	}
	public String getPlanMonthlyRate() {
		return PlanMonthlyRate;
	}
	public void setPlanMonthlyRate(String planMonthlyRate) {
		PlanMonthlyRate = planMonthlyRate;
	}
	public String getPlanNameEn() {
		return PlanNameEn;
	}
	public void setPlanNameEn(String planNameEn) {
		PlanNameEn = planNameEn;
	}
	public String getPlanNameTh() {
		return PlanNameTh;
	}
	public void setPlanNameTh(String planNameTh) {
		PlanNameTh = planNameTh;
	}
	public String getPlanOrdDisp() {
		return PlanOrdDisp;
	}
	public void setPlanOrdDisp(String planOrdDisp) {
		PlanOrdDisp = planOrdDisp;
	}
	public String getPlanPayMaxAge() {
		return PlanPayMaxAge;
	}
	public void setPlanPayMaxAge(String planPayMaxAge) {
		PlanPayMaxAge = planPayMaxAge;
	}
	public String getPlanPayMinAge() {
		return PlanPayMinAge;
	}
	public void setPlanPayMinAge(String planPayMinAge) {
		PlanPayMinAge = planPayMinAge;
	}
	public String getPlanPremiumFix() {
		return PlanPremiumFix;
	}
	public void setPlanPremiumFix(String planPremiumFix) {
		PlanPremiumFix = planPremiumFix;
	}
	public long getPlanPremiumTerm() {
		return PlanPremiumTerm;
	}
	public void setPlanPremiumTerm(long planPremiumTerm) {
		PlanPremiumTerm = planPremiumTerm;
	}
	public String getPlanPremiumType() {
		return PlanPremiumType;
	}
	public void setPlanPremiumType(String planPremiumType) {
		PlanPremiumType = planPremiumType;
	}
	public String getPlanQuarterlyRate() {
		return PlanQuarterlyRate;
	}
	public void setPlanQuarterlyRate(String planQuarterlyRate) {
		PlanQuarterlyRate = planQuarterlyRate;
	}
	public long getPlanSafix() {
		return PlanSafix;
	}
	public void setPlanSafix(long planSafix) {
		PlanSafix = planSafix;
	}
	public String getPlanSatype() {
		return PlanSatype;
	}
	public void setPlanSatype(String planSatype) {
		PlanSatype = planSatype;
	}
	public String getPlanSemiannuallyRate() {
		return PlanSemiannuallyRate;
	}
	public void setPlanSemiannuallyRate(String planSemiannuallyRate) {
		PlanSemiannuallyRate = planSemiannuallyRate;
	}
	public String getPlanShortNameEn() {
		return PlanShortNameEn;
	}
	public void setPlanShortNameEn(String planShortNameEn) {
		PlanShortNameEn = planShortNameEn;
	}
	public String getPlanShortNameTh() {
		return PlanShortNameTh;
	}
	public void setPlanShortNameTh(String planShortNameTh) {
		PlanShortNameTh = planShortNameTh;
	}
	public String getPlanStartSa() {
		return PlanStartSa;
	}
	public void setPlanStartSa(String planStartSa) {
		PlanStartSa = planStartSa;
	}
	public String getPlanSumStart() {
		return PlanSumStart;
	}
	public void setPlanSumStart(String planSumStart) {
		PlanSumStart = planSumStart;
	}
	public String getPremUnit() {
		return PremUnit;
	}
	public void setPremUnit(String premUnit) {
		PremUnit = premUnit;
	}
	public String getProdCode() {
		return ProdCode;
	}
	public void setProdCode(String prodCode) {
		ProdCode = prodCode;
	}
	public String getSelectType() {
		return SelectType;
	}
	public void setSelectType(String selectType) {
		SelectType = selectType;
	}
	public String getSiModel() {
		return SiModel;
	}
	public void setSiModel(String siModel) {
		SiModel = siModel;
	}
	public String getMinTopup() {
		return MinTopup;
	}
	public void setMinTopup(String minTopup) {
		MinTopup = minTopup;
	}
	public long getDefaultPaymentModeCode() {
		return DefaultPaymentModeCode;
	}
	public void setDefaultPaymentModeCode(long defaultPaymentModeCode) {
		DefaultPaymentModeCode = defaultPaymentModeCode;
	}
	public String getAnnualPaymentMode() {
		return AnnualPaymentMode;
	}
	public void setAnnualPaymentMode(String annualPaymentMode) {
		AnnualPaymentMode = annualPaymentMode;
	}
	public String getQuarterlyPaymentMode() {
		return QuarterlyPaymentMode;
	}
	public void setQuarterlyPaymentMode(String quarterlyPaymentMode) {
		QuarterlyPaymentMode = quarterlyPaymentMode;
	}
	public String getMonthlyPaymentMode() {
		return MonthlyPaymentMode;
	}
	public void setMonthlyPaymentMode(String monthlyPaymentMode) {
		MonthlyPaymentMode = monthlyPaymentMode;
	}
	public String getSemiAnnualPaymentMode() {
		return SemiAnnualPaymentMode;
	}
	public void setSemiAnnualPaymentMode(String semiAnnualPaymentMode) {
		SemiAnnualPaymentMode = semiAnnualPaymentMode;
	}

	public String getSinglePaymentMode() {
		return SinglePaymentMode;
	}
	public void setSinglePaymentMode(String singlePaymentMode) {
		SinglePaymentMode = singlePaymentMode;
	}
	public String getPlanPaymentTerm() {
		return PlanPaymentTerm;
	}
	public void setPlanPaymentTerm(String planPaymentTerm) {
		PlanPaymentTerm = planPaymentTerm;
	}
	public String getDescriptionInsuredAgeTh() {
		return DescriptionInsuredAgeTh;
	}
	public void setDescriptionInsuredAgeTh(String descriptionInsuredAgeTh) {
		DescriptionInsuredAgeTh = descriptionInsuredAgeTh;
	}
	public String getDescriptionInsuredAgeEn() {
		return DescriptionInsuredAgeEn;
	}
	public void setDescriptionInsuredAgeEn(String descriptionInsuredAgeEn) {
		DescriptionInsuredAgeEn = descriptionInsuredAgeEn;
	}
	public String getDescriptionCoverageTermTh() {
		return DescriptionCoverageTermTh;
	}
	public void setDescriptionCoverageTermTh(String descriptionCoverageTermTh) {
		DescriptionCoverageTermTh = descriptionCoverageTermTh;
	}
	public String getDescriptionCoverageTermEn() {
		return DescriptionCoverageTermEn;
	}
	public void setDescriptionCoverageTermEn(String descriptionCoverageTermEn) {
		DescriptionCoverageTermEn = descriptionCoverageTermEn;
	}
	public String getDescriptionPaymentTermTh() {
		return DescriptionPaymentTermTh;
	}
	public void setDescriptionPaymentTermTh(String descriptionPaymentTermTh) {
		DescriptionPaymentTermTh = descriptionPaymentTermTh;
	}
	public String getDescriptionPaymentTermEn() {
		return DescriptionPaymentTermEn;
	}
	public void setDescriptionPaymentTermEn(String descriptionPaymentTermEn) {
		DescriptionPaymentTermEn = descriptionPaymentTermEn;
	}
	public String getGuaranteedMaturityValue() {
		return GuaranteedMaturityValue;
	}
	public void setGuaranteedMaturityValue(String guaranteedMaturityValue) {
		GuaranteedMaturityValue = guaranteedMaturityValue;
	}
	public String getGuaranteedMinimumReturnRatePerYear() {
		return GuaranteedMinimumReturnRatePerYear;
	}
	public void setGuaranteedMinimumReturnRatePerYear(String guaranteedMinimumReturnRatePerYear) {
		GuaranteedMinimumReturnRatePerYear = guaranteedMinimumReturnRatePerYear;
	}
	public String getExtraPlanNameEn() {
		return ExtraPlanNameEn;
	}
	public void setExtraPlanNameEn(String extraPlanNameEn) {
		ExtraPlanNameEn = extraPlanNameEn;
	}
	public String getExtraPlanNameTh() {
		return ExtraPlanNameTh;
	}
	public void setExtraPlanNameTh(String extraPlanNameTh) {
		ExtraPlanNameTh = extraPlanNameTh;
	}
	public String getExtraPlanShortNameEn() {
		return ExtraPlanShortNameEn;
	}
	public void setExtraPlanShortNameEn(String extraPlanShortNameEn) {
		ExtraPlanShortNameEn = extraPlanShortNameEn;
	}
	public String getExtraPlanShortNameTh() {
		return ExtraPlanShortNameTh;
	}
	public void setExtraPlanShortNameTh(String extraPlanShortNameTh) {
		ExtraPlanShortNameTh = extraPlanShortNameTh;
	}
	public String getIsForFNA() {
		return IsForFNA;
	}
	public void setIsForFNA(String isForFNA) {
		IsForFNA = isForFNA;
	}
	public String getIsForSMP() {
		return IsForSMP;
	}
	public void setIsForSMP(String isForSMP) {
		IsForSMP = isForSMP;
	}
	public String getIsForEAPP() {
		return IsForEAPP;
	}
	public void setIsForEAPP(String isForEAPP) {
		IsForEAPP = isForEAPP;
	}
	public String getIsForILP() {
		return IsForILP;
	}
	public void setIsForILP(String isForILP) {
		IsForILP = isForILP;
	}
	public String getPlanGroupCode() {
		return PlanGroupCode;
	}
	public void setPlanGroupCode(String planGroupCode) {
		PlanGroupCode = planGroupCode;
	}
	public String getPlanCalCoverTermFlag() {
		return PlanCalCoverTermFlag;
	}
	public void setPlanCalCoverTermFlag(String planCalCoverTermFlag) {
		PlanCalCoverTermFlag = planCalCoverTermFlag;
	}
	public String getPlanCalPremiumTermFlag() {
		return PlanCalPremiumTermFlag;
	}
	public void setPlanCalPremiumTermFlag(String planCalPremiumTermFlag) {
		PlanCalPremiumTermFlag = planCalPremiumTermFlag;
	}
	public String getIsAF() {
		return IsAF;
	}
	public void setIsAF(String isAF) {
		IsAF = isAF;
	}
	public String getIsSaleTool() {
		return IsSaleTool;
	}
	public void setIsSaleTool(String isSaleTool) {
		IsSaleTool = isSaleTool;
	}
	
	//JsonMapping
	public String getJsonMappingForSI() {
		return JsonMappingForSI;
	}
	public void setJsonMappingForSI(String jsonMappingForSI) {
		JsonMappingForSI = jsonMappingForSI;
	}
	
	
	public String getChannel() {
		return Channel;
	}
	public void setChannel(String channel) {
		Channel = channel;
	}
	public String getIsActive() {
		return IsActive;
	}
	public void setIsActive(String isActive) {
		IsActive = isActive;
	}



	@Override
	public String toString() {
		return "MasterdataModel ["
				+ "PlanCode=" + PlanCode
				+ ", BaseCode=" + BaseCode 
				+ ", MagnumCode=" + MagnumCode
				+ ", DiscountUnit=" + DiscountUnit 
				+ ", MaxGradeCode=" + MaxGradeCode 
				+ ", MinGradeCode=" + MinGradeCode
				+ ", PlanAcptGen=" + PlanAcptGen 
				+ ", PlanCommEn=" + PlanCommEn 
				+ ", PlanCommTh=" + PlanCommTh
				+ ", PlanCoverFix=" + PlanCoverFix 
				+ ", PlanCoverMax=" + PlanCoverMax 
				+ ", PlanCoverMin=" + PlanCoverMin
				+ ", PlanCoverTerm=" + PlanCoverTerm 
				+ ", PlanCoverType=" + PlanCoverType 
				+ ", PlanDescEn=" + PlanDescEn
				+ ", PlanDescTh=" + PlanDescTh 
				+ ", PlanEffDate=" + PlanEffDate 
				+ ", PlanExpDate=" + PlanExpDate
				+ ", PlanInsMaxAge=" + PlanInsMaxAge 
				+ ", PlanInsMinAge=" + PlanInsMinAge 
				+ ", PlanLimitAge="+ PlanLimitAge 
				+ ", PlanMaxPrem=" + PlanMaxPrem 
				+ ", PlanMaxSa=" + PlanMaxSa 
				+ ", PlanMinPrem="+ PlanMinPrem 
				+ ", PlanMinPremiumTerm=" + PlanMinPremiumTerm 
				+ ", PlanMinSa=" + PlanMinSa
				+ ", PlanMonthlyRate=" + PlanMonthlyRate 
				+ ", PlanNameEn=" + PlanNameEn 
				+ ", PlanNameTh=" + PlanNameTh
				+ ", PlanOrdDisp=" + PlanOrdDisp 
				+ ", PlanPayMaxAge=" + PlanPayMaxAge 
				+ ", PlanPayMinAge="+ PlanPayMinAge 
				+ ", PlanPremiumFix=" + PlanPremiumFix 
				+ ", PlanPremiumTerm=" + PlanPremiumTerm
				+ ", PlanPremiumType=" + PlanPremiumType 
				+ ", PlanQuarterlyRate=" + PlanQuarterlyRate 
				+ ", PlanSafix="+ PlanSafix 
				+ ", PlanSatype=" + PlanSatype 
				+ ", PlanSemiannuallyRate=" + PlanSemiannuallyRate
				+ ", PlanShortNameEn=" + PlanShortNameEn 
				+ ", PlanShortNameTh=" + PlanShortNameTh 
				+ ", PlanStartSa="+ PlanStartSa 
				+ ", PlanSumStart=" + PlanSumStart 
				+ ", PremUnit=" + PremUnit 
				+ ", ProdCode=" + ProdCode
				+ ", SelectType=" + SelectType + ", SiModel=" + SiModel 
				+ ", MinTopup=" + MinTopup
				+ ", DefaultPaymentModeCode=" + DefaultPaymentModeCode 
				+ ", AnnualPaymentMode=" + AnnualPaymentMode
				+ ", QuarterlyPaymentMode=" + QuarterlyPaymentMode 
				+ ", MonthlyPaymentMode=" + MonthlyPaymentMode
				+ ", SemiAnnualPaymentMode=" + SemiAnnualPaymentMode 
				+ ", SinglePaymentMode=" + SinglePaymentMode
				+ ", PlanPaymentTerm=" + PlanPaymentTerm 
				+ ", DescriptionInsuredAgeTh=" + DescriptionInsuredAgeTh
				+ ", DescriptionInsuredAgeEn=" + DescriptionInsuredAgeEn 
				+ ", DescriptionCoverageTermTh="+ DescriptionCoverageTermTh 
				+ ", DescriptionCoverageTermEn=" + DescriptionCoverageTermEn
				+ ", DescriptionPaymentTermTh=" + DescriptionPaymentTermTh 
				+ ", DescriptionPaymentTermEn="+ DescriptionPaymentTermEn 
				+ ", GuaranteedMaturityValue=" + GuaranteedMaturityValue
				+ ", GuaranteedMinimumReturnRatePerYear=" + GuaranteedMinimumReturnRatePerYear 
				+ ", ExtraPlanNameEn="+ ExtraPlanNameEn 
				+ ", ExtraPlanNameTh=" + ExtraPlanNameTh 
				+ ", ExtraPlanShortNameEn="+ ExtraPlanShortNameEn 
				+ ", ExtraPlanShortNameTh=" + ExtraPlanShortNameTh 
				+ ", IsForFNA=" + IsForFNA
				+ ", IsForSMP=" + IsForSMP 
				+ ", IsForEAPP=" + IsForEAPP 
				+ ", IsForILP=" + IsForILP 
				+ ", PlanGroupCode="+ PlanGroupCode 
				+ ", PlanCalCoverTermFlag="+ PlanCalCoverTermFlag 
				+ ", PlanCalPremiumTermFlag="+ PlanCalPremiumTermFlag 
				+ ", IsAF=" + IsAF 
				+ ", IsSaleTool=" + IsSaleTool 
				+ ", JsonMappingForSI="+ JsonMappingForSI 
				+ ", Channel=" + Channel 
				+ ", IsActive=" + IsActive + "]";
	}

}
