package complex_math;

public class Factorial {
 
    public Factorial (int x){
        int sum = 1;
        for (; x > 0; x--) {
            sum = x * sum;
        }
        System.out.println("The factorial is " + sum + ".");
    }
    protected Factorial (long x){
        long sum = 1;
        for (; x > 0; x--) {
            sum = x * sum;
        }
        System.out.println("The factorial is " + sum + ".");
    }
}
