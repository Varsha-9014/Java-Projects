package xyz;

import java.util.TreeSet;

public class TreeSetExample1 {

    public static void main(String[] args) {
        TreeSet<Integer> TS = new TreeSet<Integer>();

        TS.add(10);
        TS.add(20);
        TS.add(30);
        TS.add(6);

        System.out.println("TreeSet elements: " + TS);         // Output: [6, 10, 20, 30]
        System.out.println("Contains 20? " + TS.contains(20)); // Use Integer instead of String
        System.out.println("First element: " + TS.first());    // Output: 6
    }
}
