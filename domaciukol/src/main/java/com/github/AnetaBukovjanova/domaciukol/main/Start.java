package com.github.AnetaBukovjanova.domaciukol.main;

import com.github.AnetaBukovjanova.domaciukol.logika.Game;
import com.github.AnetaBukovjanova.domaciukol.ui.HomeController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Start extends Application 
	{
	    public static void main( String[] args )
	    {
	    	launch(args);
	    }
	@Override   
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/ui/MainWindow.fxml"));
		Parent root = loader.load();

		HomeController controller = loader.getController();
		Game game = new Game();
		controller.inicializuj(game, this);

		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		primaryStage.setTitle("Angličtina pro děti");
}
}



