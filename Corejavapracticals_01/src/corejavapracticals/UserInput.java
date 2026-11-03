package corejavapracticals;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("inter first digit");

		int a = sc.nextInt();

		System.out.println("inter Second digit");

		int b = sc.nextInt();
		System.out.println("Enter opr like + , - , * , /");

		String opr = sc.next();

		switch (opr) {
		case "+":
			System.out.println("Sum Of two digites" + (a + b));
			break;

		case "-":
			System.out.println("Substarct Of two digites" + (a - b));
			break;

		}

	}
}
