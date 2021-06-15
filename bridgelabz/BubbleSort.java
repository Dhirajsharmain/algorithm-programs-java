/**
 * ****************************************************************************
 * Purpose: The purpose of this class is to reads in integers and prints them
 * in sorted order using Bubble Sort.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 15-06-2021 **********************************************************
 */

package bridgelabz;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {52, 14, 35, 2, 45, 210, 5};

        System.out.println("Before Sorting Data : ");
        printArray(array);
        bubbleSort(array);
        System.out.println("After Sorting Data : ");
        printArray(array);
    }


    private static void bubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    private static void printArray(int[] array){
        for (int element:array) {
            System.out.println(element);
        }
    }
}