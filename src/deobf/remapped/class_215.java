package remapped;

public class class_215 {
   private static String[] field_714;

   private static double method_934(double var0) {
      var0 %= Math.PI * 2;
      if (Math.abs(var0) > Math.PI) {
         var0 -= Math.PI * 2;
      }

      if (Math.abs(var0) > Math.PI / 2) {
         var0 = Math.PI - var0;
      }

      return var0;
   }

   public static double method_932(double var0) {
      var0 = method_934(var0);
      return !(Math.abs(var0) <= Math.PI / 4) ? Math.cos((Math.PI / 2) - var0) : Math.sin(var0);
   }

   public static double method_933(double var0) {
      return method_932(var0 + (Math.PI / 2));
   }
}
