// date:17.3.28
// author: linyang <linyang@xiaomi.com>

public class TestCircle2 {
  public static void main(String[] args) {
    Circle2 c1 = new Circle2();
    
    System.out.println("before creating c2");
    System.out.println("c1 is : radius (" + c1.radius + ") and number of Circle pbjects (" + c1.numberOfObjects +  ")");
    
    Circle2 c2 = new Circle2(5);
    c1.radius = 9;
    System.out.println("\nafter creating c2 and modifying " + "c1's radisu to 9");
    System.out.println("c1 is : radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
    System.out.println("c2 is : radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
    
  }
}


/*
$ java TestCircle2
before creating c2
c1 is : radius (1.0) and number of Circle pbjects (1)

after creating c2 and modifying c1's radisu to 9
c1 is : radius (9.0) and number of Circle objects (2)
c2 is : radius (5.0) and number of Circle objects (2)
*/
