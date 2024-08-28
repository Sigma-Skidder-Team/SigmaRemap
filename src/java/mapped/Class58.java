package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntArrayList;

public final class Class58 implements Class56 {
   private static String[] field123;
   private final DoubleArrayList field124;
   private final IntArrayList field125;
   private final IntArrayList field126;

   public Class58(DoubleList var1, DoubleList var2, boolean var3, boolean var4) {
      int var7 = 0;
      int var8 = 0;
      double var9 = Double.NaN;
      int var11 = var1.size();
      int var12 = var2.size();
      int var13 = var11 + var12;
      this.field124 = new DoubleArrayList(var13);
      this.field125 = new IntArrayList(var13);
      this.field126 = new IntArrayList(var13);

      while (true) {
         boolean var14 = var7 < var11;
         boolean var15 = var8 < var12;
         if (!var14 && !var15) {
            if (this.field124.isEmpty()) {
               this.field124.add(Math.min(var1.getDouble(var11 - 1), var2.getDouble(var12 - 1)));
            }

            return;
         }

         boolean var16 = var14 && (!var15 || var1.getDouble(var7) < var2.getDouble(var8) + 1.0E-7);
         double var17 = !var16 ? var2.getDouble(var8++) : var1.getDouble(var7++);
         if ((var7 != 0 && var14 || var16 || var4) && (var8 != 0 && var15 || !var16 || var3)) {
            if (var9 >= var17 - 1.0E-7) {
               if (!this.field124.isEmpty()) {
                  this.field125.set(this.field125.size() - 1, var7 - 1);
                  this.field126.set(this.field126.size() - 1, var8 - 1);
               }
            } else {
               this.field125.add(var7 - 1);
               this.field126.add(var8 - 1);
               this.field124.add(var17);
               var9 = var17;
            }
         }
      }
   }

   @Override
   public boolean method192(Class7775 var1) {
      for (int var4 = 0; var4 < this.field124.size() - 1; var4++) {
         if (!var1.method25758(this.field125.getInt(var4), this.field126.getInt(var4), var4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList method194() {
      return this.field124;
   }
}
