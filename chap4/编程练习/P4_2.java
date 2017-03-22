// date:17.3.22
// author: linyang <linyang@xiaomi.com>
// 统计正数和负数的个数并计算这些数的平均值

import java.util.Scanner;

public class P4_2 {
    public static void main(String args[]) {
        Scanner stdin = new Scanner(System.in);
        
        int array[] = new int[1000]; //java中数组的声明方式
        int idx;
        for (idx = 0; idx < 1000; idx++) {
            array[idx] = stdin.nextInt();
            if (array[idx] == 0) {
                break;
            }
        }
        
        int plusCount = 0;
        int minusCount = 0;
        int sum = 0;
        double avg = 0;
        for (int i = 0; i <= idx; i ++) {
            if (array[i] > 0) {
                plusCount++;
            } else if (array[i] < 0) {
                minusCount++;
            }
            sum += array[i];
        }
        avg = ((double)sum / idx);
        
        System.out.println("正数个数--" + plusCount);
        System.out.println("负数个数--" + minusCount);
        System.out.println("总和--" + sum);
        System.out.println("平均值--" + avg);
    }
}
        
        
            

