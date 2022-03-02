package com.nt.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
	//no HAS a property of dependent class
	public Cricketer() {
		System.out.println("Cricketer :: 0-param constructor");
	}

	public void Bowling() {
		System.out.println("Cricketer is Bowling()");
	}
	
	public void  Batting() {
		System.out.println("Cricketer is Batting()");

		//create additional IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//perform Dependency lookup method to get dependent class obj
		Bat bat = ctx.getBean("bat" ,Bat.class);
		int score=bat.scoreRuns();
		System.out.println("Cricketer  Batting score is :: " +score);
	}

	public void fielding() {
		System.out.println("Cricketer is fielding()");
  }
	
	public void wicketKeeping() {
		System.out.println("Cricketer is  Keeping() the wickets");
	}
}//class


