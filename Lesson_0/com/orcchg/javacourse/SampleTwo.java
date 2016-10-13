package com.orcchg.javacourse;

public class SampleTwo {

  /**
   * Invokes {@link SampleTwo#test()} method as a unit-test.
   *
   * @param args List or command-line argumets as instances of {@link String}
   *        class.
   */
  public static void main(String[] args) {
    test();
  }

  /**
   * Prints a fixed text string for testing purposes of {@link SampleTwo} class.
   */
  private void test() {
    System.out.println("Hello, World!");
  }
}

