package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class Exercise_04 {

    public static void main(String[] args) {
        
        int[] test4 = {0,1,2,3};
        
        try {
            try {
                System.out.println(test4[8]);
            } catch (ArrayIndexOutOfBoundsException exc4) {
                System.out.println("Array Index Out Of Bounds");
            } try {
                System.out.println(test4[2]/test4[0]);
            } catch (ArithmeticException exc4) {
                System.out.println("Cannot divide by 0");
            }
        } finally {
            System.out.println("This prints once the try/catch has finished.");
        }
    }
}