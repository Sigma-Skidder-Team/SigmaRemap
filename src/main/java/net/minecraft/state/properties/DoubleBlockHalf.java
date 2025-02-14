package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum DoubleBlockHalf implements IStringSerializable {
   field209,
   field210;

   private static final DoubleBlockHalf[] field211 = new DoubleBlockHalf[]{field209, field210};

   @Override
   public String toString() {
      return this.getString();
   }

   @Override
   public String getString() {
      return this != field209 ? "lower" : "upper";
   }
}
