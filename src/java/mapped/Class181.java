package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class181 implements IStringSerializable {
   field642("none"),
   field643("small"),
   field644("large");

   private final String field645;
   private static final Class181[] field646 = new Class181[]{field642, field643, field644};

   private Class181(String var3) {
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
