// date:17.4.9
// author: linyang <942510346@qq.com>
// 9.2 Person、Student、Employee、Faculty、Staff

public class Employee extends Person {
	private double salary;
	private String office;
	private MyDate hireDate;

	public String toString() {
		return "class name is " + getClass().getName() + ", name is " + name;
	}
}


class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month =  month;
		this.day = day;
	}
}