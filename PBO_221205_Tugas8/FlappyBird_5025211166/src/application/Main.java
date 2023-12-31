package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent depan = FXMLLoader.load(getClass().getResource("KepakSayap.fxml"));
			Scene scene = new Scene(depan);
			
			scene.getRoot().requestFocus();
			primaryStage.setTitle("KepakSayap ver. 166");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
