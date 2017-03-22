// date:17.3.22
// author: linyang <linyang@xiaomi.com>
// 查找能被5和6整除的数


public class P4_10 {
    public static void main(String args[]) {
        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + "");
                System.out.print(" ");
                count++;
                if (count == 10) {
                    count = 0;
                    System.out.println("");
                }
            }
            

        }
    }
}
             
            