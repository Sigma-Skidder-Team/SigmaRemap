package mapped;

import net.minecraft.util.IntReferenceHolder;

public final class Class4925 extends IntReferenceHolder {
   private static String[] field22830;
   public final int[] field22831;
   public final int field22832;

   public Class4925(int[] var1, int var2) {
      this.field22831 = var1;
      this.field22832 = var2;
   }

   @Override
   public int get() {
      return this.field22831[this.field22832];
   }

   @Override
   public void method15235(int var1) {
      this.field22831[this.field22832] = var1;
   }
}
