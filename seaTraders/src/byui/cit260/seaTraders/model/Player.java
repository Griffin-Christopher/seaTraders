/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import byui.cit260.seaTraders.model.location.Location;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Christopher Griffin
 */
public class Player implements Serializable {  
  
  // Objects
  private static ArrayList<Mercenary> crew;
  
  // Variables
  private static String name;
  private static Location currentLocation;
  private static double agility;
  private static double armor;
  private static double attack;
  private static double speed;
  private static double health;
  private static int[] resources; // Gold | Food | Ammo | Lumber | Cotton | Iron
  private static int experience;
  private static int fame;
  private static int rank;
  private static ArrayList<String> journal;
  
  // Constructors
  public Player() {
    setAgility(1.0);
    setArmor(0.0);
    setAttack(20.0);
    setSpeed(0.0);
    setHealth(0.0);
    setFame(0);
    setRank(0);
  }

  // Getters
  public static ArrayList<Mercenary> getCrew() {
    return crew;
  }
  public static Mercenary getCrewMember(int index) {
    return crew.get(index);
  }
  public static String getName() {
    return name;
  }
  public static Location getCurrentLocation() {
    return currentLocation;
  }
  public static double getAgility() {
    return agility;
  }
  public static double getArmor() {
    return armor;
  }
  public static double getAttack() {
    return attack;
  }
  public static double getSpeed() {
    return speed;
  }
  public static double getHealth() {
    return health;
  }
  public static int[] getResources() {
    return resources;
  }
  public static int getExperience() {
    return experience;
  }
  public static int getFame() {
    return fame;
  }
  public static int getRank() {
    return rank;
  }
  public static ArrayList<String> getJournal() {
    return journal;
  }

  // Setters
  public static void setCrew(ArrayList<Mercenary> crew) {
    Player.crew = crew;
  }
  public static void setCrewMember(int index, Mercenary crewMember) {
    Player.crew.set(index, crewMember);
  }
  public static void setName(String name) {
    Player.name = name;
  }
  public static void setCurrentLocation(Location location) {
    Player.currentLocation = location;
  }
  public static void setAgility(double agility) {
    Player.agility = agility;
  }
  public static void setArmor(double armor) {
    Player.armor = armor;
  }
  public static void setAttack(double attack) {
    Player.attack = attack;
  }
  public static void setSpeed(double speed) {
    Player.speed = speed;
  }
  public static void setHealth(double health) {
    Player.health = health;
  }
  public static void setResources(int[] resources) {
    Player.resources = resources;
  }
  public static void setResource(int index, int resource) {
    Player.resources[index] = resource;
  }
  public static void setExperience(int experience) {
    Player.experience = experience;
  }
  public static void setFame(int fame) {
    Player.fame = fame;
  }
  public static void setRank(int rank) {
    Player.rank = rank;
  }
  public static void setJournal(ArrayList<String> journal) {
    Player.journal = journal;
  }
  public static void setJournalEntry(int index, String entry) {
    Player.journal.set(index, entry);
  }
}