// date:17.4.13
// author: linyang <942510346@qq.com>

// 如何编译
//Introduction-to-Java-Programming/chap9 $ ls
//Circle.class  Circle.java  GeometricObject.class  GeometricObject.java  Rectangle.class  Rectangle.java  TestCircleRectangle.class  TestCircleRectangle.java

//Introduction-to-Java-Programming $ javac chap9/TestCircleRectangle.java


package chap9;

import static java.lang.System.out;

public class TestCircleRectangle {
	public static void main(String[] args) {
		Circle circle = new Circle();
		out.println("A circle " + circle.toString());
		out.println(circle.getRadius());
		out.println("the radius is " + circle.getRadius());
		out.println("the area is " + circle.getArea());
		out.println("the Diameter is " + circle.getDiameter());

		Rectangle rectangle = new Rectangle(2, 4);
		out.println("\nA rectangle " + rectangle.toString());
		out.println("the area is  " + rectangle.getArea());
		out.println("the perimeter is " + rectangle.getPerimeter());
	}
}



/*
kolya@asus ~/src/Introduction-to-Java-Programming $ javac chap9/TestCircleRectangle.java 
kolya@asus ~/src/Introduction-to-Java-Programming $ java chap9.TestCircleRectangle
A circle created on Thu Apr 13 18:08:53 CST 2017
color: white and filled: false
0.0
the radius is 0.0
the area is 0.0
the Diameter is 0.0

A rectangle created on Thu Apr 13 18:08:53 CST 2017
color: white and filled: false
the area is  8.0
the perimeter is 12.0
*/