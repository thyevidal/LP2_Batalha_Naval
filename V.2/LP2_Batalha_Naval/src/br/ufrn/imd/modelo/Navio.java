package br.ufrn.imd.modelo;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Navio extends Rectangle {
    private final int tamanho;
    private final Tabuleiro tabuleiro;
    private boolean horizontal = true;

    public static final int TAMANHO_1 = 1;
    public static final int TAMANHO_2 = 2;
    public static final int TAMANHO_3 = 3;
    public static final int TAMANHO_4 = 4;

    public Navio(int tamanho, Tabuleiro tabuleiro) {
        super(tamanho * Tabuleiro.TAMANHO_CASA, Tabuleiro.TAMANHO_CASA);
        this.tamanho = tamanho;
        this.tabuleiro = tabuleiro;
        setFill(Color.GREEN.deriveColor(0, 1, 1, 0.5)); // Cor verde com transparência

        setOnMousePressed(e -> {
            if (e.isSecondaryButtonDown()) { // Botão direito do mouse para rotacionar
                rotate();
            }
        });
    }

    public int getTamanho() {
        return tamanho;
    }

    public void rotate() {
        horizontal = !horizontal;
        setWidth(horizontal ? tamanho * Tabuleiro.TAMANHO_CASA : Tabuleiro.TAMANHO_CASA);
        setHeight(horizontal ? Tabuleiro.TAMANHO_CASA : tamanho * Tabuleiro.TAMANHO_CASA);
    }

    public boolean isHorizontal() {
        return horizontal;
    }
}
