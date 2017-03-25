// date:17.3.24
// author: linyang <linyang@xiaomi.com>
// 输出不同的数

import java.util.Scanner;


public class P6_5 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = in.nextInt();
		}

		System.out.print(a[0] + " ");
		for (int i = 1; i < 10; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] == a[j]) {
					break;
				}
				if (a[i] != a[j] && j == 0) {
					System.out.print(a[i] + " ");
				}
			}
		}
		System.out.println("");
	}
}