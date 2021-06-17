package Day2;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class to initialize date and call constructor by using this
public class MyDateT {
	//data members
	private int date;
	private int month;
	private int year;
	
	//default constructor
	public MyDateT()
	{
		this(20,6,1999);
	}
	public MyDateT(int d,int m,int y)
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
