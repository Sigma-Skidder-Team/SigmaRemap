package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class105 implements IStringSerializable {
   field325("compare"),
   field326("subtract");

   private final String field327;
   private static final Class105[] field328 = new Class105[]{field325, field326};

   private Class105(String var3) {
      this.field327 = var3;
   }

   @Override
   public String toString() {
      return this.field327;
   }

   @Override
   public String getString() {
      return this.field327;
   }
}
