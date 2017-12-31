package com.company;

public class UniqueThreeDigit {
    public static void main(String args[]) {
        int number=0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && j != k && k != i) {
                        System.out.println(i + "" + j + "" + k);
                        number ++;
                    }
                }

            }
        }
        System.out.println("number of unique combinations :" + number);
    }
}
