package remapped;

import java.util.ArrayList;

public class class_8209 {
   private static String[] field_41990;
   private ArrayList field_41991 = new ArrayList();

   public class_8209() {
   }

   public class_8209(ArrayList var1) {
      this.field_41991.addAll(var1);
   }

   public int method_37589() {
      return this.field_41991.size();
   }

   public class_2457 method_37588(int var1) {
      return (class_2457)this.field_41991.get(var1);
   }

   public void method_37583(class_2457 var1) {
      this.field_41991.add(var1);
   }

   public class_2457 method_37586(float var1, float var2) {
      for (int var5 = 0; var5 < this.field_41991.size(); var5++) {
         class_2457 var6 = this.method_37588(var5);
         if (var6.method_11319(var1, var2)) {
            return var6;
         }
      }

      return null;
   }

   public class_8866 method_37584(float var1, float var2, float var3, float var4, boolean var5) {
      class_2457 var8 = this.method_37586(var1, var2);
      class_2457 var9 = this.method_37586(var3, var4);
      if (var8 != null && var9 != null) {
         for (int var10 = 0; var10 < this.field_41991.size(); var10++) {
            ((class_2457)this.field_41991.get(var10)).method_11313();
         }

         var9.method_11318(var8, var3, var4, 0.0F);
         if (var9.method_11321() != Float.MAX_VALUE) {
            if (var8.method_11321() != Float.MAX_VALUE) {
               class_8866 var11 = new class_8866();
               var11.method_40791(new class_1642(var1, var2, null));
               if (!var8.method_11317(var9, var11)) {
                  return null;
               } else {
                  var11.method_40791(new class_1642(var3, var4, null));
                  if (var5) {
                     this.method_37590(var11);
                  }

                  return var11;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private boolean method_37585(float var1, float var2, float var3, float var4, float var5) {
      float var8 = var3 - var1;
      float var9 = var4 - var2;
      float var10 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
      var8 *= var5;
      var8 /= var10;
      var9 *= var5;
      var9 /= var10;
      int var11 = (int)(var10 / var5);

      for (int var12 = 0; var12 < var11; var12++) {
         float var13 = var1 + var8 * (float)var12;
         float var14 = var2 + var9 * (float)var12;
         if (this.method_37586(var13, var14) == null) {
            return false;
         }
      }

      return true;
   }

   private void method_37590(class_8866 var1) {
      int var4 = 0;

      while (var4 < var1.method_40793() - 2) {
         float var5 = var1.method_40790(var4);
         float var6 = var1.method_40792(var4);
         float var7 = var1.method_40790(var4 + 2);
         float var8 = var1.method_40792(var4 + 2);
         if (!this.method_37585(var5, var6, var7, var8, 0.1F)) {
            var4++;
         } else {
            var1.method_40789(var4 + 1);
         }
      }
   }
}
