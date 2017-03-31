// date:17.3.31
// author: linyang <linyang@xiaomi.com>

import javax.swing.JOptionPane;

public class CheckPalindrome {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("enter a string");
		String optput = "";

		if (isPalindrome(s)) {
			optput = s + " is a Palindrome";
		} else {
			optput = s + " is not a Palindrome";
		}
		JOptionPane.showMessageDialog(null, optput);
	}

	public static boolean isPalindrome(String s) {
		int low = 0;
		int high = s.length() - 1;

		while(low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				return false;
			}

			low++;high--;
		}

		return true;
	}

}