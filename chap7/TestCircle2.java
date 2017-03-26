

public class TestCircle2 {
  public static void main(String[] args) {
    Circle2 c1 = new Circle2();
    
    System.out.println("before creating c2");
    System.out.println("c1 is : radius (" + c1.radius + ") and number of Circle pbjects (" + c1.numberOfObjects +  ")");
    
    Circle2 c2 = new Circle2(5);
    c1.radius = 9;
    System.out.println("after creating c2");
  }
}