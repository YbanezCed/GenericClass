package Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter another number: ");
        double num2 = scanner.nextDouble();

        Arithmetic<Double, Double> arithmetic = new Arithmetic<>(num1, num2);
        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + arithmetic.multiply());
        System.out.println("Division: " + arithmetic.divide());
        System.out.println("Min: " + arithmetic.getMin());
        System.out.println("Max: " + arithmetic.getMax());

        scanner.close();
    }
}
