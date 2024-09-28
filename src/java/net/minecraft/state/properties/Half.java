package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum Half implements IStringSerializable {
   field270("top"),
   field271("bottom");

   private final String field272;
   private static final Half[] field273 = new Half[]{field270, field271};

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
