// date:17.4.1
// author: linyang <linyang@xiaomi.com>
// 在字符串中排序字符

import java.util.Scanner;

public class P8_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a string");
		String s = in.nextLine();

		System.out.println(s + " 's sotred string is " + sort(s));
	}

	public static String sort(String s) {
		StringBuilder strBuf = new StringBuilder(s);

		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (strBuf.charAt(i) > strBuf.charAt(j)) {
					char tmp = strBuf.charAt(j);
					strBuf.setCharAt(j, strBuf.charAt(i));
					strBuf.setCharAt(i, tmp);
				}
			}
		}

		return strBuf.toString();
	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_11
please enter a string
accb
accb 's sotred string is abcc
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_11
please enter a string
acb
acb 's sotred string is abc
*/