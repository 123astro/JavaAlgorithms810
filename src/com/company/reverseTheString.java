package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class reverseTheString {

    public void reverseTheString(String word) {

        StringBuilder output = new StringBuilder();
        List<Boolean> capHolder = new ArrayList<>(); // creating a truth table for caps
        List<Boolean> spaceHolder = new ArrayList<>(); // creating a truth table for spaces
        for (int i = 0; i < word.length(); i++) {
            if (Character.isSpaceChar(word.charAt(i))) {
                spaceHolder.add(true);
            } else {
                spaceHolder.add(false);
            }
            if (Character.isUpperCase(word.charAt(i))) {
                capHolder.add(true);
            } else {
                capHolder.add(false);
            }
        }

        int k = 0;
        for (int i = word.length() - 1; i >= 0; i--) { // i is decrementing and k is incrementing
            // i is the word (in reverse for loop) and k is the truth table
            if (spaceHolder.get(k)) {
                output.append(" ");
                i++;
            } else {
                if (capHolder.get(k)) {  //if true Upper case
                    output.append(word.toUpperCase(Locale.ROOT).charAt(i));
                } else { // else is false for lower case
                    if (word.charAt(i) != ' ') {  // Not equal to ' ' space
                        output.append(word.toLowerCase(Locale.ROOT).charAt(i));
                    } else {
                        k--;
                    }
                }
            }
            k++;
        }
        System.out.println("Reverse the string output: " + output);
    }

    public void run() {
        reverseTheString("1 23 456");
    }
}