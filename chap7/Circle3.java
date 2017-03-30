// date:17.3.27
// author: linyang <linyang@xiaomi.com>

public class Circle3 {
  private double radius = 1;
  private static int numberOfObjects = 0;

  public Circle3 () {
    numberOfObjects++;
  }

  public Circle3 (double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }
  
  public double getRadius() {
    return radius;
  }

  public void setRadius(double newRadius) {
    radius = (newRadius >= 0 ? newRadius : 0);
  }
  
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }
}




  