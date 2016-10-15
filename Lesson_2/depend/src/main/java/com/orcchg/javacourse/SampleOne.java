package com.orcchg.javacourse;

import com.google.common.base.Joiner;

public class SampleOne {

  public static void main(String[] args) {
    Joiner joiner = Joiner.on(", ").skipNulls();
    String result = joiner.join("Harry", null, "Ron", "Hermione");
    System.out.println(result);
  }
}

