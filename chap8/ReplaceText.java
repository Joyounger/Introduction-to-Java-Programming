// date:17.4.3
// author: linyang <linyang@xiaomi.com>

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class ReplaceText {
	public static void main(String[] args) throws Exception {
		if (args.length != 4) {
			out.println("usage: java ReplaceText sourceFile targetFile oldStr newStr");
			System.exit(0);
		}

		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			out.println("sourceFile  " + args[0] + " does not exists");
			System.exit(0);
		}

		File targetFile = new File(args[1]);
		if (targetFile.exists()) {
			out.println("targetFile  " + args[1] + " already exists");
			System.exit(0);
		}

		Scanner input = new Scanner(sourceFile);
		PrintWriter output = new PrintWriter(targetFile);

		while (input.hasNext()) {
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[2], args[3]);
			output.println(s2);
		}

		input.close();
		output.close();
	}
}