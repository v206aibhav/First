package com.phoenix.threads;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current Thread : "+
							Thread.currentThread().getName());
		
		List<String> cities = new ArrayList<>();
		cities.add("Indore");
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Bhopal");
		cities.forEach(System.out::println);
	}

}
