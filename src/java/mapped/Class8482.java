package mapped;

public class Class8482 {
   private static String[] field36360;

   public static Class6794<Class8848> method29977(Class1655 var0, PlayerEntity var1, Class79 var2) {
      var1.method3154(var2);
      return Class6794.<Class8848>method20697(var1.method3094(var2));
   }

   public static Class8848 method29978(Class8848 var0, PlayerEntity var1, Class8848 var2, boolean var3) {
      boolean var6 = var1.field4919.field29609;
      if (var3 && var6) {
         if (!var1.field4902.method4058(var2)) {
            var1.field4902.method4045(var2);
         }

         return var0;
      } else {
         if (!var6) {
            var0.method32182(1);
         }

         if (!var0.method32105()) {
            if (!var1.field4902.method4045(var2)) {
               var1.method2882(var2, false);
            }

            return var0;
         } else {
            return var2;
         }
      }
   }

   public static Class8848 method29979(Class8848 var0, PlayerEntity var1, Class8848 var2) {
      return method29978(var0, var1, var2, true);
   }
}
