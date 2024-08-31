package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class183 implements IStringSerializable {
   field664,
   field665;

   private static final Class183[] field666 = new Class183[]{field664, field665};

   @Override
   public String toString() {
      return this.getString();
   }

   @Override
   public String getString() {
      return this != field664 ? "right" : "left";
   }
}
