

public class Course {
	private String name; 						//课程名称
	private String[] students = new String[100];//选课的学生
	private int numberOfStudents; 				//学生人数
	
	Course(String name) { //创建制定名称的课程
		this.name = name;
	}
	
	public String getName() {  //返回课程名
		return this.name;
	}
	
	public void addStudent(String student) { //向课程列表中添加一个新学生
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() { // 返回选该课程的学生
		return this.students;
	}

	public int getNumberOfStudents() { // 返回选该课程的学生人数
		return this.numberOfStudents;
	}	
}