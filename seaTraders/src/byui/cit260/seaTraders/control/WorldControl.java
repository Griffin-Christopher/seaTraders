/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.exceptions.WorldControlException;
import byui.cit260.seaTraders.model.Player;
import byui.cit260.seaTraders.model.World;
import byui.cit260.seaTraders.model.location.Location;

/**
 *
 * @author Christopher Griffin
 */
public class WorldControl {
  
  public static World createWorld() throws WorldControlException {
    // Initialize game world
    World world = new World (10, 10);
    if (World.getRowCount() != 10 || World.getColumnCount() != 10) {
      throw new WorldControlException(""
              + "*** ERROR: World must contain 10 rows and columns. ***");
    }
    
    return world;
  }
  
  // JUST FOR TESTING THROWN EXCEPTIONS
  public static void createWorld(int test) throws WorldControlException {
    // Run Function Test
    World world = new World (4, 4);
    if (World.getRowCount() != 10 || World.getColumnCount() != 10) {
      throw new WorldControlException(""
              + "*** ERROR: World must contain 10 rows and columns. ***");
    }
  }

  public static void startNewGame(World world) {
    // Move player to starting location and begin initial tutorial
    Player.setCurrentLocation(World.getLocation(0, 0));
    LocationControl.displayCurrentLocation();
  }
  
  public static void movePlayer(Location location) {
    Player.setCurrentLocation(location);
    LocationControl.displayCurrentLocation();
  }
}