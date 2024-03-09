package fig.impl;

import java.awt.Color;

import fig.interfaces.LineInterface;

public class Line extends FigPosColor implements LineInterface {
	
	private int posX2;
	private int posY2;
	public Line(int posX, int posY, int posX2, int posY2, Color color) {
		super(posX, posY, color);
		this.posX2 = posX2;
		this.posY2 = posY2;
	}


	@Override
	public int getPosX2() {
		return this.posX2;
	}

	@Override
	public int getPosY2() {
		return this.posY2;
	}

	@Override
	public void setPosX2(int posX2) {
		this.posX2 = posX2;
		
	}

	@Override
	public void setPosY2(int posY2) {
		this.posY2 = posY2;
		
	}

}
