package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
    //HAS-A property(Supporting composition)
	private Date date;
	
	
	//For Constructor Injection
     public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator 1-param consytuctor") ;
		this.date = date;
	}

	//setter method for setter injection
	/*public void setDate(Date date) {
		System.out.println("WishMessageGenerator .setDate") ;
		this.date = date;
	}*/
	
	//b.method
	 public String generateMessage(String user) {
		
		 System.out.println("WishMessageGenerator.generateMessage()" +date );
		//get current hour of the date 
		 int hour = date.getHours();                   //24 hours format 0 to 23
		 //generate WishMessage
		 if(hour<12)
			 return"Good Morning::"+user;
		 else if(hour<16)
			 return"Good Afternoon::"+user;
		 else if(hour<20)
			 return"Good Evening ::"+user;
		 else 
			 return"Good Night::"+user;
	}//method
}//class
