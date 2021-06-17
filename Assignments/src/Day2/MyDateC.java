package Day2;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class to initialize date with default constructor
public class MyDateC {
	
	private int date;
	private int month;
	private int year;
	
	public MyDateC()
	{
		date=8;
		month=6;
		year=2021;
	}
	public void printDate()
	{
		System.out.println(date+"/"+month+"/"+year);
	}

}
