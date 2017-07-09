
public class FinalizationDemo {
	public static void main(String[] args) {
		Cake c1 = new Cake(1);
		Cake c2 = new Cake(2);
		Cake c3 = new Cake(3);

		c2 = c3 = null;
		System.gc();
	}
}


class Cake extends Object {
	private int id;

	public Cake (int id) {
		this.id = id;
		System.out.println("Cake objec " + id + " is created");
	}

	protected void finalize() throws java.lang.Throwable {
		super.finalize();
		System.out.println("Cake objec " + id + " is disposed");
	}
}


/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap9 $ java FinalizationDemo
Cake objec 1 is created
Cake objec 2 is created
Cake objec 3 is created
Cake objec 3 is disposed
Cake objec 2 is disposed
*/