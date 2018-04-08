package com.github.AnetaBukovjanova.domaciukol.ui;

import com.github.AnetaBukovjanova.domaciukol.logika.Game;
import com.github.AnetaBukovjanova.domaciukol.logika.Word;
import com.github.AnetaBukovjanova.domaciukol.main.Start;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
//import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class HomeController extends GridPane
{
	private Game game;
	private List<Word> slova;
	private boolean hadani = false;
	private Map<String, Word> button;
		
	@FXML private TextArea textarea;
	@FXML private Button hadej;
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	@FXML private Button button4;
	@FXML private Button button5;
	@FXML private Button button6;
	
	@FXML private Tooltip tool1;
	@FXML private Tooltip tool2;
	@FXML private Tooltip tool3;
	@FXML private Tooltip tool4;
	@FXML private Tooltip tool5;
	@FXML private Tooltip tool6;
	
	@FXML private ImageView image1;
	@FXML private ImageView image2;
	@FXML private ImageView image3;
	@FXML private ImageView image4;
	@FXML private ImageView image5;
	@FXML private ImageView image6;
	
	public void odesliPrikaz() {
		textarea.clear();
		String vysledek = "Správný výsledek: " + game.getSpravne() + "\n" + "špatný výsledek: " + game.getSpatne();
		textarea.appendText(vysledek);
	}
	
	public void inicializuj(Game game, Start start) {
		this.game = game;
		button = new HashMap<String, Word>();
		slova = game.getSlova();
		
		button.put(button1.getId(), slova.get(0));
		String URL = slova.get(0).getObrazek();
		Image obrazek = new Image (getClass().getResourceAsStream(URL));
		image1.setImage(obrazek);
		tool1.setText(button.get("button1").getSlovoCZE());
		
		button.put(button2.getId(), slova.get(1));
		URL = slova.get(1).getObrazek();
		obrazek = new Image (getClass().getResourceAsStream(URL));
		image2.setImage(obrazek);
		tool2.setText(button.get("button2").getSlovoCZE());
		
		button.put(button3.getId(), slova.get(2));
		URL = slova.get(2).getObrazek();
		obrazek = new Image (getClass().getResourceAsStream(URL));
		image3.setImage(obrazek);
		tool3.setText(button.get("button3").getSlovoCZE());
		
		button.put(button4.getId(), slova.get(3));
		URL = slova.get(3).getObrazek();
		obrazek = new Image (getClass().getResourceAsStream(URL));
		image4.setImage(obrazek);
		tool4.setText(button.get("button4").getSlovoCZE());
		
		button.put(button5.getId(), slova.get(4));
		URL = slova.get(4).getObrazek();
		obrazek = new Image (getClass().getResourceAsStream(URL));
		image5.setImage(obrazek);
		tool5.setText(button.get("button5").getSlovoCZE());
		
		button.put(button6.getId(), slova.get(5));
		URL = slova.get(5).getObrazek();
		obrazek = new Image (getClass().getResourceAsStream(URL));
		image6.setImage(obrazek);
		tool6.setText(button.get("button6").getSlovoCZE());
			
		
	}
	
	@FXML public void klikHadej(ActionEvent arg0) {
		if (!hadani) {
			game.vyberSlovo();
			String slovo = game.getHadane();
			hadej.setText(slovo);
			hadani = true;
		}
	}
	
	@FXML public void hadej(ActionEvent arg0) {
		if (hadani) {
			String hadane = ((Node) arg0.getTarget()).getId();
			hadane = button.get(hadane).getSlovoENG();
			if (hadej.getText().equals(hadane)) {
				game.setVysledek(hadane);
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Výsledek hádání:");
				alert.setHeaderText(null);
				alert.setContentText("Jsi šikula!: Uhádl/a jsi to!");
				alert.showAndWait();
			}
			else 
			{	
				game.setVysledek(hadane);
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Výsledek hádání ");
				alert.setHeaderText("Bohužel jsi to neuhádl/a.");
				alert.showAndWait();
			}
		hadani = false;
		hadej.setText("hadej");
		this.odesliPrikaz();
		}
	}
	
	
}
