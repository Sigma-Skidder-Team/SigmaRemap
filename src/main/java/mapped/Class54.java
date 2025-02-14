package mapped;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class Class54 extends AbstractDoubleList {
   private static String[] field114;
   private final DoubleList field115;
   private final double field116;

   public Class54(DoubleList var1, double var2) {
      this.field115 = var1;
      this.field116 = var2;
   }

   public double getDouble(int var1) {
      return this.field115.getDouble(var1) + this.field116;
   }

   public int size() {
      return this.field115.size();
   }
}
