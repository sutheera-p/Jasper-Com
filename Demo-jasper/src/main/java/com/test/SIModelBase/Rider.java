package com.test.SIModelBase;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Rider {
    public String prodCode;
    public int sortOrder;
    public String planCode;
    
	@JsonInclude(JsonInclude.Include.NON_NULL)
    public double sumAssured;
	@JsonInclude(JsonInclude.Include.NON_NULL)
    public String area;
    public String emRate;

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public double getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEmRate() {
		return emRate;
	}

	public void setEmRate(String emRate) {
		this.emRate = emRate;
	}

	@Override
	public String toString() {
		return "Rider [prodCode=" + prodCode 
				+ ", sortOrder=" + sortOrder
				+ ", planCode=" + planCode 
				+ ", sumAssured="+ sumAssured 
				+ ", area=" + area 
				+ ", emRate=" + emRate + "]";
	}
}
