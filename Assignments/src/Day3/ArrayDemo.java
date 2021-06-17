package Day3;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr1=new int[5];
		
		for(int i=0;i<arr1.length;i++)
			arr1[i]=sc.nextInt();
		
		for(int i=0;i<arr1.length;i++)
			System.out.print(" "+arr1[i]);
		System.out.println("\n");
		
		int arr2[]={10,20,30,40};
		
		for(int i=0;i<arr2.length;i++)
			System.out.print(" "+arr2[i]);
		System.out.println("\n");
		
		String arr3[]={"Indore","Bhopal","Ahemdabad","Surat"};
		
		for(int i=0;i<arr3.length;i++)
			System.out.print(" "+arr3[i]);

	}

}
