package com.example.jamie.kaijuattacks;

/**
 * Created by jamie on 25/10/2017.
 */

public class Jesuszilla extends Kaiju {
  public Jesuszilla(int healthValue, int attackValue) {
    super("Jesuszilla", healthValue, attackValue);
  }

  @Override
  public String move() {
    return "Thump thump thump";
  }
}
