package com.company;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String args[]) {
        System.out.println("input the number :");
        Scanner in = new Scanner(System.in);
        try {
            int a = in.nextInt();

            if (a % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is odd");


            }
        } catch (Exception e) {
            System.out.println("invalid input");

        }
    }
}

