package mapped;

public class Class6828 extends Class6829 {
   private static String[] field29704;
   private final Class1105 field29705;

   public Class6828(Class1105 var1) {
      super(var1);
      this.field29705 = var1;
   }

   @Override
   public void method20810() {
      if (this.field29714 == Class2335.field15967 && !this.field29705.method4230().method21664()) {
         Vector3d var3 = new Vector3d(
            this.field29708 - this.field29705.getPosX(), this.field29709 - this.field29705.getPosY(), this.field29710 - this.field29705.getPosZ()
         );
         double var4 = var3.method11348();
         double var6 = var3.field18048 / var4;
         double var8 = var3.field18049 / var4;
         double var10 = var3.field18050 / var4;
         float var12 = (float)(MathHelper.method37814(var3.field18050, var3.field18048) * 180.0F / (float)Math.PI) - 90.0F;
         this.field29705.field5031 = this.method20816(this.field29705.field5031, var12, 90.0F);
         this.field29705.field4965 = this.field29705.field5031;
         float var13 = (float)(this.field29711 * this.field29705.method3086(Class9173.field42108));
         float var14 = MathHelper.method37821(0.125F, this.field29705.method2918(), var13);
         this.field29705.method3113(var14);
         double var15 = Math.sin((double)(this.field29705.field5055 + this.field29705.method3205()) * 0.5) * 0.05;
         double var17 = Math.cos((double)(this.field29705.field5031 * (float) (Math.PI / 180.0)));
         double var19 = Math.sin((double)(this.field29705.field5031 * (float) (Math.PI / 180.0)));
         double var21 = Math.sin((double)(this.field29705.field5055 + this.field29705.method3205()) * 0.75) * 0.05;
         this.field29705
            .method3434(this.field29705.method3433().method11339(var15 * var17, var21 * (var19 + var17) * 0.25 + (double)var14 * var8 * 0.1, var15 * var19));
         Class8092 var23 = this.field29705.method4227();
         double var24 = this.field29705.getPosX() + var6 * 2.0;
         double var26 = this.field29705.method3442() + var8 / var4;
         double var28 = this.field29705.getPosZ() + var10 * 2.0;
         double var30 = var23.method28044();
         double var32 = var23.method28045();
         double var34 = var23.method28046();
         if (!var23.method28043()) {
            var30 = var24;
            var32 = var26;
            var34 = var28;
         }

         this.field29705
            .method4227()
            .method28042(
               MathHelper.method37822(0.125, var30, var24), MathHelper.method37822(0.125, var32, var26), MathHelper.method37822(0.125, var34, var28), 10.0F, 40.0F
            );
         Class1105.method5313(this.field29705, true);
      } else {
         this.field29705.method3113(0.0F);
         Class1105.method5313(this.field29705, false);
      }
   }
}
