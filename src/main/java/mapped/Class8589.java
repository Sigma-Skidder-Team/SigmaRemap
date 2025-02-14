package mapped;

public class Class8589 {
   private static String[] field38669;

   public static int method30726(int var0, float var1) {
      return 31 * method30732(var0) + method30733(var1);
   }

   public static int method30727(float var0, float var1) {
      return 31 * method30733(var0) + method30733(var1);
   }

   public static int method30728(boolean var0, boolean var1) {
      return 31 * method30734(var0) + method30734(var1);
   }

   public static int method30729(int var0, Object var1) {
      return 31 * method30732(var0) + method30735(var1);
   }

   public static int method30730(Object var0, boolean var1) {
      return 31 * method30735(var0) + method30734(var1);
   }

   public static int method30731(Object var0, Object var1) {
      return 31 * method30735(var0) + method30735(var1);
   }

   public static int method30732(int var0) {
      return var0;
   }

   public static int method30733(float var0) {
      return Float.hashCode(var0);
   }

   public static int method30734(boolean var0) {
      return Boolean.hashCode(var0);
   }

   public static int method30735(Object var0) {
      return var0 != null ? var0.hashCode() : 0;
   }
}
