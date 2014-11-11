package com.namone.gameState;

import org.newdawn.slick.Graphics;

//@GENERAL BLUE-PRINT FOR ALL GAMESTATES

public abstract class GameState {
	
	public GameStateManager gsm;
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(Graphics g, Graphics graphics);

}
