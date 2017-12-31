package com.company;

import java.util.Scanner;

public class Question66 {
    public static void main(String args[]) {

        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                sum += i;
            }

        }
        System.out.println("sum of prime numbers from 1 to 100 are :" + sum);

    }

    private static boolean isPrime(int n) {
        if (n == 2) return true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
