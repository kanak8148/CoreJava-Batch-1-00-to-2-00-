package in.co.rays.date;

import java.time.LocalDate;

public class TestLocaldate {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		/*
		 * System.out.println(today);
		 * 
		 * System.out.println(today.getDayOfYear());
		 * System.out.println(today.getDayOfWeek());
		 * System.out.println(today.getYear());
		 */
		
		
		LocalDate dob = LocalDate.of(2005, 8, 23);
		
		System.out.println(dob);
		
		System.out.println(dob.getDayOfMonth());
		
		int age = today.getYear()- dob.getYear();
		
		System.out.println(age);
		
		
		
	}

}
