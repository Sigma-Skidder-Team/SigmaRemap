package mapped;

public class Class8352 {
   public static void method29264(Class7427 var0, String var1, int var2, int var3) {
      method29269(var0, var1, 1, var2, var3, 0, Color.field16442);
   }

   public static void method29265(Class7427 var0, String var1, int var2, int var3, int var4) {
      method29269(var0, var1, 2, var2, var3, var4, Color.field16442);
   }

   public static void method29266(Class7427 var0, String var1, int var2, int var3, int var4, Color var5) {
      method29269(var0, var1, 2, var2, var3, var4, var5);
   }

   public static void method29267(Class7427 var0, String var1, int var2, int var3, int var4) {
      method29269(var0, var1, 3, var2, var3, var4, Color.field16442);
   }

   public static void method29268(Class7427 var0, String var1, int var2, int var3, int var4, Color var5) {
      method29269(var0, var1, 3, var2, var3, var4, var5);
   }

   public static final int method29269(Class7427 var0, String var1, int var2, int var3, int var4, int var5, Color var6) {
      byte var9 = 0;
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 == 4) {
                  int var10 = var5 - var0.method23942(var1);
                  if (var10 <= 0) {
                     var0.method23937((float)var3, (float)var4, var1, var6);
                  }

                  return method29271(var0, var1, var3, var4, method29270(var0, var1, var10));
               }
            } else {
               var0.method23937((float)(var3 + var5 - var0.method23942(var1)), (float)var4, var1, var6);
            }
         } else {
            var0.method23937((float)(var3 + var5 / 2 - var0.method23942(var1) / 2), (float)var4, var1, var6);
         }
      } else {
         var0.method23937((float)var3, (float)var4, var1, var6);
      }

      return var9;
   }

   private static int method29270(Class7427 var0, String var1, int var2) {
      int var5 = 0;
      int var6 = 0;

      while (var6 < var1.length()) {
         if (var1.charAt(var6++) == ' ') {
            var5++;
         }
      }

      if (var5 > 0) {
         var5 = (var2 + var0.method23942(" ") * var5) / var5;
      }

      return var5;
   }

   private static int method29271(Class7427 var0, String var1, int var2, int var3, int var4) {
      int var7 = 0;
      int var8 = 0;
      int var9 = var2;

      while (var7 < var1.length()) {
         var8 = var1.indexOf(32, var7);
         if (var8 == -1) {
            var8 = var1.length();
         }

         String var10 = var1.substring(var7, var8);
         var0.method23936((float)var9, (float)var3, var10);
         var9 += var0.method23942(var10) + var4;
         var7 = var8 + 1;
      }

      return var9;
   }
}
