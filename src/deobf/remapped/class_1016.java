package remapped;

import java.util.Map.Entry;

public class class_1016 implements class_2995 {
   private static String[] field_5331;
   private final MinecraftClient field_5330;

   public class_1016(MinecraftClient var1) {
      this.field_5330 = var1;
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      class_174 var11 = this.field_5330.field_9601;
      class_3542.method_16438();
      class_3542.method_16448();
      class_3542.method_16354();
      class_3542.method_16428();
      class_1331 var12 = new class_1331(var3, 0.0, var7);
      class_8042 var13 = class_8042.method_36499();
      class_9633 var14 = var13.method_36501();
      var14.method_44471(5, class_7985.field_40903);

      for (byte var15 = -32; var15 <= 32; var15 += 16) {
         for (byte var16 = -32; var16 <= 32; var16 += 16) {
            class_5990 var17 = var11.method_22556(var12.method_6104(var15, 0, var16));

            for (Entry var19 : var17.method_27354()) {
               class_3801 var20 = (class_3801)var19.getKey();
               class_2034 var21 = var17.method_27352();
               class_2426 var22 = this.method_4503(var20);

               for (int var23 = 0; var23 < 16; var23++) {
                  for (int var24 = 0; var24 < 16; var24++) {
                     int var25 = var21.field_10328 * 16 + var23;
                     int var26 = var21.field_10327 * 16 + var24;
                     float var27 = (float)((double)((float)var11.method_22562(var20, var25, var26) + (float)var20.ordinal() * 0.09375F) - var5);
                     WorldRenderer.method_20064(
                        var14,
                        (double)((float)var25 + 0.25F) - var3,
                        (double)var27,
                        (double)((float)var26 + 0.25F) - var7,
                        (double)((float)var25 + 0.75F) - var3,
                        (double)(var27 + 0.09375F),
                        (double)((float)var26 + 0.75F) - var7,
                        var22.method_11057(),
                        var22.method_11061(),
                        var22.method_11055(),
                        1.0F
                     );
                  }
               }
            }
         }
      }

      var13.method_36500();
      class_3542.method_16432();
      class_3542.method_16489();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private class_2426 method_4503(class_3801 var1) {
      switch (var1) {
         case field_18598:
            return new class_2426(1.0F, 1.0F, 0.0F);
         case field_18591:
            return new class_2426(1.0F, 0.0F, 1.0F);
         case field_18592:
            return new class_2426(0.0F, 0.7F, 0.0F);
         case field_18599:
            return new class_2426(0.0F, 0.0F, 0.5F);
         case field_18595:
            return new class_2426(0.0F, 0.3F, 0.3F);
         case field_18590:
            return new class_2426(0.0F, 0.5F, 0.5F);
         default:
            return new class_2426(0.0F, 0.0F, 0.0F);
      }
   }
}
