package Day3;

import java.util.Scanner;

public class ForEach1Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		double []arr1=new double[3];
		for(int i=0;i<arr1.length;i++)
			arr1[i]=sc.nextDouble();
			
		for(double n:arr1)
			System.out.print(n+" ");
		
		float []arr3=new float[3];
		for(int i=0;i<arr3.length;i++)
			arr3[i]=sc.nextFloat();
			
		for(float n:arr3)
			System.out.print(n+" ");
		
		String[] arr2={"rose","jasmine","mogra","sunflower"}; 
		for(String n:arr2)
			System.out.print(n+" ");

	}

}
