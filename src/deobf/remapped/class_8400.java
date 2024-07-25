package remapped;

public class class_8400 {
   private static String[] field_42978;
   private static int[] field_42979 = new int[65536];

   public static void method_38686(int[] var0) {
      field_42979 = var0;
   }

   public static int method_38683(double var0, double var2) {
      var2 *= var0;
      int var6 = (int)((1.0 - var0) * 255.0);
      int var7 = (int)((1.0 - var2) * 255.0);
      return field_42979[var7 << 8 | var6];
   }

   public static int method_38685() {
      return 6396257;
   }

   public static int method_38687() {
      return 8431445;
   }

   public static int method_38682() {
      return 4764952;
   }
}
