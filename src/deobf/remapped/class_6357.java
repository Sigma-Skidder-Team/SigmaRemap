package remapped;

public class class_6357 {
   private static String[] field_32517;

   public static float method_29129(float var0, float var1, float var2) {
      float var5 = 2.0F + var2 / 4.0F;
      float var6 = MathHelper.clamp(var1 - var0 / var5, var1 * 0.2F, 20.0F);
      return var0 * (1.0F - var6 / 25.0F);
   }

   public static float method_29131(float var0, float var1) {
      float var4 = MathHelper.clamp(var1, 0.0F, 20.0F);
      return var0 * (1.0F - var4 / 25.0F);
   }
}
