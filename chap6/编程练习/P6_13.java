// date:17.3.24
// author: linyang <linyang@xiaomi.com>
// 增加数组大小


public class P6_13 {
	public static void main(String[] args) {
		int[] list = new int[5];
		for(int i = 1; i<=list.length;i++){
			list[i - 1] = i;
		}
		list = doubleCapacity(list);
		System.out.println("输出数组中的内容：");
		for(int i = 0;i < list.length;i++)
			System.out.print("  " + list[i]);
	}

	private static int[] doubleCapacity(int[] list) {
		int[] newList = new int[list.length*2];
		//
		System.arraycopy(list, 0, newList, 0, list.length);
		return newList;
	}
	
}
	

/*
System提供了一个静态方法arraycopy(),我们可以使用它来实现数组之间的复制。其函数原型是：
public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)
src:源数组；	srcPos:源数组要复制的起始位置；
dest:目的数组；	destPos:目的数组放置的起始位置；	length:复制的长度。
注意：src and dest都必须是同类型或者可以进行转换类型的数组．


*/
