package remapped;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class class_2385 extends AbstractDoubleList {
   private static String[] field_11900;
   private final DoubleList field_11899;
   private final double field_11901;

   public class_2385(DoubleList var1, double var2) {
      this.field_11899 = var1;
      this.field_11901 = var2;
   }

   public double getDouble(int var1) {
      return this.field_11899.getDouble(var1) + this.field_11901;
   }

   public int size() {
      return this.field_11899.size();
   }
}
