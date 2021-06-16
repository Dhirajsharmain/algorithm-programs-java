/**
 * ****************************************************************************
 * Purpose: This Class is implemented to do Merge Sort of list of Strings.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 15-06-2021 **********************************************************
 */

package bridgelabz.services;

public class MergeSort {

    /**
     * This is the main method or starting point of program.
     *
     * @param args
     */
    public static void main(String[] args) {

        String[] stringArray = new String[]{"fgh", "jkl", "zxc", "vbn", "anil", "bbc"};

        System.out.println("Unsorted Array : ");
        printArray(stringArray);

        MergeSort ob = new MergeSort();
        ob.sort(stringArray, 0, stringArray.length - 1);

        System.out.println("\nSorted array : ");
        printArray(stringArray);
    }

    /**
     * Main function that sorts stringArray[leftIndex...rightIndex] using merge().
     *
     * @param stringArray : Array to be sorted.
     * @param leftIndex   : Lower Index of array
     * @param rightIndex  : Higher Index of array.
     */
    private static void sort(String[] stringArray, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            // Find the middle point.
            int middle = (leftIndex + rightIndex) / 2;

            // Sort first and second halves.
            sort(stringArray, leftIndex, middle);
            sort(stringArray, middle + 1, rightIndex);

            // Merge the sorted halves.
            merge(stringArray, leftIndex, middle, rightIndex);
        }
    }

    /**
     * Method for merging two sub-arrays divided by sort method, find sizes of two sub-arrays to be merged,
     * Create temp arrays, Copy data to temp arrays, Merge the temp arrays.
     * First sub-array is stringArray[leftIndex..middle].
     * Second sub-array is stringArray[middle+1..rightIndex]
     *
     * @param stringArray : Array with unsorted data.
     * @param leftIndex   : starting point of left array.
     * @param middle      : end point of left array.
     * @param rightIndex  : enf point for right array.
     */
    private static void merge(String[] stringArray, int leftIndex, int middle, int rightIndex) {
        // Find sizes of two sub-arrays to be merged.
        int num1 = middle - leftIndex + 1;
        int num2 = rightIndex - middle;

        /* Create temp arrays */
        String[] leftArray = new String[num1];
        String[] rightArray = new String[num2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < num1; ++i)
            leftArray[i] = stringArray[leftIndex + i];
        for (int j = 0; j < num2; ++j)
            rightArray[j] = stringArray[middle + 1 + j];

        /* Merge the temp arrays */

        int i = 0, j = 0;
        int k = leftIndex;

        while (i < num1 && j < num2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                stringArray[k] = leftArray[i];
                i++;
            } else {
                stringArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of leftArray[] if any */
        while (i < num1) {
            stringArray[k] = leftArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of rightArray[] if any */
        while (j < num2) {
            stringArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    /**
     * Method for printing the print array.
     *
     * @param stringArray : Array to be printed.
     */
    private static void printArray(String stringArray[]) {
        for (int i = 0; i < stringArray.length; ++i)
            System.out.print(stringArray[i] + " ");
        System.out.println();
    }
}
