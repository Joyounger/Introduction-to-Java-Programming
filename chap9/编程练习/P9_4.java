// date:17.6.30
// author: aquanox@163.com

import java.util.ArrayList;

public class P9_4 extends ArrayList {

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public int getSize() {
		return super.size();
	}

	public Object peek() {
		return super.get(getSize() - 1);
	}

	public Object pop() {
		Object o = peek();
		super.remove(getSize() - 1);
		return o;
	}

	public Object push(Object o) {
		super.add(o);
		return o;
	}

	public int search(Object o) {
		return super.lastIndexOf(o);
	}

	public String toString() {
		return "stack: " + super.toString();
	}

}