package com.orcchg.javalib;

public class LibraryTwo {

  private float coeffX;
  private float coeffY;

  public void init() {
    coeffX = 1.0f;
    coeffY = 0.8f;
  }

  public void pixel(float x, float y) {
    System.out.println("Pixel at (" + x * coeffX + ", " + y * coeffY + ")");
  }
}

