// date:17.4.13
// author: linyang <942510346@qq.com>
// compile:javac chap9/PolymorphismDemo.java
// run:java chap9/PolymorphismDemo

package  chap9;
import static java.lang.System.out;

public class TestPolymorphismCasting {
	public static void main(String[] args) {
		Object object1 = new Circle(1);
		Object object2 = new Rectangle(1, 1);

		displayObject(object1);
		displayObject(object2);
	}


	public static void displayObject(Object object) {
		if (object instanceof Circle) {
			out.println("the circle area is " + ((Circle)object).getArea());
			out.println("the circle diameter is " + ((Circle)object).getDiameter());
		} else if (object instanceof Rectangle) {
			out.println("the circle area is " + ((Rectangle)object).getArea());
			
		}
	}

}

/*
kolya@asus ~/src/Introduction-to-Java-Programming $ java chap9/TestPolymorphismCasting
the circle area is 3.141592653589793
the circle diameter is 2.0
the circle area is 1.0
*/