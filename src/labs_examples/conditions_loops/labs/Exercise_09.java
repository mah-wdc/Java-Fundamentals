package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int x = 1000;
        do {
            System.out.println(x);
            x -= 3;
            if (x < 100){
                break;
            }
        } while (x > 0);
    }
}
