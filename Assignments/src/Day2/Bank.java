package Day2;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class to print account holder details
public class Bank {

	public static void main(String[] args) {
		
		System.out.println("Interest is : "+Account.getInterestRate());
		Account acc=new Account();
		acc.setAccNo(1);
		acc.setOwnerName("Vaibhav Gupta");
		acc.setBalance(25000);
		acc.setDurationYears(2);
		
		System.out.println("Account No : "+acc.getAccNo() );
		System.out.println("Owner Name:"+acc.getOwnerName());
		System.out.println("Balance : "+acc.getBalance());
		System.out.println("Years : "+acc.getDurationYears());
		acc.calculateInterest();
		
		System.out.println("*************************************");
		
		Account acc2=new Account(2,"Vivek",20000,2);
		acc2.printDetails();
		acc2.calculateInterest();
		
		System.out.println("**************************************");
		
		System.out.println("Number of Account objects:"+acc2.getCount());
	}

}
