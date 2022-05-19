package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int sum = 0;
        float count = 0.0f;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter a starting number: ");
        int lowerBound = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Please enter an ending number: ");
        int upperBound = input2.nextInt();

        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
            count++;
        }

        System.out.println("The sum of the numbers from " + lowerBound + " to " + upperBound + " is " + sum + ".");
        System.out.println("The average of the numbers is " + (sum/count) + ".");

    }
}
