package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class StrategyDPTest_2 {

	public static  void main(String[] args) {
		//create IOC container
		//ClassPathXmlApplicationContext ctx  = new 	ClassPathXmlApplicationContext ("com/nt/cfgss/applicationContext.xml");
		ClassPathXmlApplicationContext ctx  = new 	ClassPathXmlApplicationContext ("applicationContext.xml");
		//get Target class obj
		/* Flipkart fpkt= ctx.getBean("fpkt",Flipkart.class);
		 //invoke the b.method
		 String resultMsg=fpkt.shopping(new String[] {"shirt","trouser","glasses"},
				                                                new float[] {5679.60f,5557.55f,4545.77f} );
		 System.out.println(resultMsg);*/
		
		}//main
	}//class


