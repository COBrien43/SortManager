package com.sparta.cob.engineering50.javabasic;

public class BubbleSort {


    public void bubbleSort(int[] array) {
        int i;
        for (i = 0; i < array.length - 1; i++) {
            int j;
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }


}

