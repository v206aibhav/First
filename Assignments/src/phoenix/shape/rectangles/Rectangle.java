package phoenix.shape.rectangles;

import phoenix.shape.Shape;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//class to find area and perimeter of rectangle
public class Rectangle extends Shape {
	
	private int length;
	private int breadth;
	
	public Rectangle()
	{
		length=10;
		breadth=5;
	}
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public void calculateArea() {
		System.out.println("Area of rectangle is : "+length*breadth);
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of rectangle is : "+2*(length+breadth));
		
	}

}
