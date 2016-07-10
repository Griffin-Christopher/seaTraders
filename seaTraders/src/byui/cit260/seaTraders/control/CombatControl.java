/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.exceptions.CombatControlException;
import byui.cit260.seaTraders.model.NPC;
import byui.cit260.seaTraders.model.Player;
import byui.cit260.seaTraders.model.Ship;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import seatraders.SeaTraders;

/**
 *
 * @author Christopher Griffin
 */
public class CombatControl {  
  
  // Objects
  private NPC npcOne;
  private NPC npcTwo;
  
  private final PrintWriter console = SeaTraders.getOutFile();
  
  // Variables
  private double timer = 0;
  private int round = 1;
  private double playerSpeed = 0;
  private double npcOneSpeed = 0;
  private double npcTwoSpeed = 0;
  
  // 1v1 Combat Constructor
  public CombatControl(NPC npcOne) throws CombatControlException {
    // Store NPC State
    this.npcOne = npcOne;
    
    // Calculate Action Intervals
    if (this.npcOne.getAgility() != 0) {
      this.playerSpeed = calcInitiative();
      this.npcOneSpeed = calcInitiative(getNPCOne());
    }
  }
  
  // 1v2 Combat Constructor
  public CombatControl(NPC npcOne, NPC npcTwo) throws CombatControlException {
    // Store NPC States
    this.npcOne = npcOne;
    this.npcTwo = npcTwo;
    
    // Calculate Action Intervals
    if (Player.getAgility() != 0) {
      this.playerSpeed = calcInitiative();
      this.npcOneSpeed = calcInitiative(getNPCOne());
      this.npcTwoSpeed = calcInitiative(getNPCTwo());
    }
  }
  
  // Getters
  public NPC getNPCOne() {
    return npcOne;
  }
  public NPC getNPCTwo() {
    return npcTwo;
  }
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
  public double calcInitiative() throws CombatControlException {
    this.console.println("\nPlayer Agility: " + Player.getAgility());
    if (Player.getAgility() < 0) {
      throw new CombatControlException("\n"
              + "*** ERROR: Negative Player Agility Value ***");
    }
    // ELSE
    double actionInterval = round(1 / Player.getAgility(), 2);
    return actionInterval;
  }
  public double calcInitiative(NPC npc) throws CombatControlException {
    this.console.println("NPC Agility: " + npc.getAgility());
    if (npc.getAgility() < 0) {
      throw new CombatControlException("\n"
              + "*** ERROR: Negative NPC Agility Value ***");
    }
    // ELSE
    double actionInterval = round(1 / npc.getAgility(), 2);
    return actionInterval;
  }
  
  /** 
   *** COMBAT MECHANICS 
   **/
  public void advanceCombat() {
    // Display Speeds
    this.console.println("\n*** COMBATANTS ***");
    this.console.println("Player Speed: " + this.playerSpeed);
    this.console.println("NPC One Speed: " + this.npcOneSpeed);
    if (npcTwo != null) {
      this.console.println("NPC Two Speed: " + this.npcTwoSpeed);
    }
    
    /*
    // Start combat
    for (int i = 0; i < 1000; i++) {
      // Check for new combat round
      if (i == 0 || i % 100 == 0) {
        this.console.println("\n*** ROUND: " + this.round + " ***");
        // Update Combat Round
        this.round += 1;
      }

      // Check for combat action(s)
      if (i != 0 && this.timer / this.playerSpeed == 0) {
        this.console.println(this.timer + " - Player Action");
      }
      if (i != 0 && this.timer % this.npcOneSpeed == 0) {
        this.console.println(this.timer + " - Pirate One Action");
      }
      if (i != 0 && this.timer % this.npcTwoSpeed == 0) {
        this.console.println(this.timer + " - Pirate Two Action");
      }
      
      // Advance combat timer
      this.timer += 0.01;
    }
    */
    
    // Reset Timer
    setTimer(0);
  }
  
  public double calcDamage(NPC npc) throws CombatControlException {
    // Input Checks
    this.console.println("\nPlayer Attack: " + Player.getAttack());
    if (Player.getAttack() < 0) {
      throw new CombatControlException("\n"
              + "*** ERROR: Negative Player Attack Value ***");
    }
    this.console.println("NPC Armor: " + npc.getArmor());
    if (npc.getArmor() < 0) {
      throw new CombatControlException("\n"
              + "*** ERROR: Negative Pirate Armor Value ***");
    }
    this.console.println("Ship Cannons: " + Ship.getCannons());
    if (Ship.getCannons() < 0) {
      throw new CombatControlException("\n"
              + "*** ERROR: Negative Ship Cannons Value ***");
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