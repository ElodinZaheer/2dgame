package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {

	// Screen Settings
	final int originalTileSize = 32;
	final int scale = 3;
	final int tileSize = originalTileSize * scale; // 96x96
	final int maxScreenCol = 10;
	final int maxScreenRow = 8;
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;
	
	Thread gameThread;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		
	}
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {
		
		
	}
}
