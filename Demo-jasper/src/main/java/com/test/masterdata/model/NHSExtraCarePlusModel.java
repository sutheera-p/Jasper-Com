package com.test.masterdata.model;

public class NHSExtraCarePlusModel extends JsonMappingForSI{
	public Percent Percent;
	
	public Percent getPercent() {
		return Percent;
	}
	public void setPercent(Percent percent) {
		Percent = percent;
	}
	public class Percent {
		public String Percent_1;
		public String Percent_2;
	}
}
