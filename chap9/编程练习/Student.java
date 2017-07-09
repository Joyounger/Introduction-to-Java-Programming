// date:17.4.9
// author: linyang <942510346@qq.com>
// 9.2 Person、Student、Employee、Faculty、Staff

public class Student extends Person {
	public static final int class1 = 1;
	public static final int class2 = 2;
	public static final int class3 = 3;
	public static final int class4 = 4;

	public String toString() {
		return "class name is " + getClass().getName() + ", name is " + name;
	}
}