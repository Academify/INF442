package draw.impl;
import java.awt.Graphics;

import draw.interfaces.DrawableInterface;
import fig.interfaces.LineInterface;

public class LineDrawable extends FigPosColorDrawable implements LineInterface, DrawableInterface {
	private LineInterface line;
	
	public LineDrawable(LineInterface line) {
		this.line = line;
	}
	
	public int getPosX2() {
		return line.getPosX2();
	}

	public int getPosY2() {
		return line.getPosY2();
	}


	public void setPosX2(int posX2) {
		line.setPosX2(posX2);
	}


	public void setPosY2(int posY2) {
		line.setPosY2(posY2);
	}


	public void awtDraw(Graphics g) {
		g.setColor(getAWTColor());
		g.drawLine(getPosX(), getPosY(), getPosX2(), getPosY2());
	}
}
