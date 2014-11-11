package com.namone.gameState;

import java.awt.Font;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;

import static org.lwjgl.opengl.GL11.*; 

public class MenuState extends GameState{
	
	public MenuState(){
		
	}
	
	public void init(){

	}
	
	public void update(){
		
	}
	
	public void draw(Graphics g, Graphics graphics){
		graphics.setBackground(Color.white);
		g.setColor(Color.black);
		g.drawString("TITLE", 50, 50);
	}
	
}
