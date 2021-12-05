package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//hold  spring bean cfgs file name and location
           FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
           //create IOC /Spring container (BeanFactory)
            XmlBeanFactory factory = new XmlBeanFactory(res);
            //get target spring bean class obj
              Object obj =factory.getBean("wmg");
            //perform typecasting (obj of super class)
            WishMessageGenerator generator = (WishMessageGenerator)obj;
            //invoke the  b.method
            String msg = generator.generateMessage("rani");
            System.out.println("UserName::" +msg);
	}

}
