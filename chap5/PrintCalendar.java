import javax.swing.JOptionPane;

public class PrintCalendar {
	public static void main(String[] args) {
		String yearString = JOptionPane.showInputDialog(
		  "Enter full year(e.g., 2001):");
		int year = Integer.parseInt(yearString);
		String monthString = JOptionPane.showInputDialog(
		  "Enter month in number between 1 and 12:");
		int month = Integer.parseInt(monthString);	
		
		printMonth(year, month);
	}
	
	static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}
	
	static void printMonthTitle(int year, int month) {
		System.out.println("    " + getMonthName(month) + "" + year);
		System.out.println("---------------------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}
	
	static String getMonthName(int month) {
		String monthName = null;
		switch (month) {
			case 1: monthName = "January"; break;
			case 2: monthName = "Feburary"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December";
		}

		return monthName;
	}

	static void printMonthBody(int year, int month) {
		int startDay = getStartDay(year, month);
		
		int numberOfDaysInMonth = getnumberOfDaysInMonth(year, month);
		
		// pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++) {
			System.out.print("  ");
		}
		
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			if (i < 10) {
				// 从10之前的各位数日期1-9占1位，因此用两个空格分隔
				System.out.print("  " + i);
			} else {
				// 从10开始的10、11、12等日期占两位，因此用一个空格分隔
				System.out.print(" " + i);
			}
			
			if ((i + startDay) % 7 == 0) {
				System.out.println();
			}
		}
	}
	
	static int getStartDay(int year, int month) {
		// get total number of days since 1/1/1800
		int startDay1800 = 3; // 1800.1.1是这周第四天（从周日算起）
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		return (totalNumberOfDays + startDay1800) % 7;
	}

	static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i)) {
				total = total + 366;
			} else {
				total = total + 365;
			}
		}
		
		for (int i = 1; i < month; i++) {
			total = total + getnumberOfDaysInMonth(year, i);
		}
		return total;
	}
	
	static int getnumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
		  month == 8 || month == 10 || month == 12) {
			 return 31; 
		}
		
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		
		if (month == 2) return isLeapYear(year) ? 29 : 28;
		
		return 0; // if month is incorrect;
	}
	
	static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}


/*
 $ cal 1 1800
      一月 1800         
日 一 二 三 四 五 六  
          1  2  3  4  
 5  6  7  8  9 10 11  
12 13 14 15 16 17 18  
19 20 21 22 23 24 25  
26 27 28 29 30 31     
*/
