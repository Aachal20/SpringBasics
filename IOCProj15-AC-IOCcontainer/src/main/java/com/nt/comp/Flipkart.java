package com.nt.comp;


import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	//spring bean
  //HAS-A property with type interface
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart::o-param constructor"); //constructor
	 }

  //setter method for setter injection	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		this.courier = courier;
	}
	
	public String shopping(String item[] ,float prices[]) {
		
		//calculate billAmt(b.logic)
       float billAmt=0.0f;
       for(int i=0;i<item.length;++i)
    	   billAmt=billAmt+prices[i];
       //generate order id
       int oid= new Random().nextInt(100);    //give random value as interger no between 0 to 100000
       //use courier for shipping
       String status=courier.deliver(oid);
       String finalMsg=Arrays.toString(item)+"are purchased with prices "+Arrays.toString(prices)+"The generated billAmount is::" +billAmt;
       
       return finalMsg+":::::::::::" +status;
 	}
	
}
