package com.orcchg.javacourse;

public class CallLibraryOne {

  // TODO: split initialization and call of library, move to CallLibrary* ctor

  public static void main(String[] args) {
    LibraryOne libObject = new LibraryOne();
    libObject.init();
    libObject.pixel(0.5f, 0.35f);
  }
}

