package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

import java.util.EnumSet;

public class Class2725 extends Class2595 {
   private final TameableEntity field17220;
   private LivingEntity field17221;
   private final IWorldReader field17222;
   private final double field17223;
   private final Class6990 field17224;
   private int field17225;
   private final float field17226;
   private final float field17227;
   private float field17228;
   private final boolean field17229;

   public Class2725(TameableEntity var1, double var2, float var4, float var5, boolean var6) {
      this.field17220 = var1;
      this.field17222 = var1.world;
      this.field17223 = var2;
      this.field17224 = var1.method4230();
      this.field17227 = var4;
      this.field17226 = var5;
      this.field17229 = var6;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
      if (!(var1.method4230() instanceof Class6991) && !(var1.method4230() instanceof Class6995)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean method10803() {
      LivingEntity var3 = this.field17220.method4400();
      if (var3 != null) {
         if (!var3.isSpectator()) {
            if (!this.field17220.method4402()) {
               if (!(this.field17220.getDistanceSq(var3) < (double)(this.field17227 * this.field17227))) {
                  this.field17221 = var3;
                  return true;
               } else {
                  return false;
               }
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
      if (!this.field17224.method21664()) {
         return !this.field17220.method4402() ? !(this.field17220.getDistanceSq(this.field17221) <= (double)(this.field17226 * this.field17226)) : false;
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field17225 = 0;
      this.field17228 = this.field17220.method4223(PathNodeType.WATER);
      this.field17220.method4224(PathNodeType.WATER, 0.0F);
   }

   @Override
   public void method10807() {
      this.field17221 = null;
      this.field17224.method21666();
      this.field17220.method4224(PathNodeType.WATER, this.field17228);
   }

   @Override
   public void method10805() {
      this.field17220.method4227().method28040(this.field17221, 10.0F, (float)this.field17220.method4259());
      if (--this.field17225 <= 0) {
         this.field17225 = 10;
         if (!this.field17220.method4296() && !this.field17220.isPassenger()) {
            if (!(this.field17220.getDistanceSq(this.field17221) >= 144.0)) {
               this.field17224.method21655(this.field17221, this.field17223);
            } else {
               this.method10934();
            }
         }
      }
   }

   private void method10934() {
      BlockPos var3 = this.field17221.getPosition();

      for (int var4 = 0; var4 < 10; var4++) {
         int var5 = this.method10937(-3, 3);
         int var6 = this.method10937(-1, 1);
         int var7 = this.method10937(-3, 3);
         boolean var8 = this.method10935(var3.getX() + var5, var3.getY() + var6, var3.getZ() + var7);
         if (var8) {
            return;
         }
      }
   }

   private boolean method10935(int var1, int var2, int var3) {
      if (Math.abs((double)var1 - this.field17221.getPosX()) < 2.0 && Math.abs((double)var3 - this.field17221.getPosZ()) < 2.0) {
         return false;
      } else if (this.method10936(new BlockPos(var1, var2, var3))) {
         this.field17220.setLocationAndAngles((double)var1 + 0.5, (double)var2, (double)var3 + 0.5, this.field17220.rotationYaw, this.field17220.rotationPitch);
         this.field17224.method21666();
         return true;
      } else {
         return false;
      }
   }

   private boolean method10936(BlockPos var1) {
      PathNodeType var4 = Class6762.method20633(this.field17222, var1.method8354());
      if (var4 == PathNodeType.WALKABLE) {
         BlockState var5 = this.field17222.getBlockState(var1.down());
         if (!this.field17229 && var5.getBlock() instanceof LeavesBlock) {
            return false;
         } else {
            BlockPos var6 = var1.method8338(this.field17220.getPosition());
            return this.field17222.hasNoCollisions(this.field17220, this.field17220.getBoundingBox().offset(var6));
         }
      } else {
         return false;
      }
   }

   private int method10937(int var1, int var2) {
      return this.field17220.getRNG().nextInt(var2 - var1 + 1) + var1;
   }
}
