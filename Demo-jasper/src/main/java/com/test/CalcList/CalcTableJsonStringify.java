package com.test.CalcList;

import java.util.List;

public class CalcTableJsonStringify {
	public RateOfReturn RateOfReturn;
	public List<CalcList> CalcList;
	
	public RateOfReturn getRateOfReturn() {
		return RateOfReturn;
	}
	public void setRateOfReturn(RateOfReturn rateOfReturn) {
		RateOfReturn = rateOfReturn;
	}
	
	public List<CalcList> getCalcList() {
		return CalcList;
	}
	public void setCalcList(List<CalcList> calcList) {
		CalcList = calcList;
	}
	
	@Override
	public String toString() {
		return "CalcTableJsonStringify ["
				+ "RateOfReturn=" + RateOfReturn 
				+ ", CalcList=" + CalcList + "]";
	}
}
