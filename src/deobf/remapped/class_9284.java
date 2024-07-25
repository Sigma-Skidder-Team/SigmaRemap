package remapped;

public class class_9284 extends class_4171<class_9716, class_3169<class_9716>> {
   private static String[] field_47364;

   public class_9284(class_2514<class_9716, class_3169<class_9716>> var1) {
      super(var1);
   }

   public void method_42749(
      class_7966 var1, class_2565 var2, int var3, class_9716 var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      if (var4.method_44885() && !var4.method_37109() && var4.method_3168(class_7742.field_39260) && var4.method_44891() != null) {
         class_6098 var13 = var4.method_26520(class_6943.field_35708);
         if (var13.method_27960() != class_4897.field_24503) {
            var1.method_36063();
            var1.method_36065(0.0, 0.0, 0.125);
            double var14 = class_9299.method_42794((double)var7, var4.field_3849, var4.field_3868)
               - class_9299.method_42794((double)var7, var4.field_41767, var4.method_37302());
            double var16 = class_9299.method_42794((double)var7, var4.field_3854, var4.field_3864)
               - class_9299.method_42794((double)var7, var4.field_41698, var4.method_37309());
            double var18 = class_9299.method_42794((double)var7, var4.field_3843, var4.field_3858)
               - class_9299.method_42794((double)var7, var4.field_41725, var4.method_37156());
            float var20 = var4.field_29611 + (var4.field_29605 - var4.field_29611);
            double var21 = (double)class_9299.method_42818(var20 * (float) (Math.PI / 180.0));
            double var23 = (double)(-class_9299.method_42840(var20 * (float) (Math.PI / 180.0)));
            float var25 = (float)var16 * 10.0F;
            var25 = class_9299.method_42828(var25, -6.0F, 32.0F);
            float var26 = (float)(var14 * var21 + var18 * var23) * 100.0F;
            var26 = class_9299.method_42828(var26, 0.0F, 150.0F);
            float var27 = (float)(var14 * var23 - var18 * var21) * 100.0F;
            var27 = class_9299.method_42828(var27, -20.0F, 20.0F);
            if (var26 < 0.0F) {
               var26 = 0.0F;
            }

            if (var26 > 165.0F) {
               var26 = 165.0F;
            }

            if (var25 < -5.0F) {
               var25 = -5.0F;
            }

            float var28 = class_9299.method_42795(var7, var4.field_3857, var4.field_3859);
            var25 += class_9299.method_42818(class_9299.method_42795(var7, var4.field_41705, var4.field_41695) * 6.0F) * 32.0F * var28;
            if (var4.method_37382()) {
               var25 += 25.0F;
            }

            float var29 = class_3111.method_14403() * 20.0F;
            var29 = class_3111.method_14262(var29, 0.02F, 1.0F);
            var4.field_49393 = class_9299.method_42795(var29, var4.field_49393, 6.0F + var26 / 2.0F + var25);
            var4.field_49386 = class_9299.method_42795(var29, var4.field_49386, var27 / 2.0F);
            var4.field_49381 = class_9299.method_42795(var29, var4.field_49381, 180.0F - var27 / 2.0F);
            var1.method_36060(class_2426.field_12080.method_11074(var4.field_49393));
            var1.method_36060(class_2426.field_12076.method_11074(var4.field_49386));
            var1.method_36060(class_2426.field_12074.method_11074(var4.field_49381));
            class_7907 var30 = var2.method_11645(class_3581.method_16734(var4.method_44891()));
            this.method_19347().method_14622(var1, var30, var3, class_5367.field_27381);
            var1.method_36064();
         }
      }
   }
}
