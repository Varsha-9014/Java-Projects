package practice;

class Calculator {
    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a * b;
    }

    int calculate(int a, int b, int c) {
        return a * b * c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.calculate(12, 30));        // Adds integers
        System.out.println(c.calculate(12.5, 30.5));    // Multiplies doubles
        System.out.println(c.calculate(12, 30, 50));    // Multiplies three integers
    }
}

