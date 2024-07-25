package remapped;

import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class class_7539 implements class_2995 {
   private final Map<Integer, class_3998> field_38472 = Maps.newHashMap();
   private final Map<Integer, Float> field_38474 = Maps.newHashMap();
   private final Map<Integer, Long> field_38475 = Maps.newHashMap();

   public void method_34332(int var1, class_3998 var2, float var3) {
      this.field_38472.put(var1, var2);
      this.field_38475.put(var1, Util.getMeasuringTimeMs());
      this.field_38474.put(var1, var3);
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      if (!this.field_38472.isEmpty()) {
         long var11 = Util.getMeasuringTimeMs();

         for (Integer var14 : this.field_38472.keySet()) {
            class_3998 var15 = this.field_38472.get(var14);
            float var16 = this.field_38474.get(var14);
            method_34335(var15, var16, true, true, var3, var5, var7);
         }

         for (Integer var20 : this.field_38475.keySet().<Integer>toArray(new Integer[0])) {
            if (var11 - this.field_38475.get(var20) > 5000L) {
               this.field_38472.remove(var20);
               this.field_38475.remove(var20);
            }
         }
      }
   }

   public static void method_34335(class_3998 var0, float var1, boolean var2, boolean var3, double var4, double var6, double var8) {
      RenderSystem.method_16438();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
      RenderSystem.method_16354();
      RenderSystem.method_16484(6.0F);
      method_34330(var0, var1, var2, var3, var4, var6, var8);
      RenderSystem.method_16432();
      RenderSystem.disableBlend();
      RenderSystem.method_16489();
   }

   private static void method_34330(class_3998 var0, float var1, boolean var2, boolean var3, double var4, double var6, double var8) {
      method_34334(var0, var4, var6, var8);
      BlockPos var12 = var0.method_18426();
      if (method_34333(var12, var4, var6, var8) <= 80.0F) {
         class_3372.method_15562(
            new Box(
                  (double)((float)var12.method_12173() + 0.25F),
                  (double)((float)var12.method_12165() + 0.25F),
                  (double)var12.method_12185() + 0.25,
                  (double)((float)var12.method_12173() + 0.75F),
                  (double)((float)var12.method_12165() + 0.75F),
                  (double)((float)var12.method_12185() + 0.75F)
               )
               .method_18918(-var4, -var6, -var8),
            0.0F,
            1.0F,
            0.0F,
            0.5F
         );

         for (int var13 = 0; var13 < var0.method_18437(); var13++) {
            class_5851 var14 = var0.method_18447(var13);
            if (method_34333(var14.method_26686(), var4, var6, var8) <= 80.0F) {
               float var15 = var13 != var0.method_18429() ? 0.0F : 1.0F;
               float var16 = var13 != var0.method_18429() ? 1.0F : 0.0F;
               class_3372.method_15562(
                  new Box(
                        (double)((float)var14.field_29731 + 0.5F - var1),
                        (double)((float)var14.field_29735 + 0.01F * (float)var13),
                        (double)((float)var14.field_29736 + 0.5F - var1),
                        (double)((float)var14.field_29731 + 0.5F + var1),
                        (double)((float)var14.field_29735 + 0.25F + 0.01F * (float)var13),
                        (double)((float)var14.field_29736 + 0.5F + var1)
                     )
                     .method_18918(-var4, -var6, -var8),
                  var15,
                  0.0F,
                  var16,
                  0.5F
               );
            }
         }
      }

      if (var2) {
         for (class_5851 var25 : var0.method_18431()) {
            if (method_34333(var25.method_26686(), var4, var6, var8) <= 80.0F) {
               class_3372.method_15562(
                  new Box(
                        (double)((float)var25.field_29731 + 0.5F - var1 / 2.0F),
                        (double)((float)var25.field_29735 + 0.01F),
                        (double)((float)var25.field_29736 + 0.5F - var1 / 2.0F),
                        (double)((float)var25.field_29731 + 0.5F + var1 / 2.0F),
                        (double)var25.field_29735 + 0.1,
                        (double)((float)var25.field_29736 + 0.5F + var1 / 2.0F)
                     )
                     .method_18918(-var4, -var6, -var8),
                  1.0F,
                  0.8F,
                  0.8F,
                  0.5F
               );
            }
         }

         for (class_5851 var26 : var0.method_18435()) {
            if (method_34333(var26.method_26686(), var4, var6, var8) <= 80.0F) {
               class_3372.method_15562(
                  new Box(
                        (double)((float)var26.field_29731 + 0.5F - var1 / 2.0F),
                        (double)((float)var26.field_29735 + 0.01F),
                        (double)((float)var26.field_29736 + 0.5F - var1 / 2.0F),
                        (double)((float)var26.field_29731 + 0.5F + var1 / 2.0F),
                        (double)var26.field_29735 + 0.1,
                        (double)((float)var26.field_29736 + 0.5F + var1 / 2.0F)
                     )
                     .method_18918(-var4, -var6, -var8),
                  0.8F,
                  1.0F,
                  1.0F,
                  0.5F
               );
            }
         }
      }

      if (var3) {
         for (int var19 = 0; var19 < var0.method_18437(); var19++) {
            class_5851 var22 = var0.method_18447(var19);
            if (method_34333(var22.method_26686(), var4, var6, var8) <= 80.0F) {
               class_3372.method_15555(
                  String.format("%s", var22.field_29730),
                  (double)var22.field_29731 + 0.5,
                  (double)var22.field_29735 + 0.75,
                  (double)var22.field_29736 + 0.5,
                  -1,
                  0.02F,
                  true,
                  0.0F,
                  true
               );
               class_3372.method_15555(
                  String.format(Locale.ROOT, "%.2f", var22.field_29729),
                  (double)var22.field_29731 + 0.5,
                  (double)var22.field_29735 + 0.25,
                  (double)var22.field_29736 + 0.5,
                  -1,
                  0.02F,
                  true,
                  0.0F,
                  true
               );
            }
         }
      }
   }

   public static void method_34334(class_3998 var0, double var1, double var3, double var5) {
      class_8042 var9 = class_8042.method_36499();
      class_9633 var10 = var9.method_36501();
      var10.method_44471(3, class_7985.field_40903);

      for (int var11 = 0; var11 < var0.method_18437(); var11++) {
         class_5851 var12 = var0.method_18447(var11);
         if (!(method_34333(var12.method_26686(), var1, var3, var5) > 80.0F)) {
            float var13 = (float)var11 / (float)var0.method_18437() * 0.33F;
            int var14 = var11 != 0 ? class_9299.method_42792(var13, 0.9F, 0.9F) : 0;
            int var15 = var14 >> 16 & 0xFF;
            int var16 = var14 >> 8 & 0xFF;
            int var17 = var14 & 0xFF;
            var10.method_35761((double)var12.field_29731 - var1 + 0.5, (double)var12.field_29735 - var3 + 0.5, (double)var12.field_29736 - var5 + 0.5)
               .method_35743(var15, var16, var17, 255)
               .method_35735();
         }
      }

      var9.method_36500();
   }

   private static float method_34333(BlockPos var0, double var1, double var3, double var5) {
      return (float)(Math.abs((double)var0.method_12173() - var1) + Math.abs((double)var0.method_12165() - var3) + Math.abs((double)var0.method_12185() - var5));
   }
}
