package com.phoenix.desginpatterns.singleton;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//Class PM as a singleton class
public class PrimeMinister {
	
private static PrimeMinister obj;
	
	//private default constructor
	private PrimeMinister()
	{
		System.out.println("PrimeMinister object is created");
	}
	//method to get instance of PM class
	public static PrimeMinister getInstance()
	{
		System.out.println("getInstance() of PrimeMinister is called");
		if(obj==null)
			obj=new PrimeMinister();
		return obj;
	}
	
	public void representNation()
	{
		System.out.println("representNation method of PrimeMinister is called");
	}

}
