package remapped;

public class class_2148 {
   private static String[] field_10748;

   public static int method_10029(class_7114 var0) {
      return class_2180.method_10122(var0);
   }

   public static int method_10030(class_7114 var0) {
      return class_2180.method_10121(var0);
   }

   public static void method_10032(class_8107 var0, class_2513[] var1, int var2) {
      float var5 = (float)(var2 >> 24 & 0xFF) / 255.0F;
      float var6 = (float)(var2 >> 16 & 0xFF) / 255.0F;
      float var7 = (float)(var2 >> 8 & 0xFF) / 255.0F;
      float var8 = (float)(var2 & 0xFF) / 255.0F;
      class_9633 var9 = class_8042.method_36499().method_36501();
      RenderSystem.enableBlend();
      RenderSystem.method_16354();
      RenderSystem.defaultBlendFunc();
      var9.method_44471(7, class_7985.field_40903);

      for (int var10 = 0; var10 < var1.length; var10++) {
         class_2513 var11 = var1[var10];
         if (var11 != null) {
            int var12 = var11.method_11443();
            int var13 = var11.method_11441();
            int var14 = var11.method_11442();
            int var15 = var11.method_11445();
            if (var12 < var14) {
               int var16 = var12;
               var12 = var14;
               var14 = var16;
            }

            if (var13 < var15) {
               int var17 = var13;
               var13 = var15;
               var15 = var17;
            }

            var9.method_35762(var0, (float)var12, (float)var15, 0.0F).method_35742(var6, var7, var8, var5).method_35735();
            var9.method_35762(var0, (float)var14, (float)var15, 0.0F).method_35742(var6, var7, var8, var5).method_35735();
            var9.method_35762(var0, (float)var14, (float)var13, 0.0F).method_35742(var6, var7, var8, var5).method_35735();
            var9.method_35762(var0, (float)var12, (float)var13, 0.0F).method_35742(var6, var7, var8, var5).method_35735();
         }
      }

      var9.method_44487();
      class_138.method_554(var9);
      RenderSystem.method_16432();
      RenderSystem.disableBlend();
   }
}
