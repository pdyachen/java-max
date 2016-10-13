package com.orcchg.javacourse;

public class SampleOne {

  public static void main(String[] args) {
    BaseOne base = new BaseOne();
    base.execute();

    DerivedOne derived = new DerivedOne();
    derived.execute();
  }
}

