package egengrafik;

import java.awt.Color;
import java.awt.Graphics;

public class Boll {


	private Color c;
	private int r;
	private double x;
	private double y;
	private int xv;
	private int yv;

	public Boll(double xx,double yy, Color cc, int rr, int xvxv,int yvyv) {

		this.c=cc;
		this.r=rr;
		this.x=xx;
		this.y=yy;
		this.xv=xvxv;
		this.yv=yvyv;


	}

	public int xToInt() {

		return (int) Math.round(x);
	}

	public int yToInt() {

		return (int) Math.round(y);
	}


	public void rita(Graphics g) {

		g.setColor(c);
		g.fillOval(xToInt(),yToInt(),(r*2),(r*2));

	}



	public void update() {


		y=y+yv;
		x=x+xv;


	}


}
