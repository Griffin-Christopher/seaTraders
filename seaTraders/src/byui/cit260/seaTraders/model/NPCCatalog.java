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

public enum NPCCatalog implements Serializable { 

  /******
  * NAVY
  **********************************************************/
  NAVY_PATROL(     1.50, 5.00, 20.0, 3.00, 100.0),
  NAVY_BARGE(      1.00, 10.0, 10.0, 1.00, 250.0),
  NAVY_PRISON_SHIP(1.25, 25.0, 15.0, 2.00, 500.0),  
  /***********
  * MERCHANTS
  **********************************************************/
  MERCHANT_SMALL( 1.50, 5.00, 10.0, 3.00, 75.0),
  MERCHANT_MEDIUM(1.25, 10.0, 15.0, 2.00, 150.0),
  MERCHANT_LARGE( 1.00, 20.0, 30.0, 1.00, 300.0),  
  /*********
  * HAULERS
  **********************************************************/
  HAULER_SMALL( 1.50, 5.00, 10.0, 3.00, 75.0),
  HAULER_MEDIUM(1.25, 10.0, 15.0, 2.00, 150.0),
  HAULER_LARGE( 1.00, 20.0, 30.0, 1.00, 300.0),  
  /***********
  * SMUGGLERS
  **********************************************************/
  SMUGGLER_SOLO( 1.50, 5.00, 10.0, 3.00, 100.0),
  SMUGGLER_DUO(  1.25, 10.0, 15.0, 2.00, 200.0),
  SMUGGLER_ARMED(1.00, 20.0, 30.0, 1.00, 400.0),  
  /*********
  * PIRATES
  **********************************************************/
  PIRATE_BASIC(       1.50, -1.0, 10.0,  3.00, 100.0),
  PIRATE_INTERMEDIATE(-1.0, 10.0, 15.0,  2.00, 200.0),
  PIRATE_ADVANCED(    1.00, 20.0, 30.0,  1.00, 400.0),
  PIRATE_BOSS(        1.25, 30.0, 50.0,  1.25, 500.0),
  PIRATE_LORD(        1.35, 40.0, 75.0,  1.50, 7500.0),
  PIRATE_DREAD_LORD(  1.50, 50.0, 100.0, 2.00, 1000.0);
  
  // Variables
  private final double agility;
  private final double armor;
  private final double attack;
  private final double speed;
  private final double health;
  
  // Constructor
  NPCCatalog(double agility, double armor, double attack, double speed, double health) {
    this.agility = agility;
    this.armor = armor;
    this.attack = attack;
    this.speed = speed;
    this.health = health;
  }
  
  // Getters
  public double getAgility() {
    return agility * Game.getDifficulty();
  }
  public double getArmor() {
    return armor * Game.getDifficulty();
  }
  public double getAttack() {
    return attack * Game.getDifficulty();
  }
  public double getSpeed() {
    return speed * Game.getDifficulty();
  }
  public double getHealth() {
    return health * Game.getDifficulty();
  }
  
  public NPC spawnNPC() {
    NPC npc = new NPC(getAgility(), getArmor(), getAttack(), getSpeed(), getHealth());
    return npc;
  }
}