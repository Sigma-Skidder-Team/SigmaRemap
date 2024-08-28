package mapped;

public class Class4610 extends Class4566 {
   private static String[] field22121;
   private final Class8975 field22122;

   public Class4610(Class1656 var1, double var2, double var4, double var6, double var8, double var10, double var12, Class8975 var14) {
      super(var1, var2, var4, var6);
      this.field22122 = var14;
      this.field22044 = var8 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.field22045 = var10 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.field22046 = var12 + (Math.random() * 2.0 - 1.0) * 0.05F;
      float var17 = this.field22054.nextFloat() * 0.3F + 0.7F;
      this.field22058 = var17;
      this.field22059 = var17;
      this.field22060 = var17;
      this.field22035 = 0.1F * (this.field22054.nextFloat() * this.field22054.nextFloat() * 6.0F + 1.0F);
      this.field22056 = (int)(16.0 / ((double)this.field22054.nextFloat() * 0.8 + 0.2)) + 2;
      this.method14508(var14);
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.method14508(this.field22122);
         this.field22045 += 0.004;
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22044 *= 0.9F;
         this.field22045 *= 0.9F;
         this.field22046 *= 0.9F;
         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }
}
