package com.orcchg.javacourse;

public class SampleSix {

  private int outerValue;

  /**
   * Invokes method of {@link Inner} class.
   *
   * @param args List or command-line argumets as instances of {@link String}
   *        class.
   */
  public static void main(String[] args) {
    SampleSix instance = new SampleSix();
    instance.outerValue = 5;

    // inner class instance requires reference to outer class
    SampleSix.Inner inner = new SampleSix.Inner(instance);
    inner.innerValue = 7;
    inner.test();
  }

  private static class Inner {
    private SampleSix outer;
    private int innerValue;

    private Inner(SampleSix outer) {
      this.outer = outer;
    }

    /**
     * Calculates sum of {@link SampleSix#outerValue} and {@link Inner#innerValue}
     * and prints it.
     */
    private void test() {
      int sum = outer.outerValue + innerValue;
      System.out.println("Sum: " + sum);
    }
  }
}

