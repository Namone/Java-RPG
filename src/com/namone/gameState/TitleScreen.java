package com.namone.gameState;

import java.awt.Font;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;

import static org.lwjgl.opengl.GL11.*; 

public class TitleScreen extends GameState{
	
	Font font;
	TrueTypeFont ttFont;
	UnicodeFont uniFont;
	String title = "TITLE IN PROGRESS";
	
	public TitleScreen(){
		
	}
	
	public void init(){
		/*font = new Font("Times New Roman", Font.BOLD, 30);
		uniFont = new UnicodeFont(font, 24, false, false);
		uniFont.getEffects().add(new ColorEffect());
		uniFont.addAsciiGlyphs();
		try {
			uniFont.loadGlyphs();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	*/
	}
	
	public void update(){
		
	}
	
	public void draw(Graphics g, Graphics graphics){
		
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
	}
	
}
