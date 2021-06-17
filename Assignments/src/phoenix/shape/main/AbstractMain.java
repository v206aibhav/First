package phoenix.shape.main;

import phoenix.shape.Shape;
import phoenix.shape.circle.Circle;
import phoenix.shape.rectangles.Rectangle;
import phoenix.shape.sqaure.Square;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//class to calculate area and perimeter of different shapes
public class AbstractMain {
	
	public static void main(String args[])
	{
		Shape s= null;
		s=new Circle(5);
		s.calculateArea();
		s.calculatePerimeter();
		
		System.out.println("***********************");
		s=new Rectangle(20,10);
		s.calculateArea();
		s.calculatePerimeter();
		
		System.out.println("***********************");
		s=new Square(10);
		s.calculateArea();
		s.calculatePerimeter();
		
		
	}

}
