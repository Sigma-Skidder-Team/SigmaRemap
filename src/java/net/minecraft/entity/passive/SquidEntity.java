package net.minecraft.entity.passive;

import mapped.*;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class SquidEntity extends WaterMobEntity {
    public float squidPitch;
   public float prevSquidPitch;
   public float squidYaw;
   public float prevSquidYaw;
   public float squidRotation;
   public float prevSquidRotation;
   public float tentacleAngle;
   public float lastTentacleAngle;
   private float randomMotionSpeed;
   private float rotationVelocity;
   private float rotateSpeed;
   private float randomMotionVecX;
   private float randomMotionVecY;
   private float randomMotionVecZ;

   public SquidEntity(EntityType<? extends SquidEntity> var1, World var2) {
      super(var1, var2);
      this.rand.setSeed((long)this.getEntityId());
      this.rotationVelocity = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2679(this, this));
      this.field5600.method20002(1, new Class2726(this));
   }

   public static Class7037 method4836() {
      return Class1006.method4220().method21849(Attributes.field42105, 10.0);
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return var2.field39969 * 0.5F;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27125;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27127;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27126;
   }

   @Override
   public float method3099() {
      return 0.4F;
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public void method2871() {
      super.method2871();
      this.prevSquidPitch = this.squidPitch;
      this.prevSquidYaw = this.squidYaw;
      this.prevSquidRotation = this.squidRotation;
      this.lastTentacleAngle = this.tentacleAngle;
      this.squidRotation = this.squidRotation + this.rotationVelocity;
      if ((double)this.squidRotation > Math.PI * 2) {
         if (!this.world.isRemote) {
            this.squidRotation = (float)((double)this.squidRotation - (Math.PI * 2));
            if (this.rand.nextInt(10) == 0) {
               this.rotationVelocity = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
            }

            this.world.method6786(this, (byte)19);
         } else {
            this.squidRotation = (float) (Math.PI * 2);
         }
      }

      if (!this.method3255()) {
         this.tentacleAngle = MathHelper.method37771(MathHelper.sin(this.squidRotation)) * (float) Math.PI * 0.25F;
         if (!this.world.isRemote) {
            double var5 = this.getVec().y;
            if (!this.method3033(Effects.LEVITATION)) {
               if (!this.method3247()) {
                  var5 -= 0.08;
               }
            } else {
               var5 = 0.05 * (double)(this.method3034(Effects.LEVITATION).method8629() + 1);
            }

            this.method3435(0.0, var5 * 0.98F, 0.0);
         }

         this.squidPitch = (float)((double)this.squidPitch + (double)(-90.0F - this.squidPitch) * 0.02);
      } else {
         if (!(this.squidRotation < (float) Math.PI)) {
            this.tentacleAngle = 0.0F;
            this.randomMotionSpeed *= 0.9F;
            this.rotateSpeed *= 0.99F;
         } else {
            float var3 = this.squidRotation / (float) Math.PI;
            this.tentacleAngle = MathHelper.sin(var3 * var3 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if (!((double)var3 > 0.75)) {
               this.rotateSpeed *= 0.8F;
            } else {
               this.randomMotionSpeed = 1.0F;
               this.rotateSpeed = 1.0F;
            }
         }

         if (!this.world.isRemote) {
            this.method3435((double)(this.randomMotionVecX * this.randomMotionSpeed), (double)(this.randomMotionVecY * this.randomMotionSpeed), (double)(this.randomMotionVecZ * this.randomMotionSpeed));
         }

         Vector3d var7 = this.getVec();
         float var4 = MathHelper.method37766(method3234(var7));
         this.field4965 = this.field4965
            + (-((float) MathHelper.method37814(var7.x, var7.z)) * (180.0F / (float)Math.PI) - this.field4965) * 0.1F;
         this.rotationYaw = this.field4965;
         this.squidYaw = (float)((double)this.squidYaw + Math.PI * (double)this.rotateSpeed * 1.5);
         this.squidPitch = this.squidPitch + (-((float) MathHelper.method37814((double)var4, var7.y)) * (180.0F / (float)Math.PI) - this.squidPitch) * 0.1F;
      }
   }

   @Override
   public boolean method2741(DamageSource var1, float var2) {
      if (super.method2741(var1, var2) && this.method3014() != null) {
         this.method4838();
         return true;
      } else {
         return false;
      }
   }

   private Vector3d method4837(Vector3d var1) {
      Vector3d var4 = var1.method11350(this.prevSquidPitch * (float) (Math.PI / 180.0));
      return var4.method11351(-this.field4966 * (float) (Math.PI / 180.0));
   }

   private void method4838() {
      this.method2863(SoundEvents.field27128, this.method3099(), this.method3100());
      Vector3d var3 = this.method4837(new Vector3d(0.0, -1.0, 0.0)).method11339(this.getPosX(), this.getPosY(), this.getPosZ());

      for (int var4 = 0; var4 < 30; var4++) {
         Vector3d var5 = this.method4837(new Vector3d((double)this.rand.nextFloat() * 0.6 - 0.3, -1.0, (double)this.rand.nextFloat() * 0.6 - 0.3));
         Vector3d var6 = var5.method11344(0.3 + (double)(this.rand.nextFloat() * 2.0F));
         ((ServerWorld)this.world)
            .method6939(
               ParticleTypes.field34095, var3.x, var3.y + 0.5, var3.z, 0, var6.x, var6.y, var6.z, 0.1F
            );
      }
   }

   @Override
   public void method2915(Vector3d var1) {
      this.move(Class2107.field13742, this.getVec());
   }

   public static boolean method4839(EntityType<SquidEntity> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var3.getY() > 45 && var3.getY() < var1.method6776();
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 19) {
         super.method2866(var1);
      } else {
         this.squidRotation = 0.0F;
      }
   }

   public void method4840(float var1, float var2, float var3) {
      this.randomMotionVecX = var1;
      this.randomMotionVecY = var2;
      this.randomMotionVecZ = var3;
   }

   public boolean method4841() {
      return this.randomMotionVecX != 0.0F || this.randomMotionVecY != 0.0F || this.randomMotionVecZ != 0.0F;
   }

   // $VF: synthetic method
   public static boolean method4842(SquidEntity var0) {
      return var0.inWater;
   }
}
