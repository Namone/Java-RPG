package com.namone.gameState;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class MenuSelection {
	
	public MenuSelection(){}
	
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
	
//	checks to see if the mouse click is inside of the speific area
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
