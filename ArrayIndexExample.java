package xyz;

import java.util.ArrayList; 

public class ArrayIndexExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Lucky");
        names.add("Jeevan");
        names.add("Varsha");

        int index = names.indexOf("Jeevan");

        if (index != -1) {
            System.out.println("Jeevan is at index: " + index);
        } else {
            System.out.println("Jeevan is not found in the list.");
        }
    }
}
