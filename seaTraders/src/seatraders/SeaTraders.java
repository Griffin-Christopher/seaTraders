/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatraders;

import byui.cit260.seaTraders.model.Mercenary;
import byui.cit260.seaTraders.model.location.Encounter;
import byui.cit260.seaTraders.model.Game;
import byui.cit260.seaTraders.model.Item;
import byui.cit260.seaTraders.model.location.Location;
import byui.cit260.seaTraders.model.NPC;
import byui.cit260.seaTraders.model.Player;
import byui.cit260.seaTraders.model.Quest;
import byui.cit260.seaTraders.model.Ship;
import byui.cit260.seaTraders.model.location.Stage;
import byui.cit260.seaTraders.model.World;
import byui.cit260.seaTraders.view.StartProgramView;

/**
 *
 * @author Christopher
 */
public class SeaTraders { 
  
  // Objects
  private static Game currentGame = null;
  private static Player player = null;
  private static Ship ship = new Ship();
  private static NPC npcOne = new NPC();
  private static NPC npcTwo = new NPC();
  
  // Variables
  private static String difficulty = "Normal";
  private static String rate = "Normal rate";
  
  // Getters
  public static Game getCurrentGame() {
    return currentGame;
  } 
  public static Player getPlayer() {
    return player;
  }
  public static Ship getShip() {
    return ship;
  }
  public static NPC getNPCOne() {
    return npcOne;
  }
  public static NPC getNPCTwo() {
    return npcTwo;
  }
  public static String getDifficulty() {
    return difficulty;
  }
  public static String getRate() {
    return rate;
  }

  // Setters
  public static void setCurrentGame(Game currentGame) {
    SeaTraders.currentGame = currentGame;
  }
  public static void setPlayer(Player player) {
    SeaTraders.player = player;
  }
  public static void setDifficulty(String difficulty) {
    SeaTraders.difficulty = difficulty;
  }
  public static void setRate(String rate) {
    SeaTraders.rate = rate;
  }

  public static void main(String[] args) {
    // Initialize game
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.display();
    
    // Initialize Objects
  } 
}