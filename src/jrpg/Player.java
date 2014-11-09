package jrpg;

public class Player {
    
    String playerTexture; // Texture object to hold player
    String playerName;   // Name of player (input by user)
    
    // Player health and player stamin
    private int playerHealth = 100;
    private int playerStamina = 25;
    
    
    public void Player(String textureLocation, String name) {
        
        playerName = name;
        playerTexture = textureLocation;
        
        LoadPlayerTexture();
        
    }
    
    // Load the player texture
    public void LoadPlayerTexture(){
        TextureManager.LoadTexture(playerTexture); // Passed in from Player(String textureLocation)
    }
    
    
}
