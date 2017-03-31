// date:17.3.31
// author: linyang <linyang@xiaomi.com>
// 改写程序清单8-1

import javax.swing.JOptionPane;

public class P8_1 {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("enter a string");
		String optput = "";

		if (s.equals(reverse(s))) {
			optput = s + " is a Palindrome";
		} else {
			optput = s + " is not a Palindrome";
		}
		JOptionPane.showMessageDialog(null, optput);
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