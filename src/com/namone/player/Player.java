package com.namone.player;

import java.io.IOException;

import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import static org.lwjgl.opengl.GL11.*;



public class Player {
	
	private int playerHealth = 100;
	private int playerStamina = 25;
	private int playerStrength = 10;
	private String playerName; // Input by user on player creation
	public Vector2f playerPosition;
	public Texture playerTexture;	
	// Create player
	public Player(String pName, int playerX, int playerY){
		playerName = pName;
		playerPosition = new Vector2f(playerX, playerY); // Place player at random location
		System.out.println("Player Created!");
	}
	// Load texture for player
	public void loadPlayerTexture(String PATH){
		try {
			playerTexture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(PATH));
			System.out.println("Texture Loaded >> " + PATH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Draw the player
	public void draw(){		
		Color.white.bind();
		playerTexture.bind();
		
		glBegin(GL_QUADS);
		{
			glTexCoord2f(0,0);
			glVertex2f(100,100);
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
