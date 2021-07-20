package com.phoenix.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.collections.comparators.CompareNum;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(40);
		
		//Using for each loop
		for(int e :al)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		
		Collections.sort(al);//sort in ascending order by default
		for(int e :al)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		
		//sorting according to copareNum method
		Collections.sort(al,new CompareNum());
		System.out.println("As per user-defined comparator");
		for(int e :al)
		{
			System.out.print(e+" ");
		}
		
		Comparator<Integer> c=Collections.reverseOrder();
		Collections.sort(al,c);
		System.out.println("using reverseOrder() method in desc order");
		for(int e :al)
		{
			System.out.print(e+" ");
		}
		

	}

}
