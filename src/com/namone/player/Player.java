package com.namone.player;

import java.io.IOException;
import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;
import static org.lwjgl.opengl.GL11.*;

public class Player {
	// General statistics for the player
	private int playerHealth = 100;
	private int playerStamina = 25;
	private int playerStrength = 10;
	private String playerName; // Input by user on player creation
	public Vector2f playerPosition; // Player position
	public Texture playerTexture; // Player texture
	// Create player
	public Player(String pName, int playerX, int playerY){
		playerName = pName; // Name of player (Temporary name is Tom)
		playerPosition = new Vector2f(playerX, playerY); // Place player at random location
		// Tell us the player is created
		System.out.println("Player Created!"); // Player is created when you add it to the ArrayList<>() in 
		// GameStateManager
		
	}
	// Load texture for player
	public void loadPlayerTexture(String PATH){
		try {
			// Load the player texture; needs OpenGL context (that's why it's in draw() in Game.class)
			playerTexture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(PATH));
			// Tell us it's loaded
			System.out.println("Texture Loaded >> " + PATH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Draw the player
	public void draw(){		
		Color.white.bind(); // Make the color of it white (transparent)
		playerTexture.bind(); // Bind texture to object
		
		glBegin(GL_QUADS);
		{
			glTexCoord2f(0,0); // Give orientation to the texture placed on object
			glVertex2f(100,100); // Object coordinates
			glTexCoord2f(1, 0);
			glVertex2f(100 + playerTexture.getTextureWidth() / 2, 100);
			glTexCoord2f(1, 1);
			glVertex2f(100 + playerTexture.getTextureWidth() / 2, 100 + playerTexture.getTextureHeight() / 2);
			glTexCoord2f(0, 1);
			glVertex2f(100, 100 + playerTexture.getTextureHeight() / 2);
		}
		glEnd();
	}
	// Update the player
	public void update(){
		
	}

}
