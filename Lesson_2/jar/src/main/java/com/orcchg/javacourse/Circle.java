package com.orcchg.javacourse;

public class Circle {

  private float radius;

  public Circle(float radius) {
    this.radius = radius;
  }

  public float square() {
    return (float) Math.PI * radius * radius;
  }

  public float length() {
    return 2 * (float) Math.PI * radius;
  }
}

