package remapped;

public final class class_9687 {
   private static String[] field_49298;
   public static final double field_49297 = Double.MIN_NORMAL;

   private class_9687() {
   }

   public static int method_44786(int var0, int var1) {
      return (int)((double)var0 - (double)var1 * Math.floor(Math.floor((double)var0) / (double)var1));
   }

   public static double method_44790(double var0) {
      int var4 = (int)var0;
      if (var0 == (double)var4 && var4 % 90 == 0) {
         var4 %= 360;
         if (var4 < 0) {
            var4 += 360;
         }

         switch (var4) {
            case 0:
               return 1.0;
            case 90:
               return 0.0;
            case 180:
               return -1.0;
            case 270:
               return 0.0;
         }
      }

      return Math.cos(Math.toRadians(var0));
   }

   public static double method_44789(double var0) {
      int var4 = (int)var0;
      if (var0 == (double)var4 && var4 % 90 == 0) {
         var4 %= 360;
         if (var4 < 0) {
            var4 += 360;
         }

         switch (var4) {
            case 0:
               return 0.0;
            case 90:
               return 1.0;
            case 180:
               return 0.0;
            case 270:
               return -1.0;
         }
      }

      return Math.cos(Math.toRadians(var0));
   }

   public static double method_44787(double var0, double var2) {
      double var6 = 1.0 / var2;
      return (double)Math.round(var0 * var6) / var6;
   }
}
