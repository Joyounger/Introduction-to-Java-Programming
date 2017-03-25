// date:17.3.23
// author: linyang <linyang@xiaomi.com>
// 级数求和


public class P5_13 {
	public static double seriesSum(int i) {
		double sum = 0;
		for (int j = 2; j <= i; j++) {
			sum += (double)(j - 1) / j;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		System.out.println("i  m(i)");
		for (int i = 2; i <= 20; i++) {
			System.out.println(i + "  " + seriesSum(i));
		}
	}
}


/*
i  m(i)
2  0.5
3  1.1666666666666665
4  1.9166666666666665
5  2.716666666666667
6  3.5500000000000003
7  4.4071428571428575
8  5.2821428571428575
9  6.171031746031746
10  7.071031746031746
11  7.980122655122655
12  8.896789321789322
13  9.819866244866246
14  10.748437673437675
15  11.681771006771008
16  12.619271006771008
17  13.560447477359244
18  14.504891921803688
19  15.45226034285632
20  16.40226034285632
*/
