// date:17.4.2
// author: linyang <linyang@xiaomi.com>

import java.io.File;
import static java.lang.System.out;

public class TestFileClass {
	public static void main(String[] args) {
		File file = new File("image/us.gif");

		out.println("dose it exist? " + file.exists());
		out.println("can it be read? " + file.canRead());
		out.println("can it be written? " + file.canWrite());
		out.println("is it a direcotry? " + file.isDirectory());
		out.println("is it a file? " + file.isFile());
		out.println("is it absolute? " + file.isAbsolute());
		out.println("is it hidden? " + file.isHidden());
		out.println("absolute path is? " + file.getAbsolutePath());
		out.println("last modified on " + file.lastModified());

	}
}