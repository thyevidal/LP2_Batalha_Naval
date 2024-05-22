package br.ufrn.imd.Visao;

import br.ufrn.imd.Modelo.Corveta;
import br.ufrn.imd.Modelo.Estado;
import br.ufrn.imd.Modelo.Orientacao;
import br.ufrn.imd.Modelo.Posicao;
import br.ufrn.imd.Modelo.Tabuleiro;

public class BatalhaNaval {
	
	public static void main(String[] args) {
		Corveta c1 = new Corveta();
		Tabuleiro t = new Tabuleiro(10);
		
		c1.setOrientacao(Orientacao.HORIZONTAL);
		c1.setPosicao(new Posicao(2,3));
		c1.setEstado(Estado.ATINGIDO);
		c1.Dados();
		t.exibirTabuleiro();
		
		
	}
}
