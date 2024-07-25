package remapped;

public class class_109 {
   private static String[] field_276;

   public static final float method_336(class_2522 var0, class_5561 var1, class_1331 var2) {
      float var5 = var0.method_8315(var1, var2);
      return class_2174.method_10108(var5);
   }

   public static final int method_335(class_2522 var0, class_5561 var1, class_1331 var2) {
      if (!(var1 instanceof class_1680)) {
         return WorldRenderer.method_20052(var1, var0, var2);
      } else {
         class_1680 var5 = (class_1680)var1;
         int[] var6 = var5.method_7521();
         int var7 = var5.method_7523(var2);
         if (var7 >= 0 && var7 < var6.length && var6 != null) {
            int var8 = var6[var7];
            if (var8 == -1) {
               var8 = WorldRenderer.method_20052(var1, var0, var2);
               var6[var7] = var8;
            }

            return var8;
         } else {
            return WorldRenderer.method_20052(var1, var0, var2);
         }
      }
   }
}
