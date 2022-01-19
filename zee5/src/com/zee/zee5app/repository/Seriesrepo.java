package com.zee.zee5app.repository;


import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Series;

import lombok.Data;


public class Seriesrepo
{
	private Series [] series = new Series[10];
	private Series[] seriess= new Series[10]; 
	private static int count=-1;
	
	
		
		
		 
		private Seriesrepo() {
			// TODO Auto-generated constructor stub
		}
		
		public Series[] getSeries()
		{
			return series;
		}
		
		public Series getSeriesbyId(String Id)
		{
			for (Series series:seriess)
			{
				if(seriess!=null && series.getId().equals(Id))
				{
					return series;
				}
			}
				
			return null;
		}
		    
		public String addSeries(Series series)
		{
			if(count==seriess.length-1)
			{
				Series temp[]=new Series[seriess.length*2];
				System.arraycopy(seriess,0,temp,0,seriess.length);
				seriess=temp;
				
				seriess[++count]=series;
				
				return "success";
				
			}
			seriess[++count]=series;
			return "success";
			
		}
		
		
		private static Seriesrepo seriesrepo;
		public static Seriesrepo getInstance() {
			
			if(seriesrepo==null)
				seriesrepo = new Seriesrepo();
			return seriesrepo;
			
		}

	
	
	

}
