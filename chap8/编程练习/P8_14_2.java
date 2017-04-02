// date:17.4.2
// author: linyang <linyang@xiaomi.com>
// 求整数的和



public class P8_14_2 {
	public static void main(String[] args) {
		int sum = 0;

		int idx1 = 0;
		int idx2 = 0;
		while(true) {
			idx2 = args[0].indexOf(' ', idx1);
			if (idx2 == -1) {
				sum += Integer.parseInt(args[0].substring(idx1, args[0].length()));
				break;
			}
			String str = args[0].substring(idx1, idx2);
			System.out.println(str);
			sum += Integer.parseInt(str);
			idx1=idx2+1;
		}

		System.out.println("the total is " + sum);
	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_14_2 "12 332 34 4545"
12
332
34
the total is 4923
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_14_2 "1 2 3"
1
2
the total is 6
*/