package com.phoenix.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<String,Long> map=new HashMap<String,Long>();//unordered and unsorted
		//Map<String,Long> map=new LinkedHashMap<String,Long>();//ordered and unsorted
		TreeMap<String,Long> map=new TreeMap<String,Long>();//ordered and sorted
		/*Comparator<String>c=Collections.reverseOrder();
		Map<String,Long> map=new TreeMap<String,Long>(c);*///ordered and sorted
		
		map.put("Varun Dhawan", 343545435L);
		map.put("Alia Bhatt", 443545435L);
		map.put("Amitabh bachchan", 543545435L);
		map.put("Katrina kaif", 643545435L);
		
		System.out.println("Phone no of varun : "+map.get("Varun Dhawan"));
		
		System.out.println(map);
		
		NavigableMap<String, Long> navMap= map.headMap("Katrina kaif", false);
		System.out.println(navMap);
		
		NavigableMap<String, Long> tlMap= map.tailMap("Katrina kaif", false);
		System.out.println(tlMap);
		
		System.out.println("*******************************");
		
		SortedMap<String,Long> sbMap=map.subMap("Katrina kaif", "Varun Dhawan");
		System.out.println(sbMap);
	}

}
