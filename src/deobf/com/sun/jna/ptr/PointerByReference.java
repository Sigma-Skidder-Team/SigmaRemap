package com.sun.jna.ptr;

import com.sun.jna.Pointer;

public class PointerByReference extends ByReference {
   public PointerByReference() {
      this(null);
   }

   public PointerByReference(Pointer value) {
      super(Pointer.SIZE);
      this.setValue(value);
   }

   public void setValue(Pointer value) {
      this.getPointer().setPointer(0L, value);
   }

   public Pointer getValue() {
      return this.getPointer().getPointer(0L);
   }
}
