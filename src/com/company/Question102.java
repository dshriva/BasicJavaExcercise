/* Write a Java program to check if a specified array of integers contains 10's and 30's. */

package com.company;

import java.util.Scanner;

public class Question102 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter the array");
        for(int i =0 ; i < a.length ; i++){
             a[i] = in.nextInt();
        }
        if (TestArray(a)) {
            System.out.println("the array contains 10's and 30's");
        } else {
            System.out.println("the array DOES NOT contain 10's and 30's");
        }

    }


    private static boolean TestArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 10 && a[i] < 20) {
                return true;
            }
            if (a[i] >= 30 && a[i] < 40) {
                return true;
            }
        }
        return false;
    }
}
