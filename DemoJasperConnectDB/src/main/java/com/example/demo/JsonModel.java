package com.example.demo;

public class JsonModel {
    private String agentFullName;
    private int age;
    private Benefitterm benefitTerm ;
    
public String getAgentFullName() {
		return agentFullName;
	}

	public void setAgentFullName(String agentFullName) {
		this.agentFullName = agentFullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Benefitterm getBenefitTerm() {
		return benefitTerm;
	}

	public void setBenefitTerm(Benefitterm benefitTerm) {
		this.benefitTerm = benefitTerm;
	}

	//    private String[] position;              //  Array
//    private List<String> skills;            //  List
//    private Map<String, BigDecimal> salary; //  Map
    public class Benefitterm
    {
        public String Th;
        public String En;
    }
}
