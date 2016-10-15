package com.orcchg.javacourse;

public class CallNativeFive {

  static {
    System.loadLibrary("implFive");
  }

  public static void main(String[] args) {
    CallNativeFive obj = new CallNativeFive();
    NativeFive instance = new NativeFive();
    instance.call(obj);
  }

  private void test(String str) {
    System.out.println("Test: " + str);
  }
}

