package com.phoenix.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Queue<Integer> numQ=new LinkedList<Integer>();//FIFO and LILO
		//Queue<Integer> numQ=new PriorityQueue<Integer>();
		Queue<Integer> numQ=new PriorityQueue<Integer>(Collections.reverseOrder());
		numQ.add(100);
		numQ.add(50);
		numQ.add(20);
		numQ.add(70);
		numQ.add(50);
		
		System.out.println("Head of numQ : "+numQ.peek());
		System.out.println("Removing head : "+numQ.poll());
		System.out.println("Head of numQ : "+numQ.peek());
		
		while(!numQ.isEmpty()){
			System.out.println("Polling element : "+numQ.poll());
		}
		
		System.out.println("Head of numQ : "+numQ.peek());//peek method return null if queue is empty
		//System.out.println("Head of numQ : "+numQ.element());//element throw Exception if empty
		
		System.out.println("Polling element : "+numQ.poll());//return null
		//System.out.println("Polling element : "+numQ.remove());//throw exception
		
		
		
		
	}

}
