// date:17.3.22
// author: linyang <linyang@xiaomi.com>
// 求一个整数各位数字之和


public class P5_2 {
    public static int sumDigits(long n) {
        String str = n + "";
        int len = 0;
        boolean isNegative = false;
        int sum = 0;
        if (str.charAt(0) == '-') {
            len = str.length() - 1;
            isNegative = true;
        } else {
            len = str.length();
        }
        
        if (!isNegative) {
            for (int i = len -1; i >= 0; i--) {
                int bit = (int)(n / Math.pow(10, i));
                sum += bit;
                n -= bit * (long)Math.pow(10, i);
            }
        } else {
            sum = sumDigits(n * -1);
        }

        return sum;
    }
    public static void main(String args[]) {
        System.out.println("123各位数之和--" + sumDigits(123));
        System.out.println("-123各位数之和--" + sumDigits(-123));
        System.out.println("6185885各位数之和--" + sumDigits(6185885));
    }
}


/*
123各位数之和--6
-123各位数之和--6
6185885各位数之和--41
*/
