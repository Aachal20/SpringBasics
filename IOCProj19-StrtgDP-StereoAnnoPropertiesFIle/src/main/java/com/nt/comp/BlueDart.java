//BlueDart.java(Dependent class1)
package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("bdart")
public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
		
	}

	@Override
	public String deliver(int oid) {
		
		return oid+"order id order is delivered by BlueDart";
	}

}
