package com.prajaram.elasticsearch;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "rajaram",type ="users")
public class User {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//@Field(type=FieldType.Auto)
	private int id;
	
	//@Field(type=FieldType.Auto)
	private String name;
	
	@Override
	public String toString() {
		return "{\"id\":"+id+",\"name\":\""+name+"\"}";
	}

}
