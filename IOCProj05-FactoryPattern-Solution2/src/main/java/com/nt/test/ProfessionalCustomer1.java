package com.nt.test;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class ProfessionalCustomer1 {


	public static void main(String[] args) {
		//get car object using factory
		Car car = CarFactory.createCar("Budget", "UT229879");
		car.drive();
	}

}
