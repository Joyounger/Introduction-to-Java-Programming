// date:17.4.1
// author: linyang <linyang@xiaomi.com>
// 10进制转换为16进制

import java.util.Scanner;

public class P8_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a decimal value");
		int value = in.nextInt();

		System.out.println(value + " 's hex string is " + convertDecimalToHex(value));
	}

	public static String convertDecimalToHex(int value) {
		StringBuilder strBuf = new StringBuilder();
		int offset = (int)'A' - 10;

		while(true) {
			int mod = value % 16;
			if (mod >= 10) {
				strBuf.append((char)(mod + offset));
			} else {
				strBuf.append(mod);
			}
			value = value / 16;
			if (value == 0)  {
				break;
			}
		}

		strBuf.reverse();
		return strBuf.toString();
	}
}

/*
please enter a decimal value
123
123 's hex string is 7B

please enter a decimal value
298
298 's hex string is 12A

please enter a decimal value
9123
9123 's hex string is 23A3
*/