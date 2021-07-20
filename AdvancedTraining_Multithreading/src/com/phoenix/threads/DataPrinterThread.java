package com.phoenix.threads;

public class DataPrinterThread extends Thread {

	int arr[];

	public DataPrinterThread(int[] arr) {
		super();
		this.arr = arr;
	}
	
	public void run(){
		
		try {
			synchronized (arr){
				System.out.println("Waiting to print ....");
				arr.wait(); //waiting
				for(int ele : arr){
					System.out.println(ele);
					Thread.sleep(500);
				}
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
