package net.minecraft.entity.projectile;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.UUID;

public abstract class ProjectileEntity extends Entity {
   private UUID field5093;
   private int field5094;
   private boolean field5095;

   public ProjectileEntity(EntityType<? extends ProjectileEntity> var1, World var2) {
      super(var1, var2);
   }

   public void setShooter(Entity var1) {
      if (var1 != null) {
         this.field5093 = var1.getUniqueID();
         this.field5094 = var1.getEntityId();
      }
   }

   @Nullable
   public Entity method3460() {
      if (this.field5093 != null && this.world instanceof ServerWorld) {
         return ((ServerWorld)this.world).getEntityByUuid(this.field5093);
      } else {
         return this.field5094 == 0 ? null : this.world.getEntityByID(this.field5094);
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      if (this.field5093 != null) {
         var1.method104("Owner", this.field5093);
      }

      if (this.field5095) {
         var1.putBoolean("LeftOwner", true);
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      if (var1.method106("Owner")) {
         this.field5093 = var1.method105("Owner");
      }

      this.field5095 = var1.getBoolean("LeftOwner");
   }

   @Override
   public void tick() {
      if (!this.field5095) {
         this.field5095 = this.method3461();
      }

      super.tick();
   }

   private boolean method3461() {
      Entity var3 = this.method3460();
      if (var3 != null) {
         for (Entity var5 : this.world
            .getEntitiesInAABBexcluding(this, this.getBoundingBox().expand(this.getMotion()).method19664(1.0), var0 -> !var0.isSpectator() && var0.canBeCollidedWith())) {
            if (var5.method3415() == var3.method3415()) {
               return false;
            }
         }
      }

      return true;
   }

   public void shoot(double var1, double var3, double var5, float var7, float var8) {
      Vector3d var11 = new Vector3d(var1, var3, var5)
         .method11333()
         .add(
            this.rand.nextGaussian() * 0.0075F * (double)var8,
            this.rand.nextGaussian() * 0.0075F * (double)var8,
            this.rand.nextGaussian() * 0.0075F * (double)var8
         )
         .scale((double)var7);
      this.setMotion(var11);
      float var12 = MathHelper.sqrt(horizontalMag(var11));
      this.rotationYaw = (float)(MathHelper.method37814(var11.x, var11.z) * 180.0F / (float)Math.PI);
      this.rotationPitch = (float)(MathHelper.method37814(var11.y, (double)var12) * 180.0F / (float)Math.PI);
      this.prevRotationYaw = this.rotationYaw;
      this.prevRotationPitch = this.rotationPitch;
   }

   public void method3463(Entity var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = -MathHelper.sin(var3 * (float) (Math.PI / 180.0)) * MathHelper.cos(var2 * (float) (Math.PI / 180.0));
      float var10 = -MathHelper.sin((var2 + var4) * (float) (Math.PI / 180.0));
      float var11 = MathHelper.cos(var3 * (float) (Math.PI / 180.0)) * MathHelper.cos(var2 * (float) (Math.PI / 180.0));
      this.shoot((double)var9, (double)var10, (double)var11, var5, var6);
      Vector3d var12 = var1.getMotion();
      this.setMotion(this.getMotion().add(var12.x, !var1.isOnGround() ? var12.y : 0.0, var12.z));
   }

   public void method3464(RayTraceResult var1) {
      RayTraceResult.Type var4 = var1.getType();
      if (var4 != RayTraceResult.Type.ENTITY) {
         if (var4 == RayTraceResult.Type.BLOCK) {
            this.method3466((BlockRayTraceResult)var1);
         }
      } else {
         this.method3465((EntityRayTraceResult)var1);
      }
   }

   public void method3465(EntityRayTraceResult var1) {
   }

   public void method3466(BlockRayTraceResult var1) {
      BlockState var4 = this.world.getBlockState(var1.getPos());
      var4.method23453(this.world, var4, var1, this);
   }

   @Override
   public void method3325(double var1, double var3, double var5) {
      this.setMotion(var1, var3, var5);
      if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
         float var9 = MathHelper.sqrt(var1 * var1 + var5 * var5);
         this.rotationPitch = (float)(MathHelper.method37814(var3, (double)var9) * 180.0F / (float)Math.PI);
         this.rotationYaw = (float)(MathHelper.method37814(var1, var5) * 180.0F / (float)Math.PI);
         this.prevRotationPitch = this.rotationPitch;
         this.prevRotationYaw = this.rotationYaw;
         this.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
      }
   }

   public boolean method3467(Entity var1) {
      if (!var1.isSpectator() && var1.isAlive() && var1.canBeCollidedWith()) {
         Entity var4 = this.method3460();
         return var4 == null || this.field5095 || !var4.method3416(var1);
      } else {
         return false;
      }
   }

   public void method3468() {
      Vector3d var3 = this.getMotion();
      float var4 = MathHelper.sqrt(horizontalMag(var3));
      this.rotationPitch = method3469(this.prevRotationPitch, (float)(MathHelper.method37814(var3.y, (double)var4) * 180.0F / (float)Math.PI));
      this.rotationYaw = method3469(this.prevRotationYaw, (float)(MathHelper.method37814(var3.x, var3.z) * 180.0F / (float)Math.PI));
   }

   public static float method3469(float var0, float var1) {
      while (var1 - var0 < -180.0F) {
         var0 -= 360.0F;
      }

      while (var1 - var0 >= 180.0F) {
         var0 += 360.0F;
      }

      return MathHelper.lerp(0.2F, var0, var1);
   }
}
