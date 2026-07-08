//this problem to understanding problem that polyphorphism
//this code is method overloading

public class polymorphism {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calling int method
        System.out.println("Sum of two integers: " + calc.sum(1, 2));

        // Calling float method
        System.out.println("Sum of two floats: " + calc.sum(1.5f, 2.5f));

        // Calling three-integer method
        System.out.println("Sum of three integers: " + calc.sum(1, 2, 3));
    }
}

class Calculator {

    // Method for two integers
    int sum(int a, int b) {
        return a + b;
    }

    // Method for two floats
    float sum(float a, float b) {
        return a + b;
    }

    // Method for three integers
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

