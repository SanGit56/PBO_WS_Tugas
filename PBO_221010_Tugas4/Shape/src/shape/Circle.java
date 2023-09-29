package shape;

public class Circle extends TwoDimensionalShape {
	public double radius;

	public Circle(double panjang, double lebar) {
		super(panjang, lebar);
	}

	@Override
	public double getArea() {
		this.radius = panjang / 2;
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [luas=" + getArea() + "]";
	}
}