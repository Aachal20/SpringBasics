package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class WishMessageGenerator {
	//HAS-A property(Supporting composition
	@Autowired           //Field level injection
	private Date date;
	

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
