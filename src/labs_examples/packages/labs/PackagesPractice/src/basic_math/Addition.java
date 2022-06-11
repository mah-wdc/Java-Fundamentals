package basic_math;

import javax.swing.event.SwingPropertyChangeSupport;

public class Addition {

public Addition (int x, int y){
    System.out.println("The sum is " + (x+y) + ".");
}
protected Addition (double x, double y){
    System.out.println("The sum is " + (x+y) + ".");
}
}