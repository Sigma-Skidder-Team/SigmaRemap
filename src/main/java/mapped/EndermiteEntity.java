package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class EndermiteEntity extends MonsterEntity {
   private int field6063;
   private boolean field6064;

   public EndermiteEntity(EntityType<? extends EndermiteEntity> var1, World var2) {
      super(var1, var2);
      this.field5594 = 3;
   }

   @Override
   public void method4219() {
      this.goalSelector.addGoal(1, new SwimGoal(this));
      this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0, false));
      this.goalSelector.addGoal(3, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 8.0F));
      this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this).method10918());
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 0.13F;
   }

   public static MutableAttribute method5296() {
      return MonsterEntity.method4343().method21849(Attributes.MAX_HEALTH, 8.0).method21849(Attributes.MOVEMENT_SPEED, 0.25).method21849(Attributes.ATTACK_DAMAGE, 2.0);
   }

   @Override
   public boolean canTriggerWalking() {
      return false;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26551;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26553;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26552;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26554, 0.15F, 1.0F);
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.field6063 = compound.getInt("Lifetime");
      this.field6064 = compound.getBoolean("PlayerSpawned");
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putInt("Lifetime", this.field6063);
      compound.putBoolean("PlayerSpawned", this.field6064);
   }

   @Override
   public void tick() {
      this.renderYawOffset = this.rotationYaw;
      super.tick();
   }

   @Override
   public void setRenderYawOffset(float var1) {
      this.rotationYaw = var1;
      super.setRenderYawOffset(var1);
   }

   @Override
   public double getYOffset() {
      return 0.1;
   }

   public boolean method5297() {
      return this.field6064;
   }

   public void method5298(boolean var1) {
      this.field6064 = var1;
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (!this.world.isRemote) {
         if (!this.method4282()) {
            this.field6063++;
         }

         if (this.field6063 >= 2400) {
            this.remove();
         }
      } else {
         for (int var3 = 0; var3 < 2; var3++) {
            this.world
               .addParticle(
                  ParticleTypes.field34090,
                  this.getPosXRandom(0.5),
                  this.getPosYRandom(),
                  this.getPosZRandom(0.5),
                  (this.rand.nextDouble() - 0.5) * 2.0,
                  -this.rand.nextDouble(),
                  (this.rand.nextDouble() - 0.5) * 2.0
               );
         }
      }
   }

   public static boolean canSpawn(EntityType<EndermiteEntity> var0, IWorld var1, SpawnReason var2, BlockPos var3, Random var4) {
      if (!canMonsterSpawn(var0, var1, var2, var3, var4)) {
         return false;
      } else {
         PlayerEntity var7 = var1.method7186((double)var3.getX() + 0.5, (double)var3.getY() + 0.5, (double)var3.getZ() + 0.5, 5.0, true);
         return var7 == null;
      }
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33507;
   }
}
