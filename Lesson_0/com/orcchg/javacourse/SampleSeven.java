package com.orcchg.javacourse;

import java.lang.ref.WeakReference;

public class SampleSeven {

  private int outerValue;

  /**
   * Invokes method of {@link Inner} class.
   *
   * @param args List or command-line argumets as instances of {@link String}
   *        class.
   */
  public static void main(String[] args) {
    SampleSeven instance = new SampleSeven();
    instance.outerValue = 5;

    // inner class instance requires reference to outer class
    SampleSeven.Inner inner = new SampleSeven.Inner(instance);
    inner.innerValue = 7;
    inner.test();
  }

  private static class Inner {
    private WeakReference<SampleSeven> outerRef;
    private int innerValue;

    private Inner(SampleSeven outer) {
      outerRef = new WeakReference<>(outer);
    }

    /**
     * Calculates sum of {@link SampleSeven#outerValue} and {@link Inner#innerValue}
     * and prints it.
     */
    private void test() {
      SampleSeven outer = outerRef.get();
      if (outer != null) {
        int sum = outer.outerValue + innerValue;
        System.out.println("Sum: " + sum);
      } else {
        // outer instance has already been GC'ed.
      }
    }
  }
}

