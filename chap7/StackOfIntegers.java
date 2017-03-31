
// date:17.3.31
// author: linyang <linyang@xiaomi.com>

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	public int push(int value) {
		if (size >= elements.length) {  // 如果堆栈已满
			int[] tmp = new int[elements.length * 2];
			System.arraycopy(elements, 0, tmp, 0, elements.length);
			elements = tmp; //将新数组的引用赋值给栈中的当前数组
		}

		return elements[size++] = value;
	}


	public int pop() {
		return elements[--size];
	}

	// return the top element from the stack
	public int peek() {
		return elements[size - 1];
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

}