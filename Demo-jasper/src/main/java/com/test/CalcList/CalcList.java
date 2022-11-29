package com.test.CalcList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CalcList {
	public long month;
	public long age;
	public long policyYear;
	public long modalPremium;
	public long rpCharges;
	public long topUpCharges;
	public long topUp;
	public long totalLifeCoi;
	public long totalRiderCoi;
	public long rpFvEnd;
	public long topUpFvEnd;
	public long rpSurrenderValue;
	public String topUpSurrenderValue;
	public long deathBenefit;
	public String totalPolicyAdminCharges;
	
	
	public long getMonth() {
		return month;
	}
	public void setMonth(long month) {
		this.month = month;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public long getPolicyYear() {
		return policyYear;
	}
	public void setPolicyYear(long policyYear) {
		this.policyYear = policyYear;
	}
	public long getModalPremium() {
		return modalPremium;
	}
	public void setModalPremium(long modalPremium) {
		this.modalPremium = modalPremium;
	}
	public long getRpCharges() {
		return rpCharges;
	}
	public void setRpCharges(long rpCharges) {
		this.rpCharges = rpCharges;
	}
	public long getTopUpCharges() {
		return topUpCharges;
	}
	public void setTopUpCharges(long topUpCharges) {
		this.topUpCharges = topUpCharges;
	}
	public long getTopUp() {
		return topUp;
	}
	public void setTopUp(long topUp) {
		this.topUp = topUp;
	}
	public long getTotalLifeCoi() {
		return totalLifeCoi;
	}
	public void setTotalLifeCoi(long totalLifeCoi) {
		this.totalLifeCoi = totalLifeCoi;
	}
	public long getTotalRiderCoi() {
		return totalRiderCoi;
	}
	public void setTotalRiderCoi(long totalRiderCoi) {
		this.totalRiderCoi = totalRiderCoi;
	}
	public long getRpFvEnd() {
		return rpFvEnd;
	}
	public void setRpFvEnd(long rpFvEnd) {
		this.rpFvEnd = rpFvEnd;
	}
	public long getTopUpFvEnd() {
		return topUpFvEnd;
	}
	public void setTopUpFvEnd(long topUpFvEnd) {
		this.topUpFvEnd = topUpFvEnd;
	}
	public long getRpSurrenderValue() {
		return rpSurrenderValue;
	}
	public void setRpSurrenderValue(long rpSurrenderValue) {
		this.rpSurrenderValue = rpSurrenderValue;
	}
	public String getTopUpSurrenderValue() {
		return topUpSurrenderValue;
	}
	public void setTopUpSurrenderValue(String topUpSurrenderValue) {
		this.topUpSurrenderValue = topUpSurrenderValue;
	}
	public long getDeathBenefit() {
		return deathBenefit;
	}
	public void setDeathBenefit(long deathBenefit) {
		this.deathBenefit = deathBenefit;
	}
	public String getTotalPolicyAdminCharges() {
		return totalPolicyAdminCharges;
	}
	public void setTotalPolicyAdminCharges(String totalPolicyAdminCharges) {
		this.totalPolicyAdminCharges = totalPolicyAdminCharges;
	}
	
	@Override
	public String toString() {
		return "CalcList [month=" + month 
				+ ", age=" + age 
				+ ", policyYear=" + policyYear 
				+ ", modalPremium="+ modalPremium 
				+ ", rpCharges=" + rpCharges 
				+ ", topUpCharges=" + topUpCharges 
				+ ", topUp=" + topUp
				+ ", totalLifeCoi=" + totalLifeCoi 
				+ ", totalRiderCoi=" + totalRiderCoi 
				+ ", rpFvEnd=" + rpFvEnd
				+ ", topUpFvEnd=" + topUpFvEnd 
				+ ", rpSurrenderValue=" + rpSurrenderValue 
				+ ", topUpSurrenderValue="+ topUpSurrenderValue 
				+ ", deathBenefit=" + deathBenefit 
				+ ", totalPolicyAdminCharges="+ totalPolicyAdminCharges + "]";
	}
	
}
