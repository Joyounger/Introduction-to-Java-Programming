// date:17.4.9
// author: linyang <942510346@qq.com>
// 9.2 Person、Student、Employee、Faculty、Staff


public class Person {
	private String name;
	private String address;
	private String email;
	private String phoneNumber;

	public String toString() {
		return "class name is " + getClass().getName() + ", name is " + name;
	}
}