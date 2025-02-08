package net.minecraft.entity.passive.fish;

import mapped.*;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public abstract class AbstractFishEntity extends WaterMobEntity {
   private static final DataParameter<Boolean> field5809 = EntityDataManager.<Boolean>createKey(AbstractFishEntity.class, DataSerializers.BOOLEAN);

   public AbstractFishEntity(EntityType<? extends AbstractFishEntity> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6830(this);
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return var2.height * 0.65F;
   }

   public static MutableAttribute method4791() {
      return MobEntity.method4220().method21849(Attributes.MAX_HEALTH, 3.0);
   }

   @Override
   public boolean method4255() {
      return super.method4255() || this.method4793();
   }

   public static boolean canSpawn(EntityType<? extends AbstractFishEntity> var0, IWorld var1, SpawnReason var2, BlockPos var3, Random var4) {
      return var1.getBlockState(var3).isIn(Blocks.WATER) && var1.getBlockState(var3.up()).isIn(Blocks.WATER);
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method4793() && !this.method3381();
   }

   @Override
   public int method4267() {
      return 8;
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5809, false);
   }

   private boolean method4793() {
      return this.dataManager.<Boolean>method35445(field5809);
   }

   public void method4794(boolean var1) {
      this.dataManager.set(field5809, var1);
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putBoolean("FromBucket", this.method4793());
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.method4794(compound.getBoolean("FromBucket"));
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(0, new Class2747(this, 1.25));
      this.field5600.addGoal(2, new Class2770<PlayerEntity>(this, PlayerEntity.class, 8.0F, 1.6, 1.4, EntityPredicates.field34763::test));
      this.field5600.addGoal(4, new Class2741(this));
   }

   @Override
   public Class6990 method4221(World var1) {
      return new Class6997(this, var1);
   }

   @Override
   public void travel(Vector3d var1) {
      if (this.isServerWorld() && this.isInWater()) {
         this.moveRelative(0.01F, var1);
         this.move(MoverType.SELF, this.getMotion());
         this.setMotion(this.getMotion().scale(0.9));
         if (this.getAttackTarget() == null) {
            this.setMotion(this.getMotion().add(0.0, -0.005, 0.0));
         }
      } else {
         super.travel(var1);
      }
   }

   @Override
   public void livingTick() {
      if (!this.isInWater() && this.onGround && this.collidedVertically) {
         this.setMotion(
            this.getMotion()
               .add((double)((this.rand.nextFloat() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 0.05F))
         );
         this.onGround = false;
         this.isAirBorne = true;
         this.playSound(this.getFlopSound(), this.getSoundVolume(), this.getSoundPitch());
      }

      super.livingTick();
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() == Items.WATER_BUCKET && this.isAlive()) {
         this.playSound(SoundEvents.field26430, 1.0F, 1.0F);
         var5.shrink(1);
         ItemStack var6 = this.getFishBucket();
         this.method4795(var6);
         if (!this.world.isRemote) {
            CriteriaTriggers.field44474.method15152((ServerPlayerEntity)var1, var6);
         }

         if (!var5.isEmpty()) {
            if (!var1.inventory.method4045(var6)) {
               var1.dropItem(var6, false);
            }
         } else {
            var1.setHeldItem(var2, var6);
         }

         this.remove();
         return ActionResultType.method9002(this.world.isRemote);
      } else {
         return super.method4285(var1, var2);
      }
   }

   public void method4795(ItemStack var1) {
      if (this.method3381()) {
         var1.method32150(this.method3380());
      }
   }

   public abstract ItemStack getFishBucket();

   public boolean method4797() {
      return true;
   }

   public abstract SoundEvent getFlopSound();

   @Override
   public SoundEvent method2859() {
      return SoundEvents.field26583;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
   }
}
