package remapped;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class class_4347 extends AbstractDoubleList {
   private static String[] field_21303;
   private final int field_21304;

   public class_4347(int var1) {
      this.field_21304 = var1;
   }

   public double getDouble(int var1) {
      return (double)var1 / (double)this.field_21304;
   }

   public int size() {
      return this.field_21304 + 1;
   }
}
