package com.sun.jna;

public class Function$class_10 extends Memory implements Function$class_12 {
   private final NativeMapped[] original;

   public Function$class_10(NativeMapped[] arg) {
      super((long)Native.getNativeSize(arg.getClass(), arg));
      this.original = arg;
      this.setValue(0L, this.original, this.original.getClass());
   }

   @Override
   public void read() {
      this.getValue(0L, this.original.getClass(), this.original);
   }
}
