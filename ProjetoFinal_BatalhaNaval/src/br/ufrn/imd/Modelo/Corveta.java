package br.ufrn.imd.Modelo;

public class Corveta extends Navio{

	protected final int tamanho = 2;

	public Corveta() {
		
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	
	public void Dados() {
		super.Dados();
		System.out.println("Tamanho: " + getTamanho());
		System.out.println("###########################################");
		System.out.println("");
	}
	
}
