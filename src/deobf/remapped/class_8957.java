package remapped;

public class class_8957 implements class_2995 {
   private static String[] field_45892;
   private final class_1893 field_45893;

   public class_8957(class_1893 var1) {
      this.field_45893 = var1;
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      if (!class_6588.field_33945) {
         if (class_3111.method_14424()) {
            class_6588.method_30195();
         }

         class_3542.method_16428();
         class_3542.method_16486(7425);
         class_3542.method_16374();
         class_3542.method_16433();
         class_8145 var11 = this.field_45893.field_9590.method_35949().method_41633();
         class_8042 var12 = class_8042.method_36499();
         class_9633 var13 = var12.method_36501();
         double var14 = 0.0 - var5;
         double var16 = 256.0 - var5;
         class_3542.method_16354();
         class_3542.method_16448();
         double var18 = (double)(var11.field_41742 << 4) - var3;
         double var20 = (double)(var11.field_41714 << 4) - var7;
         class_3542.method_16484(1.0F);
         var13.method_44471(3, class_7985.field_40903);

         for (byte var22 = -16; var22 <= 32; var22 += 16) {
            for (byte var23 = -16; var23 <= 32; var23 += 16) {
               var13.method_35761(var18 + (double)var22, var14, var20 + (double)var23).method_35742(1.0F, 0.0F, 0.0F, 0.0F).method_35735();
               var13.method_35761(var18 + (double)var22, var14, var20 + (double)var23).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
               var13.method_35761(var18 + (double)var22, var16, var20 + (double)var23).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
               var13.method_35761(var18 + (double)var22, var16, var20 + (double)var23).method_35742(1.0F, 0.0F, 0.0F, 0.0F).method_35735();
            }
         }

         for (byte var26 = 2; var26 < 16; var26 += 2) {
            var13.method_35761(var18 + (double)var26, var14, var20).method_35742(1.0F, 1.0F, 0.0F, 0.0F).method_35735();
            var13.method_35761(var18 + (double)var26, var14, var20).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18 + (double)var26, var16, var20).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18 + (double)var26, var16, var20).method_35742(1.0F, 1.0F, 0.0F, 0.0F).method_35735();
            var13.method_35761(var18 + (double)var26, var14, var20 + 16.0).method_35742(1.0F, 1.0F, 0.0F, 0.0F).method_35735();
            var13.method_35761(var18 + (double)var26, var14, var20 + 16.0).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18 + (double)var26, var16, var20 + 16.0).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18 + (double)var26, var16, var20 + 16.0).method_35742(1.0F, 1.0F, 0.0F, 0.0F).method_35735();
         }

         for (byte var27 = 2; var27 < 16; var27 += 2) {
            var13.method_35761(var18, var14, var20 + (double)var27).method_35742(1.0F, 1.0F, 0.0F, 0.0F).method_35735();
            var13.method_35761(var18, var14, var20 + (double)var27).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18, var16, var20 + (double)var27).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18, var16, var20 + (double)var27).method_35742(1.0F, 1.0F, 0.0F, 0.0F).method_35735();
            var13.method_35761(var18 + 16.0, var14, var20 + (double)var27).method_35742(1.0F, 1.0F, 0.0F, 0.0F).method_35735();
            var13.method_35761(var18 + 16.0, var14, var20 + (double)var27).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18 + 16.0, var16, var20 + (double)var27).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18 + 16.0, var16, var20 + (double)var27).method_35742(1.0F, 1.0F, 0.0F, 0.0F).method_35735();
         }

         for (byte var28 = 0; var28 <= 256; var28 += 2) {
            double var24 = (double)var28 - var5;
            var13.method_35761(var18, var24, var20).method_35742(1.0F, 1.0F, 0.0F, 0.0F).method_35735();
            var13.method_35761(var18, var24, var20).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18, var24, var20 + 16.0).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18 + 16.0, var24, var20 + 16.0).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18 + 16.0, var24, var20).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18, var24, var20).method_35742(1.0F, 1.0F, 0.0F, 1.0F).method_35735();
            var13.method_35761(var18, var24, var20).method_35742(1.0F, 1.0F, 0.0F, 0.0F).method_35735();
         }

         var12.method_36500();
         class_3542.method_16484(2.0F);
         var13.method_44471(3, class_7985.field_40903);

         for (byte var29 = 0; var29 <= 16; var29 += 16) {
            for (byte var31 = 0; var31 <= 16; var31 += 16) {
               var13.method_35761(var18 + (double)var29, var14, var20 + (double)var31).method_35742(0.25F, 0.25F, 1.0F, 0.0F).method_35735();
               var13.method_35761(var18 + (double)var29, var14, var20 + (double)var31).method_35742(0.25F, 0.25F, 1.0F, 1.0F).method_35735();
               var13.method_35761(var18 + (double)var29, var16, var20 + (double)var31).method_35742(0.25F, 0.25F, 1.0F, 1.0F).method_35735();
               var13.method_35761(var18 + (double)var29, var16, var20 + (double)var31).method_35742(0.25F, 0.25F, 1.0F, 0.0F).method_35735();
            }
         }

         for (byte var30 = 0; var30 <= 256; var30 += 16) {
            double var32 = (double)var30 - var5;
            var13.method_35761(var18, var32, var20).method_35742(0.25F, 0.25F, 1.0F, 0.0F).method_35735();
            var13.method_35761(var18, var32, var20).method_35742(0.25F, 0.25F, 1.0F, 1.0F).method_35735();
            var13.method_35761(var18, var32, var20 + 16.0).method_35742(0.25F, 0.25F, 1.0F, 1.0F).method_35735();
            var13.method_35761(var18 + 16.0, var32, var20 + 16.0).method_35742(0.25F, 0.25F, 1.0F, 1.0F).method_35735();
            var13.method_35761(var18 + 16.0, var32, var20).method_35742(0.25F, 0.25F, 1.0F, 1.0F).method_35735();
            var13.method_35761(var18, var32, var20).method_35742(0.25F, 0.25F, 1.0F, 1.0F).method_35735();
            var13.method_35761(var18, var32, var20).method_35742(0.25F, 0.25F, 1.0F, 0.0F).method_35735();
         }

         var12.method_36500();
         class_3542.method_16484(1.0F);
         class_3542.method_16488();
         class_3542.method_16432();
         class_3542.method_16486(7424);
         if (class_3111.method_14424()) {
            class_6588.method_30104();
         }
      }
   }
}
