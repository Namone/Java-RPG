package com.namone.gameState;

import java.awt.Font;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;

import static org.lwjgl.opengl.GL11.*; 

public class TitleScreen extends GameState{
	
	Font font;
	TrueTypeFont ttFont;
	
	public TitleScreen(){
		
	}
	
	public void init(){
		font = new Font("Times New Roman", Font.BOLD, 500);
		ttFont = new TrueTypeFont(font, false);
		
	
	}
	
	public void update(){
		
	}
	
	public void draw(Graphics g, Graphics graphics){
		graphics.setBackground(Color.white);
		ttFont.drawString(100, 50, "TEST TITLE", Color.black);
		/*graphics.setFont(ttFont);
		g.setColor(Color.black);
		g.drawString("TITLE IN PROGRESS", Display.getWidth() / 2, Display.getHeight() / 2);*/
	}
	
}
