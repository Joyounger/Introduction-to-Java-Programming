// date:17.3.26
// author: linyang <linyang@xiaomi.com>
// 显示素数因子


import javax.swing.JOptionPane;

public class P7_12 {
	public static void main(String[] args){
		StackOfIntegers stack = new StackOfIntegers();
		int num = Integer.parseInt(JOptionPane.showInputDialog("输入一个整数求其因子："));
		int temp= num;
		int i = 2;
		while(i <= num){
			if(num % i == 0){
				stack.push(i);
				num /= i;
			}else
				i++;
		}
		
		System.out.print("显示 " + temp + " 的素数因子:");
		while(! stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}
}

class StackOfIntegers{
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	public StackOfIntegers(){
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
显示 120 的素数因子:5 3 2 2 2 
显示 360 的素数因子:5 3 3 2 2 2 
*/
