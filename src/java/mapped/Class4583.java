package mapped;

public abstract class Class4583 extends Class4566 {
   public Class4583(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field22044 = this.field22044 * 0.01F + var8;
      this.field22045 = this.field22045 * 0.01F + var10;
      this.field22046 = this.field22046 * 0.01F + var12;
      this.field22041 = this.field22041 + (double)((this.field22054.nextFloat() - this.field22054.nextFloat()) * 0.05F);
      this.field22042 = this.field22042 + (double)((this.field22054.nextFloat() - this.field22054.nextFloat()) * 0.05F);
      this.field22043 = this.field22043 + (double)((this.field22054.nextFloat() - this.field22054.nextFloat()) * 0.05F);
      this.field22056 = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22044 *= 0.96F;
         this.field22045 *= 0.96F;
         this.field22046 *= 0.96F;
         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }
}
