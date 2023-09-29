package shape;

public class Sphere extends ThreeDimensionalShape {
	public double radius;

	public Sphere(double panjang, double lebar, double tinggi) {
		super(panjang, lebar, tinggi);
		this.radius = panjang / 2;
	}

	@Override
	public double getVolume() {
		return 4 * 3.14 * radius * radius * radius / 3;
	}

	@Override
	public double getArea() {
		return 4 * 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return "Sphere [luas=" + getArea() + 
				", volume=" + getVolume() + "]";
	}
}