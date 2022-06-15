
/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Exercise_05 {

    public static void main(String[] args) {
        try {
            division(6,3);
        } catch (ArithmeticException exc){
            System.out.println("Can not divide by zero");
        }
        System.out.println("<< End of program >>");        

    }

    public static void division(int a, int b) throws ArithmeticException{
        System.out.println("The answer is " + a/b);
    }
}