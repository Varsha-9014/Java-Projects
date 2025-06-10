package varsha;

class Car implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Car is moving " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Car thread interrupted");
            }
        }
    }
}

class Bike implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Bike is moving " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Bike thread interrupted");
            }
        }
    }
}

public class SimpleRace1 {
    public static void main(String[] args) {
        Thread carThread = new Thread(new Car());
        Thread bikeThread = new Thread(new Bike());

        System.out.println("Race started!");
        carThread.start();
        bikeThread.start();
    }
}
