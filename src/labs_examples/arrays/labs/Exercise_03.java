package labs_examples.arrays.labs;
import java.util.*;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {
        public static void main(String[] args) {
            int [] [] multOfThree = new int[5][5];
            int constant = 3;
            int xCount = 1;

            for (int y = 0; y < multOfThree.length; y++){
                for (int x = 0; x < multOfThree[y].length; x++) {
                    multOfThree [y] [x] = constant * xCount;  
                    System.out.print(multOfThree[y][x] + " ");
                    xCount++;
                } 
                System.out.println();
            }
        }   
    }
