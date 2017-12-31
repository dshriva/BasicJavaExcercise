//Write a Java program to insert a word in the middle of the another string.
//Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0

package com.company;

public class SubstringEx1 {
    public void main(String[] args) {
        String str = "Python 3.0";
        String word = "Tutorial";
        System.out.println(str.substring(0, 6) + word + str.substring(6));

    }


}
