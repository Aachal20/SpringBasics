package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans. WishMessageGenerator;

public class SetterInjectionTest {
	
	public static void main(String[] args) {
		//locate and hols spring bean cfg filename and location
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//create IOC Container(BeanFactory Container)
		XmlBeanFactory factory =new XmlBeanFactory(res);
		//get target spring bean class
		Object obj = factory.getBean("wmg");
		//typecasting
		WishMessageGenerator generator =(WishMessageGenerator) obj;
		//invoke the b.method
		String result =generator.generateMessage("raja");
		System.out.println("Wish Message is ::" +result);
		
	}

}
