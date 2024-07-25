package remapped;

public class class_6117 {
   private static String[] field_31270;
   private float field_31272;
   private float field_31274;
   private float field_31271;
   private long field_31273;

   public class_6117(float var1, float var2) {
      this(var1, var2, var2);
   }

   public class_6117(float var1, float var2, float var3) {
      this.field_31272 = var1;
      this.field_31274 = var2;
      this.field_31271 = var3;
      this.field_31273 = System.currentTimeMillis();
   }

   public float method_28100() {
      return this.field_31272;
   }

   public float method_28102() {
      return this.field_31274;
   }

   public float method_28099() {
      return this.field_31271;
   }

   public long method_28103() {
      return this.field_31273;
   }

   public float method_28097(float var1, float var2, float var3) {
      this.field_31274 = var2;
      this.field_31271 = var3;
      return this.method_28096(var1);
   }

   public float method_28096(float var1) {
      long var4 = System.currentTimeMillis();
      float var6 = this.field_31272;
      long var7 = this.field_31273;
      float var9 = (float)(var4 - var7) / 1000.0F;
      float var10 = !(var1 >= var6) ? this.field_31271 : this.field_31274;
      float var11 = method_28098(var6, var1, var9, var10);
      this.field_31272 = var11;
      this.field_31273 = var4;
      return var11;
   }

   public static float method_28098(float var0, float var1, float var2, float var3) {
      if (var2 <= 0.0F) {
         return var0;
      } else {
         float var6 = var1 - var0;
         float var7;
         if (var3 > 0.0F && var2 < var3 && Math.abs(var6) > 1.0E-6F) {
            float var8 = var3 / var2;
            float var9 = 4.61F;
            float var10 = 0.13F;
            float var11 = 10.0F;
            float var12 = var9 - 1.0F / (var10 + var8 / var11);
            float var13 = var2 / var3 * var12;
            var13 = class_8231.method_37704(var13, 0.0F, 1.0F);
            var7 = var0 + var6 * var13;
         } else {
            var7 = var1;
         }

         return var7;
      }
   }
}
