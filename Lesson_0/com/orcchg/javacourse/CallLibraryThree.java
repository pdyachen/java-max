package com.orcchg.javacourse;

import com.orcchg.javalib.LibraryThree;

public class CallLibraryThree {

  // TODO: split initialization and call of library, move to CallLibrary* ctor

  public static void main(String[] args) {
    LibraryThree libObject = new LibraryThree();
    libObject.init();
    libObject.pixel(0.5f, 0.35f);
  }
}

