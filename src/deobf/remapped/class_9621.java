package remapped;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntArrayList;

public final class class_9621 implements class_1205 {
   private static String[] field_49014;
   private final DoubleArrayList field_49015;
   private final IntArrayList field_49013;
   private final IntArrayList field_49012;

   public class_9621(DoubleList var1, DoubleList var2, boolean var3, boolean var4) {
      int var7 = 0;
      int var8 = 0;
      double var9 = Double.NaN;
      int var11 = var1.size();
      int var12 = var2.size();
      int var13 = var11 + var12;
      this.field_49015 = new DoubleArrayList(var13);
      this.field_49013 = new IntArrayList(var13);
      this.field_49012 = new IntArrayList(var13);

      while (true) {
         boolean var14 = var7 < var11;
         boolean var15 = var8 < var12;
         if (!var14 && !var15) {
            if (this.field_49015.isEmpty()) {
               this.field_49015.add(Math.min(var1.getDouble(var11 - 1), var2.getDouble(var12 - 1)));
            }

            return;
         }

         boolean var16 = var14 && (!var15 || var1.getDouble(var7) < var2.getDouble(var8) + 1.0E-7);
         double var17 = !var16 ? var2.getDouble(var8++) : var1.getDouble(var7++);
         if ((var7 != 0 && var14 || var16 || var4) && (var8 != 0 && var15 || !var16 || var3)) {
            if (var9 >= var17 - 1.0E-7) {
               if (!this.field_49015.isEmpty()) {
                  this.field_49013.set(this.field_49013.size() - 1, var7 - 1);
                  this.field_49012.set(this.field_49012.size() - 1, var8 - 1);
               }
            } else {
               this.field_49013.add(var7 - 1);
               this.field_49012.add(var8 - 1);
               this.field_49015.add(var17);
               var9 = var17;
            }
         }
      }
   }

   @Override
   public boolean method_5337(class_2718 var1) {
      for (int var4 = 0; var4 < this.field_49015.size() - 1; var4++) {
         if (!var1.method_12240(this.field_49013.getInt(var4), this.field_49012.getInt(var4), var4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList method_5336() {
      return this.field_49015;
   }
}
