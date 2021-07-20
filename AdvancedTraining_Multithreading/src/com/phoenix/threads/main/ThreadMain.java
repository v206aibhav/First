package com.phoenix.threads.main;

import com.phoenix.threads.MyThread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("current thread :"+Thread.currentThread().getName());
		
		
		
		//user - defined t1 and t2 thread
		Thread t1 = new MyThread();
		Thread t2 =  new MyThread();
		t1.setName("vaibhav");
		t2.setName("arti");
		t1.setPriority(2);
		t2.setPriority(8);
		t1.start();
		t2.start();
	}

}
