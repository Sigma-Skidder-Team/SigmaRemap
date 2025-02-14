package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum ChestType implements IStringSerializable {
   field379("single", 0),
   LEFT("left", 2),
   RIGHT("right", 1);

   public static final ChestType[] field382 = values();
   private final String field383;
   private final int field384;
   private static final ChestType[] field385 = new ChestType[]{field379, LEFT, RIGHT};

   private ChestType(String var3, int var4) {
      this.field383 = var3;
      this.field384 = var4;
   }

   @Override
   public String getString() {
      return this.field383;
   }

   public ChestType method308() {
      return field382[this.field384];
   }
}
