package remapped;

public class class_9556 {
   private static String[] field_48609;

   public static float method_44078(float var0, float var1, float var2, float var3) {
      float var6 = 1.70158F;
      float var7;
      return var2 * (var7 = var0 / var3) * var7 * ((var6 + 1.0F) * var7 - var6) + var1;
   }

   public static float method_44079(float var0, float var1, float var2, float var3, float var4) {
      float var6;
      return var2 * (var6 = var0 / var3) * var6 * ((var4 + 1.0F) * var6 - var4) + var1;
   }

   public static float method_44073(float var0, float var1, float var2, float var3) {
      float var6 = 1.70158F;
      float var7;
      return var2 * ((var7 = var0 / var3 - 1.0F) * var7 * ((var6 + 1.0F) * var7 + var6) + 1.0F) + var1;
   }

   public static float method_44074(float var0, float var1, float var2, float var3, float var4) {
      float var6;
      return var2 * ((var6 = var0 / var3 - 1.0F) * var6 * ((var4 + 1.0F) * var6 + var4) + 1.0F) + var1;
   }

   public static float method_44076(float var0, float var1, float var2, float var3) {
      float var6 = 1.70158F;
      float var7;
      float var8;
      float var9;
      float var10;
      return !((var7 = var0 / (var3 / 2.0F)) < 1.0F)
         ? var2 / 2.0F * ((var8 = var7 - 2.0F) * var8 * (((var9 = var6 * 1.525F) + 1.0F) * var8 + var9) + 2.0F) + var1
         : var2 / 2.0F * var7 * var7 * (((var10 = var6 * 1.525F) + 1.0F) * var7 - var10) + var1;
   }

   public static float method_44077(float var0, float var1, float var2, float var3, float var4) {
      float var6;
      float var7;
      float var8;
      float var9;
      return !((var6 = var0 / (var3 / 2.0F)) < 1.0F)
         ? var2 / 2.0F * ((var7 = var6 - 2.0F) * var7 * (((var8 = var4 * 1.525F) + 1.0F) * var7 + var8) + 2.0F) + var1
         : var2 / 2.0F * var6 * var6 * (((var9 = var4 * 1.525F) + 1.0F) * var6 - var9) + var1;
   }
}
