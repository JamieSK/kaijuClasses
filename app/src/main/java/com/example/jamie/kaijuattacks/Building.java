package com.example.jamie.kaijuattacks;

import com.example.jamie.kaijuattacks.interfaces.Damageable;

/**
 * Created by jamie on 25/10/2017.
 */

public abstract class Building implements Damageable {
  private int healthValue;

  public Building(int healthValue) {
    this.healthValue = healthValue;
  }

  @Override
  public void damage(int amount) {
    healthValue -= amount;
    if (healthValue < 0) {
      healthValue = 0;
    }
  }

  public int getHealthValue() {
    return healthValue;
  }
}
