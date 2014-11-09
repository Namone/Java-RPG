package jrpg;

import org.lwjgl.util.vector.Vector2f;

public class Player {
    
    String playerTexture; // Texture object to hold player sprite
    String playerName;   // Name of player (input by user)
    
    // Player health and player stamina
    private int playerHealth = 100;
    private int playerStamina = 25;
    // Player position on X - Y coordinate 
    private Vector2f playerPosition;
    
    
    public void Player(String textureLocation, String name, int positionX, int positionY) {
        
        playerName = name;
        playerTexture = textureLocation;
        playerPosition = new Vector2f(positionX, positionY);
        LoadPlayerTexture();
        
    }
    
    // Load the player texture
    public void LoadPlayerTexture(){
        TextureManager.LoadTexture(playerTexture); // Passed in from Player(String textureLocation)
    }
    
    public void DrawPlayer(){
        // TODO: PLAYER DRAW CODE GOES HERE
    }
    
    
}
