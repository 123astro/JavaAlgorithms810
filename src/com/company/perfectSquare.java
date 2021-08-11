package com.company;

import java.util.Arrays;

class perfectSquare {

    public void perfectSquare(int num1) {

        int[][] array = new int[num1][num1];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++)
                array[i][j] = num1; // populate each position of the array with the num1 value.
        }
        System.out.println(Arrays.deepToString(array));
    }
    public void run(){
        perfectSquare(3);
    }
}

