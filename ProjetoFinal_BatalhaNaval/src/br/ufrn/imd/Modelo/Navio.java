package br.ufrn.imd.Modelo;

public abstract class Navio {
	
	private Orientacao orientacao;
	private Posicao posicao;
	private Estado estado;
	
	
	public Navio() {

	}


	public Orientacao getOrientacao() {
		return orientacao;
	}


	public void setOrientacao(Orientacao orientacao) {
		this.orientacao = orientacao;
	}

	public Posicao getPosicao() {
		return posicao;
	}


	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void Dados() {
		System.out.println("############## --- Dados --- ##############");
		System.out.println("Orientação: " + getOrientacao());
		System.out.println("Posição: linha: " + getPosicao().getLinha() + " coluna: " + getPosicao().getColuna());
		System.out.println("Estado: " + getEstado());
	}
	
	
	
}
