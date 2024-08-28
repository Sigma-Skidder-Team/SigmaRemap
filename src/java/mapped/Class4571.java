package mapped;

public class Class4571 extends Class4566 {
   private static String[] field22009;

   public Class4571(Class1656 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var16 = this.field22054.nextFloat() * 0.1F + 0.2F;
      this.field22058 = var16;
      this.field22059 = var16;
      this.field22060 = var16;
      this.method14519(0.02F, 0.02F);
      this.field22035 = this.field22035 * (this.field22054.nextFloat() * 0.6F + 0.5F);
      this.field22044 *= 0.02F;
      this.field22045 *= 0.02F;
      this.field22046 *= 0.02F;
      this.field22056 = (int)(20.0 / (Math.random() * 0.8 + 0.2));
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
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22056-- > 0) {
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22044 *= 0.99;
         this.field22045 *= 0.99;
         this.field22046 *= 0.99;
      } else {
         this.method14518();
      }
   }
}
