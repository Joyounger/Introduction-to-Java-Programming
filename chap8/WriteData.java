// date:17.4.3
// author: linyang <linyang@xiaomi.com>

import java.io.File;
import java.io.PrintWriter;
import static java.lang.System.out;

public class WriteData {
	public static void main(String[] args) throws Exception {
		File file = new File("scores.txt");
		if (file.exists()) {
			out.println("file already exists");
			System.exit(0);
		}

		PrintWriter output = new PrintWriter(file);
		output.print("John T Smith ");
		output.println(90);
		output.print("eric k jones ");
		output.println(85);

		output.close();
	}
}