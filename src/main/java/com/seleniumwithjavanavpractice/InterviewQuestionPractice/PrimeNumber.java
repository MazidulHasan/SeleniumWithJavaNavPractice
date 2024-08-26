package com.seleniumwithjavanavpractice.InterviewQuestionPractice;

public class PrimeNumber {
    public static void main(String[] args) {
        if (isPrime(20)) {
            System.out.println("yes");
        }
    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
