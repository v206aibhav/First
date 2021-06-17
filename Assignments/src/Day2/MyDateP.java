package Day2;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class to initialize date by parameterized constructor
public class MyDateP {
	
	private int date;
	private int month;
	private int year;
	
	public MyDateP()
	{
		date=8;
		month=6;
		year=2021;
	}
	public MyDateP(int d,int m,int y)
	{
		date=d;
		month=m;
		year=y;
	}
	public void printDate()
	{
		System.out.println(date+"/"+month+"/"+year);
	}

}
