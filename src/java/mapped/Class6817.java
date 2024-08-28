package mapped;

public class Class6817 {
   private static String[] field29682;

   public static Class6679 method20782(String var0, Class6679[] var1) {
      if (var1 == null) {
         return null;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            Class6679 var5 = var1[var4];
            if (var5.method20366().equals(var0)) {
               return var5;
            }
         }

         return null;
      }
   }

   public static Class9458 method20783(Class9458[] var0, Class6679[] var1, boolean var2) {
      if (var0 == null) {
         return null;
      } else {
         for (int var5 = 0; var5 < var0.length; var5++) {
            Class9458 var6 = var0[var5];
            if (method20784(var6, var1, var2)) {
               return var6;
            }
         }

         return null;
      }
   }

   public static boolean method20784(Class9458 var0, Class6679[] var1, boolean var2) {
      if (var0 != null) {
         if (var1 != null) {
            String[] var5 = var0.method36404();

            for (int var6 = 0; var6 < var5.length; var6++) {
               String var7 = var5[var6];
               Class6679 var8 = method20782(var7, var1);
               if (var8 != null) {
                  String var9 = !var2 ? var8.method20370() : var8.method20372();
                  String var10 = var0.method36405(var7);
                  if (!Class7944.equals(var9, var10)) {
                     return false;
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
