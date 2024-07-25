package com.sun.jna;

public final class Native$7 extends ThreadLocal<Memory> {
   public Memory initialValue() {
      Memory var3 = new Memory(4L);
      var3.clear();
      return var3;
   }
}
