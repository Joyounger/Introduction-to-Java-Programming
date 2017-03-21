import javax.swing.JOptionPane;



public class Welcome
{
	String s = new String();
	
	public static void main(String[] args)
	{
		System.currentTimeMillis();
		
		JOptionPane.showMessageDialog(null, "welcome to java", 
			"title", JOptionPane.INFORMATION_MESSAGE);
	}
}

