package com.phoenix.collections;

import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array to List Conversion
		List<Integer> numList = Arrays.asList(100,600,300,200,800,500);
		numList.forEach(System.out::println);
		numList.set(2, 2000);
		//numList.add(3);
		System.out.println(numList);
		numList.forEach(System.out::println);
		
		//List to Array conversion
		Integer[] iArr=new Integer[numList.size()];
		
		iArr=numList.toArray(iArr);
		for(int ele : iArr)
			System.out.println(ele);
	}

}
