package net.minecraft.block;

import net.minecraft.util.IStringSerializable;

public enum WallHeight implements IStringSerializable {
   field667("none"),
   field668("low"),
   field669("tall");

   private final String field670;
   private static final WallHeight[] field671 = new WallHeight[]{field667, field668, field669};

   private WallHeight(String var3) {
      this.field670 = var3;
   }

   @Override
   public String toString() {
      return this.getString();
   }

   @Override
   public String getString() {
      return this.field670;
   }
}
