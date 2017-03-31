// date:17.3.31
// author: linyang <linyang@xiaomi.com>
// 统计字符串中字母的个数

import java.util.Scanner;


public class P8_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int[] counts = countLetters(s);

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				if (i <= 25) {
					System.out.println((char)(i + 'A') + " appears " +
						counts[i] + ((counts[i] > 1)))
				}
			}
		}
	}

	public static int countLetters(String s) {
		int[] counts = new int[52];

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				counts[s.charAt(i) - 'A']++;
			}
			if (Character.isLowerCase(s.charAt(i))) {
				counts[s.charAt(i) - 'a' + 26]++;
			}
		}

		return counts;
	}
}