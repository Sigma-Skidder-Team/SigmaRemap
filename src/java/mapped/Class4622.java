package mapped;

public class Class4622 extends Class4566 {
   private static String[] field22138;
   private boolean field22139;
   private final Class8975 field22140;

   public Class4622(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, Class8975 var14) {
      super(var1, var2, var4, var6);
      this.field22044 = var8;
      this.field22045 = var10;
      this.field22046 = var12;
      this.field22058 = MathHelper.method37783(this.field22054, 0.7176471F, 0.8745098F);
      this.field22059 = MathHelper.method37783(this.field22054, 0.0F, 0.0F);
      this.field22060 = MathHelper.method37783(this.field22054, 0.8235294F, 0.9764706F);
      this.field22035 *= 0.75F;
      this.field22056 = (int)(20.0 / ((double)this.field22054.nextFloat() * 0.8 + 0.2));
      this.field22139 = false;
      this.field22049 = false;
      this.field22140 = var14;
      this.method14508(var14);
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.method14508(this.field22140);
         if (this.field22048) {
            this.field22045 = 0.0;
            this.field22139 = true;
         }

         if (this.field22139) {
            this.field22045 += 0.002;
         }

         this.method14511(this.field22044, this.field22045, this.field22046);
         if (this.field22042 == this.field22039) {
            this.field22044 *= 1.1;
            this.field22046 *= 1.1;
         }

         this.field22044 *= 0.96F;
         this.field22046 *= 0.96F;
         if (this.field22139) {
            this.field22045 *= 0.96F;
         }
      } else {
         this.method14518();
      }
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }

   @Override
   public float method14509(float var1) {
      return this.field22035 * MathHelper.method37777(((float)this.field22055 + var1) / (float)this.field22056 * 32.0F, 0.0F, 1.0F);
   }
}
