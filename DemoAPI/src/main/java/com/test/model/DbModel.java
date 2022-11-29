package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "dbo",name = "springjasper")
public class DbModel {
    @Id
    private long id;
    private String name;
    private String key_type;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey_type() {
		return key_type;
	}
	public void setKey_type(String key_type) {
		this.key_type = key_type;
	}
	@Override
	public String toString() {
		return "DbModel [id=" + id + ", name=" + name + ", key_type=" + key_type + "]";
	}
}
