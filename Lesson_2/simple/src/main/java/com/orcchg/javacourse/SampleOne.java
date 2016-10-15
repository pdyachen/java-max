package com.orcchg.javacourse;

public class SampleOne {

  public static void main(String[] args) {
    Circle circle = new Circle(2.71f);
    float s = circle.square();
    float l = circle.length();
    System.out.println("Length: " + l + ", Square: " + s);
  }
}

