package com.orcchg.javacourse;

public class CallNativeFour {

  static {
    System.loadLibrary("implFour");
  }

  public static void main(String[] args) {
    NativeFour instance = new NativeFour();
    Point A = new Point(3.14f, 2.71f);
    Point B = new Point(1.41f, 2.67f);
    float result = instance.distance(A, B);
    System.out.println("Distance: " + result);
  }
}

