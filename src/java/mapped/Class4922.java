package mapped;

import net.minecraft.util.IntReferenceHolder;

public final class Class4922 extends IntReferenceHolder {
   private static String[] field22824;
   public final Class8202 field22825;
   public final int field22826;

   public Class4922(Class8202 var1, int var2) {
      this.field22825 = var1;
      this.field22826 = var2;
   }

   @Override
   public int get() {
      return this.field22825.method28505(this.field22826);
   }

   @Override
   public void method15235(int var1) {
      this.field22825.method28506(this.field22826, var1);
   }
}
