/**
 * ****************************************************************************
 * Purpose: This Class is implemented for finding all permutations of a String
 * using iterative method and Recursion method. Check if the arrays returned by
 * two string functions are equal.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 15-06-2021 **********************************************************
 */

package bridgelabz;

import bridgelabz.utility.AlgoUtility;

public class Permutation {

    private static char[] charactersArray;

    /**
     * Recursive function to generate all permutations of a string
     *  @param charactersArray : Characters array of input string
     * @param startingIndex   : Index of character array from where the swap will start.
     */
    private static void permutations(char[] charactersArray, int startingIndex) {
        AlgoUtility algoUtility = new AlgoUtility();

        if (startingIndex == charactersArray.length - 1) {
            System.out.println(String.valueOf(charactersArray));
        }

        for (int i = startingIndex; i < charactersArray.length; i++) {
            //algoUtility.swap(charactersArray, startingIndex, i);
            permutations(charactersArray, startingIndex + 1);
            //algoUtility.swap(charactersArray, startingIndex, i);
        }
    }

    /**
     * This is the main method or starting point of program to generate all permutations of a string.
     *
     * @param args
     */
    public static void main(String[] args) {
        String inputString = "ABCD";
        charactersArray = inputString.toCharArray();
        permutations(charactersArray, 0);
    }
}
