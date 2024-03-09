package draw.impl;

import java.awt.Color;

import fig.interfaces.FigPosColorInterface;

public class FigPosColorDrawable implements FigPosColorInterface{
	private int posX;
	private int posY;
	private Color AWTColor;
	
	@Override
	public int getPosX() {
		return this.posX;
	}

	@Override
	public int getPosY() {
		// TODO Auto-generated method stub
		return this.posY;
	}

	@Override
	public void setPosX(int posX) {
		this.posX = posX;
	}

	@Override
	public void setPosY(int posY) {
		this.posY = posY;
		
	}

	@Override
	public Color getAWTColor() {
		return this.AWTColor;
	}

	@Override
	public void setAWTColor(Color color) {
		this.AWTColor = color;
	}
	
	

}
