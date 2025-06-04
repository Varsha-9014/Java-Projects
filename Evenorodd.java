package xyz;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num% 2==0) {
			System.out.println("it is even number");
		}else {
			System.out.println("it is odd number");
			
		}
	}

}
