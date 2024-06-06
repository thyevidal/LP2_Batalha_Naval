package br.ufrn.imd.modelo;

public class Destroyer extends Navio{


	public Destroyer() {
		this.tamanho = 5;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public void avisoAfundou() {
		System.out.println("Destroyer acabou de afundar!");
		
	}

}
