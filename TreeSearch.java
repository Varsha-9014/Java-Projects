package xyz;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Scanner;

public class TreeSearch {

    public static void main(String[] args) {
       
        TreeSet<String> TS = new TreeSet<>(Collections.reverseOrder());    
        TS.add("Sumit");
        TS.add("Karan");
        TS.add("Anjali");
        TS.add("Mohan");
        TS.add("Zoya");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the name to search: ");
        String searchName = sc.nextLine();
        if (TS.contains(searchName)) {
            System.out.println(searchName + " is found in the list.");
        } else {
            System.out.println(searchName + " is NOT found in the list.");
        }

        sc.close();
    }
}
