package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int length = str.length();
        System.out.println("The length of the string str is: " + length);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqu = str.equals(str2);
        System.out.println("Is str equal to str2? " + isEqu);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println("The result of the new string is: " + str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println("Replaced string is now: " + str.replace("l", "z"));

        System.out.println("Substring is: " + str2.substring(2,4));

        System.out.println("Does string 1 contain the letter 'e'? " + str.contains("e"));
        System.out.println("Does string 1 contain the letter 'e'? " + str.contains("r"));

        System.out.println("The letter 'o' is at place " + str.indexOf("o") + " in the string.");

    }


}