package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class Exercise_07{
    public static void main(String args[]){
      try{
        System.out.println("Starting of silly try");
        throw new SillyException("This is a silly error message");
      }
      catch(SillyException exp){
        System.out.println("Silly Catch") ;
        System.out.println(exp) ;
      }
    }
  }
  class SillyException extends Exception{
    String str1;
    SillyException(String str2) {
      str1=str2;
    }
    public String toString(){ 
      return ("A Silly Exception has occurred: " + str1) ;
    }
  }