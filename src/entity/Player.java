package entity;

import java.awt.Color;
import java.awt.Graphics2D;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity{

	GamePanel gp;
	KeyHandler keyH;
	
	public Player (GamePanel gp, KeyHandler keyH) {
		this.gp = gp;
		this.keyH = keyH;
		
		setDefaultValues();
	}
	
	
	// sets player's default position and speed
	public void setDefaultValues() {
		
		x = 100;
		y = 100;
		speed = 4;
	}
	
	public void update() {
		if (keyH.upPressed == true) {
			y -= speed;
		}
		else if (keyH.downPressed == true) {
			y += speed;
		}
		else if (keyH.leftPressed == true) {
			x -= speed;
		}
		else if (keyH.rightPressed == true) {
			x += speed;
		}
	}
	
	public void draw(Graphics2D g2) {
		g2.setColor(Color.white);	// sets a color to use for drawing objects
		
		g2.fillRect(x, y, gp.tileSize, gp.tileSize); // draws a rectangle and fills it with specified color
	}
}
