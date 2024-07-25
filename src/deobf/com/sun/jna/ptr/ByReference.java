package com.sun.jna.ptr;

import com.sun.jna.Memory;
import com.sun.jna.PointerType;

public abstract class ByReference extends PointerType {
   public ByReference(int dataSize) {
      this.setPointer(new Memory((long)dataSize));
   }
}
