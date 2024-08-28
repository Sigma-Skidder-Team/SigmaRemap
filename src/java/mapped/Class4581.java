package mapped;

public class Class4581 extends Class4566 {
   private static String[] field22029;

   public Class4581(Class1656 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field22044 *= 0.8F;
      this.field22045 *= 0.8F;
      this.field22046 *= 0.8F;
      this.field22045 = (double)(this.field22054.nextFloat() * 0.4F + 0.05F);
      this.field22035 = this.field22035 * (this.field22054.nextFloat() * 2.0F + 0.2F);
      this.field22056 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }

   @Override
   public int method14499(float var1) {
      int var4 = super.method14499(var1);
      short var5 = 240;
      int var6 = var4 >> 16 & 0xFF;
      return 240 | var6 << 16;
   }

   @Override
   public float method14509(float var1) {
      float var4 = ((float)this.field22055 + var1) / (float)this.field22056;
      return this.field22035 * (1.0F - var4 * var4);
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      float var3 = (float)this.field22055 / (float)this.field22056;
      if (this.field22054.nextFloat() > var3) {
         this.field22037.method6746(Class7940.field34092, this.field22041, this.field22042, this.field22043, this.field22044, this.field22045, this.field22046);
      }

      if (this.field22055++ < this.field22056) {
         this.field22045 -= 0.03;
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22044 *= 0.999F;
         this.field22045 *= 0.999F;
         this.field22046 *= 0.999F;
         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }
}
