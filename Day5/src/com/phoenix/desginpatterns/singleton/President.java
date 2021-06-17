package com.phoenix.desginpatterns.singleton;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class President as a singleton class
public class President {
	
private static President obj;
	
	//private default constructor
	private President()
	{
		System.out.println("President object is created");
	}
	//Method to get instance of president class
	public static President getInstance()
	{
		System.out.println("getInstance() of President is called");
		if(obj==null)
			obj=new President();
		return obj;
	}
	
	public void representNation()
	{
		System.out.println("representNation method of president class is called");
	}


}
