package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public abstract class Class1111 extends MobEntity {
   public Class1111(EntityType<? extends Class1111> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      return false;
   }

   @Override
   public void updateFallState(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
   }

   @Override
   public void travel(Vector3d var1) {
      if (!this.isInWater()) {
         if (!this.isInLava()) {
            float var4 = 0.91F;
            if (this.onGround) {
               var4 = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).getBlock().method11571()
                  * 0.91F;
            }

            float var5 = 0.16277137F / (var4 * var4 * var4);
            var4 = 0.91F;
            if (this.onGround) {
               var4 = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).getBlock().method11571()
                  * 0.91F;
            }

            this.moveRelative(!this.onGround ? 0.02F : 0.1F * var5, var1);
            this.move(MoverType.SELF, this.getMotion());
            this.setMotion(this.getMotion().scale((double)var4));
         } else {
            this.moveRelative(0.02F, var1);
            this.move(MoverType.SELF, this.getMotion());
            this.setMotion(this.getMotion().scale(0.5));
         }
      } else {
         this.moveRelative(0.02F, var1);
         this.move(MoverType.SELF, this.getMotion());
         this.setMotion(this.getMotion().scale(0.8F));
      }

      this.func_233629_a_(this, false);
   }

   @Override
   public boolean isOnLadder() {
      return false;
   }
}
