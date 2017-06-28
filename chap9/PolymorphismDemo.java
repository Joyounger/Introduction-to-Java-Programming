// date:17.4.13
// author: linyang <942510346@qq.com>
// compile:javac chap9/PolymorphismDemo.java
// run:java chap9/PolymorphismDemo

package chap9;

public class PolymorphismDemo {
	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}

	public static void m(Object x) {
		System.out.println(x.toString());
	}
}


class GraduateStudent extends Student {

}

class Student extends Person {
	public String toString() {
		return "Student";
	}
}

class Person extends Object {
	public String toString() {
		return "Person";
	}
}



/*
kolya@asus ~/src/Introduction-to-Java-Programming $ java chap9/PolymorphismDemo
Student
Student
Person
java.lang.Object@6bc7c054
*/