package mapped;

public final class Class7182 {
   public static String method22535(Class2023 var0, float var1) {
      if (!var0.method8642()) {
         int var4 = Class9679.method37767((float)var0.method8628() * var1);
         return Class9001.method33254(var4);
      } else {
         return "**:**";
      }
   }

   public static boolean method22536(Class880 var0) {
      return var0.method3033(Class8254.field35469) || var0.method3033(Class8254.field35495);
   }

   public static int method22537(Class880 var0) {
      int var3 = 0;
      int var4 = 0;
      if (var0.method3033(Class8254.field35469)) {
         var3 = var0.method3034(Class8254.field35469).method8629();
      }

      if (var0.method3033(Class8254.field35495)) {
         var4 = var0.method3034(Class8254.field35495).method8629();
      }

      return Math.max(var3, var4);
   }

   public static boolean method22538(Class880 var0) {
      return var0.method3033(Class8254.field35479) || var0.method3033(Class8254.field35495);
   }
}
