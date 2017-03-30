// date:17.3.28
// author: linyang <linyang@xiaomi.com>

public class TestPassObject {
  public static void main(String[] args) {
    Circle3 c1 = new Circle3(1);
    
    int n = 5;
    printAreas(c1, n);
    
    System.out.println("\n" + "Radius is " + c1.getRadius());
    System.out.println("n is " + n);
    
  }
  
  public static void printAreas(Circle3 c, int times) {
    System.out.println("Radius \t\tArea");
    while(times >= 1) {
      System.out.println(c.getRadius() + "\t\t" + c.getArea());
      c.setRadius(c.getRadius() + 1);
      times--;
    }
  }
}