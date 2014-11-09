
package jrpg.namone.gamestate;

import static org.lwjgl.opengl.GL11.*;

public class MenuState extends GameState{
    
      public MenuState(GameStateManager gsm){
          
      }
      
      public void Init(){
          
      }
      
       public void Update(){
          
      }
      
      public void Draw(){
          glClearColor(50, 60, 40, 1);
          
          // @ BELOW CODE FOR TESTING PURPOSES
          glColor3f(0.5f, 0.2f, 0.7f);
          glBegin(GL_QUADS); 
          {
              glVertex2f(0, 0);
              glVertex2f(0, 50);
              glVertex2f(50, 50);
              glVertex2f(50, 0);
          }
          glEnd();
      }  
}
