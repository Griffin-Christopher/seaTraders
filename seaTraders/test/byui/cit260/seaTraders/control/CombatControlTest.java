/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.model.NPC;
import byui.cit260.seaTraders.model.Player;
import byui.cit260.seaTraders.model.Ship;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher
 */
public class CombatControlTest {
  
  public CombatControlTest() {
  }

  /**
   * Test of calcDamage method, of class CombatControl.
   */
  @Test
  public void testCalcDamage() {
    System.out.println("calcDamage() - Unit Tests");
    
    /*****************************
     * TEST CASE #1 - VALID INPUT
     *****************************/
    System.out.println("\tTest Case #1 - Valid Input");
    
    // Initialize Test Objects
    Player player = new Player(25);
    NPC npc = new NPC(10);
    Ship ship = new Ship(4);
    CombatControl instance = new CombatControl(npc);
    
    // Output Generation
    double expResult = 60;
    double result = instance.calcDamage(player, npc, ship);
    
    // Output Comparison
    assertEquals(expResult, result, 0.01);
    
    /*********************************
     * TEST CASE #2 - NEGATIVE ATTACK
     *********************************/
    System.out.println("\tTest Case #2 - Negative Attack");
    
    // Initialize Test Objects
    player = new Player(-1);
    npc = new NPC(10);
    ship = new Ship(4);
    instance = new CombatControl(npc);
    
    // Output Generation
    expResult = -1;
    result = instance.calcDamage(player, npc, ship);
    
    // Output Comparison
    assertEquals(expResult, result, 0.01);
    
    /********************************
     * TEST CASE #3 - NEGATIVE ARMOR 
     ********************************/
    System.out.println("\tTest Case #3 - Negative Armor");
    
    // Initialize Test Objects
    player = new Player(25);
    npc = new NPC(-1);
    ship = new Ship(4);
    instance = new CombatControl(npc);
    
    // Output Generation
    expResult = 0-1;
    result = instance.calcDamage(player, npc, ship);
    
    // Output Comparison
    assertEquals(expResult, result, 0.01);
    
    /**********************************
     * TEST CASE #4 - NEGATIVE CANNONS 
     **********************************/
    System.out.println("\tTest Case #4 - Negative Cannons");
    
    // Initialize Test Objects
    player = new Player(25);
    npc = new NPC(10);
    ship = new Ship(-1);
    instance = new CombatControl(npc);
    
    // Output Generation
    expResult = 0-1;
    result = instance.calcDamage(player, npc, ship);
    
    // Output Comparison
    assertEquals(expResult, result, 0.01);
    
    /**************************************
     * TEST CASE #5 - Zero Attack Boundary 
     **************************************/
    System.out.println("\tTest Case #5 - Zero Attack Boundary");
    
    // Initialize Test Objects
    player = new Player(0);
    npc = new NPC(10);
    ship = new Ship(4);
    instance = new CombatControl(npc);
    
    // Output Generation
    expResult = 0;
    result = instance.calcDamage(player, npc, ship);
    
    // Output Comparison
    assertEquals(expResult, result, 0.01);
    
    /*************************************
     * TEST CASE #6 - Zero Armor Boundary 
     *************************************/
    System.out.println("\tTest Case #6 - Zero Armor Boundary");
    
    // Initialize Test Objects
    player = new Player(25);
    npc = new NPC(0);
    ship = new Ship(4);
    instance = new CombatControl(npc);
    
    // Output Generation
    expResult = 100;
    result = instance.calcDamage(player, npc, ship);
    
    // Output Comparison
    assertEquals(expResult, result, 0.01);
    
    /***************************************
     * TEST CASE #7 - Zero Cannons Boundary 
     ***************************************/
    System.out.println("\tTest Case #7 - Zero Cannons Boundary");
    
    // Initialize Test Objects
    player = new Player(25);
    npc = new NPC(10);
    ship = new Ship(0);
    instance = new CombatControl(npc);
    
    // Output Generation
    expResult = 0;
    result = instance.calcDamage(player, npc, ship);
    
    // Output Comparison
    assertEquals(expResult, result, 0.01);
  }
}