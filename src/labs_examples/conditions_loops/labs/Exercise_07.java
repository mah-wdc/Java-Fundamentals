package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        char A = 'A';
        char E = 'E';
        char I = 'I';
        char O = 'O';
        char U = 'U';
        char letter = 'x';

        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter a word: ");
        String word = input.nextLine();

        int length = word.length();
        int count = 0;
        while (count < length){
            if (word.charAt(count) == a || word.charAt(count) == e || word.charAt(count) == i ||
                    word.charAt(count) == o || word.charAt(count) == u || word.charAt(count) == A ||
                    word.charAt(count) == E || word.charAt(count) == I || word.charAt(count) == O ||
                    word.charAt(count) == U) {
                letter = word.charAt(count);
                break;
            }
            count++;
        }
        System.out.println("\nThe word you entered is: " + word + ".");
        System.out.println("The first vowel is: '" + letter + "'\n");
    }
}
