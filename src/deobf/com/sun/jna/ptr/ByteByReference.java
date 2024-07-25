package com.sun.jna.ptr;

public class ByteByReference extends ByReference {
   public ByteByReference() {
      this((byte)0);
   }

   public ByteByReference(byte value) {
      super(1);
      this.setValue(value);
   }

   public void setValue(byte value) {
      this.getPointer().setByte(0L, value);
   }

   public byte getValue() {
      return this.getPointer().getByte(0L);
   }
}
