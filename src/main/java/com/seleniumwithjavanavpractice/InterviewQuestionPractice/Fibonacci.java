package com.seleniumwithjavanavpractice.InterviewQuestionPractice;

public class Fibonacci {
    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: fib(0) = 0, fib(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step
    }

    // Recursive method to print the Fibonacci series
    public static void printFibonacciSeries(int n) {
        if (n > 0) {
            printFibonacciSeries(n - 1); // Recur to print the previous Fibonacci numbers
            System.out.print(fibonacci(n - 1) + " "); // Print the nth Fibonacci number
        }
    }

    public static void main(String[] args) {
        int n = 6; // Print the first 6 Fibonacci numbers

        System.out.print("Fibonacci series up to " + n + " terms: ");
        printFibonacciSeries(n); // Call the method to print the series
    }
}
