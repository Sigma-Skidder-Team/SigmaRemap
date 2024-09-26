package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public abstract class Class901 extends ProjectileEntity {
   public double field5141;
   public double field5142;
   public double field5143;

   public Class901(EntityType<? extends Class901> var1, World var2) {
      super(var1, var2);
   }

   public Class901(EntityType<? extends Class901> var1, double var2, double var4, double var6, double var8, double var10, double var12, World var14) {
      this(var1, var14);
      this.setLocationAndAngles(var2, var4, var6, this.rotationYaw, this.rotationPitch);
      this.recenterBoundingBox();
      double var17 = (double) MathHelper.sqrt(var8 * var8 + var10 * var10 + var12 * var12);
      if (var17 != 0.0) {
         this.field5141 = var8 / var17 * 0.1;
         this.field5142 = var10 / var17 * 0.1;
         this.field5143 = var12 / var17 * 0.1;
      }
   }

   public Class901(EntityType<? extends Class901> var1, LivingEntity var2, double var3, double var5, double var7, World var9) {
      this(var1, var2.getPosX(), var2.getPosY(), var2.getPosZ(), var3, var5, var7, var9);
      this.setShooter(var2);
      this.setRotation(var2.rotationYaw, var2.rotationPitch);
   }

   @Override
   public void registerData() {
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      double var5 = this.getBoundingBox().getAverageEdgeLength() * 4.0;
      if (Double.isNaN(var5)) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   @Override
   public void tick() {
      Entity var3 = this.method3460();
      if (this.world.isRemote || (var3 == null || !var3.removed) && this.world.method7017(this.getPosition())) {
         super.tick();
         if (this.method3529()) {
            this.setFire(1);
         }

         RayTraceResult var4 = Class9456.method36385(this, this::method3467);
         if (var4.getType() != RayTraceResult.Type.MISS) {
            this.method3464(var4);
         }

         this.doBlockCollisions();
         Vector3d var5 = this.getMotion();
         double var6 = this.getPosX() + var5.x;
         double var8 = this.getPosY() + var5.y;
         double var10 = this.getPosZ() + var5.z;
         Class9456.method36388(this, 0.2F);
         float var12 = this.method3531();
         if (this.isInWater()) {
            for (int var13 = 0; var13 < 4; var13++) {
               float var14 = 0.25F;
               this.world
                  .addParticle(
                     ParticleTypes.field34052,
                     var6 - var5.x * 0.25,
                     var8 - var5.y * 0.25,
                     var10 - var5.z * 0.25,
                     var5.x,
                     var5.y,
                     var5.z
                  );
            }

            var12 = 0.8F;
         }

         this.setMotion(var5.add(this.field5141, this.field5142, this.field5143).scale((double)var12));
         this.world.addParticle(this.method3530(), var6, var8 + 0.5, var10, 0.0, 0.0, 0.0);
         this.setPosition(var6, var8, var10);
      } else {
         this.remove();
      }
   }

   @Override
   public boolean method3467(Entity var1) {
      return super.method3467(var1) && !var1.noClip;
   }

   public boolean method3529() {
      return true;
   }

   public IParticleData method3530() {
      return ParticleTypes.field34092;
   }

   public float method3531() {
      return 0.95F;
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.put("power", this.newDoubleNBTList(new double[]{this.field5141, this.field5142, this.field5143}));
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("power", 9)) {
         ListNBT var4 = var1.method131("power", 6);
         if (var4.size() == 3) {
            this.field5141 = var4.method158(0);
            this.field5142 = var4.method158(1);
            this.field5143 = var4.method158(2);
         }
      }
   }

   @Override
   public boolean canBeCollidedWith() {
      return true;
   }

   @Override
   public float getCollisionBorderSize() {
      return 1.0F;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.isInvulnerableTo(var1)) {
         this.markVelocityChanged();
         Entity var5 = var1.getTrueSource();
         if (var5 == null) {
            return false;
         } else {
            Vector3d var6 = var5.getLookVec();
            this.setMotion(var6);
            this.field5141 = var6.x * 0.1;
            this.field5142 = var6.y * 0.1;
            this.field5143 = var6.z * 0.1;
            this.setShooter(var5);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public float getBrightness() {
      return 1.0F;
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      Entity var3 = this.method3460();
      int var4 = var3 != null ? var3.getEntityId() : 0;
      return new SSpawnObjectPacket(
         this.getEntityId(),
         this.getUniqueID(),
         this.getPosX(),
         this.getPosY(),
         this.getPosZ(),
         this.rotationPitch,
         this.rotationYaw,
         this.getType(),
         var4,
         new Vector3d(this.field5141, this.field5142, this.field5143)
      );
   }
}
