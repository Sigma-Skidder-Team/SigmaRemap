package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum ComparatorMode implements IStringSerializable {
   field325("compare"),
   field326("subtract");

   private final String field327;
   private static final ComparatorMode[] field328 = new ComparatorMode[]{field325, field326};

   private ComparatorMode(String var3) {
      this.field327 = var3;
   }

   @Override
   public String toString() {
      return this.field327;
   }

   @Override
   public String getString() {
      return this.field327;
   }
}
