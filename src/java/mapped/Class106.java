package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class106 implements IStringSerializable {
   field329("straight"),
   field330("inner_left"),
   field331("inner_right"),
   field332("outer_left"),
   field333("outer_right");

   private final String field334;
   private static final Class106[] field335 = new Class106[]{field329, field330, field331, field332, field333};

   private Class106(String var3) {
      this.field334 = var3;
   }

   @Override
   public String toString() {
      return this.field334;
   }

   @Override
   public String getString() {
      return this.field334;
   }
}
