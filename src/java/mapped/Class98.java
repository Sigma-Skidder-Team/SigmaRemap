package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class98 implements IStringSerializable {
   field265("up"),
   field266("side"),
   field267("none");

   private final String field268;
   private static final Class98[] field269 = new Class98[]{field265, field266, field267};

   private Class98(String var3) {
      this.field268 = var3;
   }

   @Override
   public String toString() {
      return this.getString();
   }

   @Override
   public String getString() {
      return this.field268;
   }

   public boolean method279() {
      return this != field267;
   }
}
