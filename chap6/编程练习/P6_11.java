// date:17.3.24
// author: linyang <linyang@xiaomi.com>
// 计算标准差




public class P6_11 {
	public static void main(String args[]) {
		int[] a = new int[10];
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			a[i] = i + 1;
			sum += a[i];
		}
		double avg = sum / 10;
		
		sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += (a[i] - avg) * (a[i] - avg);
		}
		
		double ret = Math.sqrt(sum / 9);
		System.out.println(ret + "");
	}
}



/*
3.0276503540974917
*/
