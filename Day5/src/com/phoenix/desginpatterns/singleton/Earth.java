package com.phoenix.desginpatterns.singleton;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class Earth as singleton class
public class Earth {
	
private static Earth obj;
	
	//Private default constructor
	private Earth()
	{
		System.out.println("Earth object is created");
	}
	
	//Method to get instance of Earth class
	public static Earth getInstance()
	{
		System.out.println("getInstance() of Earth is called");
		if(obj==null)
			obj=new Earth();
		return obj;
	}
	
	public void createLife()
	{
		System.out.println("createLife method of Earth is called");
	}

}
