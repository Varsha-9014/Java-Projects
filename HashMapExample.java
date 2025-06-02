package xyz;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> HM=new HashMap<Integer,String> ();
		HM.put(1,"varsha");
		HM.put(2, "Honey");
		HM.put(3, "Jeevan");
		HM.put(4, "Madhuri");
		HM.put(5, "Hemanth");
		System.out.println(HM);
		HM.remove(2);
		System.out.println(HM);
		HM.put(4, "Vicky");
		System.out.println(HM);
		if(HM.containsKey(1)) {
			System.out.println("Key 1 is exist"+HM);
		}else {
			System.out.println("Key doesnot exist");
		}
		if(HM.containsValue("Hemanth")) {
			System.out.println("Value is exist"+HM);
		}else {
			System.out.println("Value not exist");
		}
		System.out.println("All Keys: " + HM.keySet());
		System.out.println("All Values: " + HM.values());
		System.out.println("All Key-Value Pairs:");
		for (HashMap.Entry<Integer, String> entry : HM.entrySet()) {
			   System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

	}

}
