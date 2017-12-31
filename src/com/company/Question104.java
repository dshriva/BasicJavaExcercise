/*Write a Java program to create a new array from a given array of integers, new array will contain the elements from the given array before the last element value 10.*/
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Question104 {
    public static void main(String args[]) {

        int[] a = {1,2,6,8,10,4,6,9};
        System.out.println("the new array is" + (Arrays.toString(populateNewArray(a))));
    }

    private static int[] populateNewArray(int[] a) {

        int[] newArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 10) {
                newArray[i] = a[i];
                System.out.println(newArray[i]);
            }else if ( a[i] == 10){
                return newArray;
            }
        }
        return newArray;
    }
}
