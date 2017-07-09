// date:17.7.1

import static java.lang.System.out;

public class HidingDemo {
	public static void main(String[] args) {
		A x = new B();

		out.println("(1) x.i is " + x.i);
		out.println("(2) (B)x.i is " + ((B)x).i);

		out.println("(3) x.j is " + x.j);
		out.println("(4) (B)x.j is " + ((B)x).j);

		out.println("(5) x.m1() is " + x.m1());
		out.println("(6) (B)x.m1() is " + ((B)x).m1());

		out.println("(7) x.m2() is " + x.m2());
		out.println("(8) (B)x.m3() is " + ((B)x).m3());

	}
}


class A {
	public int i = 1;
	public static int j = 11;

	public static String m1() {
		return "A's static m1";
	}

	public String m2() {
		return "A's instance m2";
	}

	public String m3() {
		return "A's instance m3";
	}
}

class B extends A {
	public int i = 2;
	public static int j = 12;

	public static String m1() {
		return "B's static m1";
	}

	public String m2() {
		return "B's instance m2";
	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap9 $ java HidingDemo
(1) x.i is 1
(2) (B)x.i is 2
(3) x.j is 11
(4) (B)x.j is 12
(5) x.m1() is A's static m1
(6) (B)x.m1() is B's static m1
(7) x.m2() is B's instance m2
(8) (B)x.m3() is A's instance m3
*/
