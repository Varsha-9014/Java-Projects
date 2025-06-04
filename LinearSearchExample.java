package xyz;

public class LinearSearchExample {

	public static void main(String[] args) {
		int[] numbers= {2,3,4,5,8,9};
		int target=5;
		boolean found=false;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==target) {
			System.out.println("Found"+" "+target+" "+"at index"+i);
			found=true;
			break;
		}
		if(!found) {
			System.out.println("Number"+target+"not found");
		}
	}
}
}

