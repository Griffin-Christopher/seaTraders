/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Christopher Griffin
 */
public class Player implements Serializable {
  
  // Variables
  private String name;
  private int[] location;
  private int[] stats;
  private double agility = 0;
  private int attack;
  private double[] resources;
  private int fame;
  private int rank;
  private String[] journal;
  
  // Constructors
  public Player() {
    agility = 1.5;
    attack = -1;
  }
  public Player(int attack) {
    this.attack = attack;
  }

  // Getters
  public String getName() {
    return name;
  }
  public int[] getLocation() {
    return location;
  }
  public int[] getStats() {
    return stats;
  }
  public double getAgility() {
    return agility;
  }
  public int getAttack() {
    return attack;
  }
  public double[] getResources() {
    return resources;
  }
  public int getFame() {
    return fame;
  }
  public int getRank() {
    return rank;
  }
  public String[] getJournal() {
    return journal;
  }
  
  // Setters
  public void setName(String name) {
    this.name = name;
  }
  public void setLocation(int[] location) {
    this.location = location;
  }
  public void setStats(int[] stats) {
    this.stats = stats;
  }
  public void setAgility(int agility) {
    this.agility = agility;
  }
  public void setAttack(int attack) {
    this.attack = attack;
  }
  public void setResources(double[] resources) {
    this.resources = resources;
  }
  public void setFame(int fame) {
    this.fame = fame;
  }
  public void setRank(int rank) {
    this.rank = rank;
  }
  public void setJournal(String[] journal) {
    this.journal = journal;
  }
  
  // OVERRIDES
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 67 * hash + Objects.hashCode(this.name);
    hash = 67 * hash + Arrays.hashCode(this.location);
    hash = 67 * hash + Arrays.hashCode(this.stats);
    hash = 67 * hash + Arrays.hashCode(this.resources);
    hash = 67 * hash + this.fame;
    hash = 67 * hash + this.rank;
    hash = 67 * hash + Arrays.deepHashCode(this.journal);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Player other = (Player) obj;
    if (this.fame != other.fame) {
      return false;
    }
    if (this.rank != other.rank) {
      return false;
    }
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    if (!Arrays.equals(this.location, other.location)) {
      return false;
    }
    if (!Arrays.equals(this.stats, other.stats)) {
      return false;
    }
    if (!Arrays.equals(this.resources, other.resources)) {
      return false;
    }
    if (!Arrays.deepEquals(this.journal, other.journal)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Player{" + "name=" + name + ", location=" + location + ", stats=" + stats + ", resources=" + resources + ", fame=" + fame + ", rank=" + rank + ", journal=" + journal + '}';
  }
}
