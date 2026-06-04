package org.johnsoncodelove;

import java.util.Scanner;

public class Main {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;

            case '-':
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;

            case '*':
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;

            case '/':
                try {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;

            default:
                System.out.println("Invalid operation!");
        }

        scanner.close();
    }
}