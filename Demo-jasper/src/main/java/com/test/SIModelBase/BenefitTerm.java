package com.test.SIModelBase;

public class BenefitTerm {
	 public String th;
	 public String en;
	 
	public String getTh() {
		return th;
	}
	public void setTh(String th) {
		this.th = th;
	}
	public String getEn() {
		return en;
	}
	public void setEn(String en) {
		this.en = en;
	}
	
	@Override
	public String toString() {
		return "BenefitTerm [th = " + th 
				+ ", en = " + en + "]";
	}
}
