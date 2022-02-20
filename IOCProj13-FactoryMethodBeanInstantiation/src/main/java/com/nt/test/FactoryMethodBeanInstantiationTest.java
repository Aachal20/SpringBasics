package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantiationTest {

	public static void main(String[] args) {
		//create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get spring bean class obj
		Class clazz = factory.getBean("c1",Class.class);
		System.out.println("clazz obj  class name::" +clazz.getClass()+ "clazz obj data::"  +clazz.toString());
       System.out.println("================");
       //calander 
       Calendar cal =factory.getBean("cal" ,Calendar.class);
       System.out.println("calander obj  class name::" +cal.getClass()+ "calander obj data::"  +cal.toString());
       System.out.println("================");
       //properties
       Properties props =factory.getBean("props" ,Properties.class);
       System.out.println("Properties obj  class name::" +props.getClass()+ "Properties  obj data::"  +props.toString());
       System.out.println("============================");
       //string
       String s2 =factory.getBean("s2" ,String.class);
       System.out.println("S2 obj  class name::  " +s2.getClass()+    "  s2  obj data::"  +s2);
       
       String s3 =factory.getBean("s3" ,String.class);
       System.out.println("S3 obj  class name::  " +s3.getClass()+ "   s3 obj data::"  +s3);
       System.out.println("============================");
       
	}

}
