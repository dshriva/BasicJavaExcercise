/*Write a Java program to find the penultimate (next to last) word of a sentence. Go to the editor
        Sample Output:

        Input a String: The quick brown fox jumps over the lazy dog.
        Penultimate word: lazy
        */
package com.company;

public class Question60 {
    public static void main(String args[]) {
        String str = "The quick brown fox jumps over the lazy dog";
        String penal_word = str.substring(str.length() - 8, str.length() - 3);
        System.out.println("penultimate word is :" + penal_word);
    }
}
