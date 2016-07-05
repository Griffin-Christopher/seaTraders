/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.io.Serializable;

/**
 *
 * @author Christopher Griffin
 */
public class Game implements Serializable {
  
  // Objects
  private static World currentWorld;
  private static Player currentPlayer;
  private static Ship currentShip;
  
  // Variables
  private static String gameDifficulty = "Normal";
  private static double difficulty = 1.00;
  private static String pirateRate = "Normal rate";
  private static double rate = 1.00;
  private static boolean[] flags;
  private static int[] playerScore;
  
  // Constructor
  public Game() {
    // Reset player's game progress
    flags = new boolean[10];
    for (int i = 0; i < flags.length; i++) {
      setFlag(i, false);
    }
    // Reset player's score
    playerScore = new int[10];
    for (int i = 0; i < playerScore.length; i++) {
      setPlayerScore(i, 0);
    }
  }
  
  // Getters
  public static World getCurrentWorld() {
    return currentWorld;
  }
  public static Player getCurrentPlayer() {
    return currentPlayer;
  }
  public static Ship getCurrentShip() {
    return currentShip;
  }
  public static String getGameDifficulty() {
    return gameDifficulty;
  }
  public static double getDifficulty() {
    return difficulty;
  }
  public static String getPirateRate() {
    return pirateRate;
  }
  public static double getRate() {
    return rate;
  } 
  public static boolean getFlag(int index) {
    return flags[index];
  }
  public static int getPlayerScore(int index) {
    return playerScore[index];
  }
  
  // Setters
  public static void setCurrentWorld(World world) {
    Game.currentWorld = world;
  }
  public static void setCurrentPlayer(Player player) {
    Game.currentPlayer = player;
  }
  public static void setCurrentShip(Ship ship) {
    Game.currentShip = ship;
  }
 
  public static void setGameDifficulty(String difficulty) {
    Game.gameDifficulty = difficulty;
  }
  public static void setDifficulty(double difficulty) {
    Game.difficulty = difficulty;
  }
  public static void setPirateRate(String rate) {
    Game.pirateRate = rate;
  }
  public static void setRate(double rate) {
    Game.rate = rate;
  }
  public static void setFlag(int index, boolean flag) {
    Game.flags[index] = flag;
  }
  public static void setPlayerScore(int[] playerScore) {
    Game.playerScore = playerScore;
  }
  public static void setPlayerScore(int index, int score) {
    Game.playerScore[index] = score;
  }
}
