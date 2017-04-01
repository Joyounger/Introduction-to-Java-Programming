// date:17.4.1
// author: linyang <linyang@xiaomi.com>


import javax.swing.JOptionPane;

public class PalindromeIgnoreNonAlphanumeric {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("enter a string:");
		String output = "ignoring nonalphanumeric characters, \nis "
		  + s + " a palindrome? " + isPalindrome(s);

		JOptionPane.showMessageDialog(null, output);

	}

	public static boolean isPalindrome(String s) {
		String s1 = filter(s);
		String s2 = reverse(s1);

		return s2.equals(s1);
	}

	public static String filter (String s) {
		StringBuffer strBuf = new StringBuffer();

		for (int i = 0; i < s.length(); i++)  {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				strBuf.append(s.charAt(i));
			}
		}

		return strBuf.toString();
	}

	public static String reverse(String s) {
		StringBuffer strBuf = new StringBuffer(s);
		strBuf = strBuf.reverse();

		return strBuf.toString();
	}

}