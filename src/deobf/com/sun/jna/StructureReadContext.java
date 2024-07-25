package com.sun.jna;

import java.lang.reflect.Field;

public class StructureReadContext extends FromNativeContext {
   private Structure structure;
   private Field field;

   public StructureReadContext(Structure struct, Field field) {
      super(field.getType());
      this.structure = struct;
      this.field = field;
   }

   public Structure getStructure() {
      return this.structure;
   }

   public Field getField() {
      return this.field;
   }
}
