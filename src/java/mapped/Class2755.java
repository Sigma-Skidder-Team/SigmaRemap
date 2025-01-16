package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class Class2755 extends Class2754 {
   private static String[] field17294;
   public final FoxEntity field17295;

   public Class2755(FoxEntity var1) {
      this.field17295 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17295.method5142()) {
         LivingEntity var3 = this.field17295.method4232();
         if (var3 != null && var3.isAlive()) {
            if (var3.method3387() == var3.getHorizontalFacing()) {
               boolean var4 = FoxEntity.method5152(this.field17295, var3);
               if (!var4) {
                  this.field17295.method4230().method21652(var3, 0);
                  this.field17295.method5143(false);
                  this.field17295.method5144(false);
               }

               return var4;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      LivingEntity var3 = this.field17295.method4232();
      if (var3 != null && var3.isAlive()) {
         double var4 = this.field17295.getMotion().y;
         return (!(var4 * var4 < 0.05F) || !(Math.abs(this.field17295.rotationPitch) < 15.0F) || !this.field17295.onGround) && !this.field17295.method5131();
      } else {
         return false;
      }
   }

   @Override
   public boolean method10808() {
      return false;
   }

   @Override
   public void method10804() {
      this.field17295.setJumping(true);
      this.field17295.method5141(true);
      this.field17295.method5144(false);
      LivingEntity var3 = this.field17295.method4232();
      this.field17295.method4227().method28040(var3, 60.0F, 30.0F);
      Vector3d var4 = new Vector3d(
            var3.getPosX() - this.field17295.getPosX(),
            var3.getPosY() - this.field17295.getPosY(),
            var3.getPosZ() - this.field17295.getPosZ()
         )
         .method11333();
      this.field17295.setMotion(this.field17295.getMotion().add(var4.x * 0.8, 0.9, var4.z * 0.8));
      this.field17295.method4230().method21666();
   }

   @Override
   public void method10807() {
      this.field17295.method5143(false);
      FoxEntity.method5172(this.field17295, 0.0F);
      FoxEntity.method5173(this.field17295, 0.0F);
      this.field17295.method5144(false);
      this.field17295.method5141(false);
   }

   @Override
   public void method10805() {
      LivingEntity var3 = this.field17295.method4232();
      if (var3 != null) {
         this.field17295.method4227().method28040(var3, 60.0F, 30.0F);
      }

      if (!this.field17295.method5131()) {
         Vector3d var4 = this.field17295.getMotion();
         if (var4.y * var4.y < 0.03F && this.field17295.rotationPitch != 0.0F) {
            this.field17295.rotationPitch = MathHelper.method37828(this.field17295.rotationPitch, 0.0F, 0.2F);
         } else {
            double var5 = Math.sqrt(Entity.horizontalMag(var4));
            double var7 = Math.signum(-var4.y) * Math.acos(var5 / var4.length()) * 180.0F / (float)Math.PI;
            this.field17295.rotationPitch = (float)var7;
         }
      }

      if (var3 != null && this.field17295.getDistance(var3) <= 2.0F) {
         this.field17295.attackEntityAsMob(var3);
      } else if (this.field17295.rotationPitch > 0.0F
         && this.field17295.onGround
         && (float)this.field17295.getMotion().y != 0.0F
         && this.field17295.world.getBlockState(this.field17295.getPosition()).isIn(Blocks.SNOW)) {
         this.field17295.rotationPitch = 60.0F;
         this.field17295.method4233((LivingEntity)null);
         FoxEntity.method5170(this.field17295, true);
      }
   }
}
