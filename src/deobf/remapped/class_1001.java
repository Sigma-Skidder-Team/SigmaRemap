package remapped;

public class class_1001 {
   private static String[] field_5166;

   public static class_6843 method_4342(String var0, class_6843[] var1) {
      if (var1 == null) {
         return null;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            class_6843 var5 = var1[var4];
            if (var5.method_31405().equals(var0)) {
               return var5;
            }
         }

         return null;
      }
   }

   public static class_8471 method_4339(class_8471[] var0, class_6843[] var1, boolean var2) {
      if (var0 == null) {
         return null;
      } else {
         for (int var5 = 0; var5 < var0.length; var5++) {
            class_8471 var6 = var0[var5];
            if (method_4340(var6, var1, var2)) {
               return var6;
            }
         }

         return null;
      }
   }

   public static boolean method_4340(class_8471 var0, class_6843[] var1, boolean var2) {
      if (var0 != null) {
         if (var1 != null) {
            String[] var5 = var0.method_38987();

            for (int var6 = 0; var6 < var5.length; var6++) {
               String var7 = var5[var6];
               class_6843 var8 = method_4342(var7, var1);
               if (var8 != null) {
                  String var9 = !var2 ? var8.method_31403() : var8.method_31382();
                  String var10 = var0.method_38983(var7);
                  if (!class_3111.equals(var9, var10)) {
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
