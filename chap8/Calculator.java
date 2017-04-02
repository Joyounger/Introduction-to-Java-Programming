// date:17.4.2
// author: linyang <linyang@xiaomi.com>


public class Calculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		int result = 0;
		switch (args[1].charAt(0)) {
			case '+': result = Integer.parseInt(args[0]) +
							   Integer.parseInt(args[2]);
					  break;
			case '-': result = Integer.parseInt(args[0]) -
							   Integer.parseInt(args[2]);
					  break;
			case '*': result = Integer.parseInt(args[0]) *
							   Integer.parseInt(args[2]);
					  break;
			case '/': result = Integer.parseInt(args[0]) /
							   Integer.parseInt(args[2]);
					  break;	
			
		}

		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
			+ " = " + result);
	}
}

/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap8 $ java Calculator
usage: java Calculator operand1 operator operand2
kolya@asus ~/src/Introduction-to-Java-Programming/chap8 $ java Calculator 63 + 48
63 + 48 = 111
kolya@asus ~/src/Introduction-to-Java-Programming/chap8 $ java Calculator 63 + 40
63 + 40 = 103
kolya@asus ~/src/Introduction-to-Java-Programming/chap8 $ java Calculator 63 * 40
usage: java Calculator operand1 operator operand2
kolya@asus ~/src/Introduction-to-Java-Programming/chap8 $ java Calculator 63 / 40
63 / 40 = 1
kolya@asus ~/src/Introduction-to-Java-Programming/chap8 $ java Calculator 63 * 40
usage: java Calculator operand1 operator operand2
kolya@asus ~/src/Introduction-to-Java-Programming/chap8 $ javac Calculator.java 
kolya@asus ~/src/Introduction-to-Java-Programming/chap8 $ java Calculator 63 * 40
usage: java Calculator operand1 operator operand2
kolya@asus ~/src/Introduction-to-Java-Programming/chap8 $ java Calculator 63 "*" 40
63 * 40 = 2520
*/