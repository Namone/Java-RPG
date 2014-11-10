package com.namone.mainEngine;

import org.lwjgl.LWJGLException;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.*;
import org.newdawn.slick.Graphics;

import com.namone.gameState.GameStateManager;

public class Application {
	
	boolean isRunning = false;	
	GameStateManager gsm = new GameStateManager();

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
			render();
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
	public void render(){
		// TODO: Drawing code goes here
		gsm.draw();
	}
	
}
