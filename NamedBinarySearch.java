package xyz;
import java.util.Arrays;
import java.util.Scanner;

public class NamedBinarySearch {
    public static void main(String[] args) {
        String[] names = {"Amit", "Divya", "Karan", "Priya", "Zoya"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to search: ");
        String target = scanner.nextLine();
        int index = Arrays.binarySearch(names, target);

        if (index >= 0) {
            System.out.println("Name found at index: " + index);
        } else {
            System.out.println("Name not found in the list.");
        }

        scanner.close();
    }
}
