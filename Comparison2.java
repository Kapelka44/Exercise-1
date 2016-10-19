package com;

import java.util.*;

public class Comparison2 {
    public static void main(String[] args) {
        int array[] = new int[20];
        for (int q = 0; q < array.length; q++) {
            array[q] = (int) (Math.random() * 100);
            System.out.print(array[q] + "  ");
        }
        bubbleSort(array);
        System.out.println("Number ascending: " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] number) {
        for(int i = number.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( number[j] > number[j+1] ){
                    int tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                }
            }
        }
    }
}
