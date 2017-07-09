// date:17.7.1

import static java.lang.System.out;

public class InitialzationDemo {
	public static void main(String[] args) {
		new InitialzationDemo();
	}

	public InitialzationDemo() {
		new M();
	}

	{
		out.println("(2) InitialzationDemo's instance block");
	}

	static {
		out.println("(1) InitialzationDemo's static block");
	}
}


class M extends N {
	M() {
		out.println("(8) M's constructor body");
	}

	{
		out.println("(7) M's instance initialzation block");
	}

	static {
		out.println("(4) M's static initialzation block");
	}
}

class N {
	N() {
		out.println("(6) N's constructor body");
	}

	{
		out.println("(5) N's instance initialzation block");
	}

	static {
		out.println("(3) N's static initialzation block");
	}
}



/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap9 $ java InitialzationDemo
(1) InitialzationDemo's static block
(2) InitialzationDemo's instance block
(3) N's static initialzation block
(4) M's static initialzation block
(5) N's instance initialzation block
(6) N's constructor body
(7) M's instance initialzation block
(8) M's constructor body
*/