package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.DHL;
import com.nt.comp.Flipkart;

import it.nt.comp1.TestBean;
//Loose Coupling through properties file
public class StrategyDPTest {

	public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgss/applicationContext.xml");
		//get target class obj from Factory
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class) ;
		//invoke the b-method
		String result =fpkt.shopping(new String[] {"shirt" , "trouser" ,"mobile-phone"},
				new float[] {5000.0f ,8000.0f ,25000f});
		System.out.println(result);
		
		System.out.println("-------------------------");
		//DHL dhl = ctx.getBean("dhl" , DHL.class);
		//System.out.println(dhl);
		
		

	}//main
}//class
