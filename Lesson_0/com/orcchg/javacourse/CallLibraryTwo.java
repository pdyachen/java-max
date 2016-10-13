package com.orcchg.javacourse;

import com.orcchg.javalib.LibraryTwo;

public class CallLibraryTwo {

  // TODO: split initialization and call of library, move to CallLibrary* ctor

  public static void main(String[] args) {
    LibraryTwo libObject = new LibraryTwo();
    libObject.init();
    libObject.pixel(0.5f, 0.35f);
  }
}

