/* 
Without running the code below, please tell me what it will print.

Output: Child called

*/
public class InheritanceTest

{
  public static void main(String[] args)
  {
    Parent c = new Child();
    c.doSomething();
  }
}

class Parent
{
  public void doSomething()
  {
    System.out.println("Parent called");
  }
}

class Child extends Parent
{
  public void doSomething()
  {
    System.out.println("Child called");
  }
}