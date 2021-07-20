package com.phoenix.collections.searching;

import java.util.Arrays;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={50,20,80,40,10,90};
		

		Arrays.sort(arr);
		System.out.println("Sorted array");
		Arrays.stream(arr).forEach(System.out::println);
		
		int searchIdx=Arrays.binarySearch(arr, 20);
		System.out.println("element is found at index no :"+searchIdx);
		
		
		
	}

}
