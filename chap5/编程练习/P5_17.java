// date:17.3.23
// author: linyang <linyang@xiaomi.com>
// 显示0和1的矩阵


public class P5_17 {
	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (Math.random() >= 0.5) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String args[]) {
		printMatrix(3);
	}
	
	
}


/*
0 0 0 
0 0 0 
0 1 1 
kolya@asus ~/src/Introduction-to-Java-Programming/chap5/编程练习 $ java P5_17
1 0 0 
0 1 1 
0 1 1 
kolya@asus ~/src/Introduction-to-Java-Programming/chap5/编程练习 $ java P5_17
0 0 0 
1 1 1 
1 0 1 
kolya@asus ~/src/Introduction-to-Java-Programming/chap5/编程练习 $ java P5_17
1 1 0 
0 0 1 
1 1 1
*/
