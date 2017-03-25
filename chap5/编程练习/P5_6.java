// date:17.3.23
// author: linyang <linyang@xiaomi.com>
// 显示模式


public class P5_6 {
    public static void displayPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if ( j <= n - i + 1) {
                    //System.out.print(j + " ");
                    System.out.print(String.format("%3d", j) + " "); //设置为右对齐格式，解决n > 10时输出格式不对齐的问题
                } else {
                    System.out.print("   ");
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        displayPattern(5);
        displayPattern(20);
    }
}



/*
                  1 
              2   1 
          3   2   1 
      4   3   2   1 
  5   4   3   2   1 
                                                                              1 
                                                                          2   1 
                                                                      3   2   1 
                                                                  4   3   2   1 
                                                              5   4   3   2   1 
                                                          6   5   4   3   2   1 
                                                      7   6   5   4   3   2   1 
                                                  8   7   6   5   4   3   2   1 
                                              9   8   7   6   5   4   3   2   1 
                                         10   9   8   7   6   5   4   3   2   1 
                                     11  10   9   8   7   6   5   4   3   2   1 
                                 12  11  10   9   8   7   6   5   4   3   2   1 
                             13  12  11  10   9   8   7   6   5   4   3   2   1 
                         14  13  12  11  10   9   8   7   6   5   4   3   2   1 
                     15  14  13  12  11  10   9   8   7   6   5   4   3   2   1 
                 16  15  14  13  12  11  10   9   8   7   6   5   4   3   2   1 
             17  16  15  14  13  12  11  10   9   8   7   6   5   4   3   2   1 
         18  17  16  15  14  13  12  11  10   9   8   7   6   5   4   3   2   1 
     19  18  17  16  15  14  13  12  11  10   9   8   7   6   5   4   3   2   1 
 20  19  18  17  16  15  14  13  12  11  10   9   8   7   6   5   4   3   2   1



*/
