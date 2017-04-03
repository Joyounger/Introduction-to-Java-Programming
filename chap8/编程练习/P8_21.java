// date:17.4.3
// author: linyang <linyang@xiaomi.com>
// 处理文本文件中的分数


import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;

public class P8_21 {
	public static void main(String[] args) throws Exception {
		double avg = 0;
		int count = 0;
		double sum = 0;

		Scanner in = new Scanner(new File(args[0]));
		while (in.hasNext()) {
			String str = in.next();
			String[] nums = str.split("/");
			if (nums.length != 2) {
				out.println("error!");
				System.exit(0);
			}
			count++;
			double numerator = Double.parseDouble(nums[0]);
			double denominator = Double.parseDouble(nums[1]);
			sum += numerator / denominator;
		}

		avg = sum / count;
		out.println("sum is " + sum);
		out.println("count is " + count);
		out.println("avg is " + avg);
	}
}


/*
95/5 6/3.5 70/2 1/55
1/2 3/3 12/9 85/5
17+1.33+1+0.5+0.0182+35+1.71+19
sum is 75.56580086580087
count is 8
avg is 9.445725108225108

分子：numerator
分母：denominator
*/