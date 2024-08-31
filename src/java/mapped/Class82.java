package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class82 implements IStringSerializable {
   HEAD("head"),
   FOOT("foot");

   private final String field207;
   private static final Class82[] field208 = new Class82[]{HEAD, FOOT};

   private Class82(String var3) {
      this.field207 = var3;
   }

   @Override
   public String toString() {
      return this.field207;
   }

   @Override
   public String getString() {
      return this.field207;
   }
}
