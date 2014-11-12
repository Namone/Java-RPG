package com.namone.gameState;

import java.util.ArrayList;

import org.newdawn.slick.Graphics;

import com.namone.player.Player;

public class GameStateManager {
	// An arrayList to hold game states
	private ArrayList<GameState> gameStates = new ArrayList<GameState>();
	
	Graphics g = new Graphics(); // New graphics object to pass through draw()
	
	private int currentState; // Holds current state
	
	private final int MENU_STATE = 0; // Index of TitleState
	private final int GAME_STATE = 1; // Index of Game
	private final int PAUSE_STATE = 2; // Index of PuaseState
	
	
	public GameStateManager(){
		currentState = MENU_STATE; // Default state is menu
		// Debugging purposes
		if(currentState == 0){
			System.out.println("Enter MENU_STATE");
		} else if(currentState == 1){
			System.out.println("Enter GAME_STATE");
		} else {
			System.out.println("Enter PAUSE_STATE");
		}
		// Add new game states that we can access via their index
		gameStates.add(new TitleScreen()); // MenuState added at index 0 (position 1)
		gameStates.add(new Game()); // POSITION 2 INDEX 1
		
	}
	// Initialize selected game state
	public void init(){
		gameStates.get(currentState).init();
	}
	// Update selected game state
	public void update(){
		gameStates.get(currentState).update(); // -----> Updates selected game state
	}
	// Draw selected game state
	public void draw(Graphics g, Graphics graphics, GameStateManager gsm){
		gameStates.get(currentState).draw(g, graphics, gsm);
	}
	// Get current game state
	public int getCurrent(){
		return currentState;
	}
	// Set current game state
	public void setCurrent(int state){
		currentState = state;
	}

}
