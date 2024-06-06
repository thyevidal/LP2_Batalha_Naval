package br.ufrn.imd.modelo;

public class Corveta extends Navio {


	public Corveta() {
		this.tamanho = 2;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public void avisoAfundou() {
		System.out.println("O Corveta acabou de afundar!");
		
	}
	
}
