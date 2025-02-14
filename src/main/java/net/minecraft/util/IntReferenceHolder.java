package net.minecraft.util;

import mapped.Class4922;
import mapped.Class4924;
import mapped.Class4925;
import mapped.Class8202;

public abstract class IntReferenceHolder {
   private int field22827;

   public static IntReferenceHolder create(Class8202 var0, int var1) {
      return new Class4922(var0, var1);
   }

   public static IntReferenceHolder method15237(int[] var0, int var1) {
      return new Class4925(var0, var1);
   }

   public static IntReferenceHolder method15238() {
      return new Class4924();
   }

   public abstract int get();

   public abstract void method15235(int var1);

   public boolean isDirty() {
      int var3 = this.get();
      boolean var4 = var3 != this.field22827;
      this.field22827 = var3;
      return var4;
   }
}
