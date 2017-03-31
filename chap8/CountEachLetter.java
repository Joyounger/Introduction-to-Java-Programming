// date:17.3.31
// author: linyang <linyang@xiaomi.com>
// 统计字符串中每个字母


import javax.swing.JOptionPane;

public class CountEachLetter {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("enter a string");

		int[] counts = countLetters(s.toLowerCase());
		String output = "";

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				output += (char)('a' + i) + " appeas " + 
		      	  counts[i] + ((counts[i] == 1)? "  time\n" : " times\n");	
			}
		}

		JOptionPane.showMessageDialog(null, output);
	}

	public static int[] countLetters(String s) {
		int[] counts = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				counts[s.charAt(i) - 'a']++;
			}
		}
		return counts;
	}
}



