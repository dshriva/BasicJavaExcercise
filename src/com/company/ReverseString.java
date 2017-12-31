package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]) {
        System.out.println("input the string");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] ch = str.toCharArray();



        for (int i = ch.length -1; i >= 0; i--) {
            System.out.print(ch[i]);

            }

        Calculator c = new Calculator();
        System.out.println();
        System.out.println(c.doCalculation(1,2,'+'));

    }
}

