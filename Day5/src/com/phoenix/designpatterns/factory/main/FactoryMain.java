package com.phoenix.designpatterns.factory.main;

import com.phoenix.desginpatterns.factory.Classfactory;
import com.phoenix.desginpatterns.factory.cars.Car;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class that calls each car class
public class FactoryMain {

	public static void main(String[] args) {
		
		 Car car1=Classfactory.newCar("Sedan");
		 //car1.run();
		 Car car2=Classfactory.newCar("Couple");
		 Car car3=Classfactory.newCar("Sport");
		 Car car4=Classfactory.newCar("Luxury");
		 
		 System.out.println("\n*********** Car Type from Command Line ***********\n");
		 
		 String carType=args[0];
		 Car car=Classfactory.newCar(carType);
		 car.start();
		 car.run();
		 car.stop();
	}

}
