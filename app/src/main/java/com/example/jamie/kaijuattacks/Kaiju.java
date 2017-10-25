package com.example.jamie.kaijuattacks;

import com.example.jamie.kaijuattacks.interfaces.Attacks;
import com.example.jamie.kaijuattacks.interfaces.Damageable;

/**
 * Created by jamie on 25/10/2017.
 */

public abstract class Kaiju implements Attacks, Damageable {
  private String name;
  private int healthValue;
  private int attackValue;

  public Kaiju(String name, int healthValue, int attackValue) {
    this.name = name;
    this.healthValue = healthValue;
    this.attackValue = attackValue;
  }

  public String roar() {
    return "Yelp.";
  }

  @Override
  public void attack(Damageable object) {
    if (healthValue > 0) {
      object.damage(attackValue);
    }
  }

  @Override
  public void damage(int amount) {
    healthValue -= amount;
    if (healthValue < 0) {
      healthValue = 0;
    }
  }

  public abstract String move();

  public int getHealthValue() {
    return healthValue;
  }
}
