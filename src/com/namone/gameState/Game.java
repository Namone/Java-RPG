package com.namone.gameState;

import org.newdawn.slick.Graphics;

import static org.lwjgl.opengl.GL11.*;

import com.namone.input.InputListener;
import com.namone.player.Player;

public class Game extends GameState{
	
	Player player;
<<<<<<< HEAD
	InputListener menuSel = new InputListener();
=======
	MenuSelection menuSel = new MenuSelection();
	boolean update = false;
>>>>>>> origin/master
	// Creates the actual game (beyond the menu)
	public Game(){
		init();
	}
	// Initialize the world and player
	public void init() {		
		player = new Player("Tom", 60, 60); // Create player - Temporary arguments for player		
	}	
	// Update the player & the world
<<<<<<< HEAD
	public void update() {		// Updates player position
			menuSel.keyboardClickListener(player);        // uses keyboard input to move player and 
														 //will eventually handle inputs of all kind? 		
=======
	public void update() {		
			menuSel.keyboardClickListener(player);        // uses keyboard input to move player and will enventully handle inputs of all kind? 
		
>>>>>>> origin/master
	}	
	// Draw the player & the world
	public void draw(Graphics g, Graphics graphics, GameStateManager gsm) {
		glClearColor(0, 50, 0, 1);
		// Draw the player to the screen (60, 60)
		player.loadPlayerTexture("res/testsprite.png"); // Load player texture
<<<<<<< HEAD
		player.draw();
=======
		player.draw(100, 100);
		update = true;
		//update();
>>>>>>> origin/master
	}

}
