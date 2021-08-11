package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class reverseTheString {

    public void reverseTheString(String word) {

        StringBuilder output = new StringBuilder();
        List<Boolean> capHolder = new ArrayList<>();
        List<Boolean> spaceHolder = new ArrayList<>();
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

        int j = 0;
        for (int i = word.length() - 1; i >= 0; i--) { // i is decrementing and j is incrementing
            if (spaceHolder.get(j)) {
                output.append(" ");
                i++;
            } else {
                if (capHolder.get(j)) {  //if true Upper case
                    output.append(word.toUpperCase(Locale.ROOT).charAt(i));
                } else if (!capHolder.get(j)) { // if false lower case
                    if (word.charAt(i) != ' ') {
                        output.append(word.toLowerCase(Locale.ROOT).charAt(i));
                    } else {
                        j--;
                    }
                }
            }
            j++;
        }
        System.out.println(output);
    }
    public void run(){
        reverseTheString("1 23 456");
    }
}