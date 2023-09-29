package application;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class DetakKalkController {
	@FXML
	private TextField umur;
	@FXML
	private Label detak_maks;
	@FXML
	private Label detak_target;

	// Event Listener on Button.onAction
	@FXML
	public void hitung(ActionEvent event) {
		HeartRateCalculator detak_kalk = new HeartRateCalculator();
		
		try {
			int umur_pengguna = Integer.parseInt(umur.getText());
			int hitung_detak_maks = detak_kalk.hitungDetakMaks(umur_pengguna);
			String hitung_detak_target = detak_kalk.hitungDetakTarget(umur_pengguna);
			
			detak_maks.setText("Detak jantung maksimal anda adalah: " + Integer.toString(hitung_detak_maks) + " bpm");
			detak_target.setText("Target detak jantung: " + hitung_detak_target + " bpm");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
