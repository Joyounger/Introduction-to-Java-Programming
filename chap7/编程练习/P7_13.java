// date:17.3.26
// author: linyang <linyang@xiaomi.com>
// 显示素数




public class P7_13 {
	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers(120);
		for (int i = 2; i <120; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}

		System.out.print("降序显示小于120的素数：");
		//while (!stack.empty()) {
		//	System.out.print(stack.pop() + " ");
		//}
		
		System.out.println("堆栈大小是" + stack.getSize());
		int stackLen = stack.getSize();
		for (int i = 0; i < stackLen; i++) {
			System.out.print(stack.pop() + " ");
		}
		
		System.out.println();
		System.out.println("堆栈大小是" + stack.getSize());
	}
	
	public static boolean isPrime(int num)  {
		if (num == 2) {
			return true;
		} else if (num > 2) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}


class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}
	public StackOfIntegers(int capacity){
		elements = new int[capacity];
	}
	public int push(int value) {
		if(size >= elements.length){
			int[] temp = new int[elements.length*2];
			System.arraycopy(elements,0,temp,0,elements.length);
			elements = temp;
		}
		return elements[size++] = value;
	}

	public int pop() {
		return elements[--size];
	}

	public boolean empty() {
		return size == 0;
	}
	public int getSize(){
		return size;
	}
	public int peek(){
		return elements[size - 1];
	}
	
}

/*
堆栈大小是30
降序显示小于120的素数：113 109 107 103 101 97 89 83 79 73 71 67 61 59 53 47 43 41 37 31 29 23 19 17 13 11 7 5 3 2 
堆栈大小是0
*/
