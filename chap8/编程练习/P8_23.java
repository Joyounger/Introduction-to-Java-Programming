// date:17.4.3
// author: linyang <linyang@xiaomi.com>
// 替换文本


import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class P8_23 {
	public static void main(String[] args) throws Exception {
		if (args.length != 3) {
			out.println("usage: java P8_23 sourceFile oldStr newStr");
			System.exit(0);
		}

		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			out.println("sourceFile  " + args[0] + " does not exists");
			System.exit(0);
		}

		Scanner input = new Scanner(sourceFile);
		StringBuilder strBuf = new StringBuilder();


		while (input.hasNext()) {
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[2], args[3]);
			strBuf.append(s2);
		}
		input.close();

		PrintWriter output = new PrintWriter(sourceFile);
		output.print(strBuf.toString());
		output.close();
	}
}