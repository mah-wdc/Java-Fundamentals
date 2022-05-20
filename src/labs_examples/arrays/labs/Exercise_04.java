package labs_examples.arrays.labs;
import java.util.*;
/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] irregularArray = new int[3][6];
        for (int i = 0; i < irregularArray.length; i++) {
            for (int j = 0; j < irregularArray[i].length; j++) {
                irregularArray [i] [j] = i + j;
                System.out.print(irregularArray[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
