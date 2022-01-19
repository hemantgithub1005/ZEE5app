package com.zee.zee5app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 @Data
 @AllArgsConstructor
 @NoArgsConstructor
public class Subscription {
	
	
	
	public  String getId() 
	{
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	private  String Id;
	private String setusername;
	private String setpassword;
	private int monthssubs;
	
	
}
