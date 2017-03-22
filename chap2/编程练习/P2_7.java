// date:17.3.21
// author: linyang <linyang@xiaomi.com>
// 将大写字母转换为小写字母


import java.util.Scanner;

public class P2_7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while(true) { //while(1)  不兼容的类型: int无法转换为boolean
            System.out.println("please enter a capital letter, press Ctrl + C to exit");
            String str = in.next();
            char upperCase = str.charAt(0);
            int offset = 'a' - 'A';
            char lowerCase = (char)((int)upperCase + offset);
            System.out.println("the lowerCase is " + lowerCase);
        }
    }
}
    
    