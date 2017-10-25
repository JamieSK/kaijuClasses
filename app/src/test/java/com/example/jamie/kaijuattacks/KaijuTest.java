package com.example.jamie.kaijuattacks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 25/10/2017.
 */

public class KaijuTest {
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
    godzilla.attack(empireState);
    assertEquals(0, empireState.getHealthValue());
  }

  @Test
  public void canBeAttacked() {
    helicopter.attack(godzilla);
    assertEquals(20, godzilla.getHealthValue());
  }

  @Test
  public void cannotHaveHealthLessThanZero() {
    helicopter.attack(godzilla);
    helicopter.attack(godzilla);
    assertEquals(0, godzilla.getHealthValue());
  }

  @Test
  public void cannotAttackWhenDead() {
    helicopter.attack(godzilla);
    helicopter.attack(godzilla);
    godzilla.attack(helicopter);
    assertEquals(20, helicopter.getHealthValue());
  }

  @Test
  public void canRoar() {
    assertEquals("Yelp.", godzilla.roar());
  }

  @Test
  public void canMove() {
    assertEquals("Thud thud thud.", godzilla.move());
  }
}
