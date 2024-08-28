package mapped;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class Class53 extends AbstractDoubleList {
   private static String[] field112;
   private final int field113;

   public Class53(int var1) {
      this.field113 = var1;
   }

   public double getDouble(int var1) {
      return (double)var1 / (double)this.field113;
   }

   public int size() {
      return this.field113 + 1;
   }
}
