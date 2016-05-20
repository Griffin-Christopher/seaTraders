/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatraders;

import byui.cit260.seaTraders.model.Game;

/**
 *
 * @author Christopher
 */
public class SeaTraders {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Game game = new Game();
    
    // Test
    game.setStage(1);
    game.setFlags(new int[]{2, 3, 4});
    game.setPlayerScore(new double[]{50, 60, 70});
    
    // toString()
    String gameInfo = game.toString();
    System.out.println(gameInfo);
  } 
}
