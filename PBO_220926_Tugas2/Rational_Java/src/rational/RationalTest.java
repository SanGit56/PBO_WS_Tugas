package rational;

import java.util.Scanner;

public class RationalTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Masukkan numerator: ");
		int num = input.nextInt();
		
		System.out.printf("Masukkan denominator: ");
		int denom = input.nextInt();
		
		Rational pecahan1 = new Rational();
		Rational pecahan2 = new Rational(num, denom);
		
		System.out.printf("Masukkan jumlah angka setelah koma: ");
		int despoin = input.nextInt();
		
		System.out.printf("Operasi 1/2 dan %d/%d:%n", num, denom);
		
		pecahan1.add(pecahan1, pecahan2, despoin);
		pecahan1.subtract(pecahan1, pecahan2, despoin);
		pecahan1.multiply(pecahan1, pecahan2, despoin);
		pecahan1.divide(pecahan1, pecahan2, despoin);
	}
}