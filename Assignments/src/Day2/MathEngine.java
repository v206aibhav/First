package Day2;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class contains overload methods
public class MathEngine {
	
	public int multiply(int a,int b)
	{
		return (a*b);
		
	}
	public void multiply(int a,int b,int c)
	{
		System.out.println(a*b*c);
		
	}
	public float multiply(float a,int b)
	{
		return a*b;
		
	}
	public float multiply(int a,float b)
	{
		return a*b;
		
	}

}
