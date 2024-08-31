package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class99 implements IStringSerializable {
   field270("top"),
   field271("bottom");

   private final String field272;
   private static final Class99[] field273 = new Class99[]{field270, field271};

   private Class99(String var3) {
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
