package com.sun.jna;

public class Memory$class_15 extends Memory {
   public Memory$class_15(Memory var1, long offset, long size) {
      this.this$0 = var1;
      this.size = size;
      this.peer = var1.peer + offset;
   }

   @Override
   public void dispose() {
      this.peer = 0L;
   }

   @Override
   public void boundsCheck(long off, long sz) {
      this.this$0.boundsCheck(this.peer - this.this$0.peer + off, sz);
   }

   @Override
   public String toString() {
      return super.toString() + " (shared from " + this.this$0.toString() + ")";
   }
}
