package mapped;

public class Class6832 extends Class6829 {
   private static String[] field29706;
   private final int field29718;
   private final boolean field29719;

   public Class6832(Class1006 var1, int var2, boolean var3) {
      super(var1);
      this.field29718 = var2;
      this.field29719 = var3;
   }

   @Override
   public void method20810() {
      if (this.field29714 != Class2335.field15967) {
         if (!this.field29719) {
            this.field29707.method3248(false);
         }

         this.field29707.method4244(0.0F);
         this.field29707.method4243(0.0F);
      } else {
         this.field29714 = Class2335.field15966;
         this.field29707.method3248(true);
         double var3 = this.field29708 - this.field29707.getPosX();
         double var5 = this.field29709 - this.field29707.getPosY();
         double var7 = this.field29710 - this.field29707.getPosZ();
         double var9 = var3 * var3 + var5 * var5 + var7 * var7;
         if (var9 < 2.5000003E-7F) {
            this.field29707.method4244(0.0F);
            this.field29707.method4243(0.0F);
            return;
         }

         float var11 = (float)(MathHelper.method37814(var7, var3) * 180.0F / (float)Math.PI) - 90.0F;
         this.field29707.rotationYaw = this.method20816(this.field29707.rotationYaw, var11, 90.0F);
         float var12;
         if (!this.field29707.method3226()) {
            var12 = (float)(this.field29711 * this.field29707.method3086(Class9173.field42109));
         } else {
            var12 = (float)(this.field29711 * this.field29707.method3086(Class9173.field42108));
         }

         this.field29707.method3113(var12);
         double var13 = (double) MathHelper.method37766(var3 * var3 + var7 * var7);
         float var15 = (float)(-(MathHelper.method37814(var5, var13) * 180.0F / (float)Math.PI));
         this.field29707.rotationPitch = this.method20816(this.field29707.rotationPitch, var15, (float)this.field29718);
         this.field29707.method4244(!(var5 > 0.0) ? -var12 : var12);
      }
   }
}
