package com.orcchg.javacourse;

public class SampleTwoFixed {

  /**
   * Invokes {@link SampleTwoFixed#test()} method as a unit-test.
   *
   * @param args List or command-line argumets as instances of {@link String}
   *        class.
   */
  public static void main(String[] args) {
    SampleTwoFixed instance = new SampleTwoFixed();
    instance.test();
  }

  /**
   * Prints a fixed text string for testing purposes of {@link SampleTwoFixed} class.
   */
  private void test() {
    System.out.println("Hello, World!");
  }
}

