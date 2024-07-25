package remapped;

import java.util.Properties;

public class class_1433 {
   private Identifier field_7736;
   private int field_7739 = 0;
   private int field_7735 = 2;
   private boolean field_7742;
   private static final int field_7738 = 2;
   private static final int field_7737 = 0;
   private static final int field_7743 = 1;
   private static final int field_7740 = 2;

   public class_1433(Identifier var1, int var2, int var3, boolean var4) {
      this.field_7736 = var1;
      this.field_7739 = var2;
      this.field_7735 = var3;
      this.field_7742 = var4;
   }

   public static class_1433 method_6578(String var0, int var1, Properties var2) {
      Identifier var5 = new Identifier(var0);
      int var6 = method_6583(method_6580("scaleMode", var1, var2));
      int var7 = var6 != 0 ? 1 : 2;
      int var8 = method_6582(method_6580("scale", var1, var2), var7);
      boolean var9 = class_3111.method_14257(method_6580("center", var1, var2), false);
      return new class_1433(var5, var6, var8, var9);
   }

   private static String method_6580(String var0, int var1, Properties var2) {
      if (var2 != null) {
         String var5 = var2.getProperty("dim" + var1 + "." + var0);
         return var5 == null ? var2.getProperty(var0) : var5;
      } else {
         return null;
      }
   }

   private static int method_6583(String var0) {
      if (var0 != null) {
         var0 = var0.toLowerCase().trim();
         if (!var0.equals("fixed")) {
            if (!var0.equals("full")) {
               if (!var0.equals("stretch")) {
                  class_5609.method_25465("Invalid scale mode: " + var0);
                  return 0;
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private static int method_6582(String var0, int var1) {
      if (var0 != null) {
         var0 = var0.trim();
         int var4 = class_3111.method_14361(var0, -1);
         if (var4 >= 1) {
            return var4;
         } else {
            class_5609.method_25465("Invalid scale: " + var0);
            return var1;
         }
      } else {
         return var1;
      }
   }

   public void method_6579(int var1, int var2) {
      class_1920.method_8912();
      class_1920.method_8804();
      class_8042 var5 = class_8042.method_36499();
      class_9633 var6 = var5.method_36501();
      class_3111.method_14266().method_35674(this.field_7736);
      class_1920.method_8789(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = (float)(16 * this.field_7735);
      float var8 = (float)var1 / var7;
      float var9 = (float)var2 / var7;
      float var10 = 0.0F;
      float var11 = 0.0F;
      if (this.field_7742) {
         var10 = (var7 - (float)var1) / (var7 * 2.0F);
         var11 = (var7 - (float)var2) / (var7 * 2.0F);
      }

      switch (this.field_7739) {
         case 1:
            var7 = (float)Math.max(var1, var2);
            var8 = (float)(this.field_7735 * var1) / var7;
            var9 = (float)(this.field_7735 * var2) / var7;
            if (this.field_7742) {
               var10 = (float)this.field_7735 * (var7 - (float)var1) / (var7 * 2.0F);
               var11 = (float)this.field_7735 * (var7 - (float)var2) / (var7 * 2.0F);
            }
            break;
         case 2:
            var8 = (float)this.field_7735;
            var9 = (float)this.field_7735;
            var10 = 0.0F;
            var11 = 0.0F;
      }

      var6.method_44471(7, class_7985.field_40905);
      var6.method_35761(0.0, (double)var2, 0.0).method_35745(var10, var11 + var9).method_35743(255, 255, 255, 255).method_35735();
      var6.method_35761((double)var1, (double)var2, 0.0).method_35745(var10 + var8, var11 + var9).method_35743(255, 255, 255, 255).method_35735();
      var6.method_35761((double)var1, 0.0, 0.0).method_35745(var10 + var8, var11).method_35743(255, 255, 255, 255).method_35735();
      var6.method_35761(0.0, 0.0, 0.0).method_35745(var10, var11).method_35743(255, 255, 255, 255).method_35735();
      var5.method_36500();
   }
}
