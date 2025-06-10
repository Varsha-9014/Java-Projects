package varsha;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // 1. Sort numbers [5,2,8] using a Queue
        Queue<Integer> numberQueue = new LinkedList<>(Arrays.asList(5, 2, 8));
        List<Integer> sortedNumbers = new ArrayList<>(numberQueue);
        Collections.sort(sortedNumbers);
        System.out.println("Sorted Numbers: " + sortedNumbers);

        // 2. Create a list of games and play the most fun one first
        class Game implements Comparable<Game> {
            String name;
            int funLevel;

            Game(String name, int funLevel) {
                this.name = name;
                this.funLevel = funLevel;
            }

            @Override
            public int compareTo(Game other) {
                return Integer.compare(other.funLevel, this.funLevel); // Higher funLevel first
            }

            public String toString() {
                return name + " (Fun: " + funLevel + ")";
            }
        }

        java.util.PriorityQueue<Game> gameQueue = new java.util.PriorityQueue<>();
        gameQueue.add(new Game("Minecraft", 8));
        gameQueue.add(new Game("Chess", 5));
        gameQueue.add(new Game("Fortnite", 9));
        System.out.println("Most fun game to play: " + gameQueue.poll());

        // 3. Use PriorityQueue to pick smallest number
        java.util.PriorityQueue<Integer> minHeap = new java.util.PriorityQueue<>();
        minHeap.addAll(Arrays.asList(10, 4, 7, 2, 15));
        System.out.println("Smallest number: " + minHeap.peek());

        // 4. To-do list: do urgent things first
        class Task implements Comparable<Task> {
            String task;
            int urgency;

            Task(String task, int urgency) {
                this.task = task;
                this.urgency = urgency;
            }

            @Override
            public int compareTo(Task other) {
                return Integer.compare(this.urgency, other.urgency);
            }

            public String toString() {
                return task + " (Urgency: " + urgency + ")";
            }
        }

        java.util.PriorityQueue<Task> todoList = new java.util.PriorityQueue<>();
        todoList.add(new Task("Do homework", 2));
        todoList.add(new Task("Drink water", 1));
        todoList.add(new Task("Watch YouTube", 5));
        System.out.println("Urgent task to do: " + todoList.poll());

        // 5. Find top 2 smallest numbers
        List<Integer> values = Arrays.asList(12, 3, 19, 7, 1);
        java.util.PriorityQueue<Integer> smallestQueue = new java.util.PriorityQueue<>(values);
        System.out.println("Top 2 smallest numbers: " + smallestQueue.poll() + ", " + smallestQueue.poll());

        // 6. Cartoon-style Task Queue
        Queue<String> cartoonQueue = new LinkedList<>();
        cartoonQueue.offer("Eat 🍔");
        cartoonQueue.offer("Sleep 💤");
        cartoonQueue.offer("Code 💻");

        System.out.println("Cartoon-style Task Queue:");
        while (!cartoonQueue.isEmpty()) {
            System.out.println("➡ " + cartoonQueue.poll());
        }
    }
}