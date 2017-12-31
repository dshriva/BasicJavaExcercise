package com.company;

import java.util.Scanner;

public class Question61 {
    public static void main(String args[]) {
        System.out.println("enter the word");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char[] ch = word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

    }

}
