// date:17.3.31
// author: linyang <linyang@xiaomi.com>
// 每个数字在字符串中出现的次数


import java.util.Scanner;

public class P8_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a string");
		String s = in.nextLine();

		int[] counts =  count(s);
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				System.out.println((char)(i + '0') + " appears " +
					counts[i] + ((counts[i] > 1) ? " times" : " time"));
			}
		}
	}

	public static int[] count (String s) {
		int[] count = new int[10];

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))  {
				count[s.charAt(i) - '0']++;
			}
		}

		return count;
	}
}

/*
please enter a string
12203AB3
0 appears 1 times
1 appears 1 times
2 appears 2 time
3 appears 2 time

please enter a string
SSN is 343 32 4545 and ID is 434 34 4323
2 appears 2 time
3 appears 7 time
4 appears 7 time
5 appears 2 time
*/