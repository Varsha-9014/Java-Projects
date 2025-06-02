package xyz;

import java.util.Scanner;

public class switchExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the languages:");
		String Day =sc.nextLine().toLowerCase();
		switch (Day) {
		case "monday":
			System.out.println("Lets learn python");
			break;
		case "Tuesday":
			System.out.println("Lets learn Java");
			break;
		case "wednesday":
			System.out.println("Lets learn c");
			break;
		case "Thursday":
			System.out.println("Lets learn c++");
			break;
		case "Fridsy":
			System.out.println("Lets learn HTML");
			break;
		default:
			System.out.println("Invalid");				
		}
		sc.close();
	}

}
