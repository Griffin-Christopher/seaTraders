/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.model.Game;
import byui.cit260.seaTraders.model.Item;
import byui.cit260.seaTraders.model.Player;
import byui.cit260.seaTraders.model.Ship;
import byui.cit260.seaTraders.model.ShipCatalog;
import byui.cit260.seaTraders.model.World;
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

  public static void createNewGame(Player player) {
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
}