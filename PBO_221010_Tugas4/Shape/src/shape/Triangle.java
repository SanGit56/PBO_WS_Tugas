package shape;

public class Triangle extends TwoDimensionalShape {
	public double tinggi;

	public Triangle(double panjang, double tinggi) {
		super(panjang, tinggi);
		this.tinggi = tinggi;
	}

	@Override
	public double getArea() {
		return 0.5 * panjang * tinggi;
	}

	@Override
	public String toString() {
		return "Triangle [luas=" + getArea() + "]";
	}
}