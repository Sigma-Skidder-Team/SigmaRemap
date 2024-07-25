package com.sun.jna;

public final class Structure$3 extends Pointer {
   public Structure$3(long peer) {
      super(peer);
   }

   @Override
   public Pointer share(long offset, long sz) {
      return this;
   }
}
