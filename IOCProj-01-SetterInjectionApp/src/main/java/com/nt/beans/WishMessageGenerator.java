package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
     public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor()");
	}
     //HAS-A Property(supporting composition)
     private Date date;
     //perform setter method for setter injection
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	//b.method (generate wish message)
	public String generateMessage(String user) {
		//get current hour of the day
		int hour=date.getHours();
		//generate wishmessage 
		if(hour<12)
			return "GM" +user;
		else if(hour<15)
		return "GA   "  +user;
		else if(hour<20)
		return "GE" +user;
		else
		  return "GN" +user;
	}//b.method
     
     
}//class
