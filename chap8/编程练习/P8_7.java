// date:17.3.31
// author: linyang <linyang@xiaomi.com>
// 16进制转换为10进制

import java.util.Scanner;


public class P8_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a hex string");
		String s = in.nextLine();

		System.out.println(s + " 's decimal value is " + parseHex(s));
	}

	public static int parseHex(String hexString) {
		int len = hexString.length();
		int sum = 0;
		char offset1 = (char)('A' - 10);
		char offset2 = (char)('a' - 10);

		for (int i = 0; i < len; i++) {
			if (Character.isUpperCase(hexString.charAt(i))) {
				sum += (int)(hexString.charAt(i) - offset1) * Math.pow(16, len-1-i);
			}
			if (Character.isLowerCase(hexString.charAt(i))) {
				sum += (int)(hexString.charAt(i) - offset2) * Math.pow(16, len-1-i);
			}
			if (Character.isDigit(hexString.charAt(i))) {
				sum += (int)(hexString.charAt(i) - '0') * Math.pow(16, len-1-i);
			}
		}

		return sum;
	}
}

/*
please enter a hex string
ABC
ABC 's decimal value is 2748
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_7
please enter a hex string
10A
10A 's decimal value is 266
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_7
please enter a hex string
FAA
FAA 's decimal value is 4010
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_7
please enter a hex string
A5
A5 's decimal value is 165

kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_7
please enter a hex string
abC
abC 's decimal value is 2748
*/