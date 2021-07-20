package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate yesterdayDate= LocalDate.of(2021,7,15);
		System.out.println(yesterdayDate);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime anyTime = LocalTime.of(5,23,56);
		System.out.println(anyTime);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDateTime anyDateTime = LocalDateTime.of(yesterdayDate, anyTime);
		System.out.println(anyDateTime);
		
		ZonedDateTime zdt= ZonedDateTime.now();
		System.out.println(zdt);
		
		ZoneId defaultZone = ZoneId.systemDefault();
		System.out.println(defaultZone);
		
		Set<String> zones=ZoneId.getAvailableZoneIds();
		//zones.stream().sorted().forEach(System.out::println);
		zones.stream()
					.sorted()
					.filter(z->z.startsWith("I") || z.startsWith("Am"))
					.forEach(System.out::println);
		
		ZoneId zn= ZoneId.of("US/Hawaii");
		ZonedDateTime zdt1= ZonedDateTime.of(anyDateTime, zn);
		System.out.println(zdt1);
	}

}
