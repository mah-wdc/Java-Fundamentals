package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_06 {

    public static void main(String[] args) {
        try { 
            firstStep();
        } catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("<< Array Index Out Of Bounds in MAIN >>");
        }
    } 
    public static void firstStep() throws ArrayIndexOutOfBoundsException {
        secondStep();
    }
    public static void secondStep() throws ArrayIndexOutOfBoundsException {
        int[] nums = {3,6,9,12,0};
        try {
            int x = nums[5];
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("<< Array Index Out Of Bounds in secondStep >>");
            throw exc;
        }
    }
}