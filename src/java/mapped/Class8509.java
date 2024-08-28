package mapped;

public class Class8509 {
   private static String[] field37207;

   public static int method30144(Class1655 var0) {
      return var0 != null ? method30145(var0.method6813()) : 0;
   }

   public static int method30145(Class8705<Class1655> var0) {
      if (var0 != Class1655.field9000) {
         if (var0 != Class1655.field8999) {
            return var0 != Class1655.field9001 ? 0 : 1;
         } else {
            return 0;
         }
      } else {
         return -1;
      }
   }

   public static boolean method30146(Class1655 var0) {
      return var0.method6813() == Class1655.field9000;
   }

   public static boolean method30147(Class1655 var0) {
      Class8705 var3 = var0.method6813();
      return method30145(var3) == 0;
   }

   public static boolean method30148(Class1655 var0) {
      return var0.method6813() == Class1655.field9001;
   }
}
