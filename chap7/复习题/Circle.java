

public class Circle {
  private double radius = 1.0;
  
  double getAre() {
    return radius * radius * Math.PI;
  }
  
  public static void main(String[] args) {
    Circle myCircle = new Circle();
    System.out.println("radius is " + myCircle.radius); //radius不是静态的，静态方法可以通过类对象调用非静态成员变量、非静态方法
  }
} 