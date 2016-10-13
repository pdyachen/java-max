package com.orcchg.javacourse;

public class SampleThree {

  /**
   * Invokes method of {@link Inner} class.
   *
   * @param args List or command-line argumets as instances of {@link String}
   *        class.
   */
  public static void main(String[] args) {
    SampleThree instance = new SampleThree();
    // inner class instance requires reference to outer class
    SampleThree.Inner inner = instance.new Inner();
    inner.test();
  }

  private class Inner {
    /**
     * Prints a fixed text string.
     */
    private void test() {
      System.out.println("Hello, World!");
    }
  }
}

