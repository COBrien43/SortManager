package com.sparta.cob.engineering50.javabasic;

import java.util.Arrays;

public class MergeArray {

    public void merge(int[] array1, int[] array2) { //The parameters are two int arrays needed in main
        int length = array1.length + array2.length; //storing the length of the OVERALL array with array1 plus array2
        int[] array3 = new int[length]; //stores the overall length in a new int array called array3

        int pos = 0;
        for (int i : array1) {
            array3[pos] = i; //it goes through the first array and for each position adds it to the empty array
            pos++;
        }
        for (int j : array2) {
            array3[pos] = j; //it goes through the second array and for each position adds it to the empty array
            pos++;
        }
        System.out.println(Arrays.toString(array3)); //prints out the merged array to string

    }


}
