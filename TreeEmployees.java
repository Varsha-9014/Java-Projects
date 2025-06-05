
package xyz;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class TreeEmployees {

    public static void main(String[] args) {
        Comparator<String> descendingComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };
        TreeSet<String> TS = new TreeSet<>(descendingComparator);
        TS.add("Sumit");
        TS.add("Karan");
        TS.add("Anjali");
        TS.add("Mohan");
        TS.add("Zoya");
        System.out.println("Employee Names in Descending Order:");
        for (String name : TS) {
            System.out.println(name);
        }
    }
}
