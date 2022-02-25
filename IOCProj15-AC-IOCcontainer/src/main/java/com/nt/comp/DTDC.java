//DTDC.java(Dependent class2)
package com.nt.comp;

public final class DTDC implements Courier {

	public DTDC() {
	System.out.println("DTDC::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC service we used as a delivery status");
		return oid+"order id order is delivered by BlueDart";
	}

}
