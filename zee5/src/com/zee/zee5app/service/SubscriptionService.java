package com.zee.zee5app.service;

import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.repository.Subsrepo;

public class SubscriptionService {
	

		private Subsrepo repository = Subsrepo.getInstance();
		
		// service is consuming the repository
		
		
		// if we want ot create that single object then we have to create it
		// inside the same class
		// and we have to share ref with others
		// to do the same we have to declare a met hod.
		private static SubscriptionService service = null;
		
		// this would be a static 
		// only one copy.
		public String addUser(Subscription subs)
		{
			return this.repository.addSubs(subs);
		}
		public Subscription getSubsbyId(String Id)
		{
			return repository.getSubsbyId(Id);
			 
		}
		
		public Subscription[] getSubs()
		{
			return Subsrepo.getSubs();
		}
		
		public static SubscriptionService getInstance() {
			// it  becomes object independant?
			// static will make it independant on the object for execution.
			
			// static method will access only static ref
			if(service==null)
			service = new SubscriptionService();
			return service;
			
		}
		
	}

