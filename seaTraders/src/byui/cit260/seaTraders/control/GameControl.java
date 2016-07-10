/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.exceptions.GameControlException;
import byui.cit260.seaTraders.exceptions.WorldControlException;
import byui.cit260.seaTraders.model.Game;
import byui.cit260.seaTraders.model.Item;
import byui.cit260.seaTraders.model.Player;
import byui.cit260.seaTraders.model.Ship;
import byui.cit260.seaTraders.model.ShipCatalog;
import byui.cit260.seaTraders.model.World;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import seatraders.SeaTraders;

/**
 *
 * @author Christopher Griffin
 */
public class GameControl {

  public static void createPlayer(String name) {
    if (name == null) {  // Name is empty
      return;
    }
    
    // Create new player
    Player player = new Player();
    player.setName(name);

    Game.setCurrentPlayer(player);
  }

  public static void createNewGame(Player player) throws WorldControlException {
    if (player == null)
      return;
    
    // Create and save new game
    Game game = new Game();
    SeaTraders.setCurrentGame(game);
    
    // Gold | Food | Ammo | Lumber | Cotton | Iron
    int[] startingResources = {500, 50, 100, 0, 0, 0};
    // Initialize Player
    Player.setResources(startingResources);
    
    // Initialize Player's Ship
    Game.setCurrentShip(ShipCatalog.STARTER_SHIP.spawnShip());
    Item[] playerFittings = ShipControl.createPlayerFittings();
    Ship.setFittings(playerFittings);
    Item[] playerCargo = ShipControl.createPlayerCargo();
    Ship.setCargo(playerCargo);
    
    // Initialize World Map
    World world = WorldControl.createWorld();
    Game.setCurrentWorld(world);
    WorldControl.startNewGame(world);
    
  }  
  
  // JUST FOR TESTING THROWN EXCEPTIONS
  public static void createNewGame(int test) throws WorldControlException {
    // Run Function Test
    WorldControl.createWorld(-1);
  }  

  public static void loadGame(String filePath) throws GameControlException {
    try (FileInputStream fips = new FileInputStream(
            "saves\\" + filePath + ".ser")) {
      ObjectInputStream input = new ObjectInputStream(fips);
      
      // Import game data
      Game game = (Game) input.readObject();
      SeaTraders.setCurrentGame(game);
    } catch (Exception e) {
        throw new GameControlException(e.getMessage());
    }
  }
  
  public static void saveGame(Game currentGame, String filePath) 
          throws GameControlException {
    
    try (FileOutputStream fops = new FileOutputStream(
            "saves\\" + filePath + ".ser")) {
      ObjectOutputStream output = new ObjectOutputStream(fops);
      
      // Export game data
      output.writeObject(currentGame);
      
    } catch (Exception e) {
      throw new GameControlException(e.getMessage());
    }
  }
}