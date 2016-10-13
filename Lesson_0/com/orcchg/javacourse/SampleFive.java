package com.orcchg.javacourse;

public class SampleFive {

  private int outerValue;

  /**
   * Invokes method of {@link Inner} class.
   *
   * @param args List or command-line argumets as instances of {@link String}
   *        class.
   */
  public static void main(String[] args) {
    SampleFive instance = new SampleFive();
    instance.outerValue = 5;

    // inner class instance requires reference to outer class
    SampleFive.Inner inner = instance.new Inner();
    inner.innerValue = 7;
    inner.test();
  }

  private class Inner {
    private int innerValue;

    /**
     * Calculates sum of {@link SampleFour#outerValue} and {@link Inner#innerValue}
     * and prints it.
     */
    private void test() {
      int sum = outerValue + innerValue;
      System.out.println("Sum: " + sum);
    }
  }
}

