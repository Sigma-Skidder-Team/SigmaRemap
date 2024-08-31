package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class84 implements IStringSerializable {
   field209,
   field210;

   private static final Class84[] field211 = new Class84[]{field209, field210};

   @Override
   public String toString() {
      return this.getString();
   }

   @Override
   public String getString() {
      return this != field209 ? "lower" : "upper";
   }
}
