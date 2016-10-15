package com.orcchg.javacourse;

public class CallNativeThree {

  static {
    System.loadLibrary("implThree");
  }

  public static void main(String[] args) {
    NativeThree instance = new NativeThree();
    String result = instance.reverseString("Hello, World!");
    System.out.println("Reversed: " + result);
  }
}

