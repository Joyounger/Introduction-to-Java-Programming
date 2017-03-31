// date:17.3.31
// author: linyang <linyang@xiaomi.com>
// 检测子串


import java.util.Scanner;

public class P8_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter two string, first s1, second s2");
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		if (isSubStr(s1, s2)) {
			System.out.println("s1 is the substring of s2");
		} else {
			System.out.println("s1 is not the substring of s2");
		}

	}


	public static boolean isSubStr(String s1, String s2) {
		int len = s1.length();
		int idx = -1;
		for (int i = 0; i < s2.length(); i++) {
			if (s1.charAt(0) == s2.charAt(i)) {
				idx = i;
			}
		}
		if (idx == -1) {
			return false;
		}

		for (int i = 0, j = idx; i < len; i++, j++) {
			if (s1.charAt(i) != s2.charAt(j)) {
				return false;
			}
		}

		return true;
	}
}