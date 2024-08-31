package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class111 implements IStringSerializable {
   field379("single", 0),
   field380("left", 2),
   field381("right", 1);

   public static final Class111[] field382 = values();
   private final String field383;
   private final int field384;
   private static final Class111[] field385 = new Class111[]{field379, field380, field381};

   private Class111(String var3, int var4) {
      this.field383 = var3;
      this.field384 = var4;
   }

   @Override
   public String getString() {
      return this.field383;
   }

   public Class111 method308() {
      return field382[this.field384];
   }
}
