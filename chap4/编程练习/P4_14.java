// date:17.3.22
// author: linyang <linyang@xiaomi.com>
// 显示ascii字符表


public class P4_14 {
    public static void main(String args[]) {
        int count = 0;
        for (int asciiValue = 0; asciiValue < 128; asciiValue++) {
            if (asciiValue >= '!' && asciiValue <= '~') {
                System.out.print((char)asciiValue + " ");
                count++;
                if (count == 10) {
                    count = 0;
                    System.out.println("");
                }
            }
        }
    }
}
            