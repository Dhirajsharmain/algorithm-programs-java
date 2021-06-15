/**
 * ****************************************************************************
 * Purpose: This Class is implemented to Read in a list of words from File.
 * Then prompt the user to enter a word to search the list.
 * The program reports if the search word is found in the list
 *
 * @author Dhiraj
 * @version 1.0
 * @since 15-06-2021 **********************************************************
 */

package bridgelabz;

import java.io.IOException;
import java.util.Scanner;

import static bridgelabz.InsertionSort.insertionSort;
import static bridgelabz.utility.AlgoUtility.fileReader;

public class BinarySearch {
    /**
     * This is the main method or starting point of program.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String[] unsortedData = fileReader("E:\\BridgeLabs Training\\Java\\Data Structure\\AlgorithmPrograms\\src\\Data.csv");
        String[] sortedData = insertionSort(unsortedData);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ");
        String userInput = scanner.nextLine();

        int result = binarySearch(sortedData, userInput);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);

    }

    /**
     * Method for binary search, In which Check if userInput is present at middle of array,
     * after that check If userInput greater, then ignore left half go with right half, else
     * If userInput is smaller, then ignore right half.
     *
     * @param array
     * @param userInput
     * @return
     */
    private static int binarySearch(String[] array, String userInput) {
        int startingIndex = 0, range = array.length - 1;
        while (startingIndex <= range) {
            int middle = startingIndex + (range - startingIndex) / 2;
            int result = userInput.compareTo(array[middle]);

            // Check if userInput is present at middle
            if (result == 0)
                return middle;

            // If userInput greater, ignore left half
            if (result > 0)
                startingIndex = middle + 1;

                // If userInput is smaller, ignore right half
            else
                range = middle - 1;
        }

        return -1;
    }

}
