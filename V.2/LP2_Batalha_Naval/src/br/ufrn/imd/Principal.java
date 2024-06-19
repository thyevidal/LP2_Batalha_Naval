package br.ufrn.imd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.Parent;
import javafx.stage.Stage;

import br.ufrn.imd.modelo.Tabuleiro;

public class Principal extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Carregando o FXML
            Parent root = FXMLLoader.load(getClass().getResource("/br/ufrn/imd/visao/BatalhaNaval.fxml"));
            Scene scene = new Scene(root, 1200, 650);

            // Estilizando com CSS
            String css = this.getClass().getResource("/br/ufrn/imd/Principal.css").toExternalForm();
            scene.getStylesheets().add(css);

            // Customizando o Stage
            primaryStage.setTitle("Batalha Naval");
            Image icone = new Image(getClass().getResourceAsStream("/battleship (2).png"));
            primaryStage.getIcons().add(icone);
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();

            // Inicializa o tabuleiro2 com navios aleatórios
            Tabuleiro tabuleiro2 = new Tabuleiro();
            tabuleiro2.posicionarNaviosAleatoriamente();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
