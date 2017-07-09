// date:17.6.29
// author: aquanox@163.com


public class P9_5 {
	private String name;
	private java.util.ArrayList<String> students = new java.util.ArrayList<String>();

	public P9_5(String name) {
		this.name = name;
	}

	public void addStudent(String student) {
		students.add(student);
	}

	public java.util.ArrayList<String> getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public String getName() {
		return name;
	}

}