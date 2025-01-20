package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ChickenEntity extends AnimalEntity {
   private static final Class120 field5964 = Class120.method339(Items.field37841, Items.field37960, Items.field37959, Items.field38112);
   public float field5965;
   public float field5966;
   public float field5967;
   public float field5968;
   public float field5969 = 1.0F;
   public int field5970 = this.rand.nextInt(6000) + 6000;
   public boolean field5971;

   public ChickenEntity(EntityType<? extends ChickenEntity> var1, World var2) {
      super(var1, var2);
      this.method4224(PathNodeType.WATER, 0.0F);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(1, new Class2747(this, 1.4));
      this.field5600.addGoal(2, new Class2785(this, 1.0));
      this.field5600.addGoal(3, new Class2680(this, 1.0, false, field5964));
      this.field5600.addGoal(4, new Class2764(this, 1.1));
      this.field5600.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5600.addGoal(6, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.addGoal(7, new Class2668(this));
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return !this.isChild() ? var2.field39969 * 0.92F : var2.field39969 * 0.85F;
   }

   public static MutableAttribute method5069() {
      return MobEntity.method4220().method21849(Attributes.MAX_HEALTH, 4.0).method21849(Attributes.MOVEMENT_SPEED, 0.25);
   }

   @Override
   public void livingTick() {
      super.livingTick();
      this.field5968 = this.field5965;
      this.field5967 = this.field5966;
      this.field5966 = (float)((double)this.field5966 + (double)(!this.onGround ? 4 : -1) * 0.3);
      this.field5966 = MathHelper.clamp(this.field5966, 0.0F, 1.0F);
      if (!this.onGround && this.field5969 < 1.0F) {
         this.field5969 = 1.0F;
      }

      this.field5969 = (float)((double)this.field5969 * 0.9);
      Vector3d var3 = this.getMotion();
      if (!this.onGround && var3.y < 0.0) {
         this.setMotion(var3.mul(1.0, 0.6, 1.0));
      }

      this.field5965 = this.field5965 + this.field5969 * 2.0F;
      if (!this.world.isRemote && this.isAlive() && !this.isChild() && !this.method5070() && --this.field5970 <= 0) {
         this.playSound(SoundEvents.field26452, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
         this.entityDropItem(Items.EGG);
         this.field5970 = this.rand.nextInt(6000) + 6000;
      }
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      return false;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26450;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26453;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26451;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26454, 0.15F, 1.0F);
   }

   public ChickenEntity method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.CHICKEN.create(var1);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return field5964.test(var1);
   }

   @Override
   public int getExperiencePoints(PlayerEntity player) {
      return !this.method5070() ? super.getExperiencePoints(player) : 10;
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.field5971 = compound.getBoolean("IsChickenJockey");
      if (compound.contains("EggLayTime")) {
         this.field5970 = compound.getInt("EggLayTime");
      }
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putBoolean("IsChickenJockey", this.field5971);
      compound.putInt("EggLayTime", this.field5970);
   }

   @Override
   public boolean method4254(double var1) {
      return this.method5070();
   }

   @Override
   public void method3307(Entity var1) {
      super.method3307(var1);
      float var4 = MathHelper.sin(this.renderYawOffset * (float) (Math.PI / 180.0));
      float var5 = MathHelper.cos(this.renderYawOffset * (float) (Math.PI / 180.0));
      float var6 = 0.1F;
      float var7 = 0.0F;
      var1.setPosition(this.getPosX() + (double)(0.1F * var4), this.getPosYHeight(0.5) + var1.getYOffset() + 0.0, this.getPosZ() - (double)(0.1F * var5));
      if (var1 instanceof LivingEntity) {
         ((LivingEntity)var1).renderYawOffset = this.renderYawOffset;
      }
   }

   public boolean method5070() {
      return this.field5971;
   }

   public void method5071(boolean var1) {
      this.field5971 = var1;
   }
}
