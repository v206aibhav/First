package Day2;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class to print date in dd/mm/yyyy format
public class DateMainP {

	public static void main(String[] args) {
		
		MyDateP m=new MyDateP();
		m.printDate();
		MyDateP m2=new MyDateP(20,6,2021);
		m2.printDate();
		
	}

}
