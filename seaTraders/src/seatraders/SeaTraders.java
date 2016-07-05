/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatraders;

import byui.cit260.seaTraders.model.Game;
import byui.cit260.seaTraders.view.StartProgramView;

/**
 *
 * @author Christopher
 */
public class SeaTraders { 
  
  // Objects
  private static Game currentGame = null;
  
  // Variables
  
  // Getters
  public static Game getCurrentGame() {
    return currentGame;
  } 

  // Setters
  public static void setCurrentGame(Game currentGame) {
    SeaTraders.currentGame = currentGame;
  }
  
  public static void main(String[] args) {
    // Initialize game
    StartProgramView startProgramView = new StartProgramView();
    
    // Begin Exception Handling
    try {
      startProgramView.display();
    } catch (Throwable te) {
      System.out.println(te.getMessage());
      te.printStackTrace();
      
      // Restart Program
      startProgramView.display();
    }
  } 
}