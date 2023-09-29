package shape;

public class Tetrahedron extends ThreeDimensionalShape {
	public double sisi;

	public Tetrahedron(double panjang, double lebar, double tinggi) {
		super(panjang, lebar, tinggi);
	}

	@Override
	public double getVolume() {
		this.sisi = panjang / 2;
		return 2 * java.lang.Math.sqrt(2) * sisi * sisi * sisi / 3;
	}

	@Override
	public double getArea() {
		return java.lang.Math.sqrt(3) * panjang * panjang;
	}

	@Override
	public String toString() {
		return "Tetrahedron [luas=" + getArea() + 
				", volume=" + getVolume() + "]";
	}
}