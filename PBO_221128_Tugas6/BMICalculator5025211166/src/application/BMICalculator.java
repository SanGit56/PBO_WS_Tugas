package application;

public class BMICalculator {
	double hitungBMIImperial(double berat, double tinggi)
		throws ValidationException {
		if (berat <= 0 || tinggi <= 0) {
		    throw new ValidationException("Isi jangan 0 atau negatif!");
		} else {
			double bmi_imp = (berat * 703) / (tinggi * tinggi);
			
			return bmi_imp;
		}
	}
	
	double hitungBMIMetrik(double berat, double tinggi)
		throws ValidationException {
		if (berat <= 0 || tinggi <= 0) {
		    throw new ValidationException("Isi jangan 0 atau negatif!");
		} else {
			double bmi_metrik = berat / (tinggi * tinggi);
			
			return bmi_metrik;
		}
	}
}