// date:17.3.22
// author: linyang <linyang@xiaomi.com>
// 显示倒置的整数


public class P5_3 {
    public static void reverse(int num) {
        String str = num + "";
        int len = 0;
        boolean isNegative = false;
        if (str.charAt(0) == '-') {
            len = str.length() - 1;
            isNegative = true;
        } else {
            len = str.length();
        }

        for (int i = 1; i < len; i++) {
            int bit = num % (int)Math.pow(10, i);
            num = num - bit;
            bit = bit / (int)Math.pow(10, i - 1);
            if (!isNegative) {
                System.out.print(bit + "");
            } else {
                System.out.print(bit * -1 + "");
            }
        }

        int firstbit = num / (int)Math.pow(10, len - 1);
        if (!isNegative) {
            System.out.print(firstbit + "");
        } else {
            System.out.print(firstbit * -1 + "");
            System.out.print("-");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        System.out.print("3456的倒置是");reverse(3456);
        System.out.print("-3456的倒置是");reverse(-3456);
    }
}


