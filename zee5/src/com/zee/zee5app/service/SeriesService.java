package com.zee.zee5app.service;

import com.zee.zee5app.dto.Series;
import com.zee.zee5app.repository.Seriesrepo;

public class SeriesService 
{

		private Seriesrepo repository = Seriesrepo.getInstance();
		
		// service is consuming the repository
		
		private SeriesService() {
			// TODO Auto-generated constructor stub
		}
		// if we want ot create that single object then we have to create it
		// inside the same class
		// and we have to share ref with others
		// to do the same we have to declare a met hod.
		private static SeriesService  service = null;
		
		// this would be a static 
		// only one copy.
		public String addSeries(Series series)
		{
			return this.repository.addUser();
		}
		public Register getUserbyId(String Id)
		{
			return repository.getUserbyId(Id);
			 
		}
		
		public Register[] getUsers()
		{
			return repository.getUsers();
		}
		
		public static UserServices getInstance() {
			// it  becomes object independant?
			// static will make it independant on the object for execution.
			
			// static method will access only static ref
			if(service==null)
			service = new UserServices();
			return service;
			
		}
		
	}


}
