package jrpg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class TextureManager {
    
    // Loads texture passed into method
    // String texturePath = name of texture sprite in res folder
    public static Texture LoadTexture(String texturePath){
        try {
            // Return texture passed in to method
            return TextureLoader.getTexture("PNG", new FileInputStream(new File("res/" + texturePath + ".png")));
        } catch (IOException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null; // In case try/catch fails - WHICH SHOULDN'T HAPPEN
                     // This line of code should NEVER run
    }
    
}
