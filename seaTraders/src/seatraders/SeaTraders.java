/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatraders;

import byui.cit260.seaTraders.model.CrewMember;
import byui.cit260.seaTraders.model.Encounter;
import byui.cit260.seaTraders.model.Game;
import byui.cit260.seaTraders.model.Item;
import byui.cit260.seaTraders.model.Location;
import byui.cit260.seaTraders.model.NPC;
import byui.cit260.seaTraders.model.Player;
import byui.cit260.seaTraders.model.Quest;
import byui.cit260.seaTraders.model.Ship;
import byui.cit260.seaTraders.model.Stage;
import byui.cit260.seaTraders.model.World;
import byui.cit260.seaTraders.view.StartProgramView;

/**
 *
 * @author Christopher
 */
public class SeaTraders {

  // Variables
  private static Game currentGame = null;
  private static Player player = null;
  
  // Getters
  public static Game getCurrentGame() {
    return currentGame;
  } 
  public static Player getPlayer() {
    return player;
  }

  // Setters
  public static void setCurrentGame(Game currentGame) {
    SeaTraders.currentGame = currentGame;
  }
  public static void setPlayer(Player player) {
    SeaTraders.player = player;
  }

  public static void main(String[] args) {
    // Initialize game
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.displayStartProgramView();
    
    
    
    /* VARIABLE TESTING
    // Initialize Objects
    CrewMember crew = new CrewMember();
    Encounter encounter = new Encounter();
    Game game = new Game();
    Item item = new Item();
    Location location = new Location();
    NPC npc = new NPC();
    Player player = new Player();
    Quest quest = new Quest();
    Ship ship = new Ship();
    Stage stage = new Stage();
    World world = new World();
    
    // Set Variables
    crew.setName("Jack Sparrow");
    crew.setDescription("Captain of the Black Pearl");
    crew.setStats(new int[]{8, 8, 8});
    crew.setType("Pirate");
    
    encounter.setDescription("Encounter");
    encounter.setType("Pirates!");
    
    game.setStage(1);
    game.setFlags(new int[]{2, 3, 4});
    game.setPlayerScore(new double[]{50, 60, 70});
    
    item.setName("Wooden Leg");
    item.setDescription("So many splinters!");
    item.setStats(new int[]{2, 3, 7});
    item.setType("Pirate Leg");
    
    location.setRow(2);
    location.setColumn(6);
    location.setVisited(false);
    location.setUnlocked(true);
    
    npc.setDescription("A small smuggler sloop.");
    npc.setStats(new int[]{22, 33, 44, 55});
    npc.setType("Smuggler");
    npc.setLoot(new double[]{120, 45, 687});
    
    player.setName("Davon Ashelimb");
    player.setLocation(new int[]{12, 4});
    player.setStats(new int[]{27, 50, 8, 149});
    player.setResources(new double[]{489, 5000, 4890823});
    player.setFame(9001);
    player.setRank(7);
    player.setJournal(new String[]{"I sank some shops.", "I found some treasure."});
    
    quest.setActive(true);
    quest.setCompleted(false);
    quest.setUnlocked(true);
    quest.setDescription("Hunt down the spineless deserter and bring him to justice!");
    quest.setReward("Earn 500g for your trouble.");
    quest.setType("Hunt Quest");
    quest.setObjective("Travel to LOCATION and capture the Navy Turncoat.");
    
    ship.setDescription("A standard Trade Cog.");
    ship.setStats(new int[]{400, 300, 12});
    ship.setType("Trade Vessel");
    ship.setEquipment(new double[]{985, 124, 45});
    
    stage.setName("Navy Wharf");
    stage.setDescription("Central hub for all Navy operations.");
    stage.setType("Primary Location");
    stage.setInventory(new double[]{1, 3, 4, 15, 18, 97});
    
    world.setRowCount(15);
    world.setColumnCount(15);
    world.setTransitions(new String[]{"Your trip is otherwise uneventful.", "Pirates attack!"});
  
    // Call toString()
    String crewInfo = crew.toString();
    System.out.println(crewInfo);
    
    String encounterInfo = encounter.toString();
    System.out.println(encounterInfo);
    
    String gameInfo = game.toString();
    System.out.println(gameInfo);
    
    String itemInfo = item.toString();
    System.out.println(itemInfo);
    
    String locationInfo = location.toString();
    System.out.println(locationInfo);
    
    String npcInfo = npc.toString();
    System.out.println(npcInfo);
    
    String playerInfo = player.toString();
    System.out.println(playerInfo);
    
    String questInfo = quest.toString();
    System.out.println(questInfo);
    
    String shipInfo = ship.toString();
    System.out.println(shipInfo);
    
    String stageInfo = stage.toString();
    System.out.println(stageInfo);
    
    String worldInfo = world.toString();
    System.out.println(worldInfo);
    END VARIABLE TESTING */
  } 
}