package remapped;

import javax.annotation.Nonnull;

public class class_4555 {
   private static String[] field_22202;
   private static final double[] field_22201 = new double[]{0.0, 1.0, 4.0, 6.0, 4.0, 1.0, 0.0};

   @Nonnull
   public static class_1343 method_21121(class_1343 var0, class_7141 var1) {
      int var4 = class_9299.method_42847(var0.method_61());
      int var5 = class_9299.method_42847(var0.method_60());
      int var6 = class_9299.method_42847(var0.method_62());
      double var7 = var0.method_61() - (double)var4;
      double var9 = var0.method_60() - (double)var5;
      double var11 = var0.method_62() - (double)var6;
      double var13 = 0.0;
      class_1343 var15 = class_1343.field_7335;

      for (int var16 = 0; var16 < 6; var16++) {
         double var17 = class_9299.method_42794(var7, field_22201[var16 + 1], field_22201[var16]);
         int var19 = var4 - 2 + var16;

         for (int var20 = 0; var20 < 6; var20++) {
            double var21 = class_9299.method_42794(var9, field_22201[var20 + 1], field_22201[var20]);
            int var23 = var5 - 2 + var20;

            for (int var24 = 0; var24 < 6; var24++) {
               double var25 = class_9299.method_42794(var11, field_22201[var24 + 1], field_22201[var24]);
               int var27 = var6 - 2 + var24;
               double var28 = var17 * var21 * var25;
               var13 += var28;
               var15 = var15.method_6215(var1.method_32788(var19, var23, var27).method_6209(var28));
            }
         }
      }

      return var15.method_6209(1.0 / var13);
   }
}
