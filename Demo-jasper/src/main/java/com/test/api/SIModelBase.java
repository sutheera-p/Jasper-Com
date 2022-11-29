package com.test.api;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.test.SIModelBase.SiModel;

public class SIModelBase {
	public String systemCode;
	public SiModel siModel;
	@JsonRawValue
	public String calcTableJsonStringify;
	public String channel;
	
    
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public SiModel getSiModel() {
		return siModel;
	}
	public void setSiModel(SiModel siModel) {
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

	@Override
	public String toString() {
		return "SIModelBase [systemCode=" + systemCode 
				+", siModel=" + siModel 
				+", calcTableJsonStringify="+ calcTableJsonStringify 
				+ ", channel=" + channel
				+ "]";
	}
}
