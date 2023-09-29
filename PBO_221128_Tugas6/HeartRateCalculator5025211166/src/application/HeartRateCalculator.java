package application;

public class HeartRateCalculator {
	int hitungDetakMaks(int umur)
		throws ValidationException {		
		if (umur <= 0) {
		    throw new ValidationException("Isi jangan 0 atau negatif!");
		} else {
			int detak_maks = 220 - umur;
			
			return detak_maks;
		}
	}
	
	String hitungDetakTarget(int umur)
		throws ValidationException {
		if (umur <= 0) {
		    throw new ValidationException("Isi jangan 0 atau negatif!");
		} else {
			int detak_target_bawah = (220 - umur) * 50 / 100;
			int detak_target_atas = (220 - umur) * 85 / 100;
			
			return Integer.toString(detak_target_bawah)  + " - " + Integer.toString(detak_target_atas);
		}
	}
}