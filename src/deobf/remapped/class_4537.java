package remapped;

import java.util.Map;
import java.util.Map.Entry;

public class class_4537 implements class_2995 {
   private final MinecraftClient field_22142;
   private double field_22138 = Double.MIN_VALUE;
   private final int field_22141 = 12;
   private class_4812 field_22140;

   public class_4537(MinecraftClient var1) {
      this.field_22142 = var1;
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      double var11 = (double)class_9665.method_44657();
      if (var11 - this.field_22138 > 3.0E9) {
         this.field_22138 = var11;
         class_7762 var13 = this.field_22142.method_8515();
         if (var13 == null) {
            this.field_22140 = null;
         } else {
            this.field_22140 = new class_4812(this, var13, var3, var7, null);
         }
      }

      if (this.field_22140 != null) {
         class_3542.method_16488();
         class_3542.method_16437();
         class_3542.method_16484(2.0F);
         class_3542.method_16354();
         class_3542.method_16387(false);
         Map var26 = (Map)class_4812.method_22182(this.field_22140).getNow((Map)null);
         double var14 = this.field_22142.field_9590.method_35949().method_41627().field_7333 * 0.85;

         for (Entry var17 : class_4812.method_22183(this.field_22140).entrySet()) {
            class_2034 var18 = (class_2034)var17.getKey();
            String var19 = (String)var17.getValue();
            if (var26 != null) {
               var19 = var19 + (String)var26.get(var18);
            }

            String[] var20 = var19.split("\n");
            byte var21 = 0;

            for (String var25 : var20) {
               class_3372.method_15554(var25, (double)((var18.field_10328 << 4) + 8), var14 + (double)var21, (double)((var18.field_10327 << 4) + 8), -1, 0.15F);
               var21 -= 2;
            }
         }

         class_3542.method_16387(true);
         class_3542.method_16432();
         class_3542.method_16448();
      }
   }
}
