package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {
	//HAS-A property(Supporting composition
	@Autowired(required=false)           //Field level injection
	@Qualifier("dt")
	private Date date;
	

	@Autowired
	@Qualifier("dt1") public void setDate(Date date) 
	{ 
		this.date = date; 
		System.out.println("WishMessageGenerator.setDate()");
	}


	@Autowired
	public WishMessageGenerator(@Qualifier("dt")Date date) {
		System.out.println("WishMessageGenerator.WishMessageGenerator() ::0-param constructor::"   +date);
		this.date =date;
	}

	//orbitory method
	@Autowired
	@Qualifier("dt")
	public void assign(Date date) {
		System.out.println("WishMessageGenerator.generateMessage():orbitory");
		this.date=date;
	}

	//B logic
	public String  generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage():::::" +date);
		//get current hour of day
		int hour=date.getHours(); //24b hours format
		//generate wish message
		if(hour<12) 
			return "Good Morning" +user;
		else if(hour<16) 
			return "Good Afternoon"+user;
		else if (hour<20)
			return "Good Evening"+user;
		else
			return "Good Night"+user;


	}//method
}
