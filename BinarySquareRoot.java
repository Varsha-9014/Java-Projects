package xyz;

import java.util.Scanner;

public class BinarySquareRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sqrt = integerSquareRoot(n);
        System.out.println("Integer part of square root of " + n + " is: " + sqrt);
        
        scanner.close();
    }
    public static int integerSquareRoot(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }

        if (n == 0 || n == 1) return n;

        int start = 1, end = n, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= n / mid) {
                ans = mid; 
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
