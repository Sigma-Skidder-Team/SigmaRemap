package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum PistonType implements IStringSerializable {
   field638("normal"),
   field639("sticky");

   private final String field640;
   private static final PistonType[] field641 = new PistonType[]{field638, field639};

   private PistonType(String var3) {
      this.field640 = var3;
   }

   @Override
   public String toString() {
      return this.field640;
   }

   @Override
   public String getString() {
      return this.field640;
   }
}
