
package jrpg;

import java.util.logging.Level;
import java.util.logging.Logger;
import jrpg.namone.gamestate.GameStateManager;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

public class Application {
   
    // Width and height of the game screen
    // Set here for ease and accessiblity
    private int WIDTH = 800;
    private int HEIGHT = 600;
    
    GameStateManager gameStateManager;
    
    
    
    public Application(){
        Init();
        InitDisplay(); // Initalize display 
        InitGL(); // Initalize OpenGL
        GameLoop(); // Begin the game
    }    
    
    // Game loop
    // Loops while game window is open
    // Updates game panel, character position, etc
    public void GameLoop(){
        
        while(!Display.isCloseRequested()){            
            glClear(GL_COLOR_BUFFER_BIT);  // Clear the screen's colors
            
            // TODO: DRAWING CODE IN HERE
            gameStateManager.Draw(); 
            
            Display.update(); // Update the game (built in LWJGL method)
            
            
        }
    }
    
    // Initialize some things we need (like a GameStateManager)
    public void Init(){
        gameStateManager = new GameStateManager();
    }
    
    // Cleans up everything having to do with OpenGL
    public void CleanUp(){
        Display.destroy(); // BOOM!
    }

    // Initializes the game-screen
    // Sets width & height of game window    
    public void InitDisplay()
    {
        
        // TODO: Implement fullscreen
        try {       
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT)); // Create new displayMode = 800 x 600
            Display.setTitle("JRPG");
            Display.create(); // Create the display        }
           
        } catch (LWJGLException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Initialize OpenGL
    // Sets projection modes
    // Basically, sets the screen's view
    public void InitGL(){
        glMatrixMode(GL_PROJECTION); // Select projection matrix
        glLoadIdentity(); // Clear matrix
        glOrtho(0, Display.getWidth(), 0, Display.getHeight(), -1, 1);
        glMatrixMode(GL_MODELVIEW); // Switch back to modelview matrix
        glClearColor(0, 0, 0, 1); // Clear screen to black & opaque
        glDisable(GL_DEPTH_TEST); // We aren't drawing in 3D. We don't need this
    }
}
