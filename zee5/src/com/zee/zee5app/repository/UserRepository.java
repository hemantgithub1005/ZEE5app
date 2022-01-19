package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Register;


import lombok.Data;
//repo. objects are used to call only repo methods 
//can we do this using 1 object?
@Data
public class UserRepository {
	
	private Register[] register = new Register[10];
	private Register[] registers= new Register[10]; 
	private static int count=-1;
	 
	private UserRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public Register[] getUsers()
	{
		return registers;
	}
	
	public Register getUserbyId(String Id)
	{
		for (Register register:registers)
		{
			if(register!=null && register.getId().equals(Id))
			{
				return register;
			}
		}
			
		return null;
	}
	    
	public String addUser(Register register)
	{
		if(count==registers.length-1)
		{
			Register temp[]=new Register[registers.length*2];
			System.arraycopy(registers,0,temp,0,registers.length);
			registers=temp;
			
			registers[++count]=register;
			
			return "success";
			
		}
		registers[++count]=register;
		return "success";
		
	}
	
	
	
	
	
	 
	
	private static UserRepository userRepository;
	public static UserRepository getInstance() {
		
		if(userRepository==null)
			userRepository = new UserRepository();
		return userRepository;
		
	}

}