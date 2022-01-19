package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Subscription;

import lombok.Data;
@Data

public class Subsrepo {
	
	
	private Subscription[] subs=new Subscription[10];
	private Subscription [] subs1=new Subscription[10];
	private int count=-1;
	
	public Subsrepo() 
	{
     // TODO Auto-generated constructor stub
	}
	
	public String addSubs(Subscription subs)
	{
		 if(count==subs1.length-1)
		 {
			Subscription[] temp=new Subscription[subs1.length*2];
			System.arraycopy(subs, 0, temp, 0, subs1.length);
			subs1=temp;
			subs1[++count]=subs;
			return "Success";
		 }
		 subs1[++count]=subs;
		 return "Success";
	}
	
	public Subscription deletesubs(String SubscriptionId)
	{
		return null;
	}
	
	public Subscription getSubsbyId(String Id)
	{
		for(Subscription subs:subs1)
		{
			if(subs !=null && Subscription.getId().equals(Id))
				{
					return subs;
				}
		
		}
		return null;
	}
	
	private static Subsrepo subsrepo;
	public static Subsrepo getInstance() {
		
		if(subsrepo==null)
			subsrepo = new Subsrepo();
		return subsrepo;
		
	
	
	
	

}
}
