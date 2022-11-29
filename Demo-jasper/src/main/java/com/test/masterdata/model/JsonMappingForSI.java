package com.test.masterdata.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonMappingForSI {
	public String Plan;
	public String RiderNameOnSITh;
	public String RiderNameOnSIEn;
	public AreaName AreaName;
	public Benefit Benefit;
	public MaxBenefit MaxBenefit;
	public Endorsement Endorsement;
	
//	public String getPlan() {
//		return Plan;
//	}
//	public void setPlan(String plan) {
//		Plan = plan;
//	}
//	public String getRiderNameOnSITh() {
//		return RiderNameOnSITh;
//	}
//	public void setRiderNameOnSITh(String riderNameOnSITh) {
//		RiderNameOnSITh = riderNameOnSITh;
//	}
//	public String getRiderNameOnSIEn() {
//		return RiderNameOnSIEn;
//	}
//	public void setRiderNameOnSIEn(String riderNameOnSIEn) {
//		RiderNameOnSIEn = riderNameOnSIEn;
//	}
//	public AreaName getAreaName() {
//		return AreaName;
//	}
//	public void setAreaName(AreaName areaName) {
//		AreaName = areaName;
//	}
//	public Benefit getBenefit() {
//		return Benefit;
//	}
//	public void setBenefit(Benefit benefit) {
//		Benefit = benefit;
//	}
//	public MaxBenefit getMaxBenefit() {
//		return MaxBenefit;
//	}
//	public void setMaxBenefit(MaxBenefit maxBenefit) {
//		MaxBenefit = maxBenefit;
//	}
//	public Endorsement getEndorsement() {
//		return Endorsement;
//	}
//	public void setEndorsement(Endorsement endorsement) {
//		Endorsement = endorsement;
//	}
//	
	@Override
	public String toString() {
		return "JsonMappingForSI [Plan=" + Plan 
				+ ", RiderNameOnSITh=" + RiderNameOnSITh 
				+ ", RiderNameOnSIEn="+ RiderNameOnSIEn 
				+ ", AreaName=" + AreaName 
				+ ", Benefit=" + Benefit 
				+ ", MaxBenefit=" + MaxBenefit
				+ ", Endorsement=" + Endorsement + "]";
	}
	
	//Class	
	public class AreaName {
		public String Th;
		public String En;
	}
	
	public class Benefit {
		public String Group1;
		public String Group2_4;
		public String Group3;
		public String Group6_2;
		public String Group7;
		public String Group10;
	}
	
	public class MaxBenefit {
		public String Group1;
	}
	
	public class Endorsement {
		public String Group1;
		public String Group2;
		public String Group3;
	}
}
