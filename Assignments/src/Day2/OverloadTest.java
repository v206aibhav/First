package Day2;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class to overload the methods
public class OverloadTest {

	public static void main(String[] args) {
		
		MathEngine m=new MathEngine();
		System.out.println(m.multiply(2,3));
		m.multiply(2, 3, 4);
		System.out.println(m.multiply(2, 2.2f));
		System.out.println(m.multiply(2.2f, 2));
				
	}

}
