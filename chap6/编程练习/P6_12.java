// date:17.3.24
// author: linyang <linyang@xiaomi.com>
// 倒置数组

public class P6_12 {
	public static int[] reverse(int[] list) {
		int len = list.length;
		if (len % 2 == 0) {
			for (int i = 0; i < len/2; i++) {
				int tmp = list[i];
				list[i] = list[len - i - 1];
				list[len - i - 1] = tmp;
			}
		} else {
			for (int i = 0; i < len/2; i++) {
				int tmp = list[i];
				list[i] = list[len - i - 1];
				list[len - i - 1] = tmp;
			}		
		}
		
		return list;
	}
	public static void main(String args[]) {
		int[] a = new int[11];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		a = reverse(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}


/*
10 9 8 7 6 5 4 3 2 1

11 10 9 8 7 6 5 4 3 2 1 
*/
