package br.ufrn.imd.modelo;

public abstract class Navio {
	
	protected boolean afundou;
	protected int dano;
	protected int tamanho;
	protected int coordX;
	protected int coordY;
	
	
	public Navio() {
		afundou = false;
		dano = 0;
	}


	public boolean isAfundou() {
		return afundou;
	}


	public void setAfundou(boolean afundou) {
		this.afundou = afundou;
	}


	public int getDano() {
		return dano;
	}


	public void setDano(int dano) {
		this.dano = dano;
	}


	public int getCoordX() {
		return coordX;
	}


	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}


	public int getCoordY() {
		return coordY;
	}


	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}


	@Override
	public String toString() {
		return "Afundou? = " + "\t" + afundou + "\n" + "Dano = " + "\t" + dano + "\n" + "Tamanho =" +"\t" + tamanho + " Coordenadas = (" + coordX + ","+ coordY + ")";
	}
	
	

	
	
}
