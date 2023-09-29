package shape;

public abstract class ThreeDimensionalShape extends Shape {
	protected double panjang;
	protected double lebar;
	protected double tinggi;

	public ThreeDimensionalShape(double panjang, double lebar, double tinggi) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
	}

	public abstract double getVolume();

	@Override
	public String toString() {
		return "ThreeDimensionalShape [panjang=" + panjang + 
				", lebar=" + lebar + 
				", tinggi=" + tinggi + "]";
	}
}