package com.company;

import java.util.Scanner;

public class Question44 {

    public static void main(String args[]) {
        try {

            System.out.println("input integer :");

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int sum = 0;
            sum = n + (10 * n + n) + ((100 * n) + ((10 * n) + n));
            System.out.println("sum is : " + sum);
        } catch (Exception e) {
            System.out.println("invalid input");

        }
    }
}
