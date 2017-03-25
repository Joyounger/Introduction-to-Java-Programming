// date:17.3.23
// author: linyang <linyang@xiaomi.com>
// 对三个数排序

public class P5_5 {
    public static void sort(double num1, double num2, double num3) {
        double tmp;
        if (num1 > num2) {
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        
        if (num1 > num3) {
            tmp = num1;
            num1 = num3;
            num3 = tmp;
        }

        if (num2 > num3) {
            tmp = num2;
            num2 = num3;
            num3 = tmp;
        }

        System.out.println(num1 + "<" + num2 + "<" + num3);
    }
    
    public static void main(String args[]) {
        sort(1.1, 2.2, 3.3);
        sort(30.0, 20.0, 10.0);
    }
}

/*
1.1<2.2<3.3
10.0<20.0<30.0

*/
