package phoenix.shape.circle;

import phoenix.shape.Shape;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//Class to find area and circumference of cirlce
public class Circle extends Shape {

	private float radius;
	
	//Default constructor
	public Circle()
	{
		radius=4;
		System.out.println("Default constructor of circle");
	}
	//Parameterized constructor
	public Circle(float radius)
	{
		this.radius=radius;
	}
	@Override
	public void calculateArea() {
		
		System.out.println("Area of circle is : "+(super.MATH_PI*radius*radius));
		
	}

	@Override
	public void calculatePerimeter() {
		
		System.out.println("Perimeter of circle is : "+(2*super.MATH_PI*radius));
		
	}

}
