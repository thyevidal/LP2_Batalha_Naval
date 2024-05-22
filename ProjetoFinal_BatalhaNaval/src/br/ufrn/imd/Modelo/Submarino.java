package br.ufrn.imd.Modelo;

public class Submarino extends Navio{
	protected final int tamanho = 3;

	public Submarino() {
		
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
