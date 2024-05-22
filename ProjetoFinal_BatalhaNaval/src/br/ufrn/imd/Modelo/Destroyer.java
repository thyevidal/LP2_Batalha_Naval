package br.ufrn.imd.Modelo;

public class Destroyer extends Navio{
	protected final int tamanho = 5;

	public Destroyer() {
		
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
