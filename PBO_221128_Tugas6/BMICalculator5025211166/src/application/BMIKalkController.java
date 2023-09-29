package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class BMIKalkController {
	@FXML
	private TextField berat_imp;
	@FXML
	private TextField tinggi_imp;
	@FXML
	private Label bmi_imp;
	@FXML
	private TextField berat_metrik;
	@FXML
	private TextField tinggi_metrik;
	@FXML
	private Label bmi_metrik;

	// Event Listener on Button.onAction
	@FXML
	public void hapusImperial(ActionEvent event) {
		berat_imp.clear();
		tinggi_imp.clear();
		bmi_imp.setText("");
	}
	// Event Listener on Button.onAction
	@FXML
	public void hitungImperial(ActionEvent event) {
		BMICalculator bmi_kalk = new BMICalculator();
		
		try {
			double berat = Double.parseDouble(berat_imp.getText());
			double tinggi = Double.parseDouble(tinggi_imp.getText());
			
			double bmi = bmi_kalk.hitungBMIImperial(berat, tinggi);
			bmi_imp.setText("BMI anda adalah: " + Double.toString(bmi));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	// Event Listener on Button.onAction
	@FXML
	public void hapusMetrik(ActionEvent event) {
		berat_metrik.clear();
		tinggi_metrik.clear();
		bmi_metrik.setText("");
	}
	// Event Listener on Button.onAction
	@FXML
	public void hitungMetrik(ActionEvent event) {
		BMICalculator bmi_kalk = new BMICalculator();
		
		try {
			double berat = Double.parseDouble(berat_metrik.getText());
			double tinggi = Double.parseDouble(tinggi_metrik.getText());
			
			double bmi = bmi_kalk.hitungBMIMetrik(berat, tinggi);
			bmi_metrik.setText("BMI anda adalah: " + Double.toString(bmi));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}