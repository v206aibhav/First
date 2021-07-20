package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatingDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.of(1885,9,24);
		System.out.println("Original date format : "+date);
		
		DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String formattedDate3 =date.format(formatter3);
		System.out.println("FULL: "+formattedDate3);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String formattedDate2 =date.format(formatter2);
		System.out.println("Long: "+formattedDate2);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		String formattedDate =date.format(formatter);
		System.out.println("Medium: "+formattedDate);
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		String formattedDate1 =date.format(formatter1);
		System.out.println("Short: "+formattedDate1);
		
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd,yyyy");
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM,yyyy");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Custom Format : "+date.format(dtf));
		
		LocalTime anyTime = LocalTime.of(5,23,56);
		System.out.println(anyTime);
		
		DateTimeFormatter timeFmt = 
						DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		
		String fmtTime = anyTime.format(timeFmt);
		System.out.println("Formatted time : "+fmtTime);
		
		
	}

}
