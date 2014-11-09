/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jrpg.namone.gamestate;

import java.util.ArrayList;

public class GameStateManager extends GameState{
    
    // Create an array list to add game-states to
   public ArrayList<GameState> gameStates;
   
   // Create the game states
   // @ These will be used to iterate through ArrayList<> gameStates
   public int MENU_STATE = 0;
   public int PAUSE_STATE = 1;
   public int GAME_STATE = 2;
   
   // Current game-state
   public int currentState;
   
   public GameStateManager(){
       gameStates = new ArrayList<GameState>();
       
       // Default game-state will be MENU_STATE
       currentState = MENU_STATE;
       gameStates.add(new MenuState(gsm)); // Create new instance of a menu...
       // Becuase it is created first it will be in position 0 = MENU_STATE
   }
   // Initialize items from selected game-state
   public void Init(){
       // Use currentState to get an index from gameStates
       // Default index is MENU_STATE which is equal to 0
       gameStates.get(currentState).Init(); 
   }
   
   // Update selected game-state
   public void Update(){
       gameStates.get(currentState).Update();
   }
   
   // Draw selected game-state
   public void Draw(){
       gameStates.get(currentState).Draw();
   }
   
}
