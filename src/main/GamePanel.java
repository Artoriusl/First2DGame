package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{	// GamePanel class inherits JPanel class, it has all the functions of it. It also implements Runnable interface
	
	// SCREEN SETTINGS
	final int originalTileSize = 16;	// 16x16 tile will be the default size of player character, npc, etc.
	final int scale = 3;				// this will help scale originalTileSize to 48px
	
	final int tileSize = originalTileSize * scale;	// 48x48 tile
	
	// decide the size of game screen, how many tiles the game displays horizontally and vertically
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol;	// 768px
	final int screenHeight = tileSize * maxScreenRow;	// 576px
	
	
	Thread gameThread;	// this will keep program running until we stop it
						// when we start gameThread it will automatically call the run() method
	
	
	//constructor for game panel
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));	// sets the size of the class (JPanel)
		this.setBackground(Color.black);
		
		// improve rendering performance
		this.setDoubleBuffered(true);	// when set to true, all the drawing from this component is done in an off-screen painting buffer
		
	}
	
	public void startGameThread() {
		
		gameThread = new Thread(this);	// we pass GamePanel class onto the Thread constructor
		gameThread.start();				// will call the run() method
		
	}


	@Override
	public void run() {		// the run method is where the game loop is created, core of the game
		
		while(gameThread != null) {	// as long as the thread exists we iterate through the loop
			
//			System.out.println("The game loop is running");
			
			// we will need TWO things
			
			
			// 1. Update: update information (i.e. character positions)
			
			update();
			
			
			// 2. Draw: draw screen with updated information
			
			repaint();	// this is how the paintComponnt method is called
			
		};
		
	}
	
	public void update() {
		
	}
	
	public void paintComponent(Graphics g) /*class with functions to draw on screen*/ {	// built-in method in Java to draw on JPanel
		
		super.paintComponent(g);	// the parent class (JPanel)
		
		Graphics2D g2 =	(Graphics2D)g;	// Graphics2D extends Graphics class, provides more sophisticated control
		
		g2.setColor(Color.white);	// sets a color to use for drawing objects
		
		g2.fillRect(100, 100, tileSize, tileSize);	// draws a rectangle and fills it with specified color
	
		g2.dispose();	// dispose the graphics and frees resources
	}

}
