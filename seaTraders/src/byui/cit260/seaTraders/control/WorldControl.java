/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.model.World;
import byui.cit260.seaTraders.model.location.Location;
import byui.cit260.seaTraders.model.location.Stage;

/**
 *
 * @author Christopher Griffin
 */
class WorldControl {

  public static World createWorld() {
    // Initialize game world
    World world = new World (10, 10);
    
    // Generate Stages
    Stage[] stages = new Stage[25];
    
    // Assign Stages to Locations
    populateLocations(stages);
    
    return world;
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
