package mapped;

public class Class6831 extends Class6829 {
   private static String[] field29706;
   private float field29716;
   public final Class1110 field29717;

   public Class6831(Class1110 var1, Class1006 var2) {
      super(var2);
      this.field29717 = var1;
      this.field29716 = 0.1F;
   }

   @Override
   public void method20810() {
      if (this.field29717.field5037) {
         this.field29717.field5031 += 180.0F;
         this.field29716 = 0.1F;
      }

      float var3 = (float)(Class1110.method5339(this.field29717).field18048 - this.field29717.getPosX());
      float var4 = (float)(Class1110.method5339(this.field29717).field18049 - this.field29717.getPosY());
      float var5 = (float)(Class1110.method5339(this.field29717).field18050 - this.field29717.getPosZ());
      double var6 = (double) MathHelper.method37765(var3 * var3 + var5 * var5);
      double var8 = 1.0 - (double) MathHelper.method37771(var4 * 0.7F) / var6;
      var3 = (float)((double)var3 * var8);
      var5 = (float)((double)var5 * var8);
      var6 = (double) MathHelper.method37765(var3 * var3 + var5 * var5);
      double var10 = (double) MathHelper.method37765(var3 * var3 + var5 * var5 + var4 * var4);
      float var12 = this.field29717.field5031;
      float var13 = (float) MathHelper.method37814((double)var5, (double)var3);
      float var14 = MathHelper.method37792(this.field29717.field5031 + 90.0F);
      float var15 = MathHelper.method37792(var13 * (180.0F / (float)Math.PI));
      this.field29717.field5031 = MathHelper.method37798(var14, var15, 4.0F) - 90.0F;
      this.field29717.field4965 = this.field29717.field5031;
      if (!(MathHelper.method37795(var12, this.field29717.field5031) < 3.0F)) {
         this.field29716 = MathHelper.method37797(this.field29716, 0.2F, 0.025F);
      } else {
         this.field29716 = MathHelper.method37797(this.field29716, 1.8F, 0.005F * (1.8F / this.field29716));
      }

      float var16 = (float)(-(MathHelper.method37814((double)(-var4), var6) * 180.0F / (float)Math.PI));
      this.field29717.field5032 = var16;
      float var17 = this.field29717.field5031 + 90.0F;
      double var18 = (double)(this.field29716 * MathHelper.cos(var17 * (float) (Math.PI / 180.0))) * Math.abs((double)var3 / var10);
      double var20 = (double)(this.field29716 * MathHelper.sin(var17 * (float) (Math.PI / 180.0))) * Math.abs((double)var5 / var10);
      double var22 = (double)(this.field29716 * MathHelper.sin(var16 * (float) (Math.PI / 180.0))) * Math.abs((double)var4 / var10);
      Vector3d var24 = this.field29717.method3433();
      this.field29717.method3434(var24.method11338(new Vector3d(var18, var22, var20).method11336(var24).method11344(0.2)));
   }
}
