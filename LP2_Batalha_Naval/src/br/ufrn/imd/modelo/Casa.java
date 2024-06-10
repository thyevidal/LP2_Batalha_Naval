package br.ufrn.imd.modelo;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Casa extends Rectangle {
	public int CoordX, CoordY;
	public boolean atingida = false;
	protected Navio navio;
	public Casa (int x, int y, Navio navio)
	{
		super(40,40);
		this.CoordX = x;
		this.CoordY = y;
		this.navio = navio;
		setFill(Color.BLUEVIOLET);
		setStroke(Color.DARKBLUE);
	}
	

}
