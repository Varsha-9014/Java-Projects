package xyz;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a palindrome:");
		String st=sc.next();
		String reversed = new StringBuilder(st).reverse().toString();
		if (st.equals(reversed)) {
			System.out.println("it is palindrome");			
		}else {
			System.out.println("it is not palindrome");
		}
		}
		
	}

