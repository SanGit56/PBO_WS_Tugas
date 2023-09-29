package rational;

public class Rational {
	private int numerator;
	private int denominator;
	
	public Rational() {
		this.numerator = 1;
		this.denominator = 2;
	}
	
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNum() {
		return numerator;
	}

	public void setNum(int numerator) {
		this.numerator = numerator;
	}

	public int getDenom() {
		return denominator;
	}

	public void setDenom(int denominator) {
		this.denominator = denominator;
	}
	
	public static void add(Rational pecahan1, Rational pecahan2, int despoin) {
		int num = pecahan2.denominator * pecahan1.numerator + pecahan1.denominator * pecahan2.numerator;
		int denom = pecahan1.denominator * pecahan2.denominator;
		float hasil = (float) num / (float) denom;
		
		System.out.printf("Tambah: %d/%d = ", num, denom);
		System.out.printf("%f%n", hasil);
	}
	
	public static void subtract(Rational pecahan1, Rational pecahan2, int despoin) {
		int num = pecahan2.denominator * pecahan1.numerator - pecahan1.denominator * pecahan2.numerator;
		int denom = pecahan1.denominator * pecahan2.denominator;
		float hasil = (float) num / (float) denom;
		
		System.out.printf("Kurang: %d/%d = ", num, denom);
		System.out.printf("%f%n", hasil);
	}
	
	public static void multiply(Rational pecahan1, Rational pecahan2, int despoin) {
		int num = pecahan1.numerator * pecahan2.numerator;
		int denom = pecahan1.denominator * pecahan2.denominator;
		float hasil = (float) num / (float) denom;
		
		System.out.printf("Kali: %d/%d = ", num, denom);
		System.out.printf("%f%n", hasil);
	}
	
	public static void divide(Rational pecahan1, Rational pecahan2, int despoin) {
		int num = pecahan1.numerator * pecahan2.denominator;
		int denom = pecahan1.denominator * pecahan2.numerator;
		float hasil = (float) num / (float) denom;
		
		System.out.printf("Bagi: %d/%d = ", num, denom);
		System.out.printf("%f%n", hasil);
	}
}