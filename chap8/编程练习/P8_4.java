// date:17.3.31
// author: linyang <linyang@xiaomi.com>
// 求指定字符的次数


import java.util.Scanner;

public class P8_4 {
	public static void main(String[] args) {
		System.out.println("e in Welcome meets " + count("Welcome", 'e'));
	}

	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
			}
		}

		return count;
	}
}