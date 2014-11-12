package com.namone.input;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

import com.namone.player.Player;

public class InputListener {
	
	public InputListener(){
		init();
	}
	// Initializes necessary things for input
	public void init(){
		Keyboard.enableRepeatEvents(true); // Enables repeat events (holding a button down)
	}
	
//	listen for a mouse click and returns true if the mouse click is inside the given area passed to clickAnalyzer
	public boolean mouseClickListener(){
		while(Mouse.next()){
			if(Mouse.isButtonDown(0)){
				int mouseX = Mouse.getX();
				int mouseY = Mouse.getY();
				if(clickAnalyzer(Display.getWidth() / 2, Display.getWidth() / 2 + 300, Display.getHeight() / 2, Display.getHeight() / 2 + 50, mouseX, mouseY)){
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
	
	public void keyboardClickListener(Player player){ // Changes player position
		while(Keyboard.next()){
			if(Keyboard.isKeyDown(Keyboard.KEY_W) || Keyboard.isKeyDown(Keyboard.KEY_UP)){            // Moves Up
				player.y += 5;
			} else if(Keyboard.isKeyDown(Keyboard.KEY_A) || Keyboard.isKeyDown(Keyboard.KEY_LEFT)){   // Moves Left
				player.x -= 5;
			} else if(Keyboard.isKeyDown(Keyboard.KEY_S) || Keyboard.isKeyDown(Keyboard.KEY_DOWN)){   // Moves Down
				player.y -= 5;
			} else if(Keyboard.isKeyDown(Keyboard.KEY_D) || Keyboard.isKeyDown(Keyboard.KEY_RIGHT)){  // Moves Right 
				player.x += 5;
			} 
		}
	}
	
//	checks to see if the mouse click is inside of the specific area
//	return true if the mouse click is inside area, returns false if it is not
//	
//	@param lX = left X, rX = right X, bY = bottom Y, tY = Top Y; all of the target area
	public boolean clickAnalyzer(double lX, double rX, double bY, double tY, double mouseX, double mouseY){	
		if(mouseX >= lX && mouseX <= rX && mouseY >= bY && mouseY <= tY){
			return true;
		} else {
			return false;
		}	
	}	
	
	
}
