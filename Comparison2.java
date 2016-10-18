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
        int i;
        boolean flag = true;
        int stop;
        while (flag) {
            flag = false;
            for (i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    stop = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = stop;
                    flag = true;
                }
            }
        }
    }
}
