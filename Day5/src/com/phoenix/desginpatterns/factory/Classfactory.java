package com.phoenix.desginpatterns.factory;

import com.phoenix.desginpatterns.factory.cars.Car;
import com.phoenix.desginpatterns.factory.cars.CoupleCar;
import com.phoenix.desginpatterns.factory.cars.LuxuryCar;
import com.phoenix.desginpatterns.factory.cars.SedanCar;
import com.phoenix.desginpatterns.factory.cars.SportCar;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//Class that create object of each car class
public class Classfactory {
	
	public static Car newCar(String carType)
	{
		if(carType.equals("Sedan"))
			return new SedanCar();
		else if(carType.equals("Couple"))
			return new CoupleCar();
		else if(carType.equals("Sport"))
			return new SportCar();
		else if(carType.equals("Luxury"))
			return new LuxuryCar();
		else
			return null;
	}

}
