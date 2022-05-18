package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {
    public static void main(String[] args) {
        // example of "OR"
        /*boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }*/
        // write your code below
        int a = 4;
        int b = 6;

        if (a < 5 & b < 5){
            System.out.println("1. both a & b are less than 5");
        }
        if (a < 5 && b < 5){
            System.out.println("2. both a & b are less than 5");
        }
        if (a < 5 | b < 5){
            System.out.println("3. a or b is less than 5");
        }
        if (a < 5 || b < 5){
            System.out.println("4. a or b is less than 5");
        }
        if (a < 5 ^ b < 5){
            System.out.println("5. either a or b is less than 5, but not both");
        }
        if ((a < 5) == !true){
            System.out.println("6. a is greater than 5");
        }


    }

}

