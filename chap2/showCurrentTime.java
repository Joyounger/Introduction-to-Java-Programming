import javax.swing.JOptionPane;

public class showCurrentTime
{
	static public void main(String args[])
	{
		long totalMilliseconds = System.currentTimeMills();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		int currentSecond = (int)(totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;
		
		
		
	}
	
	
}