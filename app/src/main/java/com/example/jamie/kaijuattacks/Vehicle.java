package com.example.jamie.kaijuattacks;

import com.example.jamie.kaijuattacks.interfaces.Attacks;
import com.example.jamie.kaijuattacks.interfaces.Damageable;

/**
 * Created by jamie on 25/10/2017.
 */

public abstract class Vehicle implements Damageable, Attacks {
  private String type;
  private int healthValue;
  private int attackValue;

  public Vehicle(String type, int healthValue, int attackValue) {
    this.type = type;
    this.healthValue = healthValue;
    this.attackValue = attackValue;
  }

  @Override
  public void damage(int amount) {
    healthValue -= amount;
    if (healthValue < 0) {
      healthValue = 0;
    }
  }

  @Override
  public void attack(Damageable object) {
    if (healthValue > 0) {
      object.damage(attackValue);
    }
  }

  public int getHealthValue() {
    return healthValue;
  }
}
