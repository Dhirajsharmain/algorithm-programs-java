/**
 * ****************************************************************************
 * Purpose: This Class is implemented to check one string is an anagram of
 * another if the second is simply a rearrangement of the first.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 16-06-2021 **********************************************************
 */
package bridgelabz.services;

public class AnagramDetection {

    /**
     * This is the main method or starting point of program.
     *
     * @param args
     */
    public static void main(String[] args) {
        String firstString = "abcd";
        String secondString = "dcba";

        // two string may be anagram of they are same in length, character wise.
        if (firstString.length() != secondString.length()) {
            System.out.println("Both string are not anagram");
        }else {
            char[] firstArray = firstString.toCharArray();
            char[] secondArray = secondString.toCharArray();

            anagramDetection(firstArray, secondArray);
        }
    }

    /**
     * Method for checking if elements of secondArray is equal to the firstArray elements.
     * To detecting anagram I am checking the characters of firstArray is same as the characters
     * of secondArray or not.
     * @param firstArray : first string character array
     * @param secondArray : second string character array
     */
    private static void anagramDetection(char[] firstArray, char[] secondArray) {
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    count += 1;
                }
            }
        }
        if (count == firstArray.length){
            System.out.println("Both strings are anagram");
        }else {
            System.out.println("Both strings are not anagram");
        }

    }
}
