// date:17.4.1
// author: linyang <linyang@xiaomi.com>
// 变位词

import java.util.Scanner;

public class P8_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter two string");
		String s1 = in.nextLine();
		String s2 = in.nextLine();

		System.out.println(s1 + " is the Anagram of " + s2 + " ? " + (isAnagram(s1, s2) ? "true" : "false"));
	}

	public static boolean isAnagram(String s1, String s2) {
		String s1Sorted = sort(s1);
		String s2Sorted = sort(s2);

		if (s1Sorted.equals(s2Sorted)) {
			return true;
		} else {
			return false;
		}

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
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_12
please enter two string
silent
listen
silent is the Anagram of listen ? true
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_12
please enter two string
garden
ranged
garden is the Anagram of ranged ? true
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_12
please enter two string
split
lisp
split is the Anagram of lisp ? false
*/