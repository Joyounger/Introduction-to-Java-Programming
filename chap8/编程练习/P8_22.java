// date:17.4.3
// author: linyang <linyang@xiaomi.com>
// 写/读数据



import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import static java.lang.System.out;

public class P8_22 {
	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		PrintWriter output = new PrintWriter(file);
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			int val = rand.nextInt(65536);
			output.print(val);
			output.print(" ");
		}
		output.close();

		int[] array = new int[100];
		Scanner input = new Scanner(file);
		for (int i = 0; i < 100; i++) {
			array[i] = input.nextInt();
		}
		input.close();

		Arrays.sort(array);
		//这种有冒号的for循环叫做foreach循环，foreach语句是java5的新特征之一
		// foreach并不是一个关键字，习惯上将这种特殊的for语句格式称之为“foreach”语句。从英文字面意思理解foreach也就是“for 每一个”的意思。实际上也就是这个意思。
		for (int i : array) { 
			out.print(i + " ");
		}
	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ java P8_22 Exercise8_22.txt
96 2352 2626 3554 3957 4062 5490 6892 7082 7515 7703 9641 10044 10054 10291 10940 11722 12841 13097
 13461 13729 14047 14286 14969 17099 17124 17664 17758 19562 19740 20103 20477 20800 20927 22097 22484
  22815 24009 24700 25842 26574 26969 28017 28403 29651 30591 30806 30839 31621 31683 31844 31944 33230
   33619 35481 35870 35980 36415 36875 37442 37778 37850 38581 38906 39185 40923 41489 42079 42626 43698
    43825 43960 44619 45133 46832 46918 50727 50864 51713 52194 52466 53200 54130 54643 55714 55819 56260
     56799 57295 57470 58242 58759 58796 59193 59634 62939 63886 64150 64490 64583

kolya@asus ~/src/Introduction-to-Java-Programming/chap8/编程练习 $ cat Exercise8_22.txt
31683 36875 35481 42626 54643 40923 3554 43698 20800 28403 13461 46918 38906 46832 26574 58242 
29651 25842 10044 37778 19740 59634 4062 44619 43825 38581 52466 11722 28017 24700 35870 9641 
54130 45133 12841 7082 55819 33619 14286 57470 10054 58796 37850 55714 26969 41489 51713 52194 
3957 10940 20927 56260 62939 5490 22484 22097 35980 50864 64583 24009 10291 17664 53200 17099 
17124 30839 31621 57295 7515 2352 17758 64150 19562 31844 63886 33230 39185 22815 42079 31944
 14047 58759 20477 64490 43960 14969 36415 6892 96 59193 13729 50727 37442 30806 13097 2626 
 30591 56799 20103 7703*/
		

