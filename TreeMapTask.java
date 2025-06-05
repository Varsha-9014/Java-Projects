package xyz;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapTask {

    public static void main(String[] args) {

        TreeMap<String, String> ob = new TreeMap<>();

        ob.put("India", "New Delhi");
        ob.put("USA", "Washington");
        ob.put("Germany", "Berlin");
        ob.put("Japan", "Tokyo");
        ob.put("India", "Delhi"); 
        System.out.println(ob);
        System.out.println(ob.firstKey());
        System.out.println(ob.lastKey());
        System.out.println(ob.higherKey("India"));
        System.out.println(ob.lowerKey("Japan"));
        System.out.println("\nCountry and Capital in Sorted Order:");
        for (Map.Entry<String, String> entry : ob.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
