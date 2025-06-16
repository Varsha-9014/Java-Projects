package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

    // Binary Search Method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Found at index mid
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Step 2: Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 3: Sort the array (Binary Search needs a sorted array)
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Step 4: Input the element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Step 5: Apply binary search
        int result = binarySearch(arr, target);

        // Step 6: Display result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}
