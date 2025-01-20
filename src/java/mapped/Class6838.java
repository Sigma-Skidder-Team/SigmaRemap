package mapped;

import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.math.MathHelper;

public class Class6838 extends Class6829 {
   private static String[] field29706;
   private final TurtleEntity field29726;

   public Class6838(TurtleEntity var1) {
      super(var1);
      this.field29726 = var1;
   }

   private void method20821() {
      if (!this.field29726.isInWater()) {
         if (this.field29726.onGround) {
            this.field29726.setAIMoveSpeed(Math.max(this.field29726.getAIMoveSpeed() / 2.0F, 0.06F));
         }
      } else {
         this.field29726.setMotion(this.field29726.getMotion().add(0.0, 0.005, 0.0));
         if (!TurtleEntity.method5056(this.field29726).withinDistance(this.field29726.getPositionVec(), 16.0)) {
            this.field29726.setAIMoveSpeed(Math.max(this.field29726.getAIMoveSpeed() / 2.0F, 0.08F));
         }

         if (this.field29726.isChild()) {
            this.field29726.setAIMoveSpeed(Math.max(this.field29726.getAIMoveSpeed() / 3.0F, 0.06F));
         }
      }
   }

   @Override
   public void method20810() {
      this.method20821();
      if (this.field29714 == Class2335.field15967 && !this.field29726.method4230().method21664()) {
         double var3 = this.field29708 - this.field29726.getPosX();
         double var5 = this.field29709 - this.field29726.getPosY();
         double var7 = this.field29710 - this.field29726.getPosZ();
         double var9 = (double) MathHelper.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
         var5 /= var9;
         float var11 = (float)(MathHelper.method37814(var7, var3) * 180.0F / (float)Math.PI) - 90.0F;
         this.field29726.rotationYaw = this.method20816(this.field29726.rotationYaw, var11, 90.0F);
         this.field29726.renderYawOffset = this.field29726.rotationYaw;
         float var12 = (float)(this.field29711 * this.field29726.getAttributeValue(Attributes.MOVEMENT_SPEED));
         this.field29726.setAIMoveSpeed(MathHelper.lerp(0.125F, this.field29726.getAIMoveSpeed(), var12));
         this.field29726.setMotion(this.field29726.getMotion().add(0.0, (double)this.field29726.getAIMoveSpeed() * var5 * 0.1, 0.0));
      } else {
         this.field29726.setAIMoveSpeed(0.0F);
      }
   }
}
