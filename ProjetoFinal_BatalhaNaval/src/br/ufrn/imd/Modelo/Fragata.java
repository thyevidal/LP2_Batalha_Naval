package br.ufrn.imd.Modelo;

public class Fragata extends Navio{
	protected final int tamanho = 4;

	public Fragata() {
		
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
