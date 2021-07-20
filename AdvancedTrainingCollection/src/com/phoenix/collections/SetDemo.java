package com.phoenix.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.phoenix.collections.comparators.CompareNum;
/*
 * 
 * @author 
 * 
 */
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<Integer> numSet=new HashSet<Integer>();//unordered and unsorted
		//Set<Integer> numSet=new LinkedHashSet<Integer>();//ordered and unsorted
		//Set<Integer> numSet=new TreeSet<Integer>();//ordered and sorted
		//Set<Integer> numSet=new TreeSet<Integer>(new CompareNum());//ordered and sorted in desc
		Set<Integer> numSet=new TreeSet<Integer>(Collections.reverseOrder());//ordered and sorted
		numSet.add(120);
		numSet.add(100);
		numSet.add(150);
		numSet.add(90);
		numSet.add(50);
		
		for(int x : numSet){
			System.out.print(x+" ");
		}
		
	}

}
