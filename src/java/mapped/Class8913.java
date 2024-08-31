package mapped;

public class Class8913 {
   private static String[] field40346;

   public static float method32581(float var0, float var1, float var2) {
      float var5 = 2.0F + var2 / 4.0F;
      float var6 = MathHelper.clamp(var1 - var0 / var5, var1 * 0.2F, 20.0F);
      return var0 * (1.0F - var6 / 25.0F);
   }

   public static float method32582(float var0, float var1) {
      float var4 = MathHelper.clamp(var1, 0.0F, 20.0F);
      return var0 * (1.0F - var4 / 25.0F);
   }
}
