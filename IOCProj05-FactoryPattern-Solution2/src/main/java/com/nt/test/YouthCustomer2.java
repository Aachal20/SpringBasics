package com.nt.test;

import com.nt.comp.Car;
import com.nt.comp.SportsCar;
import com.nt.factory.CarFactory;

public class YouthCustomer2 {

	public static void main(String[] args) {
		//get car object using factory
		Car car = CarFactory.createCar("sports", " Tddg456768");
		car.drive();

	}

}
