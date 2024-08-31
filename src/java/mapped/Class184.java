package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class184 implements IStringSerializable {
   field667("none"),
   field668("low"),
   field669("tall");

   private final String field670;
   private static final Class184[] field671 = new Class184[]{field667, field668, field669};

   private Class184(String var3) {
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
