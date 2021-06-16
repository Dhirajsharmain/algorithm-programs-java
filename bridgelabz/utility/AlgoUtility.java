/**
 * ****************************************************************************
 * Purpose: This is a utility class, this class is implemented to make the
 * methods open to access for all classes and to decrease the repeatability
 * of common code throughout the package.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 15-06-2021 **********************************************************
 */
package bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AlgoUtility {

    /**
     * Generics utility function to swap two elements in a array.
     *
     * @param array         : Characters array of input string
     * @param startingIndex : Index of character array from where the swap will start.
     * @param swapWithIndex : Index of character array to be swap with starting index.
     */
    public <T> void swap(T[] array, int startingIndex, int swapWithIndex) {
        T temp = array[startingIndex];
        array[startingIndex] = array[swapWithIndex];
        array[swapWithIndex] = temp;
    }

    /**
     * Utility function to swap two elements in a array.
     *
     * @param array         : Characters array of input string
     * @param startingIndex : Index of character array from where the swap will start.
     * @param swapWithIndex : Index of character array to be swap with starting index.
     */
    public void swap(char[] array, int startingIndex, int swapWithIndex) {
        char temp = array[startingIndex];
        array[startingIndex] = array[swapWithIndex];
        array[swapWithIndex] = temp;
    }

    /**
     * Method for read the csv file, Splits each line into words and store the words into array.
     *
     * @param filePath : Name of file or full path of file.
     * @throws IOException :
     */
    public static String[] fileReader(String filePath) throws IOException {
        String line;
        String[] wordsArray = new String[0];

        //Opens a file in read mode
        FileReader file = new FileReader(filePath);
        BufferedReader bufferReader = new BufferedReader(file);

        //Gets each line till end of file is reached
        while ((line = bufferReader.readLine()) != null) {
            //Splits each line into words
            wordsArray = line.split(",");
        }
        bufferReader.close();
        return wordsArray;
    }
}
