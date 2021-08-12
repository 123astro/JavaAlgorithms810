package com.company;

import java.util.Arrays;

class arrayOfMultiples {

    public void arrayOfMultiples(int num1, int length) {

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = ((i + 1) * num1); // take each num1 value and multiply it by the (iterator + 1) and assign
            // result to the array at index i.
        }
        System.out.println("Array of Multiples: " + Arrays.toString(array));
    }
    public void run(){
        arrayOfMultiples(17 , 6);
    }
}