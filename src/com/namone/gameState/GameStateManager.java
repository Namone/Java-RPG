package com.namone.gameState;

import java.util.ArrayList;

import org.newdawn.slick.Graphics;

import com.namone.player.Player;

public class GameStateManager {
	
	private ArrayList<GameState> gameStates = new ArrayList<GameState>();
	
	Graphics g = new Graphics();
	
	private int currentState;
	
	private final int MENU_STATE = 0; // Index of MenuState
	private final int GAME_STATE = 1;
	private final int PAUSE_STATE = 2; 
	
	
	public GameStateManager(){
		currentState = GAME_STATE;
		
		gameStates.add(new TitleScreen()); // MenuState added at index 0 (position 1)
		gameStates.add(new Game()); // Launch game, at index 1 (position 2)
	}
	// Initialize selected game state
	public void init(){
		gameStates.get(currentState).init();
	}
	// Update selected game state
	public void update(){
		gameStates.get(currentState).update();
	}
	// Draw selected game state
	public void draw(Graphics g, Graphics graphics){
		gameStates.get(currentState).draw(g, graphics);
	}
	
	public int getCurrent(){
		return currentState;
	}
	
	public void setCurrent(int state){
		currentState = state;
	}

}
