package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class Exercise_03 {

    public static void main(String[] args) {
        
        int[] test3 = {0,1,2,3};

        try {
            System.out.println(test3[2]/test3[0]);
        } catch (ArrayIndexOutOfBoundsException exc1) {
            System.out.println("Array Index Out Of Bounds");
        } catch (ArithmeticException exc2) {
            System.out.println("Cannot divide by 0");
        } finally {
            System.out.println("This prints once the try/catch has finished.");
        }

    }

 }