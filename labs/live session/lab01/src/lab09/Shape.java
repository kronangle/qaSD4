package lab09;

import java.awt.Color;

public class Shape {

//	Declarations
	public int x, y, w, h;
	private int dirX, dirY;
	static int worldW;
	static int worldH;
	
	private Color color = Color.BLACK;
	private SHAPE_TYPE shapeType;

//	x and y is top left point
//	w and h is the size of ball
//	dirX and dirY is the direction of the ball

	public Shape(int x, int y, int w, int h, int dirX, int dirY, Color color, SHAPE_TYPE shapeType) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		this.color = color;
		this.shapeType = shapeType;
	}
	
	public Shape(int x, int y, int w, int h, int dirX, int dirY, Color color) {
		this(x, y, w, h, dirX, dirY, color, SHAPE_TYPE.OVAL);
	}

	public Shape(int x, int y, int w, int h, int dirX, int dirY) {
		this(x, y, w, h, 3, 3, Color.BLACK);
	}
	
	public Shape(int x, int y, int w, int h) {
		this(x, y, w, h, 3, 3);
	}
	
	public static void setWorld(int w, int h) {
		Shape.worldW = w;
		Shape.worldH = h;
	}
	
	public void move() {
		x += dirX;
		y += dirY;
		
		if (x < 0) {
			x = 0;
			dirX = -dirX;
		}
		
		if (x > worldW - w) {
			x = worldW - w;
			dirX = -dirX;
		}
		
		if (y < 0) {
			y = 0;
			dirY = -dirY;
		}
		
		if (y > worldH - h) {
			y = worldH - h;
			dirY = -dirY;
		}
		
	}

	public SHAPE_TYPE getShapeType() {
		return shapeType;
	}

	public Color getColor() {
		return color;
	}
	
	
}
