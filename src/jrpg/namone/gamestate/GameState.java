/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jrpg.namone.gamestate;

/*
@ GENERAL BLUE-PRINT FOR ALL GAME STATES
*/
public abstract class GameState {
    
    protected GameStateManager gsm;
    
    public abstract void Init();
    public abstract void Update();
    public abstract void Draw();
   
    
}
