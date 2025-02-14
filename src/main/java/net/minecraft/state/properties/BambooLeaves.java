package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum BambooLeaves implements IStringSerializable {
   field642("none"),
   field643("small"),
   field644("large");

   private final String field645;
   private static final BambooLeaves[] field646 = new BambooLeaves[]{field642, field643, field644};

   private BambooLeaves(String var3) {
      this.field645 = var3;
   }

   @Override
   public String toString() {
      return this.field645;
   }

   @Override
   public String getString() {
      return this.field645;
   }
}
