package com.nt.test;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.factory.CarFactory;

public class BusinessCustomer3 {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("Luxory", "UT229879");
		car.drive();
	}

}
