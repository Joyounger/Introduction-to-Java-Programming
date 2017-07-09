import java.util.ArrayList;


public class MyStack {
	private ArrayList list = new ArrayList();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remoe(getSize() - 1);
		return o;
	}

	public Object push(Object o) {
		list.add(o);
		return o;
	}

	public int search(Object o) {
		return list.lastIndexOf(o);
	}

	public String toString() {
		return "stack: " + list.toString();
	}



}