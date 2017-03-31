// date:17.3.31
// author: linyang <linyang@xiaomi.com>
// 改写程序清单8-1


import java.util.Scanner;

public class P8_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a string");
		String s = in.nextLine();
		String optput = "";

		if (s.equalsIgnoreCase(reverse(s))) {
			optput = s + " is a Palindrome";
		} else {
			optput = s + " is not a Palindrome";
		}

		System.out.println(optput);

	}

	public static String reverse(String s) {
		int len = s.length();
		String reverseStr = "";
		for (int i = len - 1; i >= 0; i--) {
			reverseStr += s.charAt(i);
		}

		return reverseStr;
	}
}

/*
please enter a string
moo ooM
moo ooM is a Palindrome
*/