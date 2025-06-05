package xyz;

abstract class Car {
    abstract void start();         
    abstract void accelerate();     
    abstract void brake();          
    abstract void steer(String direction); 

    void stop() {
        System.out.println("Car is stopped.");
    }
}


class DriverCar extends Car {
    @Override
    void start() {
        System.out.println("Car is started.");
    }

    @Override
    void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    void brake() {
        System.out.println("Car is braking.");
    }

    @Override
    void steer(String direction) {
        System.out.println("Car is turning " + direction + ".");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Car myCar = new DriverCar();  

        myCar.start();                
        myCar.accelerate();           
        myCar.steer("left");          
        myCar.brake();                
        myCar.stop();                 
    }
}
