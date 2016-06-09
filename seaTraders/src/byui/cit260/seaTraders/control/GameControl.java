/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.model.Game;
import byui.cit260.seaTraders.model.Player;
import seatraders.SeaTraders;

/**
 *
 * @author Christopher Griffin
 */
public class GameControl {

  public static Player createPlayer(String name) {
    if (name == null) {  // Name is empty
      return null;
    }
    
    // Create new player
    Player player = new Player();
    player.setName(name);
    
    // Save player
    SeaTraders.setPlayer(player); 
    
    return player;
  }

  public static Game createNewGame() {
    // Create New Game
    Game game = new Game();
    
    // Save Game
    SeaTraders.setCurrentGame(game); 
    
    return game;
  }  
}