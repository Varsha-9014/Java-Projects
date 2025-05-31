package varsha;

class Car extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Car is moving " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // Handle exception if needed
            }
        }
    }
}

class Bike extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Bike is moving " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // Handle exception if needed
            }
        }
    }
}

public class SimpleRace {
    public static void main(String[] args) {
        new Car().start();
        new Bike().start();
    }
}
