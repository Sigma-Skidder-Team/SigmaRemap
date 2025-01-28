package net.minecraft.entity.passive;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class WolfEntity extends TameableEntity implements IAngerable {
   private static final DataParameter<Boolean> field5656 = EntityDataManager.<Boolean>createKey(WolfEntity.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Integer> field5657 = EntityDataManager.<Integer>createKey(WolfEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field5658 = EntityDataManager.<Integer>createKey(WolfEntity.class, DataSerializers.VARINT);
   public static final Predicate<LivingEntity> field5659 = var0 -> {
      EntityType var3 = var0.getType();
      return var3 == EntityType.SHEEP || var3 == EntityType.RABBIT || var3 == EntityType.FOX;
   };
   private float field5660;
   private float field5661;
   private boolean field5662;
   private boolean field5663;
   private float field5664;
   private float field5665;
   private static final RangedInteger field5666 = TickRangeConverter.convertRange(20, 39);
   private UUID field5667;

   public WolfEntity(EntityType<? extends WolfEntity> var1, World var2) {
      super(var1, var2);
      this.method4379(false);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(1, new Class2603(this));
      this.field5600.addGoal(2, new Class2778(this));
      this.field5600.addGoal(3, new Class2773(this, LlamaEntity.class, 24.0f, 1.5, 1.5));
      this.field5600.addGoal(4, new Class2745(this, 0.4F));
      this.field5600.addGoal(5, new Class2647(this, 1.0, true));
      this.field5600.addGoal(6, new Class2725(this, 1.0, 10.0F, 2.0F, false));
      this.field5600.addGoal(7, new Class2785(this, 1.0));
      this.field5600.addGoal(8, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5600.addGoal(9, new Class2618(this, 8.0F));
      this.field5600.addGoal(10, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(10, new Class2668(this));
      this.field5601.addGoal(1, new Class2702(this));
      this.field5601.addGoal(2, new Class2703(this));
      this.field5601.addGoal(3, new HurtByTargetGoal(this).method10918());
      this.field5601.addGoal(4, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method4367));
      this.field5601.addGoal(5, new Class2716<AnimalEntity>(this, AnimalEntity.class, false, field5659));
      this.field5601.addGoal(6, new Class2716<TurtleEntity>(this, TurtleEntity.class, false, TurtleEntity.field5963));
      this.field5601.addGoal(7, new NearestAttackableTargetGoal<Class1082>(this, Class1082.class, false));
      this.field5601.addGoal(8, new ResetAngerGoal<WolfEntity>(this, true));
   }

   public static MutableAttribute method4373() {
      return MobEntity.method4220().method21849(Attributes.MOVEMENT_SPEED, 0.3F).method21849(Attributes.MAX_HEALTH, 8.0).method21849(Attributes.ATTACK_DAMAGE, 2.0);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5656, false);
      this.dataManager.register(field5657, DyeColor.field400.method309());
      this.dataManager.register(field5658, 0);
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field27256, 0.15F, 1.0F);
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putByte("CollarColor", (byte)this.method4382().method309());
      this.method4364(compound);
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      if (compound.contains("CollarColor", 99)) {
         this.method4383(DyeColor.method315(compound.getInt("CollarColor")));
      }

      this.method4365((ServerWorld)this.world, compound);
   }

   @Override
   public SoundEvent getAmbientSound() {
      if (!this.method4369()) {
         if (this.rand.nextInt(3) != 0) {
            return SoundEvents.field27249;
         } else {
            return this.method4393() && this.getHealth() < 10.0F ? SoundEvents.field27257 : SoundEvents.field27254;
         }
      } else {
         return SoundEvents.field27251;
      }
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27253;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27250;
   }

   @Override
   public float getSoundVolume() {
      return 0.4F;
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (!this.world.isRemote && this.field5662 && !this.field5663 && !this.method4772() && this.onGround) {
         this.field5663 = true;
         this.field5664 = 0.0F;
         this.field5665 = 0.0F;
         this.world.setEntityState(this, (byte)8);
      }

      if (!this.world.isRemote) {
         this.method4366((ServerWorld)this.world, true);
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (this.isAlive()) {
         this.field5661 = this.field5660;
         if (!this.method4387()) {
            this.field5660 = this.field5660 + (0.0F - this.field5660) * 0.4F;
         } else {
            this.field5660 = this.field5660 + (1.0F - this.field5660) * 0.4F;
         }

         if (!this.isInWaterRainOrBubbleColumn()) {
            if ((this.field5662 || this.field5663) && this.field5663) {
               if (this.field5664 == 0.0F) {
                  this.playSound(SoundEvents.field27255, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
               }

               this.field5665 = this.field5664;
               this.field5664 += 0.05F;
               if (this.field5665 >= 2.0F) {
                  this.field5662 = false;
                  this.field5663 = false;
                  this.field5665 = 0.0F;
                  this.field5664 = 0.0F;
               }

               if (this.field5664 > 0.4F) {
                  float var3 = (float)this.getPosY();
                  int var4 = (int)(MathHelper.sin((this.field5664 - 0.4F) * (float) Math.PI) * 7.0F);
                  Vector3d var5 = this.getMotion();

                  for (int var6 = 0; var6 < var4; var6++) {
                     float var7 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.getWidth() * 0.5F;
                     float var8 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.getWidth() * 0.5F;
                     this.world
                        .addParticle(
                           ParticleTypes.field34099,
                           this.getPosX() + (double)var7,
                           (double)(var3 + 0.8F),
                           this.getPosZ() + (double)var8,
                           var5.x,
                           var5.y,
                           var5.z
                        );
                  }
               }
            }
         } else {
            this.field5662 = true;
            if (this.field5663 && !this.world.isRemote) {
               this.world.setEntityState(this, (byte)56);
               this.method4374();
            }
         }
      }
   }

   private void method4374() {
      this.field5663 = false;
      this.field5664 = 0.0F;
      this.field5665 = 0.0F;
   }

   @Override
   public void onDeath(DamageSource var1) {
      this.field5662 = false;
      this.field5663 = false;
      this.field5665 = 0.0F;
      this.field5664 = 0.0F;
      super.onDeath(var1);
   }

   public boolean method4375() {
      return this.field5662;
   }

   public float method4376(float var1) {
      return Math.min(0.5F + MathHelper.lerp(var1, this.field5665, this.field5664) / 2.0F * 0.5F, 1.0F);
   }

   public float method4377(float var1, float var2) {
      float var5 = (MathHelper.lerp(var1, this.field5665, this.field5664) + var2) / 1.8F;
      if (!(var5 < 0.0F)) {
         if (var5 > 1.0F) {
            var5 = 1.0F;
         }
      } else {
         var5 = 0.0F;
      }

      return MathHelper.sin(var5 * (float) Math.PI) * MathHelper.sin(var5 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float method4378(float var1) {
      return MathHelper.lerp(var1, this.field5661, this.field5660) * 0.15F * (float) Math.PI;
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return var2.field39969 * 0.8F;
   }

   @Override
   public int method4259() {
      return !this.method4395() ? super.method4259() : 20;
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (!this.isInvulnerableTo(source)) {
         Entity var5 = source.getTrueSource();
         this.method4403(false);
         if (var5 != null && !(var5 instanceof PlayerEntity) && !(var5 instanceof AbstractArrowEntity)) {
            var2 = (var2 + 1.0F) / 2.0F;
         }

         return super.attackEntityFrom(source, var2);
      } else {
         return false;
      }
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      boolean var4 = var1.attackEntityFrom(DamageSource.method31115(this), (float)((int)this.getAttributeValue(Attributes.ATTACK_DAMAGE)));
      if (var4) {
         this.applyEnchantments(this, var1);
      }

      return var4;
   }

   @Override
   public void method4379(boolean var1) {
      super.method4379(var1);
      if (!var1) {
         this.getAttribute(Attributes.MAX_HEALTH).method38661(8.0);
      } else {
         this.getAttribute(Attributes.MAX_HEALTH).method38661(20.0);
         this.setHealth(20.0F);
      }

      this.getAttribute(Attributes.ATTACK_DAMAGE).method38661(4.0);
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      Item var6 = var5.getItem();
      if (!this.world.isRemote) {
         if (!this.method4393()) {
            if (var6 == Items.field37935 && !this.method4369()) {
               if (!var1.abilities.isCreativeMode) {
                  var5.shrink(1);
               }

               if (this.rand.nextInt(3) != 0) {
                  this.world.setEntityState(this, (byte)6);
               } else {
                  this.method4399(var1);
                  this.field5599.method21666();
                  this.method4233((LivingEntity)null);
                  this.method4403(true);
                  this.world.setEntityState(this, (byte)7);
               }

               return ActionResultType.SUCCESS;
            }
         } else {
            if (this.method4381(var5) && this.getHealth() < this.method3075()) {
               if (!var1.abilities.isCreativeMode) {
                  var5.shrink(1);
               }

               this.heal((float)var6.method11745().method36157());
               return ActionResultType.SUCCESS;
            }

            if (!(var6 instanceof Class3321)) {
               ActionResultType var9 = super.method4285(var1, var2);
               if ((!var9.isSuccessOrConsume() || this.isChild()) && this.method4401(var1)) {
                  this.method4403(!this.method4402());
                  this.isJumping = false;
                  this.field5599.method21666();
                  this.method4233((LivingEntity)null);
                  return ActionResultType.SUCCESS;
               }

               return var9;
            }

            DyeColor var8 = ((Class3321)var6).method11876();
            if (var8 != this.method4382()) {
               this.method4383(var8);
               if (!var1.abilities.isCreativeMode) {
                  var5.shrink(1);
               }

               return ActionResultType.SUCCESS;
            }
         }

         return super.method4285(var1, var2);
      } else {
         boolean var7 = this.method4401(var1) || this.method4393() || var6 == Items.field37935 && !this.method4393() && !this.method4369();
         return !var7 ? ActionResultType.field14820 : ActionResultType.field14819;
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 8) {
         if (var1 != 56) {
            super.handleStatusUpdate(var1);
         } else {
            this.method4374();
         }
      } else {
         this.field5663 = true;
         this.field5664 = 0.0F;
         this.field5665 = 0.0F;
      }
   }

   public float method4380() {
      if (!this.method4369()) {
         return !this.method4393() ? (float) (Math.PI / 5) : (0.55F - (this.method3075() - this.getHealth()) * 0.02F) * (float) Math.PI;
      } else {
         return 1.5393804F;
      }
   }

   @Override
   public boolean method4381(ItemStack var1) {
      Item var4 = var1.getItem();
      return var4.isFood() && var4.method11745().method36159();
   }

   @Override
   public int method4267() {
      return 8;
   }

   @Override
   public int method4348() {
      return this.dataManager.<Integer>method35445(field5658);
   }

   @Override
   public void method4347(int var1) {
      this.dataManager.set(field5658, var1);
   }

   @Override
   public void method4346() {
      this.method4347(field5666.method29319(this.rand));
   }

   @Override
   public void method3016(PlayerEntity var1) {

   }

   @Nullable
   @Override
   public UUID method4350() {
      return this.field5667;
   }

   @Override
   public void setAngerTarget(UUID var1) {
      this.field5667 = var1;
   }

   public DyeColor method4382() {
      return DyeColor.method315(this.dataManager.<Integer>method35445(field5657));
   }

   public void method4383(DyeColor var1) {
      this.dataManager.set(field5657, var1.method309());
   }

   public WolfEntity method4389(ServerWorld var1, Class1045 var2) {
      WolfEntity var5 = EntityType.WOLF.create(var1);
      UUID var6 = this.method4397();
      if (var6 != null) {
         var5.method4398(var6);
         var5.method4379(true);
      }

      return var5;
   }

   public void method4385(boolean var1) {
      this.dataManager.set(field5656, var1);
   }

   @Override
   public boolean method4386(AnimalEntity var1) {
      if (var1 == this) {
         return false;
      } else if (this.method4393()) {
         if (!(var1 instanceof WolfEntity)) {
            return false;
         } else {
            WolfEntity var4 = (WolfEntity)var1;
            if (var4.method4393()) {
               return var4.method4395() ? false : this.method4507() && var4.method4507();
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean method4387() {
      return this.dataManager.<Boolean>method35445(field5656);
   }

   @Override
   public boolean method4388(LivingEntity var1, LivingEntity var2) {
      if (var1 instanceof CreeperEntity || var1 instanceof GhastEntity) {
         return false;
      } else if (!(var1 instanceof WolfEntity)) {
         if (var1 instanceof PlayerEntity && var2 instanceof PlayerEntity && !((PlayerEntity)var2).method2742((PlayerEntity)var1)) {
            return false;
         } else {
            return var1 instanceof AbstractHorseEntity && ((AbstractHorseEntity)var1).method4932() ? false : !(var1 instanceof TameableEntity) || !((TameableEntity)var1).method4393();
         }
      } else {
         WolfEntity var5 = (WolfEntity)var1;
         return !var5.method4393() || var5.method4400() != var2;
      }
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return !this.method4369() && super.method4295(var1);
   }

   @Override
   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, (double)(0.6F * this.getEyeHeight()), (double)(this.getWidth() * 0.4F));
   }

   // $VF: synthetic method
   public static Random method4391(WolfEntity var0) {
      return var0.rand;
   }

   public class Class2773<T extends LivingEntity> extends Class2770<T> {
      private final WolfEntity field17362;

      public Class2773(WolfEntity var1, Class<T> var2, float var3, double var4, double var5) {
         super(var1, var2, var3, var4, var5);
         this.field17362 = var1;
      }

      @Override
      public boolean method10803() {
         return super.method10803() && this.field17352 instanceof LlamaEntity
            ? !this.field17362.method4393() && this.method10966((LlamaEntity)this.field17352)
            : false;
      }

      private boolean method10966(LlamaEntity var1) {
         return var1.method4887() >= method4391(WolfEntity.this).nextInt(5);
      }

      @Override
      public void method10804() {
         WolfEntity.this.method4233(null);
         super.method10804();
      }

      @Override
      public void method10805() {
         WolfEntity.this.method4233(null);
         super.method10805();
      }
   }
}
