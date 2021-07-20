package com.phoenix.collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args)
	{

		NavigableMap<String, Integer> nm
			= new TreeMap<String, Integer>();

		// Add elements using put() method
		nm.put("C", 8);
		nm.put("Y", 9);
		nm.put("A", 4);
		nm.put("T", 5);
		nm.put("B", 6);
		nm.put("A", 5);

		// Print the contents on the console
		System.out.println("NavigableMap : "
						+ nm);

		System.out.println("Descending Set : "+nm.descendingKeySet());
		System.out.println("Floor Entry : "+
						nm.floorEntry("L"));
		System.out.println("First Entry : "+
						nm.firstEntry());
		System.out.println("Last Key :"+ nm.lastKey());
		System.out.println("First Key : "+
						nm.firstKey());
		System.out.println("Original Map : "+ nm);
		System.out.println("Reverse Map :"+
						nm.descendingMap());
		
		
		NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();

  
      nmap.put(3, "A");
      nmap.put(2, "A");
      nmap.put(1, "G");
      nmap.put(4, "F");

      System.out.println("NavigableMap : " + nmap);

      // Remove elements using remove()
      nmap.remove(4);

      System.out.println(
          "\nNavigableMap, after remove operation : "
          + nmap);

		
	}
}
