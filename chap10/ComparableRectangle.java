
public class ComparableRectangle extends Rectangle implements Comparable {
	public ComparableRectangle(double width, double height) {
		super(width, height);
	}


	public int compareTo(Object o) {
		if (getArea() > ((ComparableRectangle)o).getArea()) {
			return 1;
		} else if (getArea() < ((ComparableRectangle)o).getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
}