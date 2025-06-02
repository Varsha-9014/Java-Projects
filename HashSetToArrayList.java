package xyz;

import java.util.HashSet;
import java.util.ArrayList;

public class HashSetToArrayList {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Lucky");
        set.add("Jeevan");
        set.add("Varsha");
        set.add("Jeevan");
        ArrayList<String> list = new ArrayList<String>(set);
        System.out.println(list);
    }
}
