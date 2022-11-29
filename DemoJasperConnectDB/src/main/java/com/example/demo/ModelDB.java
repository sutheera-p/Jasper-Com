package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "sat",name = "smpusersalesillustrations")
public class ModelDB {
    @Id
    private long id;
    private String jsonmodel;
    private String userid;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getJsonmodel() {
		return jsonmodel;
	}
	public void setJsonmodel(String jsonmodel) {
		this.jsonmodel = jsonmodel;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "ModelDB [id=" + id + ", jsonmodel=" + jsonmodel + ", userid=" + userid + "]";
	}
}
