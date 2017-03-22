// date:17.3.21
// author: linyang <linyang@xiaomi.com>
// 从ascii码求出对应的字母


import java.util.Scanner;

public class P2_8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while(true) { 
            System.out.println("please enter a ascii code, press Ctrl + C to exit");
            int value = in.nextInt();
            char code = (char)value;
            System.out.println("the ascii value " + value + "'s ascii code is " + code);
        }       
    }
}



/*
566
the ascii value 566's ascii code is ȶ
please enter a ascii code, press Ctrl + C to exit
33333
the ascii value 33333's ascii code is 舵
please enter a ascii code, press Ctrl + C to exit
33334   
the ascii value 33334's ascii code is 舶
please enter a ascii code, press Ctrl + C to exit
33335
the ascii value 33335's ascii code is 舷
please enter a ascii code, press Ctrl + C to exit

16
the ascii value 16's ascii code is 
please enter a ascii code, press Ctrl + C to exit
17
the ascii value 17's ascii code is 
please enter a ascii code, press Ctrl + C to exit
18
the ascii value 18's ascii code is 
please enter a ascii code, press Ctrl + C to exit
*/

    