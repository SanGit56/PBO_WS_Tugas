package shape;

public abstract class TwoDimensionalShape extends Shape {
	protected double panjang;
	protected double lebar;

	public TwoDimensionalShape(double panjang, double lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	@Override
	public String toString() {
		return "TwoDimensionalShape [panjang=" + panjang + ", lebar=" + lebar + "]";
	}
}