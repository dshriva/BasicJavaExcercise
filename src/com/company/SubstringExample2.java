//Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above

package com.company;

public class SubstringExample2 {
    public static void main(String[] args){
        String str = "Durga";
        String word = str.substring(str.length()-3);
        System.out.println(word + word + word + word);

    }
}
