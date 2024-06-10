package br.ufrn.imd.modelo;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import br.ufrn.imd.modelo.Casa;
import javafx.scene.input.MouseEvent;

public class Tabuleiro extends Parent{
    protected VBox colunas = new VBox();
    
    public Tabuleiro(EventHandler<?super MouseEvent> handler)
    {
    	for (int i = 0; i < 10; i++)
    	{
    		HBox linha = new HBox();
    		for (int j = 0; j < 10; j++)
    		{
    			Casa casa = new Casa(i,j,this);
    			casa.setOnMouseClicked(handler);
    			linha.getChildren().add(casa);
    		}
    		
    		colunas.getChildren().add(linha);
    	}
    	
    	getChildren().add(colunas);
    }


    // Métodos para manipular o estado do tabuleiro (posicionar navios, disparar tiros, etc.)
}
