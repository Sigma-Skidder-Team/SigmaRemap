package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public class BatEntity extends Class1113 {
   private static final DataParameter<Byte> field6093 = EntityDataManager.<Byte>createKey(BatEntity.class, DataSerializers.field33390);
   private static final Class8522 field6094 = new Class8522().method30203(4.0).method30205();
   private BlockPos field6095;

   public BatEntity(EntityType<? extends BatEntity> var1, World var2) {
      super(var1, var2);
      this.method5365(true);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6093, (byte)0);
   }

   @Override
   public float getSoundVolume() {
      return 0.1F;
   }

   @Override
   public float getSoundPitch() {
      return super.getSoundPitch() * 0.95F;
   }

   @Nullable
   @Override
   public SoundEvent getAmbientSound() {
      return this.method5364() && this.rand.nextInt(4) != 0 ? null : SoundEvents.field26380;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26382;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26381;
   }

   @Override
   public boolean canBePushed() {
      return false;
   }

   @Override
   public void collideWithEntity(Entity var1) {
   }

   @Override
   public void collideWithNearbyEntities() {
   }

   public static MutableAttribute method5363() {
      return MobEntity.method4220().method21849(Attributes.MAX_HEALTH, 6.0);
   }

   public boolean method5364() {
      return (this.dataManager.<Byte>method35445(field6093) & 1) != 0;
   }

   public void method5365(boolean var1) {
      int var4 = this.dataManager.<Byte>method35445(field6093);
      if (!var1) {
         this.dataManager.method35446(field6093, (byte)(var4 & -2));
      } else {
         this.dataManager.method35446(field6093, (byte)(var4 | 1));
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.method5364()) {
         this.setMotion(this.getMotion().mul(1.0, 0.6, 1.0));
      } else {
         this.setMotion(Vector3d.ZERO);
         this.setRawPosition(this.getPosX(), (double) MathHelper.floor(this.getPosY()) + 1.0 - (double)this.getHeight(), this.getPosZ());
      }
   }

   @Override
   public void updateAITasks() {
      super.updateAITasks();
      BlockPos var3 = this.getPosition();
      BlockPos var4 = var3.up();
      if (!this.method5364()) {
         if (this.field6095 != null && (!this.world.method7007(this.field6095) || this.field6095.getY() < 1)) {
            this.field6095 = null;
         }

         if (this.field6095 == null || this.rand.nextInt(30) == 0 || this.field6095.method8317(this.getPositionVec(), 2.0)) {
            this.field6095 = new BlockPos(
               this.getPosX() + (double)this.rand.nextInt(7) - (double)this.rand.nextInt(7),
               this.getPosY() + (double)this.rand.nextInt(6) - 2.0,
               this.getPosZ() + (double)this.rand.nextInt(7) - (double)this.rand.nextInt(7)
            );
         }

         double var6 = (double)this.field6095.getX() + 0.5 - this.getPosX();
         double var8 = (double)this.field6095.getY() + 0.1 - this.getPosY();
         double var10 = (double)this.field6095.getZ() + 0.5 - this.getPosZ();
         Vector3d var12 = this.getMotion();
         Vector3d var13 = var12.add(
            (Math.signum(var6) * 0.5 - var12.x) * 0.1F,
            (Math.signum(var8) * 0.7F - var12.y) * 0.1F,
            (Math.signum(var10) * 0.5 - var12.z) * 0.1F
         );
         this.setMotion(var13);
         float var14 = (float)(MathHelper.method37814(var13.z, var13.x) * 180.0F / (float)Math.PI) - 90.0F;
         float var15 = MathHelper.wrapDegrees(var14 - this.rotationYaw);
         this.moveForward = 0.5F;
         this.rotationYaw += var15;
         if (this.rand.nextInt(100) == 0 && this.world.getBlockState(var4).method23400(this.world, var4)) {
            this.method5365(true);
         }
      } else {
         boolean var5 = this.isSilent();
         if (!this.world.getBlockState(var4).method23400(this.world, var3)) {
            this.method5365(false);
            if (!var5) {
               this.world.method6869((PlayerEntity)null, 1025, var3, 0);
            }
         } else {
            if (this.rand.nextInt(200) == 0) {
               this.rotationYawHead = (float)this.rand.nextInt(360);
            }

            if (this.world.method7188(field6094, this) != null) {
               this.method5365(false);
               if (!var5) {
                  this.world.method6869((PlayerEntity)null, 1025, var3, 0);
               }
            }
         }
      }
   }

   @Override
   public boolean canTriggerWalking() {
      return false;
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      return false;
   }

   @Override
   public void updateFallState(double var1, boolean var3, BlockState var4, BlockPos var5) {
   }

   @Override
   public boolean method3371() {
      return true;
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (!this.isInvulnerableTo(source)) {
         if (!this.world.isRemote && this.method5364()) {
            this.method5365(false);
         }

         return super.attackEntityFrom(source, var2);
      } else {
         return false;
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.dataManager.method35446(field6093, var1.getByte("BatFlags"));
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putByte("BatFlags", this.dataManager.<Byte>method35445(field6093));
   }

   public static boolean canSpawn(EntityType<BatEntity> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      if (var3.getY() < var1.getSeaLevel()) {
         int var7 = var1.method7015(var3);
         int var8 = 4;
         if (!method5367()) {
            if (var4.nextBoolean()) {
               return false;
            }
         } else {
            var8 = 7;
         }

         return var7 <= var4.nextInt(var8) ? canSpawnOn(var0, var1, var2, var3, var4) : false;
      } else {
         return false;
      }
   }

   private static boolean method5367() {
      LocalDate var2 = LocalDate.now();
      int var3 = var2.get(ChronoField.DAY_OF_MONTH);
      int var4 = var2.get(ChronoField.MONTH_OF_YEAR);
      return var4 == 10 && var3 >= 20 || var4 == 11 && var3 <= 3;
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return var2.field39969 / 2.0F;
   }
}
