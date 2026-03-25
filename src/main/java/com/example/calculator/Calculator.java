package com.example.calculator;

public class Calculator {

    // Adds two integers and returns the sum.
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts the second integer from the first and returns the difference.
    public int subtract(int a, int b) {
        return a - b;
    }

    // Create a method to Multiply two integers and returns the product.
    public int multiply(int a, int b) {
        return a * b;
    }

    // Create a method that Divides the first integer by the second and returns the
    // quotient.
    // and Throws ArithmeticException if the second int is zero!
    public double division(int a, int b) {
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return a / b;
    }

    // Create any other method that you want (Does not have to be related to a
    // calulator!)

}
