// date:17.4.9
// author: linyang <942510346@qq.com>
// 三角形类Triangle

import static java.lang.System.out;

public class P9_1 extends GeometricObject {
	private double side1, side2, side3;

	public P9_1() {
		side1 = side2 = side3 = 1.0;
	}

	public P9_1(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return this.side1;
	}

	public void setSide1(double side) {
		this.side1 = side;
	}

	public double getSide2() {
		return this.side2;
	}

	public void setSide2(double side) {
		this.side2 = side;
	}

	public double getSide3() {
		return this.side3;
	}

	public void setSide3(double side) {
		this.side3 = side;
	}

	public double getArea() {
		double p = (side1 + side2 + side3) / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}

	public double getPerimeter() {
		return (side1 + side2 + side3);
	}

	public String toString() {
		return "Triangle: side1 = " + side1 +  " side2 =  " + side2 + " side3= " + side3;
	}

	public static void main(String[] args) {
		P9_1 tri = new P9_1(1, 1.5, 1);
		tri.setColor("yellow");
		tri.setFilled(true);

		out.println("area is " + tri.getArea());
		out.println("perimeter is " + tri.getPerimeter());
		out.println("color is " + tri.getColor());
		out.println("is filled? " + tri.isFilled());
	}
}