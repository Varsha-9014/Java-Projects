package xyz;

import java.util.TreeSet;

public class TreeSetTaskExample {

	public static void main(String[] args) {
		TreeSet<Integer> TS=new TreeSet<Integer>();
		TS.add(40);
		TS.add(70);
		TS.add(80);
		TS.add(10);
		System.out.println(TS.getFirst());
		System.out.println(TS.getLast());
		int element=40;
		System.out.println(TS.higher(element));
		System.out.println(TS.lower(element));
	}

}
