package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum Half implements IStringSerializable {
   TOP("top"),
   BOTTOM("bottom");

   private final String field272;
   private static final Half[] field273 = new Half[]{TOP, BOTTOM};

   private Half(String var3) {
      this.field272 = var3;
   }

   @Override
   public String toString() {
      return this.field272;
   }

   @Override
   public String getString() {
      return this.field272;
   }
}
