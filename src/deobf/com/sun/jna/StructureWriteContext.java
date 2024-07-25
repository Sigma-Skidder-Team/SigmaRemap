package com.sun.jna;

import java.lang.reflect.Field;

public class StructureWriteContext extends ToNativeContext {
   private Structure struct;
   private Field field;

   public StructureWriteContext(Structure struct, Field field) {
      this.struct = struct;
      this.field = field;
   }

   public Structure getStructure() {
      return this.struct;
   }

   public Field getField() {
      return this.field;
   }
}
