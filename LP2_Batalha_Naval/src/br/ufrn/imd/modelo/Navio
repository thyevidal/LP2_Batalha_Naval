package br.ufrn.imd.modelo;

import javafx.scene.Parent;

public abstract class Navio extends Parent {
	
	protected boolean afundou;
	protected int dano;
	protected int tamanho;
	protected Casa casa;
	
	
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



	
	public void acerto()
	{
		dano = dano + 1;
	}


	@Override
	public String toString() {
		return "Afundou? = " + "\t" + afundou + "\n" + "Dano = " + "\t" + dano + "\n" + "Tamanho =" +"\t" + tamanho;
	}


	public void avisoAfundou() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

	
	
}
