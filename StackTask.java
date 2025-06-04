package xyz;

import java.util.Stack;

public class StackTask {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("plate 1");
		stack.push("plate 2");
		stack.push("plate 3");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println("How many plates are left"+stack);
		
	}
}
