package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        
        int [] numArray = new int[10];
        int sum = 0;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Input first number: ");
        numArray[0] = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Input second number: ");
        numArray[1] = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Input third number: ");
        numArray[2] = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.print("Input fourth number: ");
        numArray[3] = input4.nextInt();

        Scanner input5 = new Scanner(System.in);
        System.out.print("Input fifth number: ");
        numArray[4] = input5.nextInt();

        Scanner input6 = new Scanner(System.in);
        System.out.print("Input sixth number: ");
        numArray[5] = input6.nextInt();

        Scanner input7 = new Scanner(System.in);
        System.out.print("Input seventh number: ");
        numArray[6] = input7.nextInt();

        Scanner input8 = new Scanner(System.in);
        System.out.print("Input eighth number: ");
        numArray[7] = input8.nextInt();

        Scanner input9 = new Scanner(System.in);
        System.out.print("Input nineth number: ");
        numArray[8] = input9.nextInt();

        Scanner input10 = new Scanner(System.in);
        System.out.print("Input tenth number: ");
        numArray[9] = input10.nextInt();

        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The average of the numbers is " + (sum/10));

    }

}