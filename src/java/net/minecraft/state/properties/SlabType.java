package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum SlabType implements IStringSerializable {
   field218("top"),
   field219("bottom"),
   field220("double");

   private final String field221;
   private static final SlabType[] field222 = new SlabType[]{field218, field219, field220};

   private SlabType(String var3) {
      this.field221 = var3;
   }

   @Override
   public String toString() {
      return this.field221;
   }

   @Override
   public String getString() {
      return this.field221;
   }
}
