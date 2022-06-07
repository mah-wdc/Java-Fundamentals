/* 
Without running the code below, please tell me what will print. Why?
Parent called
Child called
because Child extends Parent so it moves to the top of the chain and executes down

*/

public class InheritanceTest
{
  public static void main(String[] args)
  {
    Parent c = new Child();
  }
}

class Parent
{
  public Parent()
  {
    System.err.println("Parent called");
  }
}

class Child extends Parent
{
  public Child()
  {
    System.err.println("Child called");
  }
}