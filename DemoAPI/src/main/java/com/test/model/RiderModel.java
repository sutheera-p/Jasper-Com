package com.test.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RiderModel {
	@JsonProperty("prodCode")
    public String ProdCode;
    
	@JsonProperty("sortOrder")
    public int SortOrder;
    
	@JsonProperty("planCode")
    public String PlanCode;
    
	@JsonProperty("sumAssured")
	@JsonInclude(JsonInclude.Include.NON_NULL)
    public double SumAssured;
    
	@JsonProperty("area")
	@JsonInclude(JsonInclude.Include.NON_NULL)
    public String Area;
    
	@JsonProperty("emRate")
    public String EmRate;
}
