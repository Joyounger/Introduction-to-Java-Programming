// date:17.7.4

public class TestGeometricObject {
	public static void main(String[] args) {
		GeometricObject genObject1 = new Circle(5);
		GeometricObject genObject2 = new Rectangle(5, 3);

		System.out.println("the two objects have the same area? " + equalArea(genObject1, genObject2));

		displayGeometricObject(genObject1);
		displayGeometricObject(genObject2);
	}


	public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}

	public static void displayGeometricObject(GeometricObject object) {
		System.out.println();
		System.out.println("the area is " + object.getArea());
		System.out.println("the parameter is " + object.getPerimeter());
	}
}

/*
kolya@asus ~/src/Introduction-to-Java-Programming/chap10 $ java TestGeometricObject
the two objects have the same area? false

the area is 78.53981633974483
the parameter is 31.41592653589793

the area is 15.0
the parameter is 16.0
*/
