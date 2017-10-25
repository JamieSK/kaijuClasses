package com.example.jamie.kaijuattacks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 25/10/2017.
 */

public class VehicleTest {
  Godzilla godzilla;
  Skyscraper empireState;
  Helicopter helicopter;

  @Before
  public void before() {
    godzilla = new Godzilla(50, 10);
    empireState = new Skyscraper();
    helicopter = new Helicopter(20, 30);
  }

  @Test
  public void canAttack() {
    helicopter.attack(godzilla);
    assertEquals(20, godzilla.getHealthValue());
  }

  @Test
  public void canBeAttacked() {
    godzilla.attack(helicopter);
    assertEquals(10, helicopter.getHealthValue());
  }
}
