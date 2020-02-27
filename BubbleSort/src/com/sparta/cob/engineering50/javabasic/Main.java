package com.sparta.cob.engineering50.javabasic;

public class Main {

    public static void main(String[] args) {
        /*BubbleSort bubbleSort = new BubbleSort();
        int array[] = {6,9,4,3,2,5,7,1,8};
        bubbleSort.bubbleSort(array);
        System.out.println("Sorted Array");
        bubbleSort.printArray(array);*/


        MergeArray mergeArray = new MergeArray();
        int [] array= {1,2,3,4,5};
        int[] array1= {6,7,8,9,10};
        mergeArray.merge(array, array1);

        /*MergeSort mergeSort = new MergeSort();
        int [] array= {10,7,3,1,4,9,6,2,5,8};
        mergeSort.mergeSort(array);*/

    }
}
