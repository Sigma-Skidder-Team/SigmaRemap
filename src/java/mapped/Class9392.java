package mapped;

import java.util.ArrayList;

public class Class9392 {
   private static String[] field43584;
   private ArrayList field43585 = new ArrayList();

   public Class9392() {
   }

   public Class9392(ArrayList var1) {
      this.field43585.addAll(var1);
   }

   public int method35653() {
      return this.field43585.size();
   }

   public Class7701 method35654(int var1) {
      return (Class7701)this.field43585.get(var1);
   }

   public void method35655(Class7701 var1) {
      this.field43585.add(var1);
   }

   public Class7701 method35656(float var1, float var2) {
      for (int var5 = 0; var5 < this.field43585.size(); var5++) {
         Class7701 var6 = this.method35654(var5);
         if (var6.method25452(var1, var2)) {
            return var6;
         }
      }

      return null;
   }

   public Class9568 method35657(float var1, float var2, float var3, float var4, boolean var5) {
      Class7701 var8 = this.method35656(var1, var2);
      Class7701 var9 = this.method35656(var3, var4);
      if (var8 != null && var9 != null) {
         for (int var10 = 0; var10 < this.field43585.size(); var10++) {
            ((Class7701)this.field43585.get(var10)).method25454();
         }

         var9.method25453(var8, var3, var4, 0.0F);
         if (var9.method25455() != Float.MAX_VALUE) {
            if (var8.method25455() != Float.MAX_VALUE) {
               Class9568 var11 = new Class9568();
               var11.method37096(new Class7276(var1, var2, null));
               if (!var8.method25456(var9, var11)) {
                  return null;
               } else {
                  var11.method37096(new Class7276(var3, var4, null));
                  if (var5) {
                     this.method35659(var11);
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

   private boolean method35658(float var1, float var2, float var3, float var4, float var5) {
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
         if (this.method35656(var13, var14) == null) {
            return false;
         }
      }

      return true;
   }

   private void method35659(Class9568 var1) {
      int var4 = 0;

      while (var4 < var1.method37097() - 2) {
         float var5 = var1.method37098(var4);
         float var6 = var1.method37099(var4);
         float var7 = var1.method37098(var4 + 2);
         float var8 = var1.method37099(var4 + 2);
         if (!this.method35658(var5, var6, var7, var8, 0.1F)) {
            var4++;
         } else {
            var1.method37100(var4 + 1);
         }
      }
   }
}
