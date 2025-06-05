package xyz;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;

public class Tree {

    public static void main(String[] args) {
       
        TreeSet<String> TS = new TreeSet<>(Collections.reverseOrder());

        
        TS.add("Sumit");
        TS.add("Karan");
        TS.add("Anjali");
        TS.add("Mohan");
        TS.add("Zoya");

        
        System.out.println("Employee Names in Reverse Alphabetical Order:");
        for (String name : TS) {
            System.out.println(name);
        }
    }
}
