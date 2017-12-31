/* Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.
        */

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Question95 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = in.nextInt();

        System.out.println("the string array is :" + Arrays.toString(populateArray(n)));
    }

    private static String[] populateArray(int n) {
        String[] stringArray = new String[n];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = String.valueOf(i);
        }
        return stringArray;
    }


}
