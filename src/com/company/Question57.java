
//Write a Java program to accepts an integer and count the factors of the number
package com.company;

import java.util.Scanner;

public class Question57 {
    public static void main(String args[]) {
        System.out.println("enter the integer :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = countfactor(n);
        System.out.println("the number of factors of the number :" + result);
    }


    private static int countfactor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }

        }
        return cnt;
    }
}