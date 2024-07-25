package com.sun.jna;

public final class Native$1 implements Callback$class_5 {
   @Override
   public void uncaughtException(Callback c, Throwable e) {
      System.err.println("JNA: Callback " + c + " threw the following exception:");
      e.printStackTrace();
   }
}
