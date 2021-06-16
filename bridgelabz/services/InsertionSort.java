/**
 * ****************************************************************************
 * Purpose: This Class is implemented for insertion sorting on array data.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 15-06-2021 **********************************************************
 */

package bridgelabz.services;

import bridgelabz.utility.AlgoUtility;
import java.io.IOException;
import static bridgelabz.utility.AlgoUtility.fileReader;

public class InsertionSort {
    private static String[] dataArray;

    /**
     *This is the main method or starting point of program to sort the array data.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        dataArray = fileReader("E:\\BridgeLabs Training\\Java\\Data Structure\\AlgorithmPrograms\\src\\Data.csv");
        System.out.println("Before sorting : ");
        printArray();
        insertionSort(dataArray);
        System.out.println();
        System.out.println("After sorting : ");
        printArray();

    }

    /**
     * Method for insertion sorting, It is open to access though over the package,
     * and this method also used in BinarySort class for sorting.
     *
     * @param Data
     * @return
     */
    static String[] insertionSort(String[] Data) {
        AlgoUtility algoUtility = new AlgoUtility();
        int n = Data.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (Data[j - 1].compareTo(Data[j]) > 0)
                    algoUtility.swap(Data, j - 1, j);
                else break;
            }
        }
        return Data;
    }

    /**
     * Method for printing the array data
     */
    private static void printArray() {
        for (String i : dataArray) {
            System.out.println(i);
        }
    }

}
