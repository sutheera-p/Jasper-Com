package com.test.api;

public class SIModelBase {
	public String systemCode;
	public siModel siModel;
	public String calcTableJsonStringify;
	public String channel;
	
    
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public siModel getSiModel() {
		return siModel;
	}
	public void setSiModel(siModel siModel) {
		this.siModel = siModel;
	}
	
	public String getCalcTableJsonStringify() {
		return calcTableJsonStringify;
	}
	public void setCalcTableJsonStringify(String calcTableJsonStringify) {
		this.calcTableJsonStringify = calcTableJsonStringify;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	//TestSearch<TestResult> testSearch = new RestTemplate().getForObject("http://localhost:8957/test/json", new TestSearch<TestResult>().getClass());
	@Override
	public String toString() {
		return "SIModelBase [systemCode=" + systemCode 
				+", siModel=" + siModel 
				+", calcTableJsonStringify="+ calcTableJsonStringify 
				+ ", channel=" + channel
				+ "]";
	}
}

