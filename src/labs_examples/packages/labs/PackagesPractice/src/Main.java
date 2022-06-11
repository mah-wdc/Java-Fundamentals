import basic_math.*;
import complex_math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Addition obj1 = new Addition(5, 7);
        Subtraction ob2 = new Subtraction(7, 5);
        Multiplication obj3 = new Multiplication(5, 7);
        Division obj4 = new Division(10, 5);
        Square obj5 = new Square(5);
        Cube obj6 = new Cube(5);
        Factorial obj7 = new Factorial(5);

        Addition obj8 = new Addition(3.3, 4.4);
        // doesn't work because it's protected
    }
}
