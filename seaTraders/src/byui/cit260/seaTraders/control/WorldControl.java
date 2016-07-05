/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.exceptions.WorldControlException;
import byui.cit260.seaTraders.model.World;
import byui.cit260.seaTraders.model.location.Location;
import byui.cit260.seaTraders.model.location.Stage;

/**
 *
 * @author Christopher Griffin
 */
class WorldControl {

  public static World createWorld() throws WorldControlException {
    // Initialize game world
    World world = new World (10, 10);
    if (World.getRowCount() != 10 || World.getColumnCount() != 10) {
      throw new WorldControlException(""
              + "*** ERROR: World must contain 10 rows and columns. ***");
    }
    // Generate Stages
    Stage[] stages = createStages();
    
    // Assign Stages to Locations
    populateLocations(stages);
    
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
    System.out.println("\n*** startNewGame() function called ***");
    // Move player to starting location and begin initial tutorial
  }

  private static Stage[] createStages() {
    Stage[] stages = new Stage[25];
    
    /*
    Stage stageName = new Stage();
    stageName.setValue();
    stages[index] = stageName;
    
    Stage stageName = new Stage();
    stageName.setValue();
    stages[index] = stageName;
    
    Stage stageName = new Stage();
    stageName.setValue();
    stages[index] = stageName;
    */
   
    return stages;
  }
  
  
  private static void populateLocations(Stage[] stages) {
    Location[][] worldMap = World.getWorldMap();
    
    // Assign Stages to Locations
    /*
    worldMap[index][index].setStage(stages[index]);
    worldMap[index][index].setStage(stages[index]);
    worldMap[index][index].setStage(stages[index]);
    worldMap[index][index].setStage(stages[index]);
    */
  }
}
