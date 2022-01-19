package com.zee.zee5app.dto;

import lombok.Data;

@Data
public class Register {
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public Register() {
		// EDC
		// any kind of customization during the initialization of object
		// then its better to introduce EDC or PC or both as per the need.
		
		System.out.println("hello");
	}
	
	// private stuff will be accessible only inside the class.
	
	// setter : is used to set the value for a particular field.
	// getter : to get/return the value of a specific field

}
