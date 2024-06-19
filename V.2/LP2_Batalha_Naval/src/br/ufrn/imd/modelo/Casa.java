package br.ufrn.imd.modelo;

import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;

public class Casa extends Button {
    private final int linha;
    private final int coluna;
    private boolean ocupada;
    private boolean clicada;
    private Navio navio;

    public Casa(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.ocupada = false;
        this.clicada = false;
        this.navio = null;

        setMinSize(30, 30);
        setMaxSize(30, 30);
        setStyle("-fx-background-color: lightgrey; -fx-border-color: black; -fx-border-width: 1px;");

        setOnMouseClicked(event -> handleMouseClick(event));
    }

    private void handleMouseClick(javafx.scene.input.MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (!clicada) {
                if (ocupada) {
                    setStyle("-fx-background-color: red; -fx-border-color: black; -fx-border-width: 1px;");
                } else {
                    setStyle("-fx-background-color: lightblue; -fx-border-color: black; -fx-border-width: 1px;");
                }
                clicada = true;
            } else {
                if (navio != null) {
                    navio.rotate();
                }
            }
        } else if (event.getButton() == MouseButton.SECONDARY) {
            if (navio != null) {
                navio.rotate();
            }
        }
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
        if (ocupada) {
            setStyle("-fx-background-color: darkgrey; -fx-border-color: black; -fx-border-width: 1px;");
        } else {
            setStyle("-fx-background-color: lightgrey; -fx-border-color: black; -fx-border-width: 1px;");
        }
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }
}
