package in.com.rays.date;

import java.time.LocalDate;

public class TestLocalDate {
	public static void main(String[] args) {
		
		
		  LocalDate now = LocalDate.now();
		  System.out.println(now);
		  
		  System.out.println(now.getDayOfMonth());
		  System.out.println(now.getDayOfYear()); System.out.println(now.getYear());
		  System.out.println(now.getDayOfWeek());
		 
		LocalDate dob = LocalDate.of(2005, 8, 2);
		
		System.out.println(dob.getDayOfMonth());
		System.out.println(dob.getYear());
		
		int age = now.getYear()-dob.getYear();
		System.out.println("My Age is"+age);
		
	
		
		
		
	
	}

}
