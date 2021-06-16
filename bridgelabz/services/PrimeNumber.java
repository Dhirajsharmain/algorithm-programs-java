/**
 * ****************************************************************************
 * Purpose: This Class is implemented to take a range of 0 - 1000 Numbers
 * and find the Prime numbers in that range.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 16-06-2021 **********************************************************
 */
package bridgelabz.services;

import java.util.Scanner;

public class PrimeNumber {

    public static int i, j, flag;

    /**
     * This is the main method or starting point of program.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerLimit, upperLimit;

        System.out.print("Enter lower limit of the range between 0 to 1000 : ");
        lowerLimit = scanner.nextInt();

        System.out.print("Enter upper limit of the range between " + lowerLimit + " to 1000 : ");
        upperLimit = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerLimit + " " + upperLimit + " and are: ");
        findPrimeNumber(lowerLimit, upperLimit);
    }

    /**
     * Method for finding prime number in between a range (eg. 20 to 50)
     *
     * @param lowerLimit : Lower number of range
     * @param upperLimit : upper number of range
     */
    private static void findPrimeNumber(int lowerLimit, int upperLimit) {

        for (i = lowerLimit; i <= upperLimit; i++) {
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);

        }
    }
}
