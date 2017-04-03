// date:17.4.3
// author: linyang <linyang@xiaomi.com>
// 替换文本


import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class P8_19 {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			out.println("usage: java P8_19 filename");
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
			if (s1.matches("\\s*[{]")) {
				strBuf.insert(strBuf.length()-1, '{');
			} else {
				strBuf.append(s1);
				strBuf.append("\n");
			}
		}
		input.close();

		PrintWriter output = new PrintWriter(sourceFile);
		output.print(strBuf.toString());
		output.close();
	}
}


/*
转换前:
public class Test
{
	public static void main(String[] args)
	{
		//some staemets	
	}
}

转换后:
public class Test{
	public static void main(String[] args){
		//some staemets	
	}
}


*/