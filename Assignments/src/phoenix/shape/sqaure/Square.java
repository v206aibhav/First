package phoenix.shape.sqaure;

import phoenix.shape.Shape;

/*
* 	Author: vaibhav.agrawal@stltech.in
*  Date : 11 june 2021
*  Version :1.0
*  Copyright : Sterlite technology ltd.
*
* */

public class Square extends Shape {
	
	private double side;
	
	public Square()
	{
		side=10;
	}
	
	public Square(double side)
	{
		this.side=side;
	}

	public static void main(String[] args) {
		

	}

	@Override
	public void calculateArea() {
		System.out.println("Area of square is : "+side*side);
		
	}

	@Override
	public void calculatePerimeter() {
		
		System.out.println("Perimeter of sqaure is : "+(4*side));
		
	}

}
