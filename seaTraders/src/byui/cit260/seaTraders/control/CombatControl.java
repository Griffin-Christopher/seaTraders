/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.model.NPC;
import byui.cit260.seaTraders.model.Player;
import byui.cit260.seaTraders.model.Ship;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Christopher
 */
public class CombatControl {  
  // Objects
  private static NPC npcOne = null;
  private static NPC npcTwo = null;
  
  // Variables
  private double timer = 0;
  private int round = 1;
  private double playerSpeed = 0;
  private double npcOneSpeed = 0;
  private double npcTwoSpeed = 0;
  
  // 1v1 Combat Constructor
  public CombatControl(NPC npcOne) {
    // Store NPC State
    CombatControl.npcOne = npcOne;
    
    // Calculate Action Intervals
    if (CombatControl.npcOne.getAgility() != 0) {
      this.playerSpeed = calcInitiative();
      this.npcOneSpeed = calcInitiative(CombatControl.npcOne);
    }
  }
  
  // 1v2 Combat Constructor
  public CombatControl(NPC npcOne, NPC npcTwo) {
    // Store NPC States
    CombatControl.npcOne = npcOne;
    CombatControl.npcTwo = npcTwo;
    
    // Calculate Action Intervals
    if (Player.getAgility() != 0) {
      this.playerSpeed = calcInitiative();
      this.npcOneSpeed = calcInitiative(CombatControl.npcOne);
      this.npcTwoSpeed = calcInitiative(CombatControl.npcTwo);
    }
  }
  
  // Getters
  public double getTimer() {
    return timer;
  }
  public int getRound() {
    return round;
  }
  public double getPlayerSpeed() {
    return playerSpeed;
  }
  public double getNPCOneSpeed() {
    return npcOneSpeed;
  }
  public double getNPCTwoSpeed() {
    return npcTwoSpeed;
  }

  // Setters
  public void setTimer(double timer) {
    this.timer = timer;
  }
  public void setRound (int round) {
    this.round = round;
  }
  public void setPlayerSpeed(double actionInterval) {
    this.playerSpeed = actionInterval;
  }
  public void setNPCOneSpeed(double actionInterval) {
    this.npcOneSpeed = actionInterval;
  }
  public void setNPCTwoSpeed(double actionInterval) {
    this.npcTwoSpeed = actionInterval;
  }
  
  // Rounding
  public static double round(double value, int places) {
    BigDecimal bd = new BigDecimal(value);
    bd = bd.setScale(places, RoundingMode.HALF_UP);
    return bd.doubleValue();
  }

  // Combat Initialization
  public double calcInitiative() {
    if (Player.getAgility() < 0) {
      System.out.println("\n*** ERROR: Negative Player Agility Value ***");
      return -1;
    }
    // ELSE
    System.out.println("\nP CALC " + Player.getAgility());
    double actionInterval = round(1 / Player.getAgility(), 2);
    return actionInterval;
  }
  public double calcInitiative(NPC npc) {
    if (npc.getAgility() < 0) {
      System.out.println("\n*** ERROR: Negative NPC Agility Value ***");
      return -1;
    }
    // ELSE
    System.out.println("\nN CALC " + npc.getAgility());
    double actionInterval = round(1 / npc.getAgility(), 2);
    return actionInterval;
  }
  
  /** 
   *** COMBAT MECHANICS 
   **/
  public void advanceCombat() {
    // Display Speeds
    System.out.println("\n*** COMBATANTS ***");
    System.out.println("Player Speed: " + this.playerSpeed);
    System.out.println("NPC One Speed: " + this.npcOneSpeed);
    if (npcTwo != null) {
      System.out.println("NPC Two Speed: " + this.npcTwoSpeed);
    }
    
    // Start combat
    for (int i = 0; i < 1000; i++) {
      // Check for new combat round
      if (i == 0 || i % 100 == 0) {
        System.out.println("\n*** ROUND: " + this.round + " ***");
        // Update Combat Round
        this.round += 1;
      }

      // Check for combat action(s)
      if (i != 0 && this.timer / this.playerSpeed == 0) {
        System.out.println(this.timer + " - Player Action");
      }
      if (i != 0 && this.timer % this.npcOneSpeed == 0) {
        System.out.println(this.timer + " - Pirate One Action");
      }
      if (i != 0 && this.timer % this.npcTwoSpeed == 0) {
        System.out.println(this.timer + " - Pirate Two Action");
      }
      
      // Advance combat timer
      this.timer += 0.01;
    }
    // Reset Timer
    setTimer(0);
  }
  
  public double calcDamage(NPC npc) {
    // Input Checks
    if (Player.getAttack() < 0) {
      System.out.println("\n*** ERROR: Negative Player Attack Value ***");
      return -1;
    }
    if (npc.getArmor() < 0) {
      System.out.println("\n*** ERROR: Negative Pirate Armor Value ***");
      return -1;
    }
    if (Ship.getCannons() < 0) {
      System.out.println("\n*** ERROR: Negative Ship Cannons Value ***");
      return -1;
    }
   
    // Damage Calculation
    double damage = (Player.getAttack() - npc.getArmor()) * Ship.getCannons();
    
    // Negative Damage Conversion
    if (damage < 0) {
      // NO DAMAGE OUTPUT
      return damage = 0;
    }
    
    // ELSE
    return damage;
  }
  
  // Resolve Combat
  public void resolveCombat() {
    // DISPLAY COMBAT RESULTS
  } 
}
