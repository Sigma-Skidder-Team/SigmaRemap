package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum BedPart implements IStringSerializable {
   HEAD("head"),
   FOOT("foot");

   private final String field207;
   private static final BedPart[] field208 = new BedPart[]{HEAD, FOOT};

   private BedPart(String var3) {
      this.field207 = var3;
   }

   @Override
   public String toString() {
      return this.field207;
   }

   @Override
   public String getString() {
      return this.field207;
   }
}
