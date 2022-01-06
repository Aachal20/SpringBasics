//ConstructionInjectionTest.java
package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans. WishMessageGenerator;
public class ConstructorInjectionTest {
	
	
	public static void main(String[] args) {
		//locate and hols spring bean cfg filename and location
		//FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		ClassPathResource res = new ClassPathResource("applicationContext.xml");
		//create IOC Container(BeanFactory Container)
		XmlBeanFactory factory =new XmlBeanFactory(res);
		//get target spring bean class
		//Object obj = factory.getBean("wmg");
		//typecasting
		WishMessageGenerator generator =factory.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String result =generator.generateMessage("raja");
		System.out.println("Wish Message is ::" +result);
		
	}

}
