package remapped;

public class class_5129 {
   private static String[] field_26461;

   public static int method_23521(int var0, float var1) {
      return 31 * method_23520(var0) + method_23518(var1);
   }

   public static int method_23519(float var0, float var1) {
      return 31 * method_23518(var0) + method_23518(var1);
   }

   public static int method_23527(boolean var0, boolean var1) {
      return 31 * method_23526(var0) + method_23526(var1);
   }

   public static int method_23522(int var0, Object var1) {
      return 31 * method_23520(var0) + method_23523(var1);
   }

   public static int method_23525(Object var0, boolean var1) {
      return 31 * method_23523(var0) + method_23526(var1);
   }

   public static int method_23524(Object var0, Object var1) {
      return 31 * method_23523(var0) + method_23523(var1);
   }

   public static int method_23520(int var0) {
      return var0;
   }

   public static int method_23518(float var0) {
      return Float.hashCode(var0);
   }

   public static int method_23526(boolean var0) {
      return Boolean.hashCode(var0);
   }

   public static int method_23523(Object var0) {
      return var0 != null ? var0.hashCode() : 0;
   }
}
