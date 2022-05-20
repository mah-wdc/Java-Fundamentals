package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number from 1 - 10: ");
        int indexNumber = input.nextInt();

        System.out.println("The index you selected holds number: " + array[indexNumber]);


    }
}