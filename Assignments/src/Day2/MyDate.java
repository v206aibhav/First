package Day2;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class to initialize date
public class MyDate {
	
	private int date;
	private int month;
	private int year;
	
	public void initDate()
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
