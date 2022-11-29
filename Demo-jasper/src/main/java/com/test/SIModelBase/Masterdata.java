package com.test.SIModelBase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Masterdata {
	 public String GENDER_TH;
	 public String GENDER_EN;
	 public String PAYMENT_MODE_TH;
	 public String PAYMENT_MODE_EN;
	 public String BASIC_PLAN_NAME_TH;
	 public String BASIC_PLAN_NAME_EN;
//	 @JsonRawValue
	 public String SMH;
	 public String LHDP;
	 public String LHD;
	 public String LHU;
	 
	public String getGENDER_TH() {
		return GENDER_TH;
	}
	public void setGENDER_TH(String gENDER_TH) {
		GENDER_TH = gENDER_TH;
	}
	public String getGENDER_EN() {
		return GENDER_EN;
	}
	public void setGENDER_EN(String gENDER_EN) {
		GENDER_EN = gENDER_EN;
	}
	public String getPAYMENT_MODE_TH() {
		return PAYMENT_MODE_TH;
	}
	public void setPAYMENT_MODE_TH(String pAYMENT_MODE_TH) {
		PAYMENT_MODE_TH = pAYMENT_MODE_TH;
	}
	public String getPAYMENT_MODE_EN() {
		return PAYMENT_MODE_EN;
	}
	public void setPAYMENT_MODE_EN(String pAYMENT_MODE_EN) {
		PAYMENT_MODE_EN = pAYMENT_MODE_EN;
	}
	public String getBASIC_PLAN_NAME_TH() {
		return BASIC_PLAN_NAME_TH;
	}
	public void setBASIC_PLAN_NAME_TH(String bASIC_PLAN_NAME_TH) {
		BASIC_PLAN_NAME_TH = bASIC_PLAN_NAME_TH;
	}
	public String getBASIC_PLAN_NAME_EN() {
		return BASIC_PLAN_NAME_EN;
	}
	public void setBASIC_PLAN_NAME_EN(String bASIC_PLAN_NAME_EN) {
		BASIC_PLAN_NAME_EN = bASIC_PLAN_NAME_EN;
	}
	public String getSMH() {
		return SMH;
	}
	public void setSMH(String sMH) {
		SMH = sMH;
	}
	public String getLHDP() {
		return LHDP;
	}
	public void setLHDP(String lHDP) {
		LHDP = lHDP;
	}
	public String getLHD() {
		return LHD;
	}
	public void setLHD(String lHD) {
		LHD = lHD;
	}
	public String getLHU() {
		return LHU;
	}
	public void setLHU(String lHU) {
		LHU = lHU;
	}
	
	@Override
	public String toString() {
		return "Masterdata [GENDER_TH=" + GENDER_TH 
				+ ", GENDER_EN=" + GENDER_EN
				+ ", PAYMENT_MODE_TH="+ PAYMENT_MODE_TH 
				+ ", PAYMENT_MODE_EN=" + PAYMENT_MODE_EN 
				+ ", BASIC_PLAN_NAME_TH="+ BASIC_PLAN_NAME_TH 
				+ ", BASIC_PLAN_NAME_EN=" + BASIC_PLAN_NAME_EN 
				+ ", SMH=" + SMH + ", LHDP=" + LHDP
				+ ", LHD=" + LHD + ", LHU=" + LHU + "]";
	} 
}
