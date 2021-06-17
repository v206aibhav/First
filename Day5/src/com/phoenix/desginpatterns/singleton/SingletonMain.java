package com.phoenix.desginpatterns.singleton;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//Singleton main class to get instance of Each singleton class
public class SingletonMain {

	public static void main(String[] args) {
		
		Sun sun=Sun.getInstance();
		sun.giveLight();
		
		System.out.println("********************************************");
		
		Earth e=Earth.getInstance();
		e.createLife();
		
		System.out.println("*********************************************");
		
		PrimeMinister pm=PrimeMinister.getInstance();
		pm.representNation();
		
		System.out.println("*********************************************");
		
		President p=President.getInstance();
		p.representNation();

	}

}
