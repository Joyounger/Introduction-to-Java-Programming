// date:17.3.25
// author: linyang <linyang@xiaomi.com>
// 时间类Time


import java.util.Calendar; 

public class P7_7 {
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		System.out.println("t1--当前时间:" + t1.hour + "时" +  t1.minute + "分" + t1.second + "妙");
		System.out.println("t2--555550000ms:" + t2.hour + "时" +  t2.minute + "分" + t2.second + "妙");
	}

	public static class Time {
		private int hour, minute, second;
		
		Time() {
			Calendar now = Calendar.getInstance();
			this.hour = now.get(Calendar.HOUR_OF_DAY);
			this.minute = now.get(Calendar.MINUTE);
			this.second = now.get(Calendar.SECOND);
		}
		
		Time(long milliSecond) {
			int allHour = (int)(milliSecond / 1000.0 / 3600);
			this.hour = allHour % 24;
			this.minute = (int)((milliSecond / 1000.0 - allHour * 3600) / 60.0);
			this.second = (int)(milliSecond / 1000.0 - allHour * 3600 - minute * 60);
		}

		public int getHour() {
			return this.hour;
		}
		public int getMinute() {
			return this.minute;
		}
		public int getSecond() {
			return this.second;
		}	
		
	}
}

/*
t1--当前时间:22时27分29妙
t2--555550000ms:10时19分10妙
*/

