package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener /*interface for receiving keystrokes*/{

	public boolean upPressed, downPressed, leftPressed, rightPressed;

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();	// returns the ASCII value associated with the key in the keystroke
		
		if (code == KeyEvent.VK_W) { // if user presses W key
			upPressed = true;
		}

		if (code == KeyEvent.VK_A) { // if user presses A key
			leftPressed = true;
		}

		if (code == KeyEvent.VK_S) { // if user presses S key
			downPressed = true;
		}

		if (code == KeyEvent.VK_D) { // if user presses D key
			rightPressed = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		if (code == KeyEvent.VK_W) { // if user releases W key
			upPressed = false;
		}

		if (code == KeyEvent.VK_A) { // if user releases A key
			leftPressed = false;
		}

		if (code == KeyEvent.VK_S) { // if user releases S key
			downPressed = false;
		}

		if (code == KeyEvent.VK_D) { // if user releases D key
			rightPressed = false;
		}
	}

}
