package Day2;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class to set and get date
public class DateMainSG {

	public static void main(String[] args) {
		
		MyDateSG m=new MyDateSG();
		m.setDate(20);
		m.setMonth(6);
		m.setYear(2021);
		System.out.println(m.getDate()+"/"+m.getMonth()+"/"+m.getYear());
	
		
		MyDateSG m1=new MyDateSG(24,8,2021);
		System.out.println(m1.getDate()+"/"+m1.getMonth()+"/"+m1.getYear());

	}

}
