package jrpg;

public class Player {
    
    String playerTexture; // Texture object to hold player
    String playerName;   // Name of player (input by user)
    
    // Player health and player stamina
    private int playerHealth = 100;
    private int playerStamina = 25;
    // Player position on X - Y coordinate 
    private int playerPositionX, playerPositionY;
    
    
    public void Player(String textureLocation, String name, int positionX, int positionY) {
        
        playerName = name;
        playerTexture = textureLocation;
        
        LoadPlayerTexture();
        
    }
    
    // Load the player texture
    public void LoadPlayerTexture(){
        TextureManager.LoadTexture(playerTexture); // Passed in from Player(String textureLocation)
    }
    
    
}
