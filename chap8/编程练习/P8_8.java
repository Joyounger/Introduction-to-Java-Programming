// date:17.4.1
// author: linyang <linyang@xiaomi.com>
// 2进制转换为10进制

import java.util.Scanner;


public class P8_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a binary string");
		String s = in.nextLine();

		System.out.println(s + " 's decimal value is " + parseBinary(s));
	}

	public static int parseBinary(String binaryString) {
		int len = binaryString.length();
		int sum = 0;

		for (int i = 0; i < len; i++) {
			if (Character.isDigit(binaryString.charAt(i))) {
				sum += (int)(binaryString.charAt(i) - '0') * Math.pow(2, len-1-i);
			}
		}

		return sum;

	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_8
please enter a binary string
10001
10001 's decimal value is 17
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_8
please enter a binary string
11111111
11111111 's decimal value is 255
*/