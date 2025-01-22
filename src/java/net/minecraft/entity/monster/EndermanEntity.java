package net.minecraft.entity.monster;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class EndermanEntity extends MonsterEntity implements IAngerable {
   private static final UUID field5645 = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final AttributeModifier field5646 = new AttributeModifier(field5645, "Attacking speed boost", 0.15F, AttributeModifier.Operation.ADDITION);
   private static final DataParameter<Optional<BlockState>> field5647 = EntityDataManager.<Optional<BlockState>>createKey(EndermanEntity.class, DataSerializers.field33397);
   private static final DataParameter<Boolean> field5648 = EntityDataManager.<Boolean>createKey(EndermanEntity.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> field5649 = EntityDataManager.<Boolean>createKey(EndermanEntity.class, DataSerializers.BOOLEAN);
   private static final Predicate<LivingEntity> field5650 = var0 -> var0 instanceof EndermiteEntity && ((EndermiteEntity)var0).method5297();
   private int field5651 = Integer.MIN_VALUE;
   private int field5652;
   private static final RangedInteger field5653 = TickRangeConverter.convertRange(20, 39);
   private int field5654;
   private UUID field5655;

   public EndermanEntity(EntityType<? extends EndermanEntity> var1, World var2) {
      super(var1, var2);
      this.stepHeight = 1.0F;
      this.method4224(PathNodeType.WATER, -1.0F);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(1, new Class2624(this));
      this.field5600.addGoal(2, new Class2647(this, 1.0, false));
      this.field5600.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0, 0.0F));
      this.field5600.addGoal(8, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(8, new Class2668(this));
      this.field5600.addGoal(10, new Class2685(this));
      this.field5600.addGoal(11, new Class2734(this));
      this.field5601.addGoal(1, new Class2710(this, this::method4367));
      this.field5601.addGoal(2, new HurtByTargetGoal(this));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<EndermiteEntity>(this, EndermiteEntity.class, 10, true, false, field5650));
      this.field5601.addGoal(4, new ResetAngerGoal<EndermanEntity>(this, false));
   }

   public static MutableAttribute method4345() {
      return MonsterEntity.method4343()
         .method21849(Attributes.MAX_HEALTH, 40.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.3F)
         .method21849(Attributes.ATTACK_DAMAGE, 7.0)
         .method21849(Attributes.FOLLOW_RANGE, 64.0);
   }

   @Override
   public void method4233(LivingEntity var1) {
      super.method4233(var1);
      ModifiableAttributeInstance var4 = this.getAttribute(Attributes.MOVEMENT_SPEED);
      if (var1 != null) {
         this.field5652 = this.ticksExisted;
         this.dataManager.set(field5648, true);
         if (!var4.method38665(field5646)) {
            var4.applyNonPersistentModifier(field5646);
         }
      } else {
         this.field5652 = 0;
         this.dataManager.set(field5648, false);
         this.dataManager.set(field5649, false);
         var4.removeModifier(field5646);
      }
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5647, Optional.<BlockState>empty());
      this.dataManager.register(field5648, false);
      this.dataManager.register(field5649, false);
   }

   @Override
   public void method4346() {
      this.method4347(field5653.method29319(this.rand));
   }

   @Override
   public void method4347(int var1) {
      this.field5654 = var1;
   }

   @Override
   public int method4348() {
      return this.field5654;
   }

   @Override
   public void setAngerTarget(UUID var1) {
      this.field5655 = var1;
   }

   @Override
   public UUID method4350() {
      return this.field5655;
   }

   public void method4351() {
      if (this.ticksExisted >= this.field5651 + 400) {
         this.field5651 = this.ticksExisted;
         if (!this.isSilent()) {
            this.world.playSound(this.getPosX(), this.getPosYEye(), this.getPosZ(), SoundEvents.field26549, this.getSoundCategory(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field5648.equals(var1) && this.method4359() && this.world.isRemote) {
         this.method4351();
      }

      super.notifyDataManagerChange(var1);
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      BlockState var4 = this.method4357();
      if (var4 != null) {
         compound.put("carriedBlockState", NBTUtil.writeBlockState(var4));
      }

      this.method4364(compound);
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      BlockState var4 = null;
      if (compound.contains("carriedBlockState", 10)) {
         var4 = NBTUtil.readBlockState(compound.getCompound("carriedBlockState"));
         if (var4.isAir()) {
            var4 = null;
         }
      }

      this.method4356(var4);
      this.method4365((ServerWorld)this.world, compound);
   }

   private boolean method4352(PlayerEntity var1) {
      ItemStack var4 = var1.inventory.field5440.get(3);
      if (var4.getItem() != Blocks.CARVED_PUMPKIN.asItem()) {
         Vector3d var5 = var1.getLook(1.0F).method11333();
         Vector3d var6 = new Vector3d(this.getPosX() - var1.getPosX(), this.getPosYEye() - var1.getPosYEye(), this.getPosZ() - var1.getPosZ());
         double var7 = var6.length();
         var6 = var6.method11333();
         double var9 = var5.dotProduct(var6);
         return !(var9 > 1.0 - 0.025 / var7) ? false : var1.canEntityBeSeen(this);
      } else {
         return false;
      }
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 2.55F;
   }

   @Override
   public void livingTick() {
      if (this.world.isRemote) {
         for (int var3 = 0; var3 < 2; var3++) {
            this.world
               .addParticle(
                  ParticleTypes.field34090,
                  this.getPosXRandom(0.5),
                  this.getPosYRandom() - 0.25,
                  this.getPosZRandom(0.5),
                  (this.rand.nextDouble() - 0.5) * 2.0,
                  -this.rand.nextDouble(),
                  (this.rand.nextDouble() - 0.5) * 2.0
               );
         }
      }

      this.isJumping = false;
      if (!this.world.isRemote) {
         this.method4366((ServerWorld)this.world, true);
      }

      super.livingTick();
   }

   @Override
   public boolean method3124() {
      return true;
   }

   @Override
   public void updateAITasks() {
      if (this.world.method6740() && this.ticksExisted >= this.field5652 + 600) {
         float var3 = this.getBrightness();
         if (var3 > 0.5F && this.world.method7022(this.getPosition()) && this.rand.nextFloat() * 30.0F < (var3 - 0.4F) * 2.0F) {
            this.method4233((LivingEntity)null);
            this.method4353();
         }
      }

      super.updateAITasks();
   }

   public boolean method4353() {
      if (!this.world.isRemote() && this.isAlive()) {
         double var3 = this.getPosX() + (this.rand.nextDouble() - 0.5) * 64.0;
         double var5 = this.getPosY() + (double)(this.rand.nextInt(64) - 32);
         double var7 = this.getPosZ() + (this.rand.nextDouble() - 0.5) * 64.0;
         return this.method4355(var3, var5, var7);
      } else {
         return false;
      }
   }

   private boolean method4354(Entity var1) {
      Vector3d var4 = new Vector3d(this.getPosX() - var1.getPosX(), this.getPosYHeight(0.5) - var1.getPosYEye(), this.getPosZ() - var1.getPosZ());
      var4 = var4.method11333();
      double var5 = 16.0;
      double var7 = this.getPosX() + (this.rand.nextDouble() - 0.5) * 8.0 - var4.x * 16.0;
      double var9 = this.getPosY() + (double)(this.rand.nextInt(16) - 8) - var4.y * 16.0;
      double var11 = this.getPosZ() + (this.rand.nextDouble() - 0.5) * 8.0 - var4.z * 16.0;
      return this.method4355(var7, var9, var11);
   }

   private boolean method4355(double var1, double var3, double var5) {
      BlockPos.Mutable var9 = new BlockPos.Mutable(var1, var3, var5);

      while (var9.getY() > 0 && !this.world.getBlockState(var9).getMaterial().blocksMovement()) {
         var9.method8379(Direction.DOWN);
      }

      BlockState var10 = this.world.getBlockState(var9);
      boolean var11 = var10.getMaterial().blocksMovement();
      boolean var12 = var10.getFluidState().method23486(FluidTags.WATER);
      if (var11 && !var12) {
         boolean var13 = this.attemptTeleport(var1, var3, var5, true);
         if (var13 && !this.isSilent()) {
            this.world.playSound((PlayerEntity)null, this.prevPosX, this.prevPosY, this.prevPosZ, SoundEvents.field26550, this.getSoundCategory(), 1.0F, 1.0F);
            this.playSound(SoundEvents.field26550, 1.0F, 1.0F);
         }

         return var13;
      } else {
         return false;
      }
   }

   @Override
   public SoundEvent getAmbientSound() {
      return !this.method4358() ? SoundEvents.field26545 : SoundEvents.field26548;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26547;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26546;
   }

   @Override
   public void dropSpecialItems(DamageSource var1, int var2, boolean var3) {
      super.dropSpecialItems(var1, var2, var3);
      BlockState var6 = this.method4357();
      if (var6 != null) {
         this.entityDropItem(var6.getBlock());
      }
   }

   public void method4356(BlockState var1) {
      this.dataManager.set(field5647, Optional.<BlockState>ofNullable(var1));
   }

   @Nullable
   public BlockState method4357() {
      return this.dataManager.<Optional<BlockState>>method35445(field5647).orElse((BlockState)null);
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (this.isInvulnerableTo(source)) {
         return false;
      } else if (!(source instanceof Class8653)) {
         boolean var6 = super.attackEntityFrom(source, var2);
         if (!this.world.isRemote() && !(source.getTrueSource() instanceof LivingEntity) && this.rand.nextInt(10) != 0) {
            this.method4353();
         }

         return var6;
      } else {
         for (int var5 = 0; var5 < 64; var5++) {
            if (this.method4353()) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean method4358() {
      return this.dataManager.<Boolean>method35445(field5648);
   }

   public boolean method4359() {
      return this.dataManager.<Boolean>method35445(field5649);
   }

   public void method4360() {
      this.dataManager.set(field5649, true);
   }

   @Override
   public boolean method4255() {
      return super.method4255() || this.method4357() != null;
   }

   // $VF: synthetic method
   public static boolean method4362(EndermanEntity var0, PlayerEntity var1) {
      return var0.method4352(var1);
   }

   // $VF: synthetic method
   public static boolean method4363(EndermanEntity var0, Entity var1) {
      return var0.method4354(var1);
   }
}
