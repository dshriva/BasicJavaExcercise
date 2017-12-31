//Write a Java program to count the letters, spaces, numbers and other characters of an input string.
package com.company;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.isSpaceChar;

public class Question38 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.next();
        int cntr_letter = 0;
        int cntr_digit = 0;
        int cntr_space = 0;
        int cntr_others = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (isLetter(ch[i])) {
                cntr_letter++;
            } else if (isDigit(ch[i])) {
                cntr_digit++;
            } else if ((isSpaceChar(ch[i]))) {
                cntr_space++;
            } else
                cntr_others++;
        }
        System.out.println("The  number of letters are : " + cntr_letter);
        System.out.println("The  number of spaces are : " + cntr_space);
        System.out.println("The  number of digits are : " + cntr_digit);
        System.out.println("The  number of other characters are : " +cntr_others);
    }

}