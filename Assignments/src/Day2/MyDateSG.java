package Day2;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class to initialize date by setter and getter
public class MyDateSG {
	
	private int date;
	private int month;
	private int year;
	
	public MyDateSG()
	{
		this(20,6,1999);
	}
	public MyDateSG(int d,int m,int y)
	{
		date=d;
		month=m;
		year=y;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printDate()
	{
		System.out.println(date+"/"+month+"/"+year);
	}

}
