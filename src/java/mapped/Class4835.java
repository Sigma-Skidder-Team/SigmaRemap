package mapped;

public class Class4835 {
   private static String[] field22612;

   private static double method14955(double var0) {
      var0 %= Math.PI * 2;
      if (Math.abs(var0) > Math.PI) {
         var0 -= Math.PI * 2;
      }

      if (Math.abs(var0) > Math.PI / 2) {
         var0 = Math.PI - var0;
      }

      return var0;
   }

   public static double method14956(double var0) {
      var0 = method14955(var0);
      return !(Math.abs(var0) <= Math.PI / 4) ? Math.cos((Math.PI / 2) - var0) : Math.sin(var0);
   }

   public static double method14957(double var0) {
      return method14956(var0 + (Math.PI / 2));
   }
}
