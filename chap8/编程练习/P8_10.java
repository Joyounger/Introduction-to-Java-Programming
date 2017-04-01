// date:17.4.1
// author: linyang <linyang@xiaomi.com>
// 10进制转换为2进制

import java.util.Scanner;

public class P8_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a decimal value");
		int value = in.nextInt();

		System.out.println(value + " 's binary string is " + convertDecimalToBinary(value));
	}

	public static String convertDecimalToBinary(int value) {
		StringBuilder strBuf = new StringBuilder();

		while(true) {
			int mod = value % 2;
			strBuf.append(mod);
			value = value / 2;
			if (value == 0)  {
				break;
			}
		}

		strBuf.reverse();
		return strBuf.toString();
	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_10
please enter a decimal value
9123
9123 's binary string is 10001110100011
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_10
please enter a decimal value
298
298 's binary string is 100101010
*/