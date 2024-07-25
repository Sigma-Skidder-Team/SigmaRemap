package remapped;

public class class_4335 {
   public static void method_20167(class_4027 var0, String var1, int var2, int var3) {
      method_20164(var0, var1, 1, var2, var3, 0, class_8709.field_44646);
   }

   public static void method_20165(class_4027 var0, String var1, int var2, int var3, int var4) {
      method_20164(var0, var1, 2, var2, var3, var4, class_8709.field_44646);
   }

   public static void method_20166(class_4027 var0, String var1, int var2, int var3, int var4, class_8709 var5) {
      method_20164(var0, var1, 2, var2, var3, var4, var5);
   }

   public static void method_20162(class_4027 var0, String var1, int var2, int var3, int var4) {
      method_20164(var0, var1, 3, var2, var3, var4, class_8709.field_44646);
   }

   public static void method_20163(class_4027 var0, String var1, int var2, int var3, int var4, class_8709 var5) {
      method_20164(var0, var1, 3, var2, var3, var4, var5);
   }

   public static final int method_20164(class_4027 var0, String var1, int var2, int var3, int var4, int var5, class_8709 var6) {
      byte var9 = 0;
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 == 4) {
                  int var10 = var5 - var0.method_18547(var1);
                  if (var10 <= 0) {
                     var0.method_18545((float)var3, (float)var4, var1, var6);
                  }

                  return method_20169(var0, var1, var3, var4, method_20168(var0, var1, var10));
               }
            } else {
               var0.method_18545((float)(var3 + var5 - var0.method_18547(var1)), (float)var4, var1, var6);
            }
         } else {
            var0.method_18545((float)(var3 + var5 / 2 - var0.method_18547(var1) / 2), (float)var4, var1, var6);
         }
      } else {
         var0.method_18545((float)var3, (float)var4, var1, var6);
      }

      return var9;
   }

   private static int method_20168(class_4027 var0, String var1, int var2) {
      int var5 = 0;
      int var6 = 0;

      while (var6 < var1.length()) {
         if (var1.charAt(var6++) == ' ') {
            var5++;
         }
      }

      if (var5 > 0) {
         var5 = (var2 + var0.method_18547(" ") * var5) / var5;
      }

      return var5;
   }

   private static int method_20169(class_4027 var0, String var1, int var2, int var3, int var4) {
      int var7 = 0;
      int var8 = 0;
      int var9 = var2;

      while (var7 < var1.length()) {
         var8 = var1.indexOf(32, var7);
         if (var8 == -1) {
            var8 = var1.length();
         }

         String var10 = var1.substring(var7, var8);
         var0.method_18544((float)var9, (float)var3, var10);
         var9 += var0.method_18547(var10) + var4;
         var7 = var8 + 1;
      }

      return var9;
   }
}
