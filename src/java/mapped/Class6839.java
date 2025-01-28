package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class Class6839 extends Class6829 {
   private static String[] field29706;
   public final VexEntity field29727;

   public Class6839(VexEntity var1, VexEntity var2) {
      super(var2);
      this.field29727 = var1;
   }

   @Override
   public void method20810() {
      if (this.field29714 == Class2335.field15967) {
         Vector3d var3 = new Vector3d(
            this.field29708 - this.field29727.getPosX(), this.field29709 - this.field29727.getPosY(), this.field29710 - this.field29727.getPosZ()
         );
         double var4 = var3.length();
         if (!(var4 < this.field29727.getBoundingBox().getAverageEdgeLength())) {
            this.field29727.setMotion(this.field29727.getMotion().add(var3.scale(this.field29711 * 0.05 / var4)));
            if (this.field29727.getAttackTarget() != null) {
               double var6 = this.field29727.getAttackTarget().getPosX() - this.field29727.getPosX();
               double var8 = this.field29727.getAttackTarget().getPosZ() - this.field29727.getPosZ();
               this.field29727.rotationYaw = -((float) MathHelper.method37814(var6, var8)) * (180.0F / (float)Math.PI);
               this.field29727.renderYawOffset = this.field29727.rotationYaw;
            } else {
               Vector3d var10 = this.field29727.getMotion();
               this.field29727.rotationYaw = -((float) MathHelper.method37814(var10.x, var10.z)) * (180.0F / (float)Math.PI);
               this.field29727.renderYawOffset = this.field29727.rotationYaw;
            }
         } else {
            this.field29714 = Class2335.field15966;
            this.field29727.setMotion(this.field29727.getMotion().scale(0.5));
         }
      }
   }
}
