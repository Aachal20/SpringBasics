//DTDC.java(Dependent class2)
package com.nt.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("dtdc")
//@Component("courier")
@Primary

@PropertySource("com/nt/commos/info.properties")
public final class DTDC implements Courier {
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	@Value("${os.name}")
	private String os;
	
	@Value("${path}")
	private String path;
	public DTDC() {
	System.out.println("DTDC::0-param constructor");
	}

	

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC service we used as a delivery status");
		return oid+"order id order is delivered by DTDC";
	}
	
	@Override
	public String toString() {
		return "DTDC [name=" + name + ", age=" + age + ", os=" + os + ", path=" + path + "]";
	}
}
