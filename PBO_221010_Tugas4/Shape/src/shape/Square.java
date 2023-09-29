package shape;

public class Square extends TwoDimensionalShape {

	public Square(double panjang, double lebar) {
		super(panjang, lebar);
	}

	@Override
	public double getArea() {
		return panjang * lebar;
	}

	@Override
	public String toString() {
		return "Square [luas=" + getArea() + "]";
	}
}