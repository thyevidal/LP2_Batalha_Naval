package br.ufrn.imd.Modelo;

public class Tabuleiro {
    private int tamanho;
    private char[][] celulas; // Matriz para representar o estado do tabuleiro

    public Tabuleiro(int tamanho) {
        this.tamanho = tamanho;
        this.celulas = new char[tamanho][tamanho];
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                celulas[i][j] = '~'; // Caractere para representar uma célula vazia
            }
        }
    }

    public void exibirTabuleiro() {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(celulas[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Métodos para manipular o estado do tabuleiro (posicionar navios, disparar tiros, etc.)
}
