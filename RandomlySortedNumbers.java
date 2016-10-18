package com;

import java.util.Arrays;

public class SortingNumbers {
    public static void main(String[] args) {

        int mas[] = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.print(mas[i] + "  ");
        }
        System.out.print("\n Sorted: \n");
        Arrays.sort(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
