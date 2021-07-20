package com.phoenix.stacks;

import java.util.ArrayDeque;

public class NumStArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack using ArrayDeque
		ArrayDeque<Integer> stack= new ArrayDeque<Integer>();
		stack.addLast(40);
		stack.addLast(20);
		stack.addLast(70);
		stack.addLast(10);
		stack.addLast(80);
		
		System.out.println("Top of the stack : "+stack.peekLast());
		System.out.println("Poll the top :"+stack.pollLast());
		System.out.println("Top of the stack : "+stack.peekLast());
		
		while(!stack.isEmpty()){
			System.out.println("Top of the stack : "+stack.pollLast());
		}
	}

}
