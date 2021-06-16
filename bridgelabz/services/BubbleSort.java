/**
 * ****************************************************************************
 * Purpose: The purpose of this class is to reads in integers and prints them
 * in sorted order using Bubble Sort.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 15-06-2021 **********************************************************
 */

package bridgelabz.services;

import bridgelabz.utility.AlgoUtility;

public class BubbleSort {
    private static Integer array[] = {52, 14, 35, 2, 45, 210, 5};
    public static void main(String[] args) {
        System.out.println("Before Sorting Data : ");
        printArray(array);
        bubbleSort(array);
        System.out.println("After Sorting Data : ");
        printArray(array);
    }

    /**
     * Method for bubble sorting.
     * @param array
     */
    private static void bubbleSort(Integer[] array) {
        AlgoUtility algoUtility = new AlgoUtility();
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    algoUtility.swap(array, j - 1, j);
                }

            }
        }
    }

    /**
     * Method for printing the array elements
     * @param array
     */
    private static void printArray(Integer[] array){
        for (int element:array) {
            System.out.println(element);
        }
    }
}