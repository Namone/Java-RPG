package com.namone.gameState;

import java.util.ArrayList;

public class GameStateManager {
	
	private ArrayList<GameState> gameStates = new ArrayList<GameState>();
	
	private int currentState;
	
	private final int MENU_STATE = 0; // Index of MenuState
	private final int PAUSE_STATE = 1; 
	private final int GAME_STATE = 2;
	
	public GameStateManager(){
		currentState = MENU_STATE;
		
		gameStates.add(new MenuState()); // MenuState added at index 0 (position 1)
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
	public void draw(){
		gameStates.get(currentState).draw();
	}
	
	public int getCurrent(){
		return currentState;
	}
	
	public void setCurrent(int state){
		currentState = state;
	}

}
