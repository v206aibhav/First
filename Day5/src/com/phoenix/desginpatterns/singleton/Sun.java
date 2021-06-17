package com.phoenix.desginpatterns.singleton;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 17 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class Sun as singleton class
public class Sun {
	
	private static Sun obj;
	
	//Default private constructor
	private Sun()
	{
		System.out.println("Sun object is created");
	}
	
	//method to getInstance of sun class
	public static Sun getInstance()
	{
		System.out.println("getInstance() of sun is called");
		if(obj==null)
			obj=new Sun();
		return obj;
	}
	
	public void giveLight()
	{
		System.out.println("giveLight method of sun is called");
	}

}
