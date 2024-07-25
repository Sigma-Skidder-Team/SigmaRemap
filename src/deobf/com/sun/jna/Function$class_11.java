package com.sun.jna;

public class Function$class_11 extends Memory implements Function$class_12 {
   private final Pointer[] original;

   public Function$class_11(Pointer[] arg) {
      super((long)(Pointer.SIZE * (arg.length + 1)));
      this.original = arg;

      for (int var4 = 0; var4 < arg.length; var4++) {
         this.setPointer((long)(var4 * Pointer.SIZE), arg[var4]);
      }

      this.setPointer((long)(Pointer.SIZE * arg.length), null);
   }

   @Override
   public void read() {
      this.read(0L, this.original, 0, this.original.length);
   }
}
