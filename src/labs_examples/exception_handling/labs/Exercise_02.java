package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class Exercise_02 {

    public static void main(String[] args) {
        
        int[] test2 = {0,1,2,3};

        try {
            System.out.println(test2[2]/test2[0]);
        } catch (ArrayIndexOutOfBoundsException exc1) {
            System.out.println("Array Index Out Of Bounds");
        } catch (ArithmeticException exc2) {
            System.out.println("Cannot divide by 0");
        }

    }

 }


