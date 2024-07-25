package remapped;

import org.lwjgl.opengl.GL11;

public class class_5099 {
   private static MinecraftClient field_26314;
   private static GameOptions field_26299;
   private static class_3492 field_26295;
   public static boolean field_26310 = false;
   public static class_5334 field_26306 = new class_5334();
   public static class_5334 field_26313 = new class_5334();
   public static class_5334 field_26308 = new class_5334();
   public static class_5334 field_26292 = new class_5334();
   public static class_5334 field_26297 = new class_5334();
   public static class_5334 field_26298 = new class_5334();
   public static class_5334 field_26293 = new class_5334();
   private static long[] field_26312 = new long[512];
   private static long[] field_26302 = new long[512];
   private static long[] field_26301 = new long[512];
   private static long[] field_26300 = new long[512];
   private static long[] field_26291 = new long[512];
   private static long[] field_26307 = new long[512];
   private static long[] field_26311 = new long[512];
   private static long[] field_26304 = new long[512];
   private static boolean[] field_26305 = new boolean[512];
   private static int field_26296 = 0;
   private static long field_26303 = -1L;
   private static long field_26309 = 0L;

   public static void method_23416() {
      if (field_26314 == null) {
         field_26314 = MinecraftClient.getInstance();
         field_26299 = field_26314.gameOptions;
         field_26295 = field_26314.method_8562();
      }

      if (field_26299.field_45470 && (field_26299.field_45509 || field_26299.field_45549)) {
         field_26310 = true;
         long var2 = System.nanoTime();
         if (field_26303 != -1L) {
            int var4 = field_26296 & field_26312.length - 1;
            field_26296++;
            boolean var5 = class_5849.method_26671();
            field_26312[var4] = var2 - field_26303 - field_26309;
            field_26302[var4] = field_26306.field_27215;
            field_26301[var4] = field_26313.field_27215;
            field_26300[var4] = field_26308.field_27215;
            field_26291[var4] = field_26292.field_27215;
            field_26307[var4] = field_26297.field_27215;
            field_26311[var4] = field_26298.field_27215;
            field_26304[var4] = field_26293.field_27215;
            field_26305[var4] = var5;
            class_5334.method_24317(field_26306);
            class_5334.method_24317(field_26313);
            class_5334.method_24317(field_26297);
            class_5334.method_24317(field_26292);
            class_5334.method_24317(field_26308);
            class_5334.method_24317(field_26298);
            class_5334.method_24317(field_26293);
            field_26303 = System.nanoTime();
         } else {
            field_26303 = var2;
         }
      } else {
         field_26310 = false;
         field_26303 = -1L;
      }
   }

