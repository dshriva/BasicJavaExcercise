

package com.company;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println("input number");

        int limit = 4;
        while ( limit > 0) {
            Scanner in = new Scanner(System.in);
            int sum = 0;
            try {
                int x = in.nextInt();

                while (x > 0) {
                    int r = x % 10;

                    sum += r;
                    x = x / 10;
                }
                System.out.println(sum);

            } catch (Exception e) {
                System.out.println("invalid number");
                //return;
            }
            limit--;
        }

    }
}




