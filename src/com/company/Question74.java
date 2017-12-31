
/*Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2. Go to the editor
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10
*/
package com.company;

import java.util.Arrays;

public class Question74 {
    public static void main(String args[]) {
        int[] a = {10, -20, 0, 30, 40, 60, 10};
        if (a.length >= 2) {
            if (Test(a)) {
                System.out.println("the first and last element is 10 ");
            } else {
                System.out.println("the first and last element is NOT 10 ");
            }
        }
    }

    private static boolean Test(int[] a) {


        return ((a[0] == a[a.length - 1]));

    }
}