   public static void method_23420(class_7966 var0, int var1) {
      if (field_26299 != null && (field_26299.field_45509 || field_26299.field_45549)) {
         long var4 = System.nanoTime();
         GlStateManager.method_8793(256);
         GlStateManager.method_8842(5889);
         GlStateManager.method_8757();
         int var6 = field_26314.getMainWindow().method_43178();
         int var7 = field_26314.getMainWindow().method_43198();
         GlStateManager.method_8819();
         GlStateManager.method_8865();
         GlStateManager.method_8781(0.0, (double)var6, (double)var7, 0.0, 1000.0, 3000.0);
         GlStateManager.method_8842(5888);
         GlStateManager.method_8757();
         GlStateManager.method_8865();
         GlStateManager.method_8897(0.0F, 0.0F, -2000.0F);
         GL11.glLineWidth(1.0F);
         GlStateManager.method_8848();
         class_8042 var8 = class_8042.method_36499();
         class_9633 var9 = var8.method_36501();
         var9.method_44471(1, class_7985.field_40903);

         for (int var10 = 0; var10 < field_26312.length; var10++) {
            int var11 = (var10 - field_26296 & field_26312.length - 1) * 100 / field_26312.length;
            var11 += 155;
            float var12 = (float)var7;
            long var20 = 0L;
            if (!field_26305[var10]) {
               method_23417(var10, field_26312[var10], var11, var11, var11, var12, var9);
               var12 -= (float)method_23417(var10, field_26304[var10], var11 / 2, var11 / 2, var11 / 2, var12, var9);
               var12 -= (float)method_23417(var10, field_26311[var10], 0, var11, 0, var12, var9);
               var12 -= (float)method_23417(var10, field_26307[var10], var11, var11, 0, var12, var9);
               var12 -= (float)method_23417(var10, field_26291[var10], var11, 0, 0, var12, var9);
               var12 -= (float)method_23417(var10, field_26300[var10], var11, 0, var11, var12, var9);
               var12 -= (float)method_23417(var10, field_26301[var10], 0, 0, var11, var12, var9);
               float var15 = var12 - (float)method_23417(var10, field_26302[var10], 0, var11, var11, var12, var9);
            } else {
               method_23417(var10, field_26312[var10], var11, var11 / 2, 0, var12, var9);
            }
         }

         method_23415(0, field_26312.length, 33333333L, 196, 196, 196, (float)var7, var9);
         method_23415(0, field_26312.length, 16666666L, 196, 196, 196, (float)var7, var9);
         var8.method_36500();
         GlStateManager.method_8843();
         int var22 = var7 - 80;
         int var24 = var7 - 160;
         field_26314.textRenderer.method_45385(var0, "30", 2.0F, (float)(var24 + 1), -8947849);
         field_26314.textRenderer.method_45385(var0, "30", 1.0F, (float)var24, -3881788);
         field_26314.textRenderer.method_45385(var0, "60", 2.0F, (float)(var22 + 1), -8947849);
         field_26314.textRenderer.method_45385(var0, "60", 1.0F, (float)var22, -3881788);
         GlStateManager.method_8842(5889);
         GlStateManager.method_8761();
         GlStateManager.method_8842(5888);
         GlStateManager.method_8761();
         GlStateManager.method_8843();
         float var31 = 1.0F - (float)((double)(System.currentTimeMillis() - class_5849.method_26668()) / 1000.0);
         var31 = Config.method_14262(var31, 0.0F, 1.0F);
         int var13 = (int)(170.0F + var31 * 85.0F);
         int var14 = (int)(100.0F + var31 * 55.0F);
         int var33 = (int)(10.0F + var31 * 10.0F);
         int var16 = var13 << 16 | var14 << 8 | var33;
         int var17 = 512 / var1 + 2;
         int var18 = var7 / var1 - 8;
         IngameGUI var19 = field_26314.field_9614;
         IngameGUI.method_9774(var0, var17 - 1, var18 - 1, var17 + 50, var18 + 10, -1605349296);
         field_26314.textRenderer.method_45385(var0, " " + class_5849.method_26673() + " MB/s", (float)var17, (float)var18, var16);
         field_26309 = System.nanoTime() - var4;
      }
   }

   private static long method_23417(int var0, long var1, int var3, int var4, int var5, float var6, class_9633 var7) {
      long var10 = var1 / 200000L;
      if (var10 >= 3L) {
         var7.method_35761((double)((float)var0 + 0.5F), (double)(var6 - (float)var10 + 0.5F), 0.0).method_35743(var3, var4, var5, 255).method_35735();
         var7.method_35761((double)((float)var0 + 0.5F), (double)(var6 + 0.5F), 0.0).method_35743(var3, var4, var5, 255).method_35735();
         return var10;
      } else {
         return 0L;
      }
   }

   private static long method_23415(int var0, int var1, long var2, int var4, int var5, int var6, float var7, class_9633 var8) {
      long var11 = var2 / 200000L;
      if (var11 >= 3L) {
         var8.method_35761((double)((float)var0 + 0.5F), (double)(var7 - (float)var11 + 0.5F), 0.0).method_35743(var4, var5, var6, 255).method_35735();
         var8.method_35761((double)((float)var1 + 0.5F), (double)(var7 - (float)var11 + 0.5F), 0.0).method_35743(var4, var5, var6, 255).method_35735();
         return var11;
      } else {
         return 0L;
      }
   }

   public static boolean method_23418() {
      return field_26310;
   }
}
