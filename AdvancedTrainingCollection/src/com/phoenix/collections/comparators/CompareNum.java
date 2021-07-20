package com.phoenix.collections.comparators;

import java.util.Comparator;

/*
 * @author vaibhav.agrawal@stl.tech
 * version 1.0
 * 
 * 
 */
public class CompareNum implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2)
			return 1;
		else if(o1>o2)
			return -1;
		else 
			return 0;
	}

}
