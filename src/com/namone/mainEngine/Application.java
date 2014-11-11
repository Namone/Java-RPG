package com.namone.mainEngine;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.Graphics;

import com.namone.gameState.GameStateManager;

public class Application {
	
	boolean isRunning = false;	
	GameStateManager gsm = new GameStateManager();
	Graphics g; // New graphics context
	Graphics graphics;

	public Application(){
		run();
	}	
	// Start the game
	public void run(){
		isRunning = true;
		init();
	}
	// Loop through the game
	public void gameLoop(){		
		while(!Display.isCloseRequested()){	
			// Clear the screen
			glClear(GL_COLOR_BUFFER_BIT);
			//Update the screen
			update();
			// Render the screen
			render(g, graphics);
			// Update the screen
			Display.update();
			Display.sync(60);
	}
		
		Display.destroy();
	}	
	// Create the display
	public void init(){
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.setTitle("JavaRPG");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g = new Graphics(800, 600); // New Graphic context
		graphics = new Graphics();
		
		initGL();
		gameLoop();		
	}
	// Initialize OpenGL
	public void initGL(){
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 800, 0, 600, -1, 1);		
		glMatrixMode(GL_MODELVIEW);
	}
	// Update code
	public void update(){
		//TODO: Update code goes here
		gsm.update();
	}	
	// Render the game (Draw)
	public void render(Graphics g, Graphics graphics){
		// TODO: Drawing code goes here
		gsm.draw(g, graphics);
	}
	
}
