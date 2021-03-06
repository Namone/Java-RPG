package com.namone.gameState;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

import java.awt.Font;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.UnicodeFont;

import com.namone.input.InputListener;

public class TitleScreen extends GameState{
	
	Font font;
	TrueTypeFont ttFont;
	UnicodeFont uniFont;
	String title = "TITLE IN PROGRESS";
	InputListener menuSel = new InputListener();
	
	public TitleScreen(){}
	
	public void init(){
//		font = new Font("Times New Roman", Font.BOLD, 30);
//		uniFont = new UnicodeFont(font, 24, false, false);
//		uniFont.getEffects().add(new ColorEffect());
//		uniFont.addAsciiGlyphs();
//		try {
//			uniFont.loadGlyphs();
//		} catch (SlickException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
	}
	
	public void update(){
		
	}
	// Draw button
	public void draw(Graphics g, Graphics graphics, GameStateManager gsm){
		
		glClearColor(50, 50, 50, 1);
		
		glColor3f(1f, 0.5f, 0.5f);
		glBegin(GL_QUADS);
		{
			glVertex2f(Display.getWidth() / 2, Display.getHeight() / 2);
			glVertex2f(Display.getWidth() / 2 + 300, Display.getHeight() / 2);
			glVertex2f(Display.getWidth() / 2 + 300, Display.getHeight() / 2 + 50);
			glVertex2f(Display.getWidth() / 2, Display.getHeight() / 2 + 50);
			
		}
		glEnd();
		if(menuSel.mouseClickListener()){
//			TODO add code to execute after mouse click
			glClearColor(0, 0, 25, 1);  // check to see if methods work.  CAN REMOVE AFTER TESTING
			gsm.setCurrent(1); // After click, set current state to 1 (GAME_STATE)
			
		}
	}
	
}
