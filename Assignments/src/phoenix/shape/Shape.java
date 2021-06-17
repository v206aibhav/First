package phoenix.shape;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//Abstract class to calculate area and perimeter of different shapes
public abstract class Shape {
	
	public static final float MATH_PI=3.14f;
	
	public abstract void calculateArea();
	
	public abstract void calculatePerimeter();

}
