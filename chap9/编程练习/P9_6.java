// date:17.6.29
// author: aquanox@163.com



public class P9_6 {
	public static void main(String[] args) {
		java.util.ArrayList objectList = new java.util.ArrayList();
		objectList.add(new Loan());
		objectList.add(new java.util.Date());
		objectList.add(new String());
		objectList.add(new javax.swing.JFrame());
		objectList.add(new Circle());

		for (int i = 0; i < objectList.size(); i++) {
			System.out.println(i + "--" + objectList.get(i).toString());
		}

	}
}