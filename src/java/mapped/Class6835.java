package mapped;

import net.minecraft.entity.LivingEntity;

public class Class6835 extends Class6829 {
   private static String[] field29706;
   private final Class1037 field29722;

   public Class6835(Class1037 var1) {
      super(var1);
      this.field29722 = var1;
   }

   @Override
   public void method20810() {
      LivingEntity var3 = this.field29722.method4232();
      if (Class1037.method4651(this.field29722) && this.field29722.method3250()) {
         if (var3 != null && var3.getPosY() > this.field29722.getPosY() || Class1037.method4652(this.field29722)) {
            this.field29722.method3434(this.field29722.getVec().method11339(0.0, 0.002, 0.0));
         }

         if (this.field29714 != Class2335.field15967 || this.field29722.method4230().method21664()) {
            this.field29722.method3113(0.0F);
            return;
         }

         double var4 = this.field29708 - this.field29722.getPosX();
         double var6 = this.field29709 - this.field29722.getPosY();
         double var8 = this.field29710 - this.field29722.getPosZ();
         double var10 = (double) MathHelper.method37766(var4 * var4 + var6 * var6 + var8 * var8);
         var6 /= var10;
         float var12 = (float)(MathHelper.method37814(var8, var4) * 180.0F / (float)Math.PI) - 90.0F;
         this.field29722.rotationYaw = this.method20816(this.field29722.rotationYaw, var12, 90.0F);
         this.field29722.field4965 = this.field29722.rotationYaw;
         float var13 = (float)(this.field29711 * this.field29722.method3086(Attributes.MOVEMENT_SPEED));
         float var14 = MathHelper.lerp(0.125F, this.field29722.method2918(), var13);
         this.field29722.method3113(var14);
         this.field29722
            .method3434(this.field29722.getVec().method11339((double)var14 * var4 * 0.005, (double)var14 * var6 * 0.1, (double)var14 * var8 * 0.005));
      } else {
         if (!this.field29722.onGround) {
            this.field29722.method3434(this.field29722.getVec().method11339(0.0, -0.008, 0.0));
         }

         super.method20810();
      }
   }
}
