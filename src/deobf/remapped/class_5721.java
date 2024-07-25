package remapped;

import java.util.IdentityHashMap;
import java.util.Map;

public class class_5721 {
   public int field_28906 = 1;
   public boolean field_28904 = false;
   private Map[] field_28905 = new Map[8];

   public class_5721(String var1) {
      if (!var1.equals("4")) {
         if (!var1.equals("2")) {
            if (!var1.equals("F")) {
               if (!var1.equals("4F")) {
                  if (!var1.equals("2F")) {
                     Config.method_14317("NaturalTextures: Unknown type: " + var1);
                  } else {
                     this.field_28906 = 2;
                     this.field_28904 = true;
                  }
               } else {
                  this.field_28906 = 4;
                  this.field_28904 = true;
               }
            } else {
               this.field_28904 = true;
            }
         } else {
            this.field_28906 = 2;
         }
      } else {
         this.field_28906 = 4;
      }
   }

   public boolean method_25879() {
      return this.field_28906 != 2 && this.field_28906 != 4 ? this.field_28904 : true;
   }

   public synchronized class_5024 method_25881(class_5024 var1, int var2, boolean var3) {
      int var6 = var2;
      if (var3) {
         var6 = var2 | 4;
      }

      if (var6 > 0 && var6 < this.field_28905.length) {
         Object var7 = this.field_28905[var6];
         if (var7 == null) {
            var7 = new IdentityHashMap(1);
            this.field_28905[var6] = (Map)var7;
         }

         class_5024 var8 = (class_5024)var7.get(var1);
         if (var8 == null) {
            var8 = this.method_25880(var1, var2, var3);
            var7.put(var1, var8);
         }

         return var8;
      } else {
         return var1;
      }
   }

   private class_5024 method_25880(class_5024 var1, int var2, boolean var3) {
      int[] var6 = var1.method_23155();
      int var7 = var1.method_23160();
      Direction var8 = var1.method_23150();
      class_5155 var9 = var1.method_23148();
      boolean var10 = var1.method_23168();
      if (!this.method_25876(var1)) {
         var2 = 0;
      }

      var6 = this.method_25878(var6, var2, var3);
      return new class_5024(var6, var7, var8, var9, var10);
   }

   private int[] method_25878(int[] var1, int var2, boolean var3) {
      int[] var6 = (int[])var1.clone();
      int var7 = 4 - var2;
      if (var3) {
         var7 += 3;
      }

      var7 %= 4;
      int var8 = var6.length / 4;

      for (int var9 = 0; var9 < 4; var9++) {
         int var10 = var9 * var8;
         int var11 = var7 * var8;
         var6[var11 + 4] = var1[var10 + 4];
         var6[var11 + 4 + 1] = var1[var10 + 4 + 1];
         if (!var3) {
            if (++var7 > 3) {
               var7 = 0;
            }
         } else if (--var7 < 0) {
            var7 = 3;
         }
      }

      return var6;
   }

   private boolean method_25876(class_5024 var1) {
      class_5155 var4 = var1.method_23148();
      float var5 = var4.method_23630();
      float var6 = var4.method_23619();
      float var7 = var6 - var5;
      float var8 = var7 / 256.0F;
      float var9 = var4.method_23642();
      float var10 = var4.method_23640();
      float var11 = var10 - var9;
      float var12 = var11 / 256.0F;
      int[] var13 = var1.method_23155();
      int var14 = var13.length / 4;

      for (int var15 = 0; var15 < 4; var15++) {
         int var16 = var15 * var14;
         float var17 = Float.intBitsToFloat(var13[var16 + 4]);
         float var18 = Float.intBitsToFloat(var13[var16 + 4 + 1]);
         if (!this.method_25882(var17, var5, var8) && !this.method_25882(var17, var6, var8)) {
            return false;
         }

         if (!this.method_25882(var18, var9, var12) && !this.method_25882(var18, var10, var12)) {
            return false;
         }
      }

      return true;
   }

   private boolean method_25882(float var1, float var2, float var3) {
      float var6 = MathHelper.abs(var1 - var2);
      return var6 < var3;
   }
}
