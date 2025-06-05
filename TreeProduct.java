package xyz;

import java.util.TreeSet;
import java.util.Scanner;

public class TreeProduct {

    public static void main(String[] args) {
      
        TreeSet<String> products = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        products.add("keyboard");
        products.add("mouse");
        products.add("monitor");
        products.add("cpu");
        products.add("webcam");
        System.out.println("Available Products:");
        for (String product : products) {
            System.out.println("- " + product);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter product name to search: ");
        String inputProduct = sc.nextLine().trim();
        if (products.contains(inputProduct)) {
            System.out.println(inputProduct + " is available.");
        } else {
            System.out.println(inputProduct + " is NOT available.");
        }

        sc.close();
    }
}
