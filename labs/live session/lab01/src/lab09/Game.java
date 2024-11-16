package lab09;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {

	private static int WIDTH = 500;
	private static int HEIGHT = 500;
	private static int NUMBER_OF_SHAPES = 10;
	private static int MAX_SHAPE_SIZE = 80;
	private static int MAX_SHAPE_SPEED = 20;

//	Ball[] balls = { new Ball(1, 1, 10, 10), new Ball(100, 150, 30, 30), new Ball(25, 30, 50, 25),
//			new Ball(252, 30, 50, 125, -5, -5), new Ball(220, 275, 50, 25, -10, -10) };

//	Shape[] shapes = new Shape[NUMBER_OF_SHAPES];
	
	ArrayList<Shape> shapes = new ArrayList<>(NUMBER_OF_SHAPES);

	Game() {
//		Window config
		JFrame frame = new JFrame();
		this.setSize(WIDTH, HEIGHT);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);

//		Ball set up
		createShapes();
		Shape.setWorld(WIDTH, HEIGHT);

//		Timer set up
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};

//		Run timer
		t.schedule(tt, 0, 50);

//		Cancel timer
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}

	private void createShapes() {
		for (int i = 0; i < NUMBER_OF_SHAPES; i++) {
			
			shapes.add(new Shape(
/* Random Start */		Utils.getRandonInt(WIDTH), Utils.getRandonInt(HEIGHT),
/* Random Size */		Utils.getRandonInt(MAX_SHAPE_SIZE), Utils.getRandonInt(MAX_SHAPE_SIZE),
/* Random dirX */		Utils.getRandonInt(-MAX_SHAPE_SPEED, MAX_SHAPE_SPEED),
/* Random dirY */		Utils.getRandonInt(-MAX_SHAPE_SPEED, MAX_SHAPE_SPEED), 
/* Random color */		Utils.getRandomColor(),
/* Random shape */		SHAPE_TYPE.values()[Utils.getRandonInt(0,(SHAPE_TYPE.values().length)-1)]));
		}
	}

	public void draw() {
		for (Shape ball : shapes) {
			ball.move();
		}
		this.repaint();
	}

	public void paint(Graphics g) {
//		Background
		g.setColor(Color.GREEN);
		g.drawRect(0, 0, WIDTH, HEIGHT);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		
//		Shapes
		for (Shape shape : shapes) {
			if (shape.getShapeType() == SHAPE_TYPE.OVAL) {
				g.drawOval(shape.x, shape.y, shape.w, shape.h);
				g.setColor(shape.getColor());
				g.fillOval(shape.x, shape.y, shape.w, shape.h);
			} else if (shape.getShapeType() == SHAPE_TYPE.RECTANGLE) {
				g.drawRect(shape.x, shape.y, shape.w, shape.h);
				g.setColor(shape.getColor());
				g.fillRect(shape.x, shape.y, shape.w, shape.h);
			} else if (shape.getShapeType() == SHAPE_TYPE.THREEDRECTANGLE) {
				g.draw3DRect(shape.x, shape.y, shape.w, shape.h, true);
				g.setColor(shape.getColor());
				g.fill3DRect(shape.x, shape.y, shape.w, shape.h, true);
			} else if (shape.getShapeType() == SHAPE_TYPE.ROUNDRECTANGLE) {
				g.drawRoundRect(shape.x, shape.y, shape.w, shape.h, 50, 50);
				g.setColor(shape.getColor());
				g.fillRoundRect(shape.x, shape.y, shape.w, shape.h, 50, 50);
			} else if (shape.getShapeType() == SHAPE_TYPE.ARC) {
				g.drawArc(shape.x, shape.y, shape.w, shape.h, 70, 70);
				g.setColor(shape.getColor());
				g.fillArc(shape.x, shape.y, shape.w, shape.h, 70, 70);
			} 
		}
	}
}