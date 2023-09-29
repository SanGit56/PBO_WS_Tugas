package shape;

public class Cube extends ThreeDimensionalShape {

	public Cube(double panjang, double lebar, double tinggi) {
		super(panjang, lebar, tinggi);
	}

	@Override
	public double getVolume() {
		return panjang * lebar * tinggi;
	}

	@Override
	public double getArea() {
		return 6 * panjang * lebar;
	}

	@Override
	public String toString() {
		return "Cube [luas=" + getArea() + 
				", volume=" + getVolume() + "]";
	}
}