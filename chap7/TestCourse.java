
public class TestCourse {
	public static void main(String[] args) {
		Course c1 = new Course("Data strcture");
		Course c2 = new Course("Database system");
		
		c1.addStudent("Peter Jones");
		c1.addStudent("Brain Smith");
		c1.addStudent("Anne Kennedy");
		
		c2.addStudent("Peter Jones");
		c2.addStudent("Steve Smith");
		
		System.out.println("Number if students in course1: " + c1.getNumberOfStudents());
		String[] students = c1.getStudents();
		for (int i = 0; i < c1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + ", ");
		}

		System.out.println();
		System.out.println("Number of students in course2: " + c2.getNumberOfStudents());
	}
}


