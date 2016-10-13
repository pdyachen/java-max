package com.orcchg.javacourse;

public class SampleFour {

  private int value;

  /**
   * Invokes method of {@link Inner} class.
   *
   * @param args List or command-line argumets as instances of {@link String}
   *        class.
   */
  public static void main(String[] args) {
    SampleFour instance = new SampleFour();
    instance.value = 5;

    // inner class instance requires reference to outer class
    SampleFour.Inner inner = instance.new Inner();
    inner.value = 7;
    inner.test();
  }

  private class Inner {
    private int value;

    /**
     * Calculates sum of {@link SampleFour#value} and {@link Inner#value}
     * and prints it.
     */
    private void test() {
      int sum = SampleFour.this.value + value;
      System.out.println("Sum: " + sum);
    }
  }
}

