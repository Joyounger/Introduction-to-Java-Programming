// date:17.6.29
// author: aquanox@163.com


public class TestP9_5 {
	public static void main(String[] args) {
		P9_5 c1 = new P9_5("Data strcture");
		P9_5 c2 = new P9_5("Database system");
		
		c1.addStudent("Peter Jones");
		c1.addStudent("Brain Smith");
		c1.addStudent("Anne Kennedy");
		
		c2.addStudent("Peter Jones");
		c2.addStudent("Steve Smith");
		
		System.out.println("Number if students in course1: " + c1.getNumberOfStudents());
		java.util.ArrayList<String> students = c1.getStudents();
		for (int i = 0; i < c1.getNumberOfStudents(); i++) {
			System.out.print(students.get(i) + ", ");
		}

		System.out.println();
		System.out.println("Number of students in course2: " + c2.getNumberOfStudents());
	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap9/编程练习 $ java TestP9_5
Number if students in course1: 3
Peter Jones, Brain Smith, Anne Kennedy, 
Number of students in course2: 2
*/


