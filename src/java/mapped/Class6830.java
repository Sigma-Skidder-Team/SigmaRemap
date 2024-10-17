package mapped;

import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.math.MathHelper;

public class Class6830 extends Class6829 {
   private static String[] field29706;
   private final Class1049 field29715;

   public Class6830(Class1049 var1) {
      super(var1);
      this.field29715 = var1;
   }

   @Override
   public void method20810() {
      if (this.field29715.areEyesInFluid(FluidTags.field40469)) {
         this.field29715.setMotion(this.field29715.getMotion().add(0.0, 0.005, 0.0));
      }

      if (this.field29714 == Class2335.field15967 && !this.field29715.method4230().method21664()) {
         float var3 = (float)(this.field29711 * this.field29715.getAttributeValue(Attributes.MOVEMENT_SPEED));
         this.field29715.setAIMoveSpeed(MathHelper.lerp(0.125F, this.field29715.getAIMoveSpeed(), var3));
         double var4 = this.field29708 - this.field29715.getPosX();
         double var6 = this.field29709 - this.field29715.getPosY();
         double var8 = this.field29710 - this.field29715.getPosZ();
         if (var6 != 0.0) {
            double var11 = (double) MathHelper.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
            this.field29715.setMotion(this.field29715.getMotion().add(0.0, (double)this.field29715.getAIMoveSpeed() * (var6 / var11) * 0.1, 0.0));
         }

         if (var4 != 0.0 || var8 != 0.0) {
            float var10 = (float)(MathHelper.method37814(var8, var4) * 180.0F / (float)Math.PI) - 90.0F;
            this.field29715.rotationYaw = this.method20816(this.field29715.rotationYaw, var10, 90.0F);
            this.field29715.renderYawOffset = this.field29715.rotationYaw;
         }
      } else {
         this.field29715.setAIMoveSpeed(0.0F);
      }
   }
}
