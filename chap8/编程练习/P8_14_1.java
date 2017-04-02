// date:17.4.2
// author: linyang <linyang@xiaomi.com>
// 求整数的和



public class P8_14_1 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}

		System.out.println("the total is " + sum);
	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_14_1 12 332 34 4545
the total is 4923
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_14_1
the total is 0
*/
	