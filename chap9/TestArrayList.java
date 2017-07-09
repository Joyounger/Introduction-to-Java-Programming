// date:17.6.28
// author: aquanox@163.com


/* compile and run
kolya@asus ~/src/Introduction-to-Java-Programming $ javac chap9/TestArrayList.java 
注: chap9/TestArrayList.java使用了未经检查或不安全的操作。
注: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。
kolya@asus ~/src/Introduction-to-Java-Programming $ java chap9/TestArrayList
*/

package chap9;

public class TestArrayList {
	public static void main(String[] args) {
		java.util.ArrayList cityList = new java.util.ArrayList();

		cityList.add("London");
		cityList.add("New York");
		cityList.add("Paris");
		cityList.add("Toronto");
		cityList.add("Hong Kong");
		cityList.add("Singapore");

		System.out.println("List size? " + cityList.size());
		System.out.println("is Toronto in the list? " + cityList.contains("Toronto"));
		System.out.println("the location of new york in the list is  " + cityList.indexOf("New York"));
		System.out.println("is the list empty? " + cityList.isEmpty());

		cityList.add(2, "Beijing");
		cityList.remove("Toronto");
		cityList.remove(1);

		for (int i = 0; i < cityList.size(); i++) {
			System.out.print(cityList.get(i) + " ");
		}
		System.out.println();

		java.util.ArrayList list = new java.util.ArrayList();
		list.add(new Circle(2));
		list.add(new Circle(3));

		System.out.println("the area of the circle? " + ((Circle)list.get(0)).getArea());
	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming $ java chap9/TestArrayList
List size? 6
is Toronto in the list? true
the location of new york in the list is  1
is the list empty? false
London Beijing Paris Hong Kong Singapore 
the area of the circle? 12.566370614359172
*/