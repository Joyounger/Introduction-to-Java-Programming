// date:17.4.3
// author: linyang <linyang@xiaomi.com>

import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;

public class ReadData {
	public static void main(String[] args) throws Exception {
		File file = new File("scores.txt");
		Scanner input = new Scanner(file);

		while(input.hasNext()) {
			String firstName = input.next();
			String mi = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			out.println(
			  firstName + " " + mi + " " + lastName + " " + score);
		}

		input.close();
	}
}