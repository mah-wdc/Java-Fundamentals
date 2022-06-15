package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

 class Exercise_01 {

    public static void main(String[] args) {
        
        int[] test1 = {1,2,3};

        try {
            System.out.println(test1[5]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array Index Out Of Bounds");
        }

    }

 }

