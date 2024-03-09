package draw.impl;

import java.awt.Color;
import java.awt.Graphics;

import draw.interfaces.DrawableInterface;
import fig.impl.Line;

public class LineDrawable extends Line implements DrawableInterface{

	public LineDrawable(int posX, int posY, int posX2, int posY2, Color color) {
		super(posX, posY, posX2, posY2, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void awtDraw(Graphics g) {
		g.setColor(getAWTColor());
		g.drawLine(getPosX(), getPosY(), getPosX2(), getPosY2());
	}
	
}
