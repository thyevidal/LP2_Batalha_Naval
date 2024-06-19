package br.ufrn.imd.modelo;

public class Fragata extends Navio{


	public Fragata() {
		this.tamanho = 4;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public void avisoAfundou() {
		System.out.println("O fragata acabou de afundar!");
	}
	


}
