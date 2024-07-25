package remapped;

import javax.annotation.Nullable;

public class class_1703 extends class_1546 {
   private static String[] field_8812;
   private final boolean field_8813;

   public class_1703(boolean var1) {
      this.field_8813 = var1;
   }

   @Override
   public class_5851 method_7003() {
      return super.method_7016(
         class_9299.method_42847(this.field_8166.method_37241().field_19941),
         class_9299.method_42847(this.field_8166.method_37241().field_19937 + 0.5),
         class_9299.method_42847(this.field_8166.method_37241().field_19938)
      );
   }

   @Override
   public class_1478 method_7013(double var1, double var3, double var5) {
      return new class_1478(
         super.method_7016(
            class_9299.method_42847(var1 - (double)(this.field_8166.method_37086() / 2.0F)),
            class_9299.method_42847(var3 + 0.5),
            class_9299.method_42847(var5 - (double)(this.field_8166.method_37086() / 2.0F))
         )
      );
   }

   @Override
   public int method_7002(class_5851[] var1, class_5851 var2) {
      int var5 = 0;

      for (Direction var9 : Direction.values()) {
         class_5851 var10 = this.method_7642(
            var2.field_29731 + var9.method_1041(), var2.field_29735 + var9.method_1054(), var2.field_29736 + var9.method_1034()
         );
         if (var10 != null && !var10.field_29726) {
            var1[var5++] = var10;
         }
      }

      return var5;
   }

   @Override
   public class_1108 method_7011(class_6163 var1, int var2, int var3, int var4, class_5886 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      return this.method_7010(var1, var2, var3, var4);
   }

   @Override
   public class_1108 method_7010(class_6163 var1, int var2, int var3, int var4) {
      BlockPos var7 = new BlockPos(var2, var3, var4);
      class_4774 var8 = var1.method_28258(var7);
      class_2522 var9 = var1.method_28262(var7);
      if (var8.method_22001() && var9.method_8319(var1, var7.method_6100(), class_2929.field_14272) && var9.method_8345()) {
         return class_1108.field_6341;
      } else {
         return var8.method_22007(class_6503.field_33094) && var9.method_8319(var1, var7, class_2929.field_14272)
            ? class_1108.field_6359
            : class_1108.field_6365;
      }
   }

   @Nullable
   private class_5851 method_7642(int var1, int var2, int var3) {
      class_1108 var6 = this.method_7643(var1, var2, var3);
      return (!this.field_8813 || var6 != class_1108.field_6341) && var6 != class_1108.field_6359 ? null : this.method_7016(var1, var2, var3);
   }

   @Nullable
   @Override
   public class_5851 method_7016(int var1, int var2, int var3) {
      class_5851 var6 = null;
      class_1108 var7 = this.method_7010(this.field_8166.world, var1, var2, var3);
      float var8 = this.field_8166.method_26931(var7);
      if (var8 >= 0.0F) {
         var6 = super.method_7016(var1, var2, var3);
         var6.field_29730 = var7;
         var6.field_29729 = Math.max(var6.field_29729, var8);
         if (this.field_8165.method_28258(new BlockPos(var1, var2, var3)).method_22001()) {
            var6.field_29729 += 8.0F;
         }
      }

      return var7 != class_1108.field_6366 ? var6 : var6;
   }

   private class_1108 method_7643(int var1, int var2, int var3) {
      class_2921 var6 = new class_2921();

      for (int var7 = var1; var7 < var1 + this.field_8164; var7++) {
         for (int var8 = var2; var8 < var2 + this.field_8163; var8++) {
            for (int var9 = var3; var9 < var3 + this.field_8167; var9++) {
               class_4774 var10 = this.field_8165.method_28258(var6.method_13362(var7, var8, var9));
               class_2522 var11 = this.field_8165.method_28262(var6.method_13362(var7, var8, var9));
               if (var10.method_22001() && var11.method_8319(this.field_8165, var6.method_6100(), class_2929.field_14272) && var11.method_8345()) {
                  return class_1108.field_6341;
               }

               if (!var10.method_22007(class_6503.field_33094)) {
                  return class_1108.field_6365;
               }
            }
         }
      }

      class_2522 var12 = this.field_8165.method_28262(var6);
      return !var12.method_8319(this.field_8165, var6, class_2929.field_14272) ? class_1108.field_6365 : class_1108.field_6359;
   }
}
