// date:17.4.2
// author: linyang <linyang@xiaomi.com>
// 传递字符串来检测回文串



public class P8_13 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("usage: java P8_13 \"str\"");
			System.exit(0);
		}

		String s = args[0];
		String optput = "";

		if (s.equals(reverse(s))) {
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