package mapped;

public class Class4577 extends Class4566 {
   private static String[] field22019;

   public Class4577(Class1656 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.method14519(0.02F, 0.02F);
      this.field22035 = this.field22035 * (this.field22054.nextFloat() * 0.6F + 0.2F);
      this.field22044 = var8 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.field22045 = var10 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.field22046 = var12 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.field22056 = (int)(40.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      this.field22045 += 0.005;
      if (this.field22056-- > 0) {
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22044 *= 0.85F;
         this.field22045 *= 0.85F;
         this.field22046 *= 0.85F;
         if (!this.field22037.method6739(new BlockPos(this.field22041, this.field22042, this.field22043)).method23486(Class8953.field40469)) {
            this.method14518();
         }
      } else {
         this.method14518();
      }
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }
}
