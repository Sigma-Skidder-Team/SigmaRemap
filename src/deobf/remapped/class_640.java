package remapped;

public class class_640 {
   private static String[] field_3594;
   private static int[] field_3595 = new int[65536];

   public static void method_2940(int[] var0) {
      field_3595 = var0;
   }

   public static int method_2941(double var0, double var2) {
      var2 *= var0;
      int var6 = (int)((1.0 - var0) * 255.0);
      int var7 = (int)((1.0 - var2) * 255.0);
      int var8 = var7 << 8 | var6;
      return var8 <= field_3595.length ? field_3595[var8] : -65281;
   }
}
