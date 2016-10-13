package com.orcchg.javacourse;

public class SampleEight {

  private static int outerValue;

  /**
   * Invokes method of {@link Inner} class.
   *
   * @param args List or command-line argumets as instances of {@link String}
   *        class.
   */
  public static void main(String[] args) {
    SampleEight instance = new SampleEight();
    SampleEight.outerValue = 5;

    // inner class instance requires reference to outer class
    SampleEight.Inner inner = instance.new Inner();
    inner.innerValue = 7;
    inner.test();
  }

  private class Inner {
    private int innerValue;

    /**
     * Calculates sum of {@link SampleEight#outerValue} and {@link Inner#innerValue}
     * and prints it.
     */
    private void test() {
      int sum = SampleEight.outerValue + innerValue;
      System.out.println("Sum: " + sum);
    }
  }
}

