package varsha;

public class ConstantTimeExample {

    public static void printFirstElement(int[] arr) {
        if (arr.length > 0) {
            System.out.println("First element is: " + arr[0]);
        } else {
            System.out.println("Array is empty.");
        }
    }

    public static void main(String[] args) {
       
        int[] numbers = {10, 20, 30, 40, 50,60,70,80,5,7,8,9,4,23,22,24,25,26,27,28,29,77,78,79,81,82,83,84};

      
        printFirstElement(numbers);
    }
}