package com.orcchg.javacourse;

public class CallNativeOne {

  static {
    System.loadLibrary("implOne");
  }

  public static void main(String[] args) {
    NativeOne instance = new NativeOne();
    int result = instance.calculate();
    System.out.println("Result from native: " + result);
  }
}

