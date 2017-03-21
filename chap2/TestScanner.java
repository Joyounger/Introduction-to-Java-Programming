import java.util.Scanner; //Scanner is in java.util

public class TestScanner
{
	static public void main(String args[])
	{
		//create a scanner
		Scanner scanner = new Scanner(System.in);
		
		//prompt the user to enter an integer
		System.out.print("enter an integer: ");
		int intValue = scanner.nextInt();
		System.out.println("you enter the integer " + intValue);
		
		//prompt the user to enter a doube value;
		System.out.print("enter a double value: ");
		double doubleValue = scanner.nextDouble();
		System.out.println("you enter the double " + doubleValue);
	
		//prompt the user to enter a doube value;
		System.out.print("enter a string without space: ");
		String string = scanner.next();
		System.out.println("you enter the string " + string);
		
	}
	
}