package xyz;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> AL=new ArrayList<String>();
		AL.add("Lucky");
		AL.add("Jeevan");
		AL.add("Varsha");
		Collections.sort(AL);
		System.out.println(AL);
		Collections.reverse(AL);
		System.out.println(AL);
		AL.remove(1);
		AL.remove("Jeevan");
		System.out.println(AL);

		
	}

}
