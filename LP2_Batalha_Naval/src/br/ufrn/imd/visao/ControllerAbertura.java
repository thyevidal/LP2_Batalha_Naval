package br.ufrn.imd.visao;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerAbertura {
	public Stage stage;
	public Scene scene;
	public Parent root;
	
	@FXML
	public void iniciar(ActionEvent evento) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("/br/ufrn/imd/visao/BatalhaNaval.fxml"));
		Scene scene = new Scene(root);
		stage = (Stage)((Node)evento.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
	
}
