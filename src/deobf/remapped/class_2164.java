package remapped;

public class class_2164 {
   private static String[] field_10795;

   public static boolean method_10066(class_2522 var0, class_9491[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            class_9491 var5 = var1[var4];
            if (var5.method_43842(var0)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method_10065(int var0, int var1, class_9491[] var2) {
      if (var2 == null) {
         return true;
      } else {
         for (int var5 = 0; var5 < var2.length; var5++) {
            class_9491 var6 = var2[var5];
            if (var6.method_43841(var0, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method_10063(int var0, class_9491[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            class_9491 var5 = var1[var4];
            if (var5.method_43838() == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method_10061(int var0, int[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            if (var1[var4] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method_10060(class_5155 var0, class_5155[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            if (var1[var4] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method_10062(class_6325 var0, class_4859[] var1) {
      if (var1 != null) {
         for (int var4 = 0; var4 < var1.length; var4++) {
            class_4859 var5 = var1[var4];
            if (var5 != null && var5.method_22350() == var0) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
