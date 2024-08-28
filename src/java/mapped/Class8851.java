package mapped;

public class Class8851 {
   private static String[] field39986;
   private float field39987;
   private float field39988;
   private float field39989;
   private long field39990;

   public Class8851(float var1, float var2) {
      this(var1, var2, var2);
   }

   public Class8851(float var1, float var2, float var3) {
      this.field39987 = var1;
      this.field39988 = var2;
      this.field39989 = var3;
      this.field39990 = System.currentTimeMillis();
   }

   public float method32197() {
      return this.field39987;
   }

   public float method32198() {
      return this.field39988;
   }

   public float method32199() {
      return this.field39989;
   }

   public long method32200() {
      return this.field39990;
   }

   public float method32201(float var1, float var2, float var3) {
      this.field39988 = var2;
      this.field39989 = var3;
      return this.method32202(var1);
   }

   public float method32202(float var1) {
      long var4 = System.currentTimeMillis();
      float var6 = this.field39987;
      long var7 = this.field39990;
      float var9 = (float)(var4 - var7) / 1000.0F;
      float var10 = !(var1 >= var6) ? this.field39989 : this.field39988;
      float var11 = method32203(var6, var1, var9, var10);
      this.field39987 = var11;
      this.field39990 = var4;
      return var11;
   }

   public static float method32203(float var0, float var1, float var2, float var3) {
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
            var13 = Class9395.method35675(var13, 0.0F, 1.0F);
            var7 = var0 + var6 * var13;
         } else {
            var7 = var1;
         }

         return var7;
      }
   }
}
