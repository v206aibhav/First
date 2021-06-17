package Day2;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

//class to set client entities and to calculate interest
public class Account {

	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	
	//static variables
	public static float interestRate;
	private static int count;
	
	//static block
	static
	{
		setInterestRate(0.05f);
	}
	
	public Account()
	{
		accNo=1;
		ownerName="vaibhav";
		balance=30000;
		durationYears=1.0f;
		count++;
	}
	
	//parameterized constructor
	public Account(int accNo,String ownerName,double balance,float years)
	{
		this.accNo=accNo;
		this.ownerName=ownerName;
		this.balance=balance;
		this.durationYears=years;
		count++;
	}
	
	//getter and setter
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public float getDurationYears() {
		return durationYears;
	}

	public void setDurationYears(float durationYears) {
		this.durationYears = durationYears;
	}

	
	public static float getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}
	//method to calculate the interest
	public void calculateInterest()
	{
		double interestAmount=(balance*durationYears*interestRate);
		System.out.println("Interest Amount : "+interestAmount);
	}
	//count the number of objects
	public static int getCount() {
		return count;
	}

	public void printDetails()
	{
		System.out.println("Account number : "+accNo+" "+"Owner name : "+ownerName);
		System.out.println("Balance : "+balance+" "+"Years :"+durationYears);
	}
}
