package xyz;

import java.util.ArrayList;

public class ArrayListCheckExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Lucky");
        names.add("Jeevan");
        names.add("Varsha");

        String nameToCheck = "Jeevan";

        if (names.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the list.");
        } else {
            System.out.println(nameToCheck + " does not exist in the list.");
        }
    }
}
