package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {
        arrayOfMultiples result1 = new arrayOfMultiples();
        result1.run();
        perfectSquare result2 = new perfectSquare();
        result2.run();
        reverseTheString result3 = new reverseTheString();
        result3.run();
    }
}

class arrayOfMultiples {

    public void arrayOfMultiples(int num1, int length) {

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = ((i + 1) * num1);
        }
        System.out.println(Arrays.toString(array));
    }
    public void run(){
        arrayOfMultiples(17 , 6);
    }
}

class perfectSquare {

    public void perfectSquare(int num1) {
        int[][] array = new int[num1][num1];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++)
                array[i][j] = num1;
        }
        System.out.println(Arrays.deepToString(array));
    }
    public void run(){
        perfectSquare(3);
    }
}

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