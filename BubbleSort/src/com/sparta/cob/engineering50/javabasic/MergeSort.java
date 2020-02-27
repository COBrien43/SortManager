package com.sparta.cob.engineering50.javabasic;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] array) { //The parameters are two int arrays needed in main
        int n = array.length;

        int[] firstHalf = new int[(n + 1) / 2];
        int[] secondHalf = new int[n - firstHalf.length];

        for (int i = 0; i < n; i++) {
            if (i < firstHalf.length) {
                firstHalf[i] = array[i];
            } else {
                secondHalf[i - firstHalf.length] = array[i];
            }
        }

        System.out.println(Arrays.toString(firstHalf));
        System.out.println(Arrays.toString(secondHalf));
    }
}
