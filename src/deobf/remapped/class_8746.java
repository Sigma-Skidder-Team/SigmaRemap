package remapped;

public class class_8746 {
   private static String[] field_44774;

   public static float method_40145(float var0, float var1, float var2) {
      float var5 = var1 - var0;

      while (var5 < (float) -Math.PI) {
         var5 += (float) (Math.PI * 2);
      }

      while (var5 >= (float) Math.PI) {
         var5 -= (float) (Math.PI * 2);
      }

      return var0 + var2 * var5;
   }
}
