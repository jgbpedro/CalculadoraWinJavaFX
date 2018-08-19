package br.com.CalculadoraWin.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root =FXMLLoader.load(getClass().getResource("RootCalc.fxml"));

		//Criar objeto Scene e associar ao Stage(Janela)
		primaryStage.setScene(new Scene(root));

		//Colocar um titulo a janela
		primaryStage.setTitle("Calculadora");

		//Mostrar a janela
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
