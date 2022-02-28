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

	public DTDC() {
	System.out.println("DTDC::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC service we used as a delivery status");
		return oid+"order id order is delivered by DTDC";
	}
	
	
}
