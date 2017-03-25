// date:17.3.24
// author: linyang <linyang@xiaomi.com>
// 统计一位数的个数




public class P6_7 {
	public static void main(String args[]) {
		int[] count = new int[10];
		int[] num = new int[100];
		
		for (int i = 0; i < 100; i++) {
			num[i] = (int)(Math.random() * 10.0);
		}
		for (int i = 0; i < 10; i++) {
			count[i] = 0;
			for (int j = 0; j < 100; j++) {
				if (num[j] == i) {
					count[i]++;
				}
			}
			System.out.println(i + "的个数是" + count[i]);
		}
		
		for (int j = 0; j < 100; j++) {
			System.out.print(num[j] + " ");
		}
	}
}
		
		
		
		
			