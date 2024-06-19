package br.ufrn.imd.modelo;

import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tabuleiro extends GridPane {
    private final List<Casa> casas = new ArrayList<>();
    private Navio navioSelecionado;

    public Tabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Casa casa = new Casa(i, j);
                casa.setOnMouseClicked(event -> handleMouseClick(casa, event));
                add(casa, j, i);
                casas.add(casa);
            }
        }
    }

    private void handleMouseClick(Casa casa, javafx.scene.input.MouseEvent event) {
        if (navioSelecionado == null) {
            if (casa.isOcupada()) {
                navioSelecionado = casa.getNavio();
                navioSelecionado.toFront();
                return;
            }
        } else {
            int linha = GridPane.getRowIndex(casa);
            int coluna = GridPane.getColumnIndex(casa);
            int tamanho = navioSelecionado.getTamanho();

            if (event.getButton() == javafx.scene.input.MouseButton.PRIMARY) {
                if (navioSelecionado.isHorizontal() && coluna + tamanho <= 10) {
                    if (!isCasaOcupada(linha, coluna, tamanho, true)) {
                        posicionarNavio(casa, linha, coluna, tamanho, true);
                    }
                } else if (!navioSelecionado.isHorizontal() && linha + tamanho <= 10) {
                    if (!isCasaOcupada(linha, coluna, tamanho, false)) {
                        posicionarNavio(casa, linha, coluna, tamanho, false);
                    }
                }
            }

            navioSelecionado = null;
        }
    }

    private boolean isCasaOcupada(int linhaInicial, int colunaInicial, int tamanho, boolean horizontal) {
        if (horizontal) {
            for (int i = colunaInicial; i < colunaInicial + tamanho; i++) {
                Casa casa = getCasa(linhaInicial, i);
                if (casa.isOcupada()) {
                    return true;
                }
            }
        } else {
            for (int i = linhaInicial; i < linhaInicial + tamanho; i++) {
                Casa casa = getCasa(i, colunaInicial);
                if (casa.isOcupada()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void posicionarNavio(Casa casaInicial, int linhaInicial, int colunaInicial, int tamanho, boolean horizontal) {
        if (horizontal) {
            for (int i = colunaInicial; i < colunaInicial + tamanho; i++) {
                Casa casa = getCasa(linhaInicial, i);
                casa.setOcupada(true);
                casa.setNavio(navioSelecionado);
            }
        } else {
            for (int i = linhaInicial; i < linhaInicial + tamanho; i++) {
                Casa casa = getCasa(i, colunaInicial);
                casa.setOcupada(true);
                casa.setNavio(navioSelecionado);
            }
        }
    }

    private Casa getCasa(int linha, int coluna) {
        for (Casa casa : casas) {
            if (GridPane.getRowIndex(casa) == linha && GridPane.getColumnIndex(casa) == coluna) {
                return casa;
            }
        }
        return null;
    }

    public void posicionarNaviosAleatoriamente() {
        Random random = new Random();
        int[] tamanhos = {1, 2, 3, 4};

        for (int tamanho : tamanhos) {
            boolean horizontal = random.nextBoolean();
            int linha, coluna;

            do {
                linha = random.nextInt(10);
                coluna = random.nextInt(10);
            } while (isCasaOcupada(linha, coluna, tamanho, horizontal));

            posicionarNavio(getCasa(linha, coluna), linha, coluna, tamanho, horizontal);
        }
    }
}
