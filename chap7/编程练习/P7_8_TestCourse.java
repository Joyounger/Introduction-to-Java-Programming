// date:17.3.25
// author: linyang <linyang@xiaomi.com>
// 课程类Course



public class P7_8_TestCourse {
	public static void main(String[] args) {
		Course course = new Course("Data Structure");
		course.addStudent("xuande");
		course.addStudent("zitong");
		course.addStudent("xuanxiude");
		String[] student = course.getStudents();
		System.out.print("学生的数量为：" + course.getNumberOfStudents()+ "\n姓名为：");
		for(int i = 0;i < course.getNumberOfStudents();i++) {
			System.out.print(student[i] + "  ");
		}
		System.out.println();
	}
}


class Course {
	private String name; 						//课程名称
	private String[] students = new String[100];//选课的学生
	private int numberOfStudents; 				//学生人数

	Course(String name) { //创建制定名称的课程
		this.name = name;
	}

	public String getName() {  //返回课程名
		return this.name;
	}

	public String[] getStudents() { // 返回选该课程的学生
		return this.students;
	}

	public int getNumberOfStudents() { // 返回选该课程的学生人数
		return this.numberOfStudents;
	}
	
	public void addStudent(String student) { //向课程列表中添加一个新学生
		if (numberOfStudents >= students.length) {
			students = addArrayLength(students);
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	// 通过创建更大的数组并复制当前数组的内容来实现数组尺寸的自动增长
	public String[] addArrayLength(String[] array) { 
		String[] newList = new String[array.length + 1];
		System.arraycopy(array, 0, newList, 0, array.length);
		return newList;
	}
}