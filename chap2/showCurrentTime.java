import javax.swing.JOptionPane;

public class showCurrentTime
{
	static public void main(String args[])
	{
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		int currentSecond = (int)(totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;
		
		// compute the current minute in the hour
        int currentMinute = (int)(totalMinutes % 60);
        
		// obtain the total houts
        long totalHours = totalMinutes / 60;
        
        // compute the current hour
        int currentHour = (int)(totalHours % 24);
        
        // dsplay results
        String output = "current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT";
        
        JOptionPane.showMessageDialog(null, output);
	}
	
	
}