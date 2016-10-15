package com.orcchg.javacourse;

public class CallNativeTwo {

  static {
    System.loadLibrary("implTwo");
  }

  public static void main(String[] args) {
    NativeTwo instance = new NativeTwo();
    float result = instance.distance(3.14f, 0.05f, -2.71f, 0.19f);
    System.out.println("Distance: " + result);
  }
}

