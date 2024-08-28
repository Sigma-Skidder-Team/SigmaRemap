package mapped;

public class Class4584 extends Class4583 {
   private static String[] field22032;

   public Class4584(Class1656 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }

   @Override
   public void method14511(double var1, double var3, double var5) {
      this.method14524(this.method14523().method19667(var1, var3, var5));
      this.method14521();
   }

   @Override
   public float method14509(float var1) {
      float var4 = ((float)this.field22055 + var1) / (float)this.field22056;
      return this.field22035 * (1.0F - var4 * var4 * 0.5F);
   }

   @Override
   public int method14499(float var1) {
      float var4 = ((float)this.field22055 + var1) / (float)this.field22056;
      var4 = Class9679.method37777(var4, 0.0F, 1.0F);
      int var5 = super.method14499(var1);
      int var6 = var5 & 0xFF;
      int var7 = var5 >> 16 & 0xFF;
      var6 += (int)(var4 * 15.0F * 16.0F);
      if (var6 > 240) {
         var6 = 240;
      }

      return var6 | var7 << 16;
   }
}
