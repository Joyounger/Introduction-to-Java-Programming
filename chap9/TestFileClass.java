import java.io.File;

public class TestFileClass
{
	public static void main(String[] args)
	{
		File file = new java.io.File("image/us.gif");
		System.out.println("does it exits? " + file.exists());
		System.out.println("the file has " + file.length() + " bytes");
		System.out.println("can it be read? " + file.canRead());
		System.out.println("can it be written? " + file.canWrite());
		System.out.println("Is it a file? " + file.isFile());
		
		
		
	}
	
	
}