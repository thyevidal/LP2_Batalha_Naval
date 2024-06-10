package br.ufrn.imd;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Parent;


public class Principal extends Application {
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			
			//Criando uma cena
			Parent root = FXMLLoader.load(getClass().getResource("/br/ufrn/imd/visao/Abertura.fxml"));
			Scene scene = new Scene(root,600,600);
			
			
			//Estilizando com CSS
			String css = this.getClass().getResource("/br/ufrn/imd/Principal.css").toExternalForm();
			scene.getStylesheets().add(css);
			
			
			//Customizando o Stage
			//Adicionando tÃ­tulo ao Stage
			primaryStage.setTitle("Batalha Naval");
			//Adicionando Ã­cone ao stage
			Image icone = new Image("battleship (2).png");
			primaryStage.getIcons().add(icone);
			
			//NÃ£o Ã© psosÃ­vel mudar o tamanho da janela
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
