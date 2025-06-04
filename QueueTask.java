package xyz;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {

	public static void main(String[] args) {
		Queue<String> Kids=new LinkedList<String>();
		Kids.add("1");
		Kids.add("2");
		Kids.add("3");
		System.out.println(Kids);
		
		String firstOut= Kids.poll();
		System.out.println(firstOut);
		System.out.println(Kids);
		Kids.add("4");
		System.out.println(Kids);
	}

}
