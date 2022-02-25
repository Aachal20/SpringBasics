package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		//create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get spring bea class obj
		WishMessageGenerator generator=ctx.getBean("wmg" ,WishMessageGenerator.class);
		//invoke the b.method
		String result=generator.generateMessage("aachal");
		System.out.println("Wish Message is:::"+result);

		ctx.close();
	}
}
