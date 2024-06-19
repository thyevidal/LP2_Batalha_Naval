package br.ufrn.imd.visao;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import br.ufrn.imd.modelo.Navio;
import br.ufrn.imd.modelo.Tabuleiro;

public class ControllerBatalhaNaval {

    @FXML
    private AnchorPane tabuleiroPane;

    private Tabuleiro tabuleiro1;

    public void initialize() {
        tabuleiro1 = new Tabuleiro();
        tabuleiroPane.getChildren().add(tabuleiro1);

        // Não posiciona navios aleatoriamente aqui para o tabuleiro1
    }

    @FXML
    public void posicionarNavio1() {
        tabuleiro1.selecionarNavio(Navio.TAMANHO_1); // Método para selecionar navio de tamanho 1
    }

    @FXML
    public void posicionarNavio2() {
        tabuleiro1.selecionarNavio(Navio.TAMANHO_2); // Método para selecionar navio de tamanho 2
    }

    @FXML
    public void posicionarNavio3() {
        tabuleiro1.selecionarNavio(Navio.TAMANHO_3); // Método para selecionar navio de tamanho 3
    }

    @FXML
    public void posicionarNavio4() {
        tabuleiro1.selecionarNavio(Navio.TAMANHO_4); // Método para selecionar navio de tamanho 4
    }
}
