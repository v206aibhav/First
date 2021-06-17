package com.phoenix.desginpatterns.factory.cars;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//Class contains behavior methods
public class Car {
	
	public void start()
	{
		System.out.println("Car starts");
	}
	
	public void run()
	{
		System.out.println("Car run");
	}
	
	public void stop()
	{
		System.out.println("Car stop");
	}

}
