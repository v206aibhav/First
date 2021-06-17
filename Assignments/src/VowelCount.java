/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 8 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */


//class to count Vowel in given string
public class VowelCount
{
	public static void main(String[] args)
		
	{
		//Data member as a string
		String str = "vaibhav";
		
		//Method Call
		System.out.println(countVowels(str));

	}
	
	//Method Definition
	private static int countVowels(String str) {
		//Data member to count vowels
		int count = 0;

		for (int i = 0; i < str.length(); i++)
		{
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
				|| str.charAt(i) == 'i'
				|| str.charAt(i) == 'o'
				|| str.charAt(i) == 'u')
			{
				
				count++;
			}
			
		}
		
		return count;
	}
}
