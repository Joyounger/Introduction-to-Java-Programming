

public class Circle1 {
  public static void main(String[] args) {
    Circle1 c1 = new Circle1(5.0);
    System.out.println("the are of the circle of radius " + c1.radius + " is " + c1.getArea());
      
    Circle1 c2 = new Circle1();
    System.out.println("the are of the circle of radius " + c2.radius + " is " + c2.getArea());
    
    c2.radius = 100;
    System.out.println("the are of the circle of radius " + c2.radius + " is " + c2.getArea());
  }
  
  
  double radius;
  
  Circle1() {
    this.radius = 1.0;
  }
  
  Circle1(double radius) {
    this.radius = radius;
  }
  
  double getArea() {
    return radius * radius * Math.PI;
  }
}

/*
the are of the circle of radius 5.0 is 78.53981633974483
the are of the circle of radius 1.0 is 3.141592653589793
the are of the circle of radius 100.0 is 31415.926535897932
*/
