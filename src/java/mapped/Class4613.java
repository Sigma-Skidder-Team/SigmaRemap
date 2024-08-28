package mapped;

public class Class4613 extends Class4566 {
   private static String[] field22126;
   private final Class8975 field22127;
   private final double field22128;

   public Class4613(
      Class1656 var1,
      double var2,
      double var4,
      double var6,
      float var8,
      float var9,
      float var10,
      double var11,
      double var13,
      double var15,
      float var17,
      Class8975 var18,
      float var19,
      int var20,
      double var21,
      boolean var23
   ) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field22128 = var21;
      this.field22127 = var18;
      this.field22044 *= (double)var8;
      this.field22045 *= (double)var9;
      this.field22046 *= (double)var10;
      this.field22044 += var11;
      this.field22045 += var13;
      this.field22046 += var15;
      float var26 = var1.field9016.nextFloat() * var19;
      this.field22058 = var26;
      this.field22059 = var26;
      this.field22060 = var26;
      this.field22035 *= 0.75F * var17;
      this.field22056 = (int)((double)var20 / ((double)var1.field9016.nextFloat() * 0.8 + 0.2));
      this.field22056 = (int)((float)this.field22056 * var17);
      this.field22056 = Math.max(this.field22056, 1);
      this.method14508(var18);
      this.field22049 = var23;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }

   @Override
   public float method14509(float var1) {
      return this.field22035 * MathHelper.method37777(((float)this.field22055 + var1) / (float)this.field22056 * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.method14508(this.field22127);
         this.field22045 = this.field22045 + this.field22128;
         this.method14511(this.field22044, this.field22045, this.field22046);
         if (this.field22042 == this.field22039) {
            this.field22044 *= 1.1;
            this.field22046 *= 1.1;
         }

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
