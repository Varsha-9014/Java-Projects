package varsha;

import java.util.*;

public class QueueTask {

    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);

        System.out.println("Original Queue: " + numbers);
        List<Integer> list = new ArrayList<>(numbers);
        Collections.sort(list);  
        numbers.clear();
        numbers.addAll(list);

        System.out.println("Sorted Queue: " + numbers);
    }
}
