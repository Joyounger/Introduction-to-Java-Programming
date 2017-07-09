// date:17.4.13
// author: linyang <942510346@qq.com>



import static java.lang.System.out;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public double getPrimeter() {
		return 2 * radius * Math.PI;
	}

	public void printCircle() {
		out.println("the Circle is created " + getDateCreated() + "  and the radius is " + radius);
	}


}