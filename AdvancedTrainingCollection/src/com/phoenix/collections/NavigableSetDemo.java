package com.phoenix.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<Double> set=new TreeSet<Double>();
		set.add(5.6);
		set.add(3.2);
		set.add(5.0);
		set.add(2.1);
		set.add(6.2);
		set.add(8.5);
		
		System.out.println("Set in ascending order");
		for(double ele : set){
			System.out.print(ele+" ");
		}
		
		System.out.println();
		System.out.println("Ceiling of 5.6 : "+set.ceiling(5.6) );
		System.out.println("Ceiling of 5.8 : "+set.ceiling(5.8) );
		System.out.println("Ceiling of 8.6 : "+set.ceiling(8.6) );
		
		System.out.println("Floor of 5.6 : "+set.floor(5.6) );
		System.out.println("Floor of 5.3 : "+set.floor(5.3) );
		System.out.println("Floor of 2.0 : "+set.floor(2.0) );
		
		System.out.println("Higher of 5.6 : "+set.higher(5.6));
		System.out.println("Higher of 5.8 : "+set.higher(5.8));
		System.out.println("Higher of 8.6 : "+set.higher(8.6));
		
		System.out.println("Lower of 5.6 : "+set.lower(5.6));
		System.out.println("Lower of 5.3 : "+set.lower(5.3));
		System.out.println("Lower of 2.0 : "+set.lower(2.0));
		
		
	}

}
