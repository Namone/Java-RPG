package com.namone.gameState;

import org.newdawn.slick.Graphics;
import static org.lwjgl.opengl.GL11.*;

import com.namone.player.Player;

public class Game extends GameState{
	
	Player player;
	MenuSelection menuSel = new MenuSelection();
	boolean update = false;
	// Creates the actual game (beyond the menu)
	public Game(){
		init();
	}
	// Initialize the world and player
	public void init() {		
		player = new Player("Tom", 60, 60); // Create player - Temporary arguments for player		
	}	
	// Update the player & the world
	public void update() {		
			menuSel.keyboardClickListener(player);        // uses keyboard input to move player and will enventully handle inputs of all kind? 
		
	}	
	// Draw the player & the world
	public void draw(Graphics g, Graphics graphics, GameStateManager gsm) {
		glClearColor(0, 50, 0, 1);
		// Draw the player to the screen (60, 60)
		player.loadPlayerTexture("res/testsprite.png"); // Load player texture
		player.draw(100, 100);
		update = true;
		//update();
	}

}
