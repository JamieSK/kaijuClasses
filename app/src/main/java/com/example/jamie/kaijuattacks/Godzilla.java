package com.example.jamie.kaijuattacks;

/**
 * Created by jamie on 25/10/2017.
 */

public class Godzilla extends Kaiju {
  public Godzilla(int healthValue, int attackValue) {
    super("Godzilla", healthValue, attackValue);
  }

  @Override
  public String move() {
    return "Thud thud thud.";
  }
}
