// date:17.4.2
// author: linyang <linyang@xiaomi.com>
// 在字符串中求大写字母个数



public class P8_15 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < args[0].length(); i++) {
			if (Character.isUpperCase(args[0].charAt(i))) {
				sum++;
			}
		}

		System.out.println("the amunt of upper letter is " + sum);
	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_15 "AADDRR DDD"
the amunt of upper letter is 9
*/