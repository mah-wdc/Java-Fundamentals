public class App {
    public static void main(String[] args) throws Exception {
        Print1();
        System.out.println(multiply(23,45));

        App test = new App();
        test.Print2();

        App test2 = new App();
        System.out.println(test2.multiply(5.5,6.6));

        
        
        
    }
    public static void Print1(){
        System.out.println("printing Print 1 static");
    }
    public void Print2(){
        System.out.println("printing Print 2 non-static");
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public double multiply(double c, double d){
        return c*d;
    }
}

