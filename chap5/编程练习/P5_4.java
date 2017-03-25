// date:17.3.23
// author: linyang <linyang@xiaomi.com>
// 返回倒置的整数


public class P5_4 {
    public static int reverse(int num) {
        String str = num + "";
        int len = 0;
        boolean isNegative = false;
        if (str.charAt(0) == '-') {
            len = str.length() - 1;
            isNegative = true;
        } else {
            len = str.length();
        }
        
        String ret = "";
        for (int i = 1; i < len; i++) {
            int bit = num % (int)Math.pow(10, i);
            num = num - bit;
            bit = bit / (int)Math.pow(10, i - 1);
            if (!isNegative) {
                ret += bit;
            } else {
                ret += bit * -1;
            }
        }
        
        int firstbit = num / (int)Math.pow(10, len - 1);
        if (!isNegative) {
            ret += firstbit;
        } else {
            ret += firstbit * -1;
            //ret += "-";
        }
        // 在 Java 中要将 String 类型转化为 int 类型时,需要使用 Integer 类中的 parseInt() 方法或者 valueOf() 方法进行转换.
        // Integer.parseInt(str) 或者 Integer.valueOf(str).intValue()
        int retVal = Integer.parseInt(ret);
        if (isNegative) {
            retVal = retVal * -1;
        }
        return retVal;
    }

    public static void main(String args[]) {
        System.out.println("3456的倒置是" + reverse(3456));
        System.out.println  ("-3456的倒置是" + reverse(-3456));
    }
}



/*
输出：
3456的倒置是6543
-3456的倒置是-6543
*/
