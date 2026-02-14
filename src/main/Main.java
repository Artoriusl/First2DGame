package main;

import javax.swing.JFrame;

public class Main {

	public static void main (String args[]) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// lets the window close properly when user clicks on X
		window.setResizable(false);								// doesn't allow the user to resize window
		window.setTitle("2D Adventure");						// sets the game title
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);									// initiates the game panel
		
		window.pack();	// makes window to be sized to the preferred size and of its subcomponents
		
		window.setLocationRelativeTo(null);						// doesn't specify the location of the window, sets the window at the center of the screen
		window.setVisible(true);								// allows us to see the window
		
		gamePanel.startGameThread();
	}
	
}
