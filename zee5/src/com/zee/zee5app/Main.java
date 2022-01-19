package com.zee.zee5app;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.service.SubscriptionService;
import com.zee.zee5app.service.UserServices;

public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Register register =new Register();
		Subscription subs=new Subscription();
		//Register : class name
		// register : reference which will refer your object
		// new : is used to create the object 
		// Register() : constructor ===> DC ==> IDC
/*		
		register.setFirstName("hemant");
		register.setLastName("yadav");
		register.setEmail("hemant@gmail.com");
		register.setPassword("hemant1234");
		
		System.out.println(register);
		// whenever you will print the reference then it 
		// will call toString() method.
		
		System.out.println(register.toString());
	 
		System.out.println(register.getEmail());
		
		// can u create the login object?
		// then can u print the login detials?
	*/	
		
		UserServices service = UserServices.getInstance();
		SubscriptionService service1=SubscriptionService.getInstance();
		// userservice object
		// main is consuming the service ?
		
		for(int i=1;i<=24;i++)
		{
			Register register2 = new Register();
			register2.setId("hemant"+i);
			String result=service.addUser(register2);
			System.out.println(result);
		}
		
		
		Register register2=service.getUserbyId("hemant1");
		System.out.println(register2!=null);
		
		for(Register register3: service.getUsers())
		{
			if(register3 !=null)
			{
				System.out.println(register3);
			}
		}
		
		
	}

} 
