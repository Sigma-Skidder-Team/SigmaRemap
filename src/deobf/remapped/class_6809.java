package remapped;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;

public class class_6809 {
   private class_266 field_35120;
   private class_2168 field_35121;
   private int field_35119 = 0;
   private int field_35124 = 0;
   private long field_35122 = 0L;

   public class_6809(class_266 var1, class_2168 var2) {
      this.field_35120 = var1;
      this.field_35121 = var2;
   }

   public void method_31255(class_7966 var1, int var2, int var3, List<class_7114> var4) {
      if (Math.abs(var2 - this.field_35119) <= 5 && Math.abs(var3 - this.field_35124) <= 5) {
         short var7 = 700;
         if (System.currentTimeMillis() >= this.field_35122 + (long)var7) {
            class_7114 var8 = class_4232.method_19727(var2, var3, var4);
            if (var8 != null) {
               Rectangle var9 = this.field_35121.method_10076(this.field_35120, var2, var3);
               String[] var10 = this.field_35121.method_10075(var8, var9.width);
               if (var10 != null) {
                  if (var10.length > 8) {
                     var10 = Arrays.<String>copyOf(var10, 8);
                     var10[var10.length - 1] = var10[var10.length - 1] + " ...";
                  }

                  if (this.field_35121.method_10077()) {
                     int var11 = -528449408;
                     this.method_31254(var1, var9.x, var9.y, var9.x + var9.width, var9.y + var9.height, var11);
                  }

                  class_2089.method_9774(var1, var9.x, var9.y, var9.x + var9.width, var9.y + var9.height, -536870912);

                  for (int var15 = 0; var15 < var10.length; var15++) {
                     String var12 = var10[var15];
                     int var13 = 14540253;
                     if (var12.endsWith("!")) {
                        var13 = 16719904;
                     }

                     TextRenderer var14 = MinecraftClient.getInstance().textRenderer;
                     var14.method_45390(var1, var12, (float)(var9.x + 5), (float)(var9.y + 5 + var15 * 11), var13);
                  }
               }
            }
         }
      } else {
         this.field_35119 = var2;
         this.field_35124 = var3;
         this.field_35122 = System.currentTimeMillis();
      }
   }

   private void method_31254(class_7966 var1, int var2, int var3, int var4, int var5, int var6) {
      class_2089.method_9774(var1, var2, var3 - 1, var4, var3, var6);
      class_2089.method_9774(var1, var2, var5, var4, var5 + 1, var6);
      class_2089.method_9774(var1, var2 - 1, var3, var2, var5, var6);
      class_2089.method_9774(var1, var4, var3, var4 + 1, var5, var6);
   }
}
