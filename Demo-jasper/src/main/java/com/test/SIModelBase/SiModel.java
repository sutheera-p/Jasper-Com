package com.test.SIModelBase;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SiModel {
	//  public SIModelBase()
	//    {
	//		LocalTime createdDateTime = LocalTime.now();
	//    }
	
	/// <summary>
	/// SI Crate date that use to bind on SI
	/// </summary>
	
	//public Date createdDateTime;
	public String channel;
	public Startdate startDate;
	public String language;
	public String uid;
	public String prodCode;
	public String proposalNo;
	public String agentFullName;
	public String insuredFullName;
	public int age;
	
	/// <summary>
	/// Assured's gender => M = Male, F = Female
	/// </summary>
	public String gender;
	
	public int occClass;
	public double taxBracket;
	public double expectedReturn;
	public BenefitTerm benefitTerm;
	public PremiumTerm premiumTerm;
	public long sumAssured;
	public long modalPremium;
	public int paymentPeriod;
	public double[] topUp;
	public double[] desiredPremium;
	public double[] desiredSa;
	public double[] withdraw;
	public double[] premiumHoliday;
	public double topUpPeriod;
	public double withdrawPeriod;
	public double[] rateOfReturn;
	public float guaranteedMaturity;
	public float guaranteedMinReturn;
	public List<Rider> rider;
	
	//stk
	public double singlePremium;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public boolean isCOF;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public boolean isChangeRider;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public float TPD;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public float CI;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public float HS;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public float HB;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public float ExtraCare;
	
	/// <summary>
	///FE send part of planCode such as 201
	/// </summary> 
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public int ExtraCarePlus;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public double EliteHealth;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String eliteHealthArea;
	
	/// <summary>
	/// plan code of personal accident rider
	/// </summary>
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String PA;
	
	/// <summary>
	/// plan code of Smart Health rider
	/// </summary>
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String SmartHealth;
	
	/// <summary>
	/// plan code of CI Perfect Care rider
	/// </summary>
	public double CIPerfectCare;
	
	/// <summary>
	/// Array of data (Masterdata) that use to bind on SI
	/// </summary>
	public Masterdata masterdata;
	
	//#region EM
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public float basicEmRate;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String tpdEmRate;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String ciEmRate;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String eliteHealthEmRate;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String smartHealthEmRate;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String ciPerfectCareEmRate;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String ciPerfectCareDeathEmRate;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String dKidEmRate;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String dHealthEmRate;
	//    #endregion EM
	
	
	/// <summary>
	/// UNRP615 additional field for agassi
	/// </summary>
	@JsonProperty("planCoverTerm")	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public double PlanCoverTerm;
	
	@JsonProperty("planCoverType")	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String PlanCoverType;
	
	@JsonProperty("planPremiumTerm")	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public double PlanPremiumTerm;
	
	@JsonProperty("planPremium")	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String PlanPremiumType;

	
	// generate get and set
	
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Startdate getStartDate() {
		return startDate;
	}

	public void setStartDate(Startdate startDate) {
		this.startDate = startDate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProposalNo() {
		return proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	public String getAgentFullName() {
		return agentFullName;
	}

	public void setAgentFullName(String agentFullName) {
		this.agentFullName = agentFullName;
	}

	public String getInsuredFullName() {
		return insuredFullName;
	}

	public void setInsuredFullName(String insuredFullName) {
		this.insuredFullName = insuredFullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getOccClass() {
		return occClass;
	}

	public void setOccClass(int occClass) {
		this.occClass = occClass;
	}

	public double getTaxBracket() {
		return taxBracket;
	}

	public void setTaxBracket(double taxBracket) {
		this.taxBracket = taxBracket;
	}

	public double getExpectedReturn() {
		return expectedReturn;
	}

	public void setExpectedReturn(double expectedReturn) {
		this.expectedReturn = expectedReturn;
	}

	public BenefitTerm getBenefitTerm() {
		return benefitTerm;
	}

	public void setBenefitTerm(BenefitTerm benefitTerm) {
		this.benefitTerm = benefitTerm;
	}

	public PremiumTerm getPremiumTerm() {
		return premiumTerm;
	}

	public void setPremiumTerm(PremiumTerm premiumTerm) {
		this.premiumTerm = premiumTerm;
	}

	public long getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(long sumAssured) {
		this.sumAssured = sumAssured;
	}

	public long getModalPremium() {
		return modalPremium;
	}

	public void setModalPremium(long modalPremium) {
		this.modalPremium = modalPremium;
	}

	public int getPaymentPeriod() {
		return paymentPeriod;
	}

	public void setPaymentPeriod(int paymentPeriod) {
		this.paymentPeriod = paymentPeriod;
	}

	public double[] getTopUp() {
		return topUp;
	}

	public void setTopUp(double[] topUp) {
		this.topUp = topUp;
	}

	public double[] getDesiredPremium() {
		return desiredPremium;
	}

	public void setDesiredPremium(double[] desiredPremium) {
		this.desiredPremium = desiredPremium;
	}

	public double[] getDesiredSa() {
		return desiredSa;
	}

	public void setDesiredSa(double[] desiredSa) {
		this.desiredSa = desiredSa;
	}

	public double[] getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double[] withdraw) {
		this.withdraw = withdraw;
	}

	public double[] getPremiumHoliday() {
		return premiumHoliday;
	}

	public void setPremiumHoliday(double[] premiumHoliday) {
		this.premiumHoliday = premiumHoliday;
	}

	public double getTopUpPeriod() {
		return topUpPeriod;
	}

	public void setTopUpPeriod(double topUpPeriod) {
		this.topUpPeriod = topUpPeriod;
	}

	public double getWithdrawPeriod() {
		return withdrawPeriod;
	}

	public void setWithdrawPeriod(double withdrawPeriod) {
		this.withdrawPeriod = withdrawPeriod;
	}

	public double[] getRateOfReturn() {
		return rateOfReturn;
	}

	public void setRateOfReturn(double[] rateOfReturn) {
		this.rateOfReturn = rateOfReturn;
	}

	public float getGuaranteedMaturity() {
		return guaranteedMaturity;
	}

	public void setGuaranteedMaturity(float guaranteedMaturity) {
		this.guaranteedMaturity = guaranteedMaturity;
	}

	public float getGuaranteedMinReturn() {
		return guaranteedMinReturn;
	}

	public void setGuaranteedMinReturn(float guaranteedMinReturn) {
		this.guaranteedMinReturn = guaranteedMinReturn;
	}

	public List<Rider> getRider() {
		return rider;
	}

	public void setRider(List<Rider> rider) {
		this.rider = rider;
	}

	public double getSinglePremium() {
		return singlePremium;
	}

	public void setSinglePremium(double singlePremium) {
		this.singlePremium = singlePremium;
	}

	public boolean isCOF() {
		return isCOF;
	}

	public void setCOF(boolean isCOF) {
		this.isCOF = isCOF;
	}

	public boolean isChangeRider() {
		return isChangeRider;
	}

	public void setChangeRider(boolean isChangeRider) {
		this.isChangeRider = isChangeRider;
	}

	public float getTPD() {
		return TPD;
	}

	public void setTPD(float tPD) {
		TPD = tPD;
	}

	public float getCI() {
		return CI;
	}

	public void setCI(float cI) {
		CI = cI;
	}

	public float getHS() {
		return HS;
	}

	public void setHS(float hS) {
		HS = hS;
	}

	public float getHB() {
		return HB;
	}

	public void setHB(float hB) {
		HB = hB;
	}

	public float getExtraCare() {
		return ExtraCare;
	}

	public void setExtraCare(float extraCare) {
		ExtraCare = extraCare;
	}

	public int getExtraCarePlus() {
		return ExtraCarePlus;
	}

	public void setExtraCarePlus(int extraCarePlus) {
		ExtraCarePlus = extraCarePlus;
	}

	public double getEliteHealth() {
		return EliteHealth;
	}

	public void setEliteHealth(double eliteHealth) {
		EliteHealth = eliteHealth;
	}

	public String getEliteHealthArea() {
		return eliteHealthArea;
	}

	public void setEliteHealthArea(String eliteHealthArea) {
		this.eliteHealthArea = eliteHealthArea;
	}

	public String getPA() {
		return PA;
	}

	public void setPA(String pA) {
		PA = pA;
	}

	public String getSmartHealth() {
		return SmartHealth;
	}

	public void setSmartHealth(String smartHealth) {
		SmartHealth = smartHealth;
	}

	public double getCIPerfectCare() {
		return CIPerfectCare;
	}

	public void setCIPerfectCare(double cIPerfectCare) {
		CIPerfectCare = cIPerfectCare;
	}

	public Masterdata getMasterdata() {
		return masterdata;
	}

	public void setMasterdata(Masterdata masterdata) {
		this.masterdata = masterdata;
	}

	public float getBasicEmRate() {
		return basicEmRate;
	}

	public void setBasicEmRate(float basicEmRate) {
		this.basicEmRate = basicEmRate;
	}

	public String getTpdEmRate() {
		return tpdEmRate;
	}

	public void setTpdEmRate(String tpdEmRate) {
		this.tpdEmRate = tpdEmRate;
	}

	public String getCiEmRate() {
		return ciEmRate;
	}

	public void setCiEmRate(String ciEmRate) {
		this.ciEmRate = ciEmRate;
	}

	public String getEliteHealthEmRate() {
		return eliteHealthEmRate;
	}

	public void setEliteHealthEmRate(String eliteHealthEmRate) {
		this.eliteHealthEmRate = eliteHealthEmRate;
	}

	public String getSmartHealthEmRate() {
		return smartHealthEmRate;
	}

	public void setSmartHealthEmRate(String smartHealthEmRate) {
		this.smartHealthEmRate = smartHealthEmRate;
	}

	public String getCiPerfectCareEmRate() {
		return ciPerfectCareEmRate;
	}

	public void setCiPerfectCareEmRate(String ciPerfectCareEmRate) {
		this.ciPerfectCareEmRate = ciPerfectCareEmRate;
	}

	public String getCiPerfectCareDeathEmRate() {
		return ciPerfectCareDeathEmRate;
	}

	public void setCiPerfectCareDeathEmRate(String ciPerfectCareDeathEmRate) {
		this.ciPerfectCareDeathEmRate = ciPerfectCareDeathEmRate;
	}

	public String getdKidEmRate() {
		return dKidEmRate;
	}

	public void setdKidEmRate(String dKidEmRate) {
		this.dKidEmRate = dKidEmRate;
	}

	public String getdHealthEmRate() {
		return dHealthEmRate;
	}

	public void setdHealthEmRate(String dHealthEmRate) {
		this.dHealthEmRate = dHealthEmRate;
	}

	public double getPlanCoverTerm() {
		return PlanCoverTerm;
	}

	public void setPlanCoverTerm(double planCoverTerm) {
		PlanCoverTerm = planCoverTerm;
	}

	public String getPlanCoverType() {
		return PlanCoverType;
	}

	public void setPlanCoverType(String planCoverType) {
		PlanCoverType = planCoverType;
	}

	public double getPlanPremiumTerm() {
		return PlanPremiumTerm;
	}

	public void setPlanPremiumTerm(double planPremiumTerm) {
		PlanPremiumTerm = planPremiumTerm;
	}

	public String getPlanPremiumType() {
		return PlanPremiumType;
	}

	public void setPlanPremiumType(String planPremiumType) {
		PlanPremiumType = planPremiumType;
	}

	//generate to String
	@Override
	public String toString() {
		return "SIModel [channel=" + channel 
				+ ", startDate=" + startDate 
				+ ", language=" + language 
				+ ", uid="+ uid 
				+ ", prodCode=" + prodCode 
				+ ", proposalNo=" + proposalNo 
				+ ", agentFullName=" + agentFullName
				+ ", insuredFullName=" + insuredFullName 
				+ ", age=" + age 
				+ ", gender=" + gender 
				+ ", occClass="+ occClass 
				+ ", taxBracket=" + taxBracket 
				+ ", expectedReturn=" + expectedReturn 
				+ ", benefitTerm="+ benefitTerm 
				+ ", premiumTerm=" + premiumTerm 
				+ ", sumAssured=" + sumAssured 
				+ ", modalPremium="+ modalPremium 
				+ ", paymentPeriod=" + paymentPeriod 
				+ ", topUp=" + Arrays.toString(topUp)
				+ ", desiredPremium=" + Arrays.toString(desiredPremium) 
				+ ", desiredSa=" + Arrays.toString(desiredSa)
				+ ", withdraw=" + Arrays.toString(withdraw) 
				+ ", premiumHoliday=" + Arrays.toString(premiumHoliday)
				+ ", topUpPeriod=" + topUpPeriod 
				+ ", withdrawPeriod=" + withdrawPeriod 
				+ ", rateOfReturn="+ Arrays.toString(rateOfReturn) 
				+ ", guaranteedMaturity=" + guaranteedMaturity
				+ ", guaranteedMinReturn=" + guaranteedMinReturn 
				+ ", rider=" + rider 
				+ ", singlePremium="+ singlePremium 
				+ ", isCOF=" + isCOF 
				+ ", isChangeRider=" + isChangeRider 
				+ ", TPD=" + TPD 
				+ ", CI="+ CI 
				+ ", HS=" + HS 
				+ ", HB=" + HB 
				+ ", ExtraCare=" + ExtraCare 
				+ ", ExtraCarePlus=" + ExtraCarePlus
				+ ", EliteHealth=" + EliteHealth 
				+ ", eliteHealthArea=" + eliteHealthArea 
				+ ", PA=" + PA
				+ ", SmartHealth=" + SmartHealth 
				+ ", CIPerfectCare=" + CIPerfectCare  //this
				+ ", Masterdata=" + masterdata
				+ ", basicEmRate=" + basicEmRate 
				+ ", tpdEmRate=" + tpdEmRate 
				+ ", ciEmRate=" + ciEmRate
				+ ", eliteHealthEmRate=" + eliteHealthEmRate 
				+ ", smartHealthEmRate=" + smartHealthEmRate
				+ ", ciPerfectCareEmRate=" + ciPerfectCareEmRate 
				+ ", ciPerfectCareDeathEmRate="+ ciPerfectCareDeathEmRate 
				+ ", dKidEmRate=" + dKidEmRate 
				+ ", dHealthEmRate=" + dHealthEmRate
				+ ", PlanCoverTerm=" + PlanCoverTerm 
				+ ", PlanCoverType=" + PlanCoverType 
				+ ", PlanPremiumTerm="+ PlanPremiumTerm 
				+ ", PlanPremiumType=" + PlanPremiumType + "]";
	}
}
