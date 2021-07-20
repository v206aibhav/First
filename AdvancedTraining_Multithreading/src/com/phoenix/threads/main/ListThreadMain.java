package com.phoenix.threads.main;

import java.util.ArrayList;
import java.util.List;

import com.phoenix.threads.ListThread1;
import com.phoenix.threads.ListThread2;

public class ListThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> cities = new ArrayList<>();
		cities.add("Mumbai");
		cities.add("Indore");
		cities.add("Bhopal");
		System.out.println("In main :"+cities);
		
		//multiple threads are operating on common object cities
		Thread t1 = new ListThread1(cities);
		Thread t2 = new ListThread2(cities);
		
		t1.start();
		t2.start();
		
	}

}
