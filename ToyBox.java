package xyz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ToyBox {

	public static void main(String[] args) {
		Stack<String> toys=new Stack<String>();
		toys.push("Ball");
		toys.push("Blocks");
		toys.push("Puzzle");
		System.out.println(toys.peek());
		System.out.println(toys);
		Queue<String> icecream=new LinkedList<String>();
		icecream.add("maya");
		icecream.add("Leo");
		icecream.add("Nina");
		System.out.println(icecream);
		String firstOut=icecream.poll();
		System.out.println(firstOut);
		System.out.println(icecream);

	}

}
