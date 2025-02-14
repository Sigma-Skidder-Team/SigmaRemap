package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class Class6831 extends Class6829 {
   private static String[] field29706;
   private float field29716;
   public final PhantomEntity field29717;

   public Class6831(PhantomEntity var1, MobEntity var2) {
      super(var2);
      this.field29717 = var1;
      this.field29716 = 0.1F;
   }

   @Override
   public void method20810() {
      if (this.field29717.collidedHorizontally) {
         this.field29717.rotationYaw += 180.0F;
         this.field29716 = 0.1F;
      }

      float var3 = (float)(PhantomEntity.method5339(this.field29717).x - this.field29717.getPosX());
      float var4 = (float)(PhantomEntity.method5339(this.field29717).y - this.field29717.getPosY());
      float var5 = (float)(PhantomEntity.method5339(this.field29717).z - this.field29717.getPosZ());
      double var6 = (double) MathHelper.sqrt(var3 * var3 + var5 * var5);
      double var8 = 1.0 - (double) MathHelper.method37771(var4 * 0.7F) / var6;
      var3 = (float)((double)var3 * var8);
      var5 = (float)((double)var5 * var8);
      var6 = (double) MathHelper.sqrt(var3 * var3 + var5 * var5);
      double var10 = (double) MathHelper.sqrt(var3 * var3 + var5 * var5 + var4 * var4);
      float var12 = this.field29717.rotationYaw;
      float var13 = (float) MathHelper.method37814((double)var5, (double)var3);
      float var14 = MathHelper.wrapDegrees(this.field29717.rotationYaw + 90.0F);
      float var15 = MathHelper.wrapDegrees(var13 * (180.0F / (float)Math.PI));
      this.field29717.rotationYaw = MathHelper.method37798(var14, var15, 4.0F) - 90.0F;
      this.field29717.renderYawOffset = this.field29717.rotationYaw;
      if (!(MathHelper.method37795(var12, this.field29717.rotationYaw) < 3.0F)) {
         this.field29716 = MathHelper.method37797(this.field29716, 0.2F, 0.025F);
      } else {
         this.field29716 = MathHelper.method37797(this.field29716, 1.8F, 0.005F * (1.8F / this.field29716));
      }

      float var16 = (float)(-(MathHelper.method37814((double)(-var4), var6) * 180.0F / (float)Math.PI));
      this.field29717.rotationPitch = var16;
      float var17 = this.field29717.rotationYaw + 90.0F;
      double var18 = (double)(this.field29716 * MathHelper.cos(var17 * (float) (Math.PI / 180.0))) * Math.abs((double)var3 / var10);
      double var20 = (double)(this.field29716 * MathHelper.sin(var17 * (float) (Math.PI / 180.0))) * Math.abs((double)var5 / var10);
      double var22 = (double)(this.field29716 * MathHelper.sin(var16 * (float) (Math.PI / 180.0))) * Math.abs((double)var4 / var10);
      Vector3d var24 = this.field29717.getMotion();
      this.field29717.setMotion(var24.add(new Vector3d(var18, var22, var20).subtract(var24).scale(0.2)));
   }
}
