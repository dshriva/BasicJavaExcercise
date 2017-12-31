package com.company;

import java.util.Scanner;

public class SumEqualThird {

    public static void main(String args[]) {
        try {
            System.out.println("input the 1st number :");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            System.out.println("input the 2nd number :");
            int b = in.nextInt();
            System.out.println("input the 3rd number :");
            int c = in.nextInt();
            int sum = a + b;
            System.out.println(retfunction(sum, c));


        } catch (Exception e) {
            System.out.println("invalid input");
        }
    }
    public static boolean retfunction(int sum, int c) {
        if (sum == c) {
            return true;
        } else {
            return false;
        }
    }
}