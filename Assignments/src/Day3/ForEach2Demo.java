package Day3;

import java.util.Scanner;

public class ForEach2Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int row=2,col=2;
		int arr1[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		    for(int j=0;j<col;j++)
				arr1[i][j]=sc.nextInt();
		
	    for (int x[] : arr1) {
	        for (int y : x) {
	          System.out.println(y);
	         
	        }
	      }

	  

	}

}
