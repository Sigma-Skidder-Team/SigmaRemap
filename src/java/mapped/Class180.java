package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class180 implements IStringSerializable {
   field638("normal"),
   field639("sticky");

   private final String field640;
   private static final Class180[] field641 = new Class180[]{field638, field639};

   private Class180(String var3) {
      this.field640 = var3;
   }

   @Override
   public String toString() {
      return this.field640;
   }

   @Override
   public String getString() {
      return this.field640;
   }
}
