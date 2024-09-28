package net.minecraft.entity;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.FrostWalkerEnchantment;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.passive.WolfEntity;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.JumpEvent;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;

public abstract class LivingEntity extends Entity {
   private static final UUID SPRINTING_SPEED_BOOST_ID = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
   private static final UUID SOUL_SPEED_BOOT_ID = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final AttributeModifier SPRINTING_SPEED_BOOST = new AttributeModifier(SPRINTING_SPEED_BOOST_ID, "Sprinting speed boost", 0.3F, AttributeModifier.Operation.MULTIPLY_TOTAL);
   public static final DataParameter<Byte> LIVING_FLAGS = EntityDataManager.<Byte>createKey(LivingEntity.class, DataSerializers.field33390);
   private static final DataParameter<Float> field4935 = EntityDataManager.<Float>createKey(LivingEntity.class, DataSerializers.field33392);
   private static final DataParameter<Integer> field4936 = EntityDataManager.<Integer>createKey(LivingEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Boolean> field4937 = EntityDataManager.<Boolean>createKey(LivingEntity.class, DataSerializers.field33398);
   private static final DataParameter<Integer> field4938 = EntityDataManager.<Integer>createKey(LivingEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field4939 = EntityDataManager.<Integer>createKey(LivingEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Optional<BlockPos>> field4940 = EntityDataManager.<Optional<BlockPos>>createKey(LivingEntity.class, DataSerializers.field33402);
   public static final EntitySize SLEEPING_SIZE = EntitySize.method32102(0.2F, 0.2F);
   private final AttributeModifierManager attributes;
   private final CombatTracker combatTracker = new CombatTracker(this);
   private final Map<Effect, EffectInstance> field4944 = Maps.newHashMap();
   private final NonNullList<ItemStack> handInventory = NonNullList.<ItemStack>method68(2, ItemStack.EMPTY);
   private final NonNullList<ItemStack> armorArray = NonNullList.<ItemStack>method68(4, ItemStack.EMPTY);
   public boolean isSwingInProgress;
   public Hand swingingHand;
   public int swingProgressInt;
   public int arrowHitTimer;
   public int beeStingRemovalCooldown;
   public int hurtTime;
   public int maxHurtTime;
   public float attackedAtYaw;
   public int deathTime;
   public float prevSwingProgress;
   public float swingProgress;
   public int ticksSinceLastSwing;
   public float prevLimbSwingAmount;
   public float field4960;
   public float field4961;
   public final int field4962 = 20;
   public final float field4963;
   public final float field4964;
   public float renderYawOffset;
   public float prevRenderYawOffset;
   public float rotationYawHead;
   public float prevRotationYawHead;
   public float jumpMovementFactor = 0.02F;
   public PlayerEntity attackingPlayer;
   public int field4971;
   public boolean dead;
   public int field4973;
   public float prevOnGroundSpeedFactor;
   public float onGroundSpeedFactor;
   public float movedDistance;
   public float prevMovedDistance;
   public float field4978;
   public int scoreValue;
   public float lastDamage;
   public boolean isJumping;
   public float moveStrafing;
   public float moveVertical;
   public float moveForward;
   public int newPosRotationIncrements;
   public double interpTargetX;
   public double interpTargetY;
   public double interpTargetZ;
   public double interpTargetYaw;
   public double interpTargetPitch;
   public double interpTargetHeadYaw;
   public int interpTicksHead;
   private boolean potionsNeedUpdate = true;
   private LivingEntity field4994;
   private int field4995;
   private LivingEntity field4996;
   private int field4997;
   private float landMovementFactor;
   public int jumpTicks;
   private float absorptionAmount;
   public ItemStack activeItemStack = ItemStack.EMPTY;
   public int activeItemStackUseCount;
   public int field5003;
   private BlockPos prevBlockpos;
   private Optional<BlockPos> field5005 = Optional.<BlockPos>empty();
   private DamageSource field5006;
   private long field5007;
   public int spinAttackDuration;
   private float swimAnimation;
   private float lastSwimAnimation;
   public Brain<?> field5011;

   public LivingEntity(EntityType<? extends LivingEntity> var1, World var2) {
      super(var1, var2);
      this.attributes = new AttributeModifierManager(Class9614.method37375(var1));
      this.setHealth(this.method3075());
      this.preventEntitySpawning = true;
      this.field4964 = (float)((Math.random() + 1.0) * 0.01F);
      this.recenterBoundingBox();
      this.field4963 = (float)Math.random() * 12398.0F;
      this.rotationYaw = (float)(Math.random() * (float) (Math.PI * 2));
      this.rotationYawHead = this.rotationYaw;
      this.stepHeight = 0.6F;
      NBTDynamicOps var5 = NBTDynamicOps.INSTANCE;
      this.field5011 = this.createBrain(new Dynamic(var5, var5.createMap(ImmutableMap.of(var5.createString("memories"), var5.emptyMap()))));
   }

   public Brain<?> getBrain() {
      return this.field5011;
   }

   public Class6971<?> getBrainCodec() {
      return Brain.method21400(ImmutableList.of(), ImmutableList.of());
   }

   public Brain<?> createBrain(Dynamic<?> var1) {
      return this.getBrainCodec().method21513(var1);
   }

   @Override
   public void onKillCommand() {
      this.attackEntityFrom(DamageSource.field39004, Float.MAX_VALUE);
   }

   public boolean canAttack(EntityType<?> var1) {
      return true;
   }

   @Override
   public void registerData() {
      this.dataManager.register(LIVING_FLAGS, (byte)0);
      this.dataManager.register(field4936, 0);
      this.dataManager.register(field4937, false);
      this.dataManager.register(field4938, 0);
      this.dataManager.register(field4939, 0);
      this.dataManager.register(field4935, 1.0F);
      this.dataManager.register(field4940, Optional.<BlockPos>empty());
   }

   public static Class7037 method2997() {
      return Class9767.method38416()
         .method21848(Attributes.field42105)
         .method21848(Attributes.field42107)
         .method21848(Attributes.MOVEMENT_SPEED)
         .method21848(Attributes.field42113)
         .method21848(Attributes.field42114);
   }

   @Override
   public void updateFallState(double var1, boolean var3, BlockState var4, BlockPos var5) {
      if (!this.isInWater()) {
         this.method3258();
      }

      if (!this.world.isRemote && var3 && this.fallDistance > 0.0F) {
         this.method3003();
         this.method3004();
      }

      if (!this.world.isRemote && this.fallDistance > 3.0F && var3) {
         float var8 = (float) MathHelper.ceil(this.fallDistance - 3.0F);
         if (!var4.isAir()) {
            double var9 = Math.min((double)(0.2F + var8 / 15.0F), 2.5);
            int var11 = (int)(150.0 * var9);
            ((ServerWorld)this.world)
               .spawnParticle(new BlockParticleData(ParticleTypes.field34051, var4), this.getPosX(), this.getPosY(), this.getPosZ(), var11, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.updateFallState(var1, var3, var4, var5);
   }

   public boolean canBreatheUnderwater() {
      return this.getCreatureAttribute() == CreatureAttribute.field33506;
   }

   public float getSwimAnimation(float var1) {
      return MathHelper.lerp(var1, this.lastSwimAnimation, this.swimAnimation);
   }

   @Override
   public void baseTick() {
      this.prevSwingProgress = this.swingProgress;
      if (this.firstUpdate) {
         this.getBedPosition().ifPresent(this::setSleepingPosition);
      }

      if (this.getMovementSpeed()) {
         this.addSprintingEffect();
      }

      super.baseTick();
      this.world.getProfiler().startSection("livingEntityBaseTick");
      boolean var3 = this instanceof PlayerEntity;
      if (this.isAlive()) {
         if (!this.isEntityInsideOpaqueBlock()) {
            if (var3 && !this.world.getWorldBorder().method24525(this.getBoundingBox())) {
               double var4 = this.world.getWorldBorder().method24526(this) + this.world.getWorldBorder().method24546();
               if (var4 < 0.0) {
                  double var6 = this.world.getWorldBorder().method24548();
                  if (var6 > 0.0) {
                     this.attackEntityFrom(DamageSource.field38997, (float)Math.max(1, MathHelper.floor(-var4 * var6)));
                  }
               }
            }
         } else {
            this.attackEntityFrom(DamageSource.field38997, 1.0F);
         }
      }

      if (this.isImmuneToFire() || this.world.isRemote) {
         this.extinguish();
      }

      boolean var8 = var3 && ((PlayerEntity)this).abilities.disableDamage;
      if (this.isAlive()) {
         if (this.areEyesInFluid(FluidTags.field40469)
            && !this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosYEye(), this.getPosZ())).isIn(Blocks.field37013)) {
            if (!this.canBreatheUnderwater() && !Class7182.method22538(this) && !var8) {
               this.setAir(this.decreaseAirSupply(this.getAir()));
               if (this.getAir() == -20) {
                  this.setAir(0);
                  Vector3d var9 = this.getMotion();

                  for (int var10 = 0; var10 < 8; var10++) {
                     double var11 = this.rand.nextDouble() - this.rand.nextDouble();
                     double var13 = this.rand.nextDouble() - this.rand.nextDouble();
                     double var15 = this.rand.nextDouble() - this.rand.nextDouble();
                     this.world
                        .addParticle(
                           ParticleTypes.field34052,
                           this.getPosX() + var11,
                           this.getPosY() + var13,
                           this.getPosZ() + var15,
                           var9.x,
                           var9.y,
                           var9.z
                        );
                  }

                  this.attackEntityFrom(DamageSource.field38999, 2.0F);
               }
            }

            if (!this.world.isRemote && this.isPassenger() && this.getRidingEntity() != null && !this.getRidingEntity().onDeathUpdate()) {
               this.stopRiding();
            }
         } else if (this.getAir() < this.getMaxAir()) {
            this.setAir(this.determineNextAir(this.getAir()));
         }

         if (!this.world.isRemote) {
            BlockPos var17 = this.getPosition();
            if (!Objects.equal(this.prevBlockpos, var17)) {
               this.prevBlockpos = var17;
               this.frostWalk(var17);
            }
         }
      }

      if (this.isAlive() && this.isInWaterRainOrBubbleColumn()) {
         this.extinguish();
      }

      if (this.hurtTime > 0) {
         this.hurtTime--;
      }

      if (this.hurtResistantTime > 0 && !(this instanceof ServerPlayerEntity)) {
         this.hurtResistantTime--;
      }

      if (this.getShouldBeDead()) {
         this.method3008();
      }

      if (this.field4971 <= 0) {
         this.attackingPlayer = null;
      } else {
         this.field4971--;
      }

      if (this.field4996 != null && !this.field4996.isAlive()) {
         this.field4996 = null;
      }

      if (this.field4994 != null) {
         if (this.field4994.isAlive()) {
            if (this.ticksExisted - this.field4995 > 100) {
               this.setRevengeTarget((LivingEntity)null);
            }
         } else {
            this.setRevengeTarget((LivingEntity)null);
         }
      }

      this.updatePotionEffects();
      this.prevMovedDistance = this.movedDistance;
      this.prevRenderYawOffset = this.renderYawOffset;
      this.prevRotationYawHead = this.rotationYawHead;
      this.prevRotationYaw = this.rotationYaw;
      this.prevRotationPitch = this.rotationPitch;
      this.world.getProfiler().endSection();
   }

   public boolean getMovementSpeed() {
      return this.ticksExisted % 5 == 0
         && this.getMotion().x != 0.0
         && this.getMotion().z != 0.0
         && !this.isSpectator()
         && EnchantmentHelper.method26333(this)
         && this.method2889();
   }

   public void addSprintingEffect() {
      Vector3d var3 = this.getMotion();
      this.world
         .addParticle(
            ParticleTypes.field34076,
            this.getPosX() + (this.rand.nextDouble() - 0.5) * (double)this.getWidth(),
            this.getPosY() + 0.1,
            this.getPosZ() + (this.rand.nextDouble() - 0.5) * (double)this.getWidth(),
            var3.x * -0.2,
            0.1,
            var3.z * -0.2
         );
      float var4 = !(this.rand.nextFloat() * 0.4F + this.rand.nextFloat() > 0.9F) ? 0.0F : 0.6F;
      this.playSound(SoundEvents.field27092, var4, 0.6F + this.rand.nextFloat() * 0.4F);
   }

   public boolean method2889() {
      return this.world.getBlockState(this.getPositionUnderneath()).isIn(BlockTags.field32802);
   }

   @Override
   public float getSpeedFactor() {
      return this.method2889() && EnchantmentHelper.method26322(Enchantments.SOUL_SPEED, this) > 0 ? 1.0F : super.getSpeedFactor();
   }

   public boolean method2985(BlockState var1) {
      return !var1.isAir() || this.isElytraFlying();
   }

   public void method3003() {
      ModifiableAttributeInstance var3 = this.getAttribute(Attributes.MOVEMENT_SPEED);
      if (var3 != null && var3.method38664(SOUL_SPEED_BOOT_ID) != null) {
         var3.method38671(SOUL_SPEED_BOOT_ID);
      }
   }

   public void method3004() {
      if (!this.getStateBelow().isAir()) {
         int var3 = EnchantmentHelper.method26322(Enchantments.SOUL_SPEED, this);
         if (var3 > 0 && this.method2889()) {
            ModifiableAttributeInstance var4 = this.getAttribute(Attributes.MOVEMENT_SPEED);
            if (var4 == null) {
               return;
            }

            var4.method38667(new AttributeModifier(SOUL_SPEED_BOOT_ID, "Soul speed boost", (double)(0.03F * (1.0F + (float)var3 * 0.35F)), AttributeModifier.Operation.ADDITION));
            if (this.getRNG().nextFloat() < 0.04F) {
               ItemStack var5 = this.getItemStackFromSlot(EquipmentSlotType.FEET);
               var5.damageItem(1, this, var0 -> var0.sendBreakAnimation(EquipmentSlotType.FEET));
            }
         }
      }
   }

   public void frostWalk(BlockPos var1) {
      int var4 = EnchantmentHelper.method26322(Enchantments.FROST_WALKER, this);
      if (var4 > 0) {
         FrostWalkerEnchantment.method18829(this, this.world, var1, var4);
      }

      if (this.method2985(this.getStateBelow())) {
         this.method3003();
      }

      this.method3004();
   }

   public boolean isChild() {
      return false;
   }

   public float getRenderScale() {
      return !this.isChild() ? 1.0F : 0.5F;
   }

   public boolean method2897() {
      return true;
   }

   @Override
   public boolean onDeathUpdate() {
      return false;
   }

   public void method3008() {
      this.deathTime++;
      if (this.deathTime == 20) {
         this.remove();

         for (int var3 = 0; var3 < 20; var3++) {
            double var4 = this.rand.nextGaussian() * 0.02;
            double var6 = this.rand.nextGaussian() * 0.02;
            double var8 = this.rand.nextGaussian() * 0.02;
            this.world.addParticle(ParticleTypes.field34089, this.getPosXRandom(1.0), this.getPosYRandom(), this.getPosZRandom(1.0), var4, var6, var8);
         }
      }
   }

   public boolean canDropLoot() {
      return !this.isChild();
   }

   public boolean method3010() {
      return !this.isChild();
   }

   public int decreaseAirSupply(int var1) {
      int var4 = EnchantmentHelper.method26325(this);
      return var4 > 0 && this.rand.nextInt(var4 + 1) > 0 ? var1 : var1 - 1;
   }

   public int determineNextAir(int var1) {
      return Math.min(var1 + 4, this.getMaxAir());
   }

   public int getExperiencePoints(PlayerEntity var1) {
      return 0;
   }

   public boolean isPlayer() {
      return false;
   }

   public Random getRNG() {
      return this.rand;
   }

   @Nullable
   public LivingEntity method3014() {
      return this.field4994;
   }

   public int method3015() {
      return this.field4995;
   }

   public void method3016(PlayerEntity var1) {
      this.attackingPlayer = var1;
      this.field4971 = this.ticksExisted;
   }

   public void setRevengeTarget(LivingEntity var1) {
      this.field4994 = var1;
      this.field4995 = this.ticksExisted;
   }

   @Nullable
   public LivingEntity getLastAttackedEntity() {
      return this.field4996;
   }

   public int getLastAttackedEntityTime() {
      return this.field4997;
   }

   public void method3020(Entity var1) {
      if (!(var1 instanceof LivingEntity)) {
         this.field4996 = null;
      } else {
         this.field4996 = (LivingEntity)var1;
      }

      this.field4997 = this.ticksExisted;
   }

   public int method3021() {
      return this.field4973;
   }

   public void method3022(int var1) {
      this.field4973 = var1;
   }

   public void playEquipSound(ItemStack var1) {
      if (!var1.isEmpty()) {
         SoundEvent var4 = SoundEvents.field26351;
         Item var5 = var1.getItem();
         if (!(var5 instanceof ArmorItem)) {
            if (var5 == Items.field38120) {
               var4 = SoundEvents.field26350;
            }
         } else {
            var4 = ((ArmorItem)var5).getArmorMaterial().getSoundEvent();
         }

         this.playSound(var4, 1.0F, 1.0F);
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      var1.putFloat("Health", this.getHealth());
      var1.putShort("HurtTime", (short)this.hurtTime);
      var1.putInt("HurtByTimestamp", this.field4995);
      var1.putShort("DeathTime", (short)this.deathTime);
      var1.putFloat("AbsorptionAmount", this.getAbsorptionAmount());
      var1.put("Attributes", this.getAttributeManager().method33389());
      if (!this.field4944.isEmpty()) {
         ListNBT var4 = new ListNBT();

         for (EffectInstance var6 : this.field4944.values()) {
            var4.add(var6.method8637(new CompoundNBT()));
         }

         var1.put("ActiveEffects", var4);
      }

      var1.putBoolean("FallFlying", this.isElytraFlying());
      this.getBedPosition().ifPresent(var1x -> {
         var1.putInt("SleepingX", var1x.getX());
         var1.putInt("SleepingY", var1x.getY());
         var1.putInt("SleepingZ", var1x.getZ());
      });
      DataResult var7 = this.field5011.method21402(NBTDynamicOps.INSTANCE);
      var7.resultOrPartial(LOGGER::error).ifPresent(var1x -> var1.put("Brain", (INBT) var1x));
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      this.setAbsorptionAmount(var1.getFloat("AbsorptionAmount"));
      if (var1.contains("Attributes", 9) && this.world != null && !this.world.isRemote) {
         this.getAttributeManager().method33390(var1.method131("Attributes", 10));
      }

      if (var1.contains("ActiveEffects", 9)) {
         ListNBT var4 = var1.method131("ActiveEffects", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            CompoundNBT var6 = var4.method153(var5);
            EffectInstance var7 = EffectInstance.method8639(var6);
            if (var7 != null) {
               this.field4944.put(var7.getPotion(), var7);
            }
         }
      }

      if (var1.contains("Health", 99)) {
         this.setHealth(var1.getFloat("Health"));
      }

      this.hurtTime = var1.getShort("HurtTime");
      this.deathTime = var1.getShort("DeathTime");
      this.field4995 = var1.getInt("HurtByTimestamp");
      if (var1.contains("Team", 8)) {
         String var8 = var1.getString("Team");
         ScorePlayerTeam var10 = this.world.method6805().method20990(var8);
         boolean var11 = var10 != null && this.world.method6805().method20993(this.method3376(), var10);
         if (!var11) {
            LOGGER.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", var8);
         }
      }

      if (var1.getBoolean("FallFlying")) {
         this.setFlag(7, true);
      }

      if (var1.contains("SleepingX", 99) && var1.contains("SleepingY", 99) && var1.contains("SleepingZ", 99)) {
         BlockPos var9 = new BlockPos(var1.getInt("SleepingX"), var1.getInt("SleepingY"), var1.getInt("SleepingZ"));
         this.setBedPosition(var9);
         this.dataManager.method35446(POSE, Pose.field13621);
         if (!this.firstUpdate) {
            this.setSleepingPosition(var9);
         }
      }

      if (var1.contains("Brain", 10)) {
         this.field5011 = this.createBrain(new Dynamic(NBTDynamicOps.INSTANCE, var1.method116("Brain")));
      }
   }

   public void updatePotionEffects() {
      Iterator var3 = this.field4944.keySet().iterator();

      try {
         while (var3.hasNext()) {
            Effect var4 = (Effect)var3.next();
            EffectInstance var5 = this.field4944.get(var4);
            if (!var5.method8633(this, () -> this.onChangedPotionEffect(var5, true))) {
               if (!this.world.isRemote) {
                  var3.remove();
                  this.onFinishedPotionEffect(var5);
               }
            } else if (var5.method8628() % 600 == 0) {
               this.onChangedPotionEffect(var5, false);
            }
         }
      } catch (ConcurrentModificationException var13) {
      }

      if (this.potionsNeedUpdate) {
         if (!this.world.isRemote) {
            this.updatePotionMetadata();
         }

         this.potionsNeedUpdate = false;
      }

      int var14 = this.dataManager.<Integer>method35445(field4936);
      boolean var15 = this.dataManager.<Boolean>method35445(field4937);
      if (var14 > 0) {
         boolean var6;
         if (this.isInvisible()) {
            var6 = this.rand.nextInt(15) == 0;
         } else {
            var6 = this.rand.nextBoolean();
         }

         if (var15) {
            var6 &= this.rand.nextInt(5) == 0;
         }

         if (var6 && var14 > 0) {
            double var7 = (double)(var14 >> 16 & 0xFF) / 255.0;
            double var9 = (double)(var14 >> 8 & 0xFF) / 255.0;
            double var11 = (double)(var14 >> 0 & 0xFF) / 255.0;
            this.world
               .addParticle(
                  var15 ? ParticleTypes.field34048 : ParticleTypes.field34068, this.getPosXRandom(0.5), this.getPosYRandom(), this.getPosZRandom(0.5), var7, var9, var11
               );
         }
      }
   }

   public void updatePotionMetadata() {
      if (!this.field4944.isEmpty()) {
         Collection var3 = this.field4944.values();
         this.dataManager.method35446(field4937, areAllPotionsAmbient(var3));
         this.dataManager.method35446(field4936, Class9741.method38184(var3));
         this.setInvisible(this.isPotionActive(Effects.INVISIBILITY));
      } else {
         this.resetPotionEffectMetadata();
         this.setInvisible(false);
      }
   }

   public double getVisibilityMultiplier(Entity var1) {
      double var4 = 1.0;
      if (this.isDiscrete()) {
         var4 *= 0.8;
      }

      if (this.isInvisible()) {
         float var6 = this.getArmorCoverPercentage();
         if (var6 < 0.1F) {
            var6 = 0.1F;
         }

         var4 *= 0.7 * (double)var6;
      }

      if (var1 != null) {
         ItemStack var9 = this.getItemStackFromSlot(EquipmentSlotType.HEAD);
         Item var7 = var9.getItem();
         EntityType var8 = var1.getType();
         if (var8 == EntityType.field41078 && var7 == Items.field38058
            || var8 == EntityType.field41107 && var7 == Items.field38061
            || var8 == EntityType.field41017 && var7 == Items.field38062) {
            var4 *= 0.5;
         }
      }

      return var4;
   }

   public boolean canAttack(LivingEntity var1) {
      return true;
   }

   public boolean canAttack(LivingEntity var1, Class8522 var2) {
      return var2.canTarget(this, var1);
   }

   public static boolean areAllPotionsAmbient(Collection<EffectInstance> var0) {
      for (EffectInstance var4 : var0) {
         if (!var4.isAmbient()) {
            return false;
         }
      }

      return true;
   }

   public void resetPotionEffectMetadata() {
      this.dataManager.method35446(field4937, false);
      this.dataManager.method35446(field4936, 0);
   }

   public boolean clearActivePotions() {
      if (this.world.isRemote) {
         return false;
      } else {
         Iterator var3 = this.field4944.values().iterator();

         boolean var4;
         for (var4 = false; var3.hasNext(); var4 = true) {
            this.onFinishedPotionEffect((EffectInstance)var3.next());
            var3.remove();
         }

         return var4;
      }
   }

   public Collection<EffectInstance> getActivePotionEffects() {
      return this.field4944.values();
   }

   public Map<Effect, EffectInstance> getActivePotionMap() {
      return this.field4944;
   }

   public boolean isPotionActive(Effect var1) {
      return this.field4944.containsKey(var1);
   }

   @Nullable
   public EffectInstance getActivePotionEffect(Effect var1) {
      return this.field4944.get(var1);
   }

   public boolean addPotionEffect(EffectInstance var1) {
      if (this.isPotionApplicable(var1)) {
         EffectInstance var4 = this.field4944.get(var1.getPotion());
         if (var4 != null) {
            if (!var4.method8626(var1)) {
               return false;
            } else {
               this.onChangedPotionEffect(var4, true);
               return true;
            }
         } else {
            this.field4944.put(var1.getPotion(), var1);
            this.onNewPotionEffect(var1);
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean isPotionApplicable(EffectInstance var1) {
      if (this.getCreatureAttribute() == CreatureAttribute.field33506) {
         Effect var4 = var1.getPotion();
         if (var4 == Effects.REGENERATION || var4 == Effects.POISON) {
            return false;
         }
      }

      return true;
   }

   public void method3037(EffectInstance var1) {
      if (this.isPotionApplicable(var1)) {
         EffectInstance var4 = this.field4944.put(var1.getPotion(), var1);
         if (var4 != null) {
            this.onChangedPotionEffect(var1, true);
         } else {
            this.onNewPotionEffect(var1);
         }
      }
   }

   public boolean isEntityUndead() {
      return this.getCreatureAttribute() == CreatureAttribute.field33506;
   }

   @Nullable
   public EffectInstance removeActivePotionEffect(Effect var1) {
      return this.field4944.remove(var1);
   }

   public boolean removeEffects(Effect var1) {
      EffectInstance var4 = this.removeActivePotionEffect(var1);
      if (var4 == null) {
         return false;
      } else {
         this.onFinishedPotionEffect(var4);
         return true;
      }
   }

   public void onNewPotionEffect(EffectInstance var1) {
      this.potionsNeedUpdate = true;
      if (!this.world.isRemote) {
         var1.getPotion().applyAttributesModifiersToEntity(this, this.getAttributeManager(), var1.method8629());
      }
   }

   public void onChangedPotionEffect(EffectInstance var1, boolean var2) {
      this.potionsNeedUpdate = true;
      if (var2 && !this.world.isRemote) {
         Effect var5 = var1.getPotion();
         var5.removeAttributesModifiersFromEntity(this, this.getAttributeManager(), var1.method8629());
         var5.applyAttributesModifiersToEntity(this, this.getAttributeManager(), var1.method8629());
      }
   }

   public void onFinishedPotionEffect(EffectInstance var1) {
      this.potionsNeedUpdate = true;
      if (!this.world.isRemote) {
         var1.getPotion().removeAttributesModifiersFromEntity(this, this.getAttributeManager(), var1.method8629());
      }
   }

   public void heal(float var1) {
      float var4 = this.getHealth();
      if (var4 > 0.0F) {
         this.setHealth(var4 + var1);
      }
   }

   public float getHealth() {
      return this.dataManager.<Float>method35445(field4935);
   }

   public void setHealth(float var1) {
      this.dataManager.method35446(field4935, MathHelper.clamp(var1, 0.0F, this.method3075()));
   }

   public boolean getShouldBeDead() {
      return this.getHealth() <= 0.0F;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.isInvulnerableTo(var1)) {
         return false;
      } else if (!this.world.isRemote) {
         if (this.getShouldBeDead()) {
            return false;
         } else if (var1.method31141() && this.isPotionActive(Effects.FIRE_RESISTANCE)) {
            return false;
         } else {
            if (this.isSleeping() && !this.world.isRemote) {
               this.wakeUp();
            }

            this.field4973 = 0;
            float var5 = var2;
            if ((var1 == DamageSource.field39008 || var1 == DamageSource.field39009) && !this.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty()) {
               this.getItemStackFromSlot(EquipmentSlotType.HEAD)
                  .damageItem((int)(var2 * 4.0F + this.rand.nextFloat() * var2 * 2.0F), this, var0 -> var0.sendBreakAnimation(EquipmentSlotType.HEAD));
               var2 *= 0.75F;
            }

            boolean var6 = false;
            float var7 = 0.0F;
            if (var2 > 0.0F && this.canBlockDamageSource(var1)) {
               this.method2887(var2);
               var7 = var2;
               var2 = 0.0F;
               if (!var1.method31129()) {
                  Entity var8 = var1.getImmediateSource();
                  if (var8 instanceof LivingEntity) {
                     this.blockUsingShield((LivingEntity)var8);
                  }
               }

               var6 = true;
            }

            this.field4960 = 1.5F;
            boolean var16 = true;
            if (!((float)this.hurtResistantTime > 10.0F)) {
               this.lastDamage = var2;
               this.hurtResistantTime = 20;
               this.damageEntity(var1, var2);
               this.maxHurtTime = 10;
               this.hurtTime = this.maxHurtTime;
            } else {
               if (var2 <= this.lastDamage) {
                  return false;
               }

               this.damageEntity(var1, var2 - this.lastDamage);
               this.lastDamage = var2;
               var16 = false;
            }

            this.attackedAtYaw = 0.0F;
            Entity var9 = var1.getTrueSource();
            if (var9 != null) {
               if (var9 instanceof LivingEntity) {
                  this.setRevengeTarget((LivingEntity)var9);
               }

               if (!(var9 instanceof PlayerEntity)) {
                  if (var9 instanceof WolfEntity) {
                     WolfEntity var10 = (WolfEntity)var9;
                     if (var10.method4393()) {
                        this.field4971 = 100;
                        LivingEntity var11 = var10.method4400();
                        if (var11 != null && var11.getType() == EntityType.PLAYER) {
                           this.attackingPlayer = (PlayerEntity)var11;
                        } else {
                           this.attackingPlayer = null;
                        }
                     }
                  }
               } else {
                  this.field4971 = 100;
                  this.attackingPlayer = (PlayerEntity)var9;
               }
            }

            if (var16) {
               if (!var6) {
                  if (var1 instanceof EntityDamageSource && ((EntityDamageSource)var1).getIsThornsDamage()) {
                     this.world.setEntityState(this, (byte)33);
                  } else {
                     byte var17;
                     if (var1 != DamageSource.field38999) {
                        if (!var1.method31141()) {
                           if (var1 != DamageSource.field39012) {
                              var17 = 2;
                           } else {
                              var17 = 44;
                           }
                        } else {
                           var17 = 37;
                        }
                     } else {
                        var17 = 36;
                     }

                     this.world.setEntityState(this, var17);
                  }
               } else {
                  this.world.setEntityState(this, (byte)29);
               }

               if (var1 != DamageSource.field38999 && (!var6 || var2 > 0.0F)) {
                  this.markVelocityChanged();
               }

               if (var9 == null) {
                  this.attackedAtYaw = (float)((int)(Math.random() * 2.0) * 180);
               } else {
                  double var12 = var9.getPosX() - this.getPosX();

                  double var14;
                  for (var14 = var9.getPosZ() - this.getPosZ(); var12 * var12 + var14 * var14 < 1.0E-4; var14 = (Math.random() - Math.random()) * 0.01) {
                     var12 = (Math.random() - Math.random()) * 0.01;
                  }

                  this.attackedAtYaw = (float)(MathHelper.method37814(var14, var12) * 180.0F / (float)Math.PI - (double)this.rotationYaw);
                  this.applyKnockback(0.4F, var12, var14);
               }
            }

            if (!this.getShouldBeDead()) {
               if (var16) {
                  this.playHurtSound(var1);
               }
            } else if (!this.checkTotemDeathProtection(var1)) {
               SoundEvent var18 = this.getDeathSound();
               if (var16 && var18 != null) {
                  this.playSound(var18, this.getSoundVolume(), this.getSoundPitch());
               }

               this.onDeath(var1);
            }

            boolean var19 = !var6 || var2 > 0.0F;
            if (var19) {
               this.field5006 = var1;
               this.field5007 = this.world.getGameTime();
            }

            if (this instanceof ServerPlayerEntity) {
               CriteriaTriggers.field44472.method15165((ServerPlayerEntity)this, var1, var5, var2, var6);
               if (var7 > 0.0F && var7 < 3.4028235E37F) {
                  ((ServerPlayerEntity)this).addStat(Stats.field40131, Math.round(var7 * 10.0F));
               }
            }

            if (var9 instanceof ServerPlayerEntity) {
               CriteriaTriggers.field44471.method15093((ServerPlayerEntity)var9, this, var1, var5, var2, var6);
            }

            return var19;
         }
      } else {
         return false;
      }
   }

   public void blockUsingShield(LivingEntity var1) {
      var1.constructKnockBackVector(this);
   }

   public void constructKnockBackVector(LivingEntity var1) {
      var1.applyKnockback(0.5F, var1.getPosX() - this.getPosX(), var1.getPosZ() - this.getPosZ());
   }

   private boolean checkTotemDeathProtection(DamageSource var1) {
      if (var1.method31135()) {
         return false;
      } else {
         ItemStack var4 = null;

         for (Hand var8 : Hand.values()) {
            ItemStack var9 = this.getHeldItem(var8);
            if (var9.getItem() == Items.TOTEM_OF_UNDYING) {
               var4 = var9.copy();
               var9.shrink(1);
               break;
            }
         }

         if (var4 != null) {
            if (this instanceof ServerPlayerEntity) {
               ServerPlayerEntity var10 = (ServerPlayerEntity)this;
               var10.addStat(Stats.field40098.method172(Items.TOTEM_OF_UNDYING));
               CriteriaTriggers.field44492.method15068(var10, var4);
            }

            this.setHealth(1.0F);
            this.clearActivePotions();
            this.addPotionEffect(new EffectInstance(Effects.REGENERATION, 900, 1));
            this.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 100, 1));
            this.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 800, 0));
            this.world.setEntityState(this, (byte)35);
         }

         return var4 != null;
      }
   }

   @Nullable
   public DamageSource getLastDamageSource() {
      if (this.world.getGameTime() - this.field5007 > 40L) {
         this.field5006 = null;
      }

      return this.field5006;
   }

   public void playHurtSound(DamageSource var1) {
      SoundEvent var4 = this.getHurtSound(var1);
      if (var4 != null) {
         this.playSound(var4, this.getSoundVolume(), this.getSoundPitch());
      }
   }

   private boolean canBlockDamageSource(DamageSource var1) {
      Entity var4 = var1.getImmediateSource();
      boolean var5 = false;
      if (var4 instanceof AbstractArrowEntity) {
         AbstractArrowEntity var6 = (AbstractArrowEntity)var4;
         if (var6.method3489() > 0) {
            var5 = true;
         }
      }

      if (!var1.isUnblockable() && this.isActiveItemStackBlocking() && !var5) {
         Vector3d var9 = var1.method31112();
         if (var9 != null) {
            Vector3d var7 = this.getLook(1.0F);
            Vector3d var8 = var9.subtractReverse(this.getPositionVec()).method11333();
            var8 = new Vector3d(var8.x, 0.0, var8.z);
            if (var8.dotProduct(var7) < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   private void renderBrokenItemStack(ItemStack var1) {
      if (!var1.isEmpty()) {
         if (!this.isSilent()) {
            this.world
               .method6745(
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  SoundEvents.field26713,
                  this.method2864(),
                  0.8F,
                  0.8F + this.world.rand.nextFloat() * 0.4F,
                  false
               );
         }

         this.addItemParticles(var1, 5);
      }
   }

   public void onDeath(DamageSource var1) {
      if (!this.removed && !this.dead) {
         Entity var4 = var1.getTrueSource();
         LivingEntity var5 = this.getAttackingEntity();
         if (this.scoreValue >= 0 && var5 != null) {
            var5.awardKillScore(this, this.scoreValue, var1);
         }

         if (this.isSleeping()) {
            this.wakeUp();
         }

         this.dead = true;
         this.getCombatTracker().method27606();
         if (this.world instanceof ServerWorld) {
            if (var4 != null) {
               var4.method2927((ServerWorld)this.world, this);
            }

            this.spawnDrops(var1);
            this.createWitherRose(var5);
         }

         this.world.setEntityState(this, (byte)3);
         this.setPose(Pose.field13625);
      }
   }

   public void createWitherRose(LivingEntity var1) {
      if (!this.world.isRemote) {
         boolean var4 = false;
         if (var1 instanceof WitherEntity) {
            if (this.world.getGameRules().getBoolean(Class5462.field24224)) {
               BlockPos var5 = this.getPosition();
               BlockState var6 = Blocks.WITHER_ROSE.method11579();
               if (this.world.getBlockState(var5).isAir() && var6.method23443(this.world, var5)) {
                  this.world.setBlockState(var5, var6, 3);
                  var4 = true;
               }
            }

            if (!var4) {
               ItemEntity var7 = new ItemEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), new ItemStack(Items.field37345));
               this.world.addEntity(var7);
            }
         }
      }
   }

   public void spawnDrops(DamageSource var1) {
      Entity var4 = var1.getTrueSource();
      int var5;
      if (!(var4 instanceof PlayerEntity)) {
         var5 = 0;
      } else {
         var5 = EnchantmentHelper.method26330((LivingEntity)var4);
      }

      boolean var6 = this.field4971 > 0;
      if (this.method3010() && this.world.getGameRules().getBoolean(Class5462.field24227)) {
         this.dropLoot(var1, var6);
         this.dropSpecialItems(var1, var5, var6);
      }

      this.dropInventory();
      this.dropExperience();
   }

   public void dropInventory() {
   }

   public void dropExperience() {
      if (!this.world.isRemote
         && (this.isPlayer() || this.field4971 > 0 && this.canDropLoot() && this.world.getGameRules().getBoolean(Class5462.field24227))) {
         int var3 = this.getExperiencePoints(this.attackingPlayer);

         while (var3 > 0) {
            int var4 = ExperienceOrbEntity.getXPSplit(var3);
            var3 -= var4;
            this.world.addEntity(new ExperienceOrbEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), var4));
         }
      }
   }

   public void dropSpecialItems(DamageSource var1, int var2, boolean var3) {
   }

   public ResourceLocation getLootTableResourceLocation() {
      return this.getType().method33212();
   }

   public void dropLoot(DamageSource var1, boolean var2) {
      ResourceLocation var5 = this.getLootTableResourceLocation();
      Class7318 var6 = this.world.getServer().method1411().method1058(var5);
      Class9464 var7 = this.method3057(var2, var1);
      var6.method23181(var7.method36460(Class8524.field38286), this::method3302);
   }

   public Class9464 method3057(boolean var1, DamageSource var2) {
      Class9464 var5 = new Class9464((ServerWorld)this.world)
         .method36450(this.rand)
         .method36454(Class9525.field44330, this)
         .method36454(Class9525.field44335, this.getPositionVec())
         .method36454(Class9525.field44332, var2)
         .method36455(Class9525.field44333, var2.getTrueSource())
         .method36455(Class9525.field44334, var2.getImmediateSource());
      if (var1 && this.attackingPlayer != null) {
         var5 = var5.method36454(Class9525.field44331, this.attackingPlayer).method36453(this.attackingPlayer.method2978());
      }

      return var5;
   }

   public void applyKnockback(float var1, double var2, double var4) {
      var1 = (float)((double)var1 * (1.0 - this.getAttributeValue(Attributes.field42107)));
      if (!(var1 <= 0.0F)) {
         this.isAirBorne = true;
         Vector3d var8 = this.getMotion();
         Vector3d var9 = new Vector3d(var2, 0.0, var4).method11333().scale((double)var1);
         this.setMotion(
            var8.x / 2.0 - var9.x,
            !this.onGround ? var8.y : Math.min(0.4, var8.y / 2.0 + (double)var1),
            var8.z / 2.0 - var9.z
         );
      }
   }

   @Nullable
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26612;
   }

   @Nullable
   public SoundEvent getDeathSound() {
      return SoundEvents.field26607;
   }

   public SoundEvent getFallSound(int var1) {
      return var1 <= 4 ? SoundEvents.field26613 : SoundEvents.field26605;
   }

   public SoundEvent getDrinkSound(ItemStack var1) {
      return var1.method32185();
   }

   public SoundEvent getEatSound(ItemStack var1) {
      return var1.method32186();
   }

   @Override
   public void setOnGround(boolean var1) {
      super.setOnGround(var1);
      if (var1) {
         this.field5005 = Optional.<BlockPos>empty();
      }
   }

   public Optional<BlockPos> method3062() {
      return this.field5005;
   }

   public boolean isOnLadder() {
      if (!this.isSpectator()) {
         BlockPos var3 = this.getPosition();
         BlockState var4 = this.getBlockState();
         Block var5 = var4.getBlock();
         if (!var5.isIn(BlockTags.field32804)) {
            if (var5 instanceof Class3206 && this.canGoThroughtTrapDoorOnLadder(var3, var4)) {
               this.field5005 = Optional.<BlockPos>of(var3);
               return true;
            } else {
               return false;
            }
         } else {
            this.field5005 = Optional.<BlockPos>of(var3);
            return true;
         }
      } else {
         return false;
      }
   }

   public BlockState getBlockState() {
      return this.world.getBlockState(this.getPosition());
   }

   private boolean canGoThroughtTrapDoorOnLadder(BlockPos var1, BlockState var2) {
      if (var2.<Boolean>get(Class3206.field18594)) {
         BlockState var5 = this.world.getBlockState(var1.down());
         if (var5.isIn(Blocks.LADDER) && var5.<Direction>get(Class3423.field19154) == var2.<Direction>get(Class3206.HORIZONTAL_FACING)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean isAlive() {
      return !this.removed && this.getHealth() > 0.0F;
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      boolean var5 = super.onLivingFall(var1, var2);
      int var6 = this.calculateFallDamage(var1, var2);
      if (var6 <= 0) {
         return var5;
      } else {
         this.playSound(this.getFallSound(var6), 1.0F, 1.0F);
         this.playFallSound();
         this.attackEntityFrom(DamageSource.field39002, (float)var6);
         return true;
      }
   }

   public int calculateFallDamage(float var1, float var2) {
      EffectInstance var5 = this.getActivePotionEffect(Effects.JUMP_BOOST);
      float var6 = var5 != null ? (float)(var5.method8629() + 1) : 0.0F;
      return MathHelper.ceil((var1 - 3.0F - var6) * var2);
   }

   public void playFallSound() {
      if (!this.isSilent()) {
         int var3 = MathHelper.floor(this.getPosX());
         int var4 = MathHelper.floor(this.getPosY() - 0.2F);
         int var5 = MathHelper.floor(this.getPosZ());
         BlockState var6 = this.world.getBlockState(new BlockPos(var3, var4, var5));
         if (!var6.isAir()) {
            SoundType var7 = var6.getSoundType();
            this.playSound(var7.getFallSound(), var7.getVolume() * 0.5F, var7.method29711() * 0.75F);
         }
      }
   }

   @Override
   public void performHurtAnimation() {
      this.maxHurtTime = 10;
      this.hurtTime = this.maxHurtTime;
      this.attackedAtYaw = 0.0F;
   }

   public int method3070() {
      return MathHelper.floor(this.getAttributeValue(Attributes.field42113));
   }

   public void method2886(DamageSource var1, float var2) {
   }

   public void method2887(float var1) {
   }

   public float applyArmorCalculations(DamageSource var1, float var2) {
      if (!var1.isUnblockable()) {
         this.method2886(var1, var2);
         var2 = Class8913.method32581(var2, (float)this.method3070(), (float)this.getAttributeValue(Attributes.field42114));
      }

      return var2;
   }

   public float applyPotionDamageCalculations(DamageSource var1, float var2) {
      if (!var1.method31136()) {
         if (this.isPotionActive(Effects.RESISTANCE) && var1 != DamageSource.field39004) {
            int var5 = (this.getActivePotionEffect(Effects.RESISTANCE).method8629() + 1) * 5;
            int var6 = 25 - var5;
            float var7 = var2 * (float)var6;
            float var8 = var2;
            var2 = Math.max(var7 / 25.0F, 0.0F);
            float var9 = var8 - var2;
            if (var9 > 0.0F && var9 < 3.4028235E37F) {
               if (!(this instanceof ServerPlayerEntity)) {
                  if (var1.getTrueSource() instanceof ServerPlayerEntity) {
                     ((ServerPlayerEntity)var1.getTrueSource()).addStat(Stats.field40129, Math.round(var9 * 10.0F));
                  }
               } else {
                  ((ServerPlayerEntity)this).addStat(Stats.field40133, Math.round(var9 * 10.0F));
               }
            }
         }

         if (!(var2 <= 0.0F)) {
            int var10 = EnchantmentHelper.method26317(this.getArmorInventoryList(), var1);
            if (var10 > 0) {
               var2 = Class8913.method32582(var2, (float)var10);
            }

            return var2;
         } else {
            return 0.0F;
         }
      } else {
         return var2;
      }
   }

   public void damageEntity(DamageSource var1, float var2) {
      if (!this.isInvulnerableTo(var1)) {
         var2 = this.applyArmorCalculations(var1, var2);
         var2 = this.applyPotionDamageCalculations(var1, var2);
         float var5 = Math.max(var2 - this.getAbsorptionAmount(), 0.0F);
         this.setAbsorptionAmount(this.getAbsorptionAmount() - (var2 - var5));
         float var6 = var2 - var5;
         if (var6 > 0.0F && var6 < 3.4028235E37F && var1.getTrueSource() instanceof ServerPlayerEntity) {
            ((ServerPlayerEntity)var1.getTrueSource()).addStat(Stats.field40128, Math.round(var6 * 10.0F));
         }

         if (var5 != 0.0F) {
            float var7 = this.getHealth();
            this.setHealth(var7 - var5);
            this.getCombatTracker().method27599(var1, var7, var5);
            this.setAbsorptionAmount(this.getAbsorptionAmount() - var5);
         }
      }
   }

   public CombatTracker getCombatTracker() {
      return this.combatTracker;
   }

   @Nullable
   public LivingEntity getAttackingEntity() {
      if (this.combatTracker.getBestAttacker() == null) {
         if (this.attackingPlayer == null) {
            return this.field4994 == null ? null : this.field4994;
         } else {
            return this.attackingPlayer;
         }
      } else {
         return this.combatTracker.getBestAttacker();
      }
   }

   public final float method3075() {
      return (float)this.getAttributeValue(Attributes.field42105);
   }

   public final int method3076() {
      return this.dataManager.<Integer>method35445(field4938);
   }

   public final void method3077(int var1) {
      this.dataManager.method35446(field4938, var1);
   }

   public final int method3078() {
      return this.dataManager.<Integer>method35445(field4939);
   }

   public final void method3079(int var1) {
      this.dataManager.method35446(field4939, var1);
   }

   private int getArmSwingAnimationEnd() {
      if (!Class7182.method22536(this)) {
         return !this.isPotionActive(Effects.MINING_FATIGUE) ? 6 : 6 + (1 + this.getActivePotionEffect(Effects.MINING_FATIGUE).method8629()) * 2;
      } else {
         return 6 - (1 + Class7182.method22537(this));
      }
   }

   public void swingArm(Hand var1) {
      this.swing(var1, false);
   }

   public void swing(Hand var1, boolean var2) {
      if (!this.isSwingInProgress || this.swingProgressInt >= this.getArmSwingAnimationEnd() / 2 || this.swingProgressInt < 0) {
         this.swingProgressInt = -1;
         this.isSwingInProgress = true;
         this.swingingHand = var1;
         if (this.world instanceof ServerWorld) {
            SAnimateHandPacket var5 = new SAnimateHandPacket(this, var1 != Hand.MAIN_HAND ? 3 : 0);
            ServerChunkProvider var6 = ((ServerWorld)this.world).getChunkProvider();
            if (!var2) {
               var6.sendToTrackingAndSelf(this, var5);
            } else {
               var6.sendToAllTracking(this, var5);
            }
         }
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      switch (var1) {
         case 2:
         case 33:
         case 36:
         case 37:
         case 44:
            boolean var4 = var1 == 33;
            boolean var5 = var1 == 36;
            boolean var6 = var1 == 37;
            boolean var7 = var1 == 44;
            this.field4960 = 1.5F;
            this.hurtResistantTime = 20;
            this.maxHurtTime = 10;
            this.hurtTime = this.maxHurtTime;
            this.attackedAtYaw = 0.0F;
            if (var4) {
               this.playSound(SoundEvents.field27145, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            }

            DamageSource var8;
            if (var6) {
               var8 = DamageSource.field38994;
            } else if (var5) {
               var8 = DamageSource.field38999;
            } else if (var7) {
               var8 = DamageSource.field39012;
            } else {
               var8 = DamageSource.field39005;
            }

            SoundEvent var9 = this.getHurtSound(var8);
            if (var9 != null) {
               this.playSound(var9, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            }

            this.attackEntityFrom(DamageSource.field39005, 0.0F);
            break;
         case 3:
            SoundEvent var10 = this.getDeathSound();
            if (var10 != null) {
               this.playSound(var10, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            }

            if (!(this instanceof PlayerEntity)) {
               this.setHealth(0.0F);
               this.onDeath(DamageSource.field39005);
            }
            break;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 31:
         case 32:
         case 34:
         case 35:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 45:
         case 53:
         default:
            super.handleStatusUpdate(var1);
            break;
         case 29:
            this.playSound(SoundEvents.field27035, 1.0F, 0.8F + this.world.rand.nextFloat() * 0.4F);
            break;
         case 30:
            this.playSound(SoundEvents.field27036, 0.8F, 0.8F + this.world.rand.nextFloat() * 0.4F);
            break;
         case 46:
            short var11 = 128;

            for (int var12 = 0; var12 < 128; var12++) {
               double var13 = (double)var12 / 127.0;
               float var15 = (this.rand.nextFloat() - 0.5F) * 0.2F;
               float var16 = (this.rand.nextFloat() - 0.5F) * 0.2F;
               float var17 = (this.rand.nextFloat() - 0.5F) * 0.2F;
               double var18 = MathHelper.lerp(var13, this.prevPosX, this.getPosX())
                  + (this.rand.nextDouble() - 0.5) * (double)this.getWidth() * 2.0;
               double var20 = MathHelper.lerp(var13, this.prevPosY, this.getPosY()) + this.rand.nextDouble() * (double)this.getHeight();
               double var22 = MathHelper.lerp(var13, this.prevPosZ, this.getPosZ())
                  + (this.rand.nextDouble() - 0.5) * (double)this.getWidth() * 2.0;
               this.world.addParticle(ParticleTypes.field34090, var18, var20, var22, (double)var15, (double)var16, (double)var17);
            }
            break;
         case 47:
            this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.MAINHAND));
            break;
         case 48:
            this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.OFFHAND));
            break;
         case 49:
            this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.HEAD));
            break;
         case 50:
            this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.CHEST));
            break;
         case 51:
            this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.LEGS));
            break;
         case 52:
            this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.FEET));
            break;
         case 54:
            HoneyBlock.livingSlideParticles(this);
            break;
         case 55:
            this.swapHands();
      }
   }

   private void swapHands() {
      ItemStack var3 = this.getItemStackFromSlot(EquipmentSlotType.OFFHAND);
      this.setItemStackToSlot(EquipmentSlotType.OFFHAND, this.getItemStackFromSlot(EquipmentSlotType.MAINHAND));
      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var3);
   }

   @Override
   public void outOfWorld() {
      this.attackEntityFrom(DamageSource.field39004, 4.0F);
   }

   public void updateArmSwingProgress() {
      int var3 = this.getArmSwingAnimationEnd();
      if (!this.isSwingInProgress) {
         this.swingProgressInt = 0;
      } else {
         this.swingProgressInt++;
         if (this.swingProgressInt >= var3) {
            this.swingProgressInt = 0;
            this.isSwingInProgress = false;
         }
      }

      this.swingProgress = (float)this.swingProgressInt / (float)var3;
   }

   @Nullable
   public ModifiableAttributeInstance getAttribute(Attribute var1) {
      return this.getAttributeManager().createInstanceIfAbsent(var1);
   }

   public double getAttributeValue(Attribute var1) {
      return this.getAttributeManager().getAttributeValue(var1);
   }

   public double method3087(Attribute var1) {
      return this.getAttributeManager().method33384(var1);
   }

   public AttributeModifierManager getAttributeManager() {
      return this.attributes;
   }

   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33505;
   }

   public ItemStack getHeldItemMainhand() {
      return this.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
   }

   public ItemStack getHeldItemOffhand() {
      return this.getItemStackFromSlot(EquipmentSlotType.OFFHAND);
   }

   public boolean method3092(Item var1) {
      return this.method3093(var1x -> var1x == var1);
   }

   public boolean method3093(Predicate<Item> var1) {
      return var1.test(this.getHeldItemMainhand().getItem()) || var1.test(this.getHeldItemOffhand().getItem());
   }

   public ItemStack getHeldItem(Hand var1) {
      if (var1 != Hand.MAIN_HAND) {
         if (var1 != Hand.OFF_HAND) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         } else {
            return this.getItemStackFromSlot(EquipmentSlotType.OFFHAND);
         }
      } else {
         return this.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
      }
   }

   public void setHeldItem(Hand var1, ItemStack var2) {
      if (var1 != Hand.MAIN_HAND) {
         if (var1 != Hand.OFF_HAND) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         }

         this.setItemStackToSlot(EquipmentSlotType.OFFHAND, var2);
      } else {
         this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var2);
      }
   }

   public boolean hasItemInSlot(EquipmentSlotType var1) {
      return !this.getItemStackFromSlot(var1).isEmpty();
   }

   @Override
   public abstract Iterable<ItemStack> getArmorInventoryList();

   public abstract ItemStack getItemStackFromSlot(EquipmentSlotType var1);

   @Override
   public abstract void setItemStackToSlot(EquipmentSlotType var1, ItemStack var2);

   public float getArmorCoverPercentage() {
      Iterable<ItemStack> var3 = this.getArmorInventoryList();
      int var4 = 0;
      int var5 = 0;

      for (ItemStack var7 : var3) {
         if (!var7.isEmpty()) {
            var5++;
         }

         var4++;
      }

      return var4 <= 0 ? 0.0F : (float)var5 / (float)var4;
   }

   @Override
   public void setSprinting(boolean var1) {
      super.setSprinting(var1);
      ModifiableAttributeInstance var4 = this.getAttribute(Attributes.MOVEMENT_SPEED);
      if (var4.method38664(SPRINTING_SPEED_BOOST_ID) != null) {
         var4.method38670(SPRINTING_SPEED_BOOST);
      }

      if (var1) {
         var4.method38667(SPRINTING_SPEED_BOOST);
      }
   }

   public float getSoundVolume() {
      return 1.0F;
   }

   public float getSoundPitch() {
      return !this.isChild()
         ? (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F
         : (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.5F;
   }

   public boolean isMovementBlocked() {
      return this.getShouldBeDead();
   }

   @Override
   public void applyEntityCollision(Entity var1) {
      if (!this.isSleeping()) {
         super.applyEntityCollision(var1);
      }
   }

   private void method3102(Entity var1) {
      Vector3d var4;
      if (!var1.removed && !this.world.getBlockState(var1.getPosition()).getBlock().isIn(BlockTags.field32797)) {
         var4 = var1.method3420(this);
      } else {
         var4 = new Vector3d(var1.getPosX(), var1.getPosY() + (double)var1.getHeight(), var1.getPosZ());
      }

      this.setPositionAndUpdate(var4.x, var4.y, var4.z);
   }

   @Override
   public boolean getAlwaysRenderNameTagForRender() {
      return this.method3383();
   }

   public float getJumpUpwardsMotion() {
      return 0.42F * this.getJumpFactor();
   }

   public void jump() {
      float var3 = this.getJumpUpwardsMotion();
      if (this.isPotionActive(Effects.JUMP_BOOST)) {
         var3 += 0.1F * (float)(this.getActivePotionEffect(Effects.JUMP_BOOST).method8629() + 1);
      }

      Vector3d var4 = this.getMotion();
      JumpEvent var5 = new JumpEvent(new Vector3d(var4.x, (double)var3, var4.z));
      if (this instanceof ClientPlayerEntity) {
         Client.getInstance().getEventManager().call(var5);
      }

      if (!var5.isCancelled()) {
         this.setMotion(var5.getVector());
         if (this.isSprinting() && !var5.method14000()) {
            float var6 = this.rotationYaw * (float) (Math.PI / 180.0);
            this.setMotion(this.getMotion().add((double)(-MathHelper.sin(var6) * 0.2F), 0.0, (double)(MathHelper.cos(var6) * 0.2F)));
         }

         this.isAirBorne = true;
      }
   }

   public void handleFluidSneak() {
      this.setMotion(this.getMotion().add(0.0, -0.04F, 0.0));
   }

   public void handleFluidJump(ITag<Fluid> var1) {
      this.setMotion(this.getMotion().add(0.0, 0.04F, 0.0));
   }

   public float getWaterSlowDown() {
      return 0.8F;
   }

   public boolean method3107(Fluid var1) {
      return false;
   }

   public void travel(Vector3d var1) {
      if (this.isServerWorld() || this.canPassengerSteer()) {
         double var4 = 0.08;
         boolean var6 = this.getMotion().y <= 0.0;
         if (var6 && this.isPotionActive(Effects.SLOW_FALLING)) {
            var4 = 0.01;
            this.fallDistance = 0.0F;
         }

         FluidState var7 = this.world.getFluidState(this.getPosition());
         if (this.isInWater() && this.method2897() && !this.method3107(var7.method23472())) {
            double var34 = this.getPosY();
            float var38 = !this.isSprinting() ? this.getWaterSlowDown() : 0.9F;
            float var39 = 0.02F;
            float var14 = (float) EnchantmentHelper.method26326(this);
            if (var14 > 3.0F) {
               var14 = 3.0F;
            }

            if (!this.onGround) {
               var14 *= 0.5F;
            }

            if (var14 > 0.0F) {
               var38 += (0.54600006F - var38) * var14 / 3.0F;
               var39 += (this.getAIMoveSpeed() - var39) * var14 / 3.0F;
            }

            if (this.isPotionActive(Effects.DOLPHINS_GRACE)) {
               var38 = 0.96F;
            }

            this.moveRelative(var39, var1);
            this.move(MoverType.SELF, this.getMotion());
            Vector3d var15 = this.getMotion();
            if (this.collidedHorizontally && this.isOnLadder()) {
               var15 = new Vector3d(var15.x, 0.2, var15.z);
            }

            this.setMotion(var15.method11347((double)var38, 0.8F, (double)var38));
            Vector3d var16 = this.method3110(var4, var6, this.getMotion());
            this.setMotion(var16);
            if (this.collidedHorizontally && this.isOffsetPositionInLiquid(var16.x, var16.y + 0.6F - this.getPosY() + var34, var16.z)) {
               this.setMotion(var16.x, 0.3F, var16.z);
            }
         } else if (this.isInLava() && this.method2897() && !this.method3107(var7.method23472())) {
            double var10 = this.getPosY();
            this.moveRelative(0.02F, var1);
            this.move(MoverType.SELF, this.getMotion());
            if (!(this.method3427(FluidTags.field40470) <= this.func_233579_cu_())) {
               this.setMotion(this.getMotion().scale(0.5));
            } else {
               this.setMotion(this.getMotion().method11347(0.5, 0.8F, 0.5));
               Vector3d var36 = this.method3110(var4, var6, this.getMotion());
               this.setMotion(var36);
            }

            if (!this.method3247()) {
               this.setMotion(this.getMotion().add(0.0, -var4 / 4.0, 0.0));
            }

            Vector3d var37 = this.getMotion();
            if (this.collidedHorizontally && this.isOffsetPositionInLiquid(var37.x, var37.y + 0.6F - this.getPosY() + var10, var37.z)) {
               this.setMotion(var37.x, 0.3F, var37.z);
            }
         } else if (!this.isElytraFlying()) {
            BlockPos var8 = this.getPositionUnderneath();
            float var9 = this.world.getBlockState(var8).getBlock().method11571();
            float var12 = !this.onGround ? 0.91F : var9 * 0.91F;
            Vector3d var13 = this.method3109(var1, var9);
            double var29 = var13.y;
            if (!this.isPotionActive(Effects.LEVITATION)) {
               if (this.world.isRemote && !this.world.method7017(var8)) {
                  if (!(this.getPosY() > 0.0)) {
                     var29 = 0.0;
                  } else {
                     var29 = -0.1;
                  }
               } else if (!this.method3247()) {
                  var29 -= var4;
               }
            } else {
               var29 += (0.05 * (double)(this.getActivePotionEffect(Effects.LEVITATION).method8629() + 1) - var13.y) * 0.2;
               this.fallDistance = 0.0F;
            }

            this.setMotion(var13.x * (double)var12, var29 * 0.98F, var13.z * (double)var12);
         } else {
            Vector3d var31 = this.getMotion();
            if (var31.y > -0.5) {
               this.fallDistance = 1.0F;
            }

            Vector3d var33 = this.getLookVec();
            float var35 = this.rotationPitch * (float) (Math.PI / 180.0);
            double var17 = Math.sqrt(var33.x * var33.x + var33.z * var33.z);
            double var19 = Math.sqrt(horizontalMag(var31));
            double var21 = var33.length();
            float var23 = MathHelper.cos(var35);
            var23 = (float)((double)var23 * (double)var23 * Math.min(1.0, var21 / 0.4));
            var31 = this.getMotion().add(0.0, var4 * (-1.0 + (double)var23 * 0.75), 0.0);
            if (var31.y < 0.0 && var17 > 0.0) {
               double var24 = var31.y * -0.1 * (double)var23;
               var31 = var31.add(var33.x * var24 / var17, var24, var33.z * var24 / var17);
            }

            if (var35 < 0.0F && var17 > 0.0) {
               double var41 = var19 * (double)(-MathHelper.sin(var35)) * 0.04;
               var31 = var31.add(-var33.x * var41 / var17, var41 * 3.2, -var33.z * var41 / var17);
            }

            if (var17 > 0.0) {
               var31 = var31.add(
                  (var33.x / var17 * var19 - var31.x) * 0.1, 0.0, (var33.z / var17 * var19 - var31.z) * 0.1
               );
            }

            this.setMotion(var31.method11347(0.99F, 0.98F, 0.99F));
            this.move(MoverType.SELF, this.getMotion());
            if (this.collidedHorizontally && !this.world.isRemote) {
               double var42 = Math.sqrt(horizontalMag(this.getMotion()));
               double var26 = var19 - var42;
               float var28 = (float)(var26 * 10.0 - 3.0);
               if (var28 > 0.0F) {
                  this.playSound(this.getFallSound((int)var28), 1.0F, 1.0F);
                  this.attackEntityFrom(DamageSource.field39003, var28);
               }
            }

            if (this.onGround && !this.world.isRemote) {
               this.setFlag(7, false);
            }
         }
      }

      this.func_233629_a_(this, this instanceof Class1016);
   }

   public void func_233629_a_(LivingEntity var1, boolean var2) {
      var1.prevLimbSwingAmount = var1.field4960;
      double var5 = var1.getPosX() - var1.prevPosX;
      double var7 = !var2 ? 0.0 : var1.getPosY() - var1.prevPosY;
      double var9 = var1.getPosZ() - var1.prevPosZ;
      float var11 = MathHelper.sqrt(var5 * var5 + var7 * var7 + var9 * var9) * 4.0F;
      if (var11 > 1.0F) {
         var11 = 1.0F;
      }

      var1.field4960 = var1.field4960 + (var11 - var1.field4960) * 0.4F;
      var1.field4961 = var1.field4961 + var1.field4960;
   }

   public Vector3d method3109(Vector3d var1, float var2) {
      this.moveRelative(this.getRelevantMoveFactor(var2), var1);
      this.setMotion(this.handleOnClimbable(this.getMotion()));
      this.move(MoverType.SELF, this.getMotion());
      Vector3d var5 = this.getMotion();
      if ((this.collidedHorizontally || this.isJumping) && this.isOnLadder()) {
         var5 = new Vector3d(var5.x, 0.2, var5.z);
      }

      return var5;
   }

   public Vector3d method3110(double var1, boolean var3, Vector3d var4) {
      if (!this.method3247() && !this.isSprinting()) {
         double var7;
         if (var3 && Math.abs(var4.y - 0.005) >= 0.003 && Math.abs(var4.y - var1 / 16.0) < 0.003) {
            var7 = -0.003;
         } else {
            var7 = var4.y - var1 / 16.0;
         }

         return new Vector3d(var4.x, var7, var4.z);
      } else {
         return var4;
      }
   }

   private Vector3d handleOnClimbable(Vector3d var1) {
      if (this.isOnLadder()) {
         this.fallDistance = 0.0F;
         float var4 = 0.15F;
         double var5 = MathHelper.clamp(var1.x, -0.15F, 0.15F);
         double var7 = MathHelper.clamp(var1.z, -0.15F, 0.15F);
         double var9 = Math.max(var1.y, -0.15F);
         if (var9 < 0.0 && !this.getBlockState().isIn(Blocks.field37053) && this.hasStoppedClimbing() && this instanceof PlayerEntity) {
            var9 = 0.0;
         }

         var1 = new Vector3d(var5, var9, var7);
      }

      return var1;
   }

   private float getRelevantMoveFactor(float var1) {
      return !this.onGround ? this.jumpMovementFactor : this.getAIMoveSpeed() * (0.21600002F / (var1 * var1 * var1));
   }

   public float getAIMoveSpeed() {
      return this.landMovementFactor;
   }

   public void setAIMoveSpeed(float var1) {
      this.landMovementFactor = var1;
   }

   public boolean attackEntityAsMob(Entity var1) {
      this.method3020(var1);
      return false;
   }

   @Override
   public void tick() {
      super.tick();
      this.updateActiveHand();
      this.updateSwimAnimation();
      if (!this.world.isRemote) {
         int var11 = this.method3076();
         if (var11 > 0) {
            if (this.arrowHitTimer <= 0) {
               this.arrowHitTimer = 20 * (30 - var11);
            }

            this.arrowHitTimer--;
            if (this.arrowHitTimer <= 0) {
               this.method3077(var11 - 1);
            }
         }

         int var12 = this.method3078();
         if (var12 > 0) {
            if (this.beeStingRemovalCooldown <= 0) {
               this.beeStingRemovalCooldown = 20 * (30 - var12);
            }

            this.beeStingRemovalCooldown--;
            if (this.beeStingRemovalCooldown <= 0) {
               this.method3079(var12 - 1);
            }
         }

         this.method3115();
         if (this.ticksExisted % 20 == 0) {
            this.getCombatTracker().method27606();
         }

         if (!this.glowing) {
            boolean var13 = this.isPotionActive(Effects.GLOWING);
            if (this.getFlag(6) != var13) {
               this.setFlag(6, var13);
            }
         }

         if (this.isSleeping() && !this.isInValidBed()) {
            this.wakeUp();
         }
      }

      this.livingTick();
      double var3 = this.getPosX() - this.prevPosX;
      double var5 = this.getPosZ() - this.prevPosZ;
      float var7 = (float)(var3 * var3 + var5 * var5);
      float var8 = this.renderYawOffset;
      float var9 = 0.0F;
      this.prevOnGroundSpeedFactor = this.onGroundSpeedFactor;
      float var10 = 0.0F;
      if (var7 > 0.0025000002F) {
         var10 = 1.0F;
         var9 = (float)Math.sqrt((double)var7) * 3.0F;
         float var14 = (float) MathHelper.method37814(var5, var3) * (180.0F / (float)Math.PI) - 90.0F;
         float var15 = MathHelper.method37771(MathHelper.method37792(this.rotationYaw) - var14);
         if (95.0F < var15 && var15 < 265.0F) {
            var8 = var14 - 180.0F;
         } else {
            var8 = var14;
         }
      }

      if (this.swingProgress > 0.0F) {
         var8 = this.rotationYaw;
      }

      if (!this.onGround) {
         var10 = 0.0F;
      }

      this.onGroundSpeedFactor = this.onGroundSpeedFactor + (var10 - this.onGroundSpeedFactor) * 0.3F;
      this.world.getProfiler().startSection("headTurn");
      var9 = this.updateDistance(var8, var9);
      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("rangeChecks");

      while (this.rotationYaw - this.prevRotationYaw < -180.0F) {
         this.prevRotationYaw -= 360.0F;
      }

      while (this.rotationYaw - this.prevRotationYaw >= 180.0F) {
         this.prevRotationYaw += 360.0F;
      }

      while (this.renderYawOffset - this.prevRenderYawOffset < -180.0F) {
         this.prevRenderYawOffset -= 360.0F;
      }

      while (this.renderYawOffset - this.prevRenderYawOffset >= 180.0F) {
         this.prevRenderYawOffset += 360.0F;
      }

      while (this.rotationPitch - this.prevRotationPitch < -180.0F) {
         this.prevRotationPitch -= 360.0F;
      }

      while (this.rotationPitch - this.prevRotationPitch >= 180.0F) {
         this.prevRotationPitch += 360.0F;
      }

      while (this.rotationYawHead - this.prevRotationYawHead < -180.0F) {
         this.prevRotationYawHead -= 360.0F;
      }

      while (this.rotationYawHead - this.prevRotationYawHead >= 180.0F) {
         this.prevRotationYawHead += 360.0F;
      }

      this.world.getProfiler().endSection();
      this.movedDistance += var9;
      if (!this.isElytraFlying()) {
         this.field5003 = 0;
      } else {
         this.field5003++;
      }

      if (this.isSleeping()) {
         this.rotationPitch = 0.0F;
      }
   }

   private void method3115() {
      Map var3 = this.func_241354_r_();
      if (var3 != null) {
         this.method3117(var3);
         if (!var3.isEmpty()) {
            this.func_241344_b_(var3);
         }
      }
   }

   @Nullable
   private Map<EquipmentSlotType, ItemStack> func_241354_r_() {
      EnumMap var3 = null;

      for (EquipmentSlotType var7 : EquipmentSlotType.values()) {
         ItemStack var8;
         switch (Class8717.field39333[var7.getSlotType().ordinal()]) {
            case 1:
               var8 = this.getItemInHand(var7);
               break;
            case 2:
               var8 = this.getArmorInSlot(var7);
               break;
            default:
               continue;
         }

         ItemStack var9 = this.getItemStackFromSlot(var7);
         if (!ItemStack.areItemStacksEqual(var9, var8)) {
            if (var3 == null) {
               var3 = Maps.newEnumMap(EquipmentSlotType.class);
            }

            var3.put(var7, var9);
            if (!var8.isEmpty()) {
               this.getAttributeManager().method33386(var8.method32171(var7));
            }

            if (!var9.isEmpty()) {
               this.getAttributeManager().method33387(var9.method32171(var7));
            }
         }
      }

      return var3;
   }

   private void method3117(Map<EquipmentSlotType, ItemStack> var1) {
      ItemStack var4 = (ItemStack)var1.get(EquipmentSlotType.MAINHAND);
      ItemStack var5 = (ItemStack)var1.get(EquipmentSlotType.OFFHAND);
      if (var4 != null
         && var5 != null
         && ItemStack.areItemStacksEqual(var4, this.getItemInHand(EquipmentSlotType.OFFHAND))
         && ItemStack.areItemStacksEqual(var5, this.getItemInHand(EquipmentSlotType.MAINHAND))) {
         ((ServerWorld)this.world).getChunkProvider().sendToTrackingAndSelf(this, new SEntityStatusPacket(this, (byte)55));
         var1.remove(EquipmentSlotType.MAINHAND);
         var1.remove(EquipmentSlotType.OFFHAND);
         this.setItemInHand(EquipmentSlotType.MAINHAND, var4.copy());
         this.setItemInHand(EquipmentSlotType.OFFHAND, var5.copy());
      }
   }

   private void func_241344_b_(Map<EquipmentSlotType, ItemStack> var1) {
      ArrayList var4 = Lists.newArrayListWithCapacity(var1.size());
      var1.forEach((var2, var3) -> {
         ItemStack var6 = var3.copy();
         var4.add(Pair.of(var2, var6));
         switch (Class8717.field39333[var2.getSlotType().ordinal()]) {
            case 1:
               this.setItemInHand(var2, var6);
               break;
            case 2:
               this.setArmorInSlot(var2, var6);
         }
      });
      ((ServerWorld)this.world).getChunkProvider().sendToTrackingAndSelf(this, new SEntityEquipmentPacket(this.getEntityId(), var4));
   }

   private ItemStack getArmorInSlot(EquipmentSlotType var1) {
      return this.armorArray.get(var1.getIndex());
   }

   private void setArmorInSlot(EquipmentSlotType var1, ItemStack var2) {
      this.armorArray.set(var1.getIndex(), var2);
   }

   private ItemStack getItemInHand(EquipmentSlotType var1) {
      return this.handInventory.get(var1.getIndex());
   }

   private void setItemInHand(EquipmentSlotType var1, ItemStack var2) {
      this.handInventory.set(var1.getIndex(), var2);
   }

   public float updateDistance(float var1, float var2) {
      float var5 = MathHelper.method37792(var1 - this.renderYawOffset);
      this.renderYawOffset += var5 * 0.3F;
      float var6 = MathHelper.method37792(this.rotationYaw - this.renderYawOffset);
      boolean var7 = var6 < -90.0F || var6 >= 90.0F;
      if (var6 < -75.0F) {
         var6 = -75.0F;
      }

      if (var6 >= 75.0F) {
         var6 = 75.0F;
      }

      this.renderYawOffset = this.rotationYaw - var6;
      if (var6 * var6 > 2500.0F) {
         this.renderYawOffset += var6 * 0.2F;
      }

      if (var7) {
         var2 *= -1.0F;
      }

      return var2;
   }

   public void livingTick() {
      if (this.jumpTicks > 0) {
         this.jumpTicks--;
      }

      if (this.canPassengerSteer()) {
         this.newPosRotationIncrements = 0;
         this.setPacketCoordinates(this.getPosX(), this.getPosY(), this.getPosZ());
      }

      if (this.newPosRotationIncrements <= 0) {
         if (!this.isServerWorld()) {
            this.setMotion(this.getMotion().scale(0.98));
         }
      } else {
         double var10 = this.getPosX() + (this.interpTargetX - this.getPosX()) / (double)this.newPosRotationIncrements;
         double var12 = this.getPosY() + (this.interpTargetY - this.getPosY()) / (double)this.newPosRotationIncrements;
         double var14 = this.getPosZ() + (this.interpTargetZ - this.getPosZ()) / (double)this.newPosRotationIncrements;
         double var16 = MathHelper.wrapDegrees(this.interpTargetYaw - (double)this.rotationYaw);
         this.rotationYaw = (float)((double)this.rotationYaw + var16 / (double)this.newPosRotationIncrements);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.interpTargetPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
         this.newPosRotationIncrements--;
         this.setPosition(var10, var12, var14);
         this.setRotation(this.rotationYaw, this.rotationPitch);
      }

      if (this.interpTicksHead > 0) {
         this.rotationYawHead = (float)((double)this.rotationYawHead + MathHelper.wrapDegrees(this.interpTargetHeadYaw - (double)this.rotationYawHead) / (double)this.interpTicksHead);
         this.interpTicksHead--;
      }

      Vector3d var3 = this.getMotion();
      double var4 = var3.x;
      double var6 = var3.y;
      double var8 = var3.z;
      if (Math.abs(var3.x) < 0.003) {
         var4 = 0.0;
      }

      if (Math.abs(var3.y) < 0.003) {
         var6 = 0.0;
      }

      if (Math.abs(var3.z) < 0.003) {
         var8 = 0.0;
      }

      this.setMotion(var4, var6, var8);
      this.world.getProfiler().startSection("ai");
      if (!this.isMovementBlocked()) {
         if (this.isServerWorld()) {
            this.world.getProfiler().startSection("newAi");
            this.updateEntityActionState();
            this.world.getProfiler().endSection();
         }
      } else {
         this.isJumping = false;
         this.moveStrafing = 0.0F;
         this.moveForward = 0.0F;
      }

      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("jump");
      if (this.isJumping && this.method2897()) {
         double var18;
         if (!this.isInLava()) {
            var18 = this.method3427(FluidTags.field40469);
         } else {
            var18 = this.method3427(FluidTags.field40470);
         }

         boolean var20 = this.isInWater() && var18 > 0.0;
         double var21 = this.func_233579_cu_();
         if (!var20 || this.onGround && !(var18 > var21)) {
            if (!this.isInLava() || this.onGround && !(var18 > var21)) {
               if ((this.onGround || var20 && var18 <= var21) && this.jumpTicks == 0) {
                  this.jump();
                  this.jumpTicks = 10;
               }
            } else {
               this.handleFluidJump(FluidTags.field40470);
            }
         } else {
            this.handleFluidJump(FluidTags.field40469);
         }
      } else {
         this.jumpTicks = 0;
      }

      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("travel");
      this.moveStrafing *= 0.98F;
      this.moveForward *= 0.98F;
      this.updateElytra();
      AxisAlignedBB var23 = this.getBoundingBox();
      this.travel(new Vector3d((double)this.moveStrafing, (double)this.moveVertical, (double)this.moveForward));
      this.world.getProfiler().endSection();
      this.world.getProfiler().startSection("push");
      if (this.spinAttackDuration > 0) {
         this.spinAttackDuration--;
         this.updateSpinAttack(var23, this.getBoundingBox());
      }

      this.collideWithNearbyEntities();
      this.world.getProfiler().endSection();
      if (!this.world.isRemote && this.method3124() && this.isInWaterRainOrBubbleColumn()) {
         this.attackEntityFrom(DamageSource.field38999, 1.0F);
      }
   }

   public boolean method3124() {
      return false;
   }

   private void updateElytra() {
      boolean var3 = this.getFlag(7);
      if (var3 && !this.onGround && !this.isPassenger() && !this.isPotionActive(Effects.LEVITATION)) {
         ItemStack var4 = this.getItemStackFromSlot(EquipmentSlotType.CHEST);
         if (var4.getItem() == Items.field38120 && Class3256.method11698(var4)) {
            var3 = true;
            if (!this.world.isRemote && (this.field5003 + 1) % 20 == 0) {
               var4.damageItem(1, this, var0 -> var0.sendBreakAnimation(EquipmentSlotType.CHEST));
            }
         } else {
            var3 = false;
         }
      } else {
         var3 = false;
      }

      if (!this.world.isRemote) {
         this.setFlag(7, var3);
      }
   }

   public void updateEntityActionState() {
   }

   public void collideWithNearbyEntities() {
      List var3 = this.world.getEntitiesInAABBexcluding(this, this.getBoundingBox(), Class8088.method27981(this));
      if (!var3.isEmpty()) {
         int var4 = this.world.getGameRules().method17136(Class5462.field24241);
         if (var4 > 0 && var3.size() > var4 - 1 && this.rand.nextInt(4) == 0) {
            int var5 = 0;

            for (int var6 = 0; var6 < var3.size(); var6++) {
               if (!((Entity)var3.get(var6)).isPassenger()) {
                  var5++;
               }
            }

            if (var5 > var4 - 1) {
               this.attackEntityFrom(DamageSource.field38998, 6.0F);
            }
         }

         for (int var7 = 0; var7 < var3.size(); var7++) {
            Entity var8 = (Entity)var3.get(var7);
            this.collideWithEntity(var8);
         }
      }
   }

   public void updateSpinAttack(AxisAlignedBB var1, AxisAlignedBB var2) {
      AxisAlignedBB var5 = var1.method19666(var2);
      List var6 = this.world.method7181(this, var5);
      if (var6.isEmpty()) {
         if (this.collidedHorizontally) {
            this.spinAttackDuration = 0;
         }
      } else {
         for (int var7 = 0; var7 < var6.size(); var7++) {
            Entity var8 = (Entity)var6.get(var7);
            if (var8 instanceof LivingEntity) {
               this.method2900((LivingEntity)var8);
               this.spinAttackDuration = 0;
               this.setMotion(this.getMotion().scale(-0.2));
               break;
            }
         }
      }

      if (!this.world.isRemote && this.spinAttackDuration <= 0) {
         this.setLivingFlag(4, false);
      }
   }

   public void collideWithEntity(Entity var1) {
      var1.applyEntityCollision(this);
   }

   public void method2900(LivingEntity var1) {
   }

   public void method3129(int var1) {
      this.spinAttackDuration = var1;
      if (!this.world.isRemote) {
         this.setLivingFlag(4, true);
      }
   }

   public boolean isSpinAttacking() {
      return (this.dataManager.<Byte>method35445(LIVING_FLAGS) & 4) != 0;
   }

   @Override
   public void stopRiding() {
      Entity var3 = this.getRidingEntity();
      super.stopRiding();
      if (var3 != null && var3 != this.getRidingEntity() && !this.world.isRemote) {
         this.method3102(var3);
      }
   }

   @Override
   public void updateRidden() {
      super.updateRidden();
      this.prevOnGroundSpeedFactor = this.onGroundSpeedFactor;
      this.onGroundSpeedFactor = 0.0F;
      this.fallDistance = 0.0F;
   }

   @Override
   public void setPositionAndRotationDirect(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.interpTargetX = var1;
      this.interpTargetY = var3;
      this.interpTargetZ = var5;
      this.interpTargetYaw = (double)var7;
      this.interpTargetPitch = (double)var8;
      this.newPosRotationIncrements = var9;
   }

   @Override
   public void setHeadRotation(float var1, int var2) {
      this.interpTargetHeadYaw = (double)var1;
      this.interpTicksHead = var2;
   }

   public void setJumping(boolean var1) {
      this.isJumping = var1;
   }

   public void triggerItemPickupTrigger(ItemEntity var1) {
      PlayerEntity var4 = var1.method4128() == null ? null : this.world.method7196(var1.method4128());
      if (var4 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44505.method15090((ServerPlayerEntity)var4, var1.method4124(), this);
      }
   }

   public void onItemPickup(Entity var1, int var2) {
      if (!var1.removed && !this.world.isRemote && (var1 instanceof ItemEntity || var1 instanceof AbstractArrowEntity || var1 instanceof ExperienceOrbEntity)) {
         ((ServerWorld)this.world).getChunkProvider().sendToTrackingAndSelf(var1, new SCollectItemPacket(var1.getEntityId(), this.getEntityId(), var2));
      }
   }

   public boolean canEntityBeSeen(Entity var1) {
      Vector3d var4 = new Vector3d(this.getPosX(), this.getPosYEye(), this.getPosZ());
      Vector3d var5 = new Vector3d(var1.getPosX(), var1.getPosYEye(), var1.getPosZ());
      return this.world.rayTraceBlocks(new RayTraceContext(var4, var5, Class2271.field14774, Class1985.field12962, this)).getType() == RayTraceResult.Type.MISS;
   }

   @Override
   public float getYaw(float var1) {
      return var1 != 1.0F ? MathHelper.lerp(var1, this.prevRotationYawHead, this.rotationYawHead) : this.rotationYawHead;
   }

   public float getSwingProgress(float var1) {
      float var4 = this.swingProgress - this.prevSwingProgress;
      if (var4 < 0.0F) {
         var4++;
      }

      return this.prevSwingProgress + var4 * var1;
   }

   public boolean isServerWorld() {
      return !this.world.isRemote;
   }

   @Override
   public boolean canBeCollidedWith() {
      return !this.removed;
   }

   @Override
   public boolean canBePushed() {
      return this.isAlive() && !this.isSpectator() && !this.isOnLadder();
   }

   @Override
   public void markVelocityChanged() {
      this.velocityChanged = this.rand.nextDouble() >= this.getAttributeValue(Attributes.field42107);
   }

   @Override
   public float getRotationYawHead() {
      return this.rotationYawHead;
   }

   @Override
   public void setRotationYawHead(float var1) {
      this.rotationYawHead = var1;
   }

   @Override
   public void setRenderYawOffset(float var1) {
      this.renderYawOffset = var1;
   }

   @Override
   public Vector3d func_241839_a(Direction.Axis var1, TeleportationRepositioner var2) {
      return func_242288_h(super.func_241839_a(var1, var2));
   }

   public static Vector3d func_242288_h(Vector3d var0) {
      return new Vector3d(var0.x, var0.y, 0.0);
   }

   public float getAbsorptionAmount() {
      return this.absorptionAmount;
   }

   public void setAbsorptionAmount(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.absorptionAmount = var1;
   }

   public void method2730() {
   }

   public void sendEndCombat() {
   }

   public void markPotionsDirty() {
      this.potionsNeedUpdate = true;
   }

   public abstract HandSide getPrimaryHand();

   public boolean isHandActive() {
      return (this.dataManager.<Byte>method35445(LIVING_FLAGS) & 1) > 0;
   }

   public Hand getActiveHand() {
      return (this.dataManager.<Byte>method35445(LIVING_FLAGS) & 2) <= 0 ? Hand.MAIN_HAND : Hand.OFF_HAND;
   }

   private void updateActiveHand() {
      if (this.isHandActive()) {
         if (!ItemStack.areItemsEqualIgnoreDurability(this.getHeldItem(this.getActiveHand()), this.activeItemStack)) {
            this.resetActiveHand();
         } else {
            this.activeItemStack = this.getHeldItem(this.getActiveHand());
            this.activeItemStack.onItemUsed(this.world, this, this.getItemInUseCount());
            if (this.shouldTriggerItemUseEffects()) {
               this.triggerItemUseEffects(this.activeItemStack, 5);
            }

            if (--this.activeItemStackUseCount == 0 && !this.world.isRemote && !this.activeItemStack.method32140()) {
               this.onItemUseFinish();
            }
         }
      }
   }

   private boolean shouldTriggerItemUseEffects() {
      int var3 = this.getItemInUseCount();
      Class9427 var4 = this.activeItemStack.getItem().method11745();
      boolean var5 = var4 != null && var4.method36161();
      var5 |= var3 <= this.activeItemStack.method32137() - 7;
      return var5 && var3 % 4 == 0;
   }

   private void updateSwimAnimation() {
      this.lastSwimAnimation = this.swimAnimation;
      if (!this.isActualySwimming()) {
         this.swimAnimation = Math.max(0.0F, this.swimAnimation - 0.09F);
      } else {
         this.swimAnimation = Math.min(1.0F, this.swimAnimation + 0.09F);
      }
   }

   public void setLivingFlag(int var1, boolean var2) {
      int var5 = this.dataManager.<Byte>method35445(LIVING_FLAGS);
      if (!var2) {
         var5 &= ~var1;
      } else {
         var5 |= var1;
      }

      this.dataManager.method35446(LIVING_FLAGS, (byte)var5);
   }

   public void setActiveHand(Hand var1) {
      ItemStack var4 = this.getHeldItem(var1);
      if (!var4.isEmpty() && !this.isHandActive()) {
         this.activeItemStack = var4;
         this.activeItemStackUseCount = var4.method32137();
         if (!this.world.isRemote) {
            this.setLivingFlag(1, true);
            this.setLivingFlag(2, var1 == Hand.OFF_HAND);
         }
      }
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      super.notifyDataManagerChange(var1);
      if (!field4940.equals(var1)) {
         if (LIVING_FLAGS.equals(var1) && this.world.isRemote) {
            if (this.isHandActive() && this.activeItemStack.isEmpty()) {
               this.activeItemStack = this.getHeldItem(this.getActiveHand());
               if (!this.activeItemStack.isEmpty()) {
                  this.activeItemStackUseCount = this.activeItemStack.method32137();
               }
            } else if (!this.isHandActive() && !this.activeItemStack.isEmpty()) {
               this.activeItemStack = ItemStack.EMPTY;
               this.activeItemStackUseCount = 0;
            }
         }
      } else if (this.world.isRemote) {
         this.getBedPosition().ifPresent(this::setSleepingPosition);
      }
   }

   @Override
   public void lookAt(Class2062 var1, Vector3d var2) {
      super.lookAt(var1, var2);
      this.prevRotationYawHead = this.rotationYawHead;
      this.renderYawOffset = this.rotationYawHead;
      this.prevRenderYawOffset = this.renderYawOffset;
   }

   public void triggerItemUseEffects(ItemStack var1, int var2) {
      if (!var1.isEmpty() && this.isHandActive()) {
         if (var1.getUseAction() == UseAction.field13708) {
            this.playSound(this.getDrinkSound(var1), 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
         }

         if (var1.getUseAction() == UseAction.field13707) {
            this.addItemParticles(var1, var2);
            this.playSound(
               this.getEatSound(var1), 0.5F + 0.5F * (float)this.rand.nextInt(2), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F
            );
         }
      }
   }

   private void addItemParticles(ItemStack var1, int var2) {
      for (int var5 = 0; var5 < var2; var5++) {
         Vector3d var6 = new Vector3d(((double)this.rand.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         var6 = var6.method11350(-this.rotationPitch * (float) (Math.PI / 180.0));
         var6 = var6.method11351(-this.rotationYaw * (float) (Math.PI / 180.0));
         double var7 = (double)(-this.rand.nextFloat()) * 0.6 - 0.3;
         Vector3d var9 = new Vector3d(((double)this.rand.nextFloat() - 0.5) * 0.3, var7, 0.6);
         var9 = var9.method11350(-this.rotationPitch * (float) (Math.PI / 180.0));
         var9 = var9.method11351(-this.rotationYaw * (float) (Math.PI / 180.0));
         var9 = var9.add(this.getPosX(), this.getPosYEye(), this.getPosZ());
         this.world
            .addParticle(
               new Class7438(ParticleTypes.field34082, var1),
               var9.x,
               var9.y,
               var9.z,
               var6.x,
               var6.y + 0.05,
               var6.z
            );
      }
   }

   public void onItemUseFinish() {
      Hand var3 = this.getActiveHand();
      if (this.activeItemStack.equals(this.getHeldItem(var3))) {
         if (!this.activeItemStack.isEmpty() && this.isHandActive()) {
            this.triggerItemUseEffects(this.activeItemStack, 16);
            ItemStack var4 = this.activeItemStack.method32111(this.world, this);
            if (var4 != this.activeItemStack) {
               this.setHeldItem(var3, var4);
            }

            this.resetActiveHand();
         }
      } else {
         this.stopActiveHand();
      }
   }

   public ItemStack getActiveItemStack() {
      return this.activeItemStack;
   }

   public int getItemInUseCount() {
      return this.activeItemStackUseCount;
   }

   public int getItemInUseMaxCount() {
      return !this.isHandActive() ? 0 : this.activeItemStack.method32137() - this.getItemInUseCount();
   }

   public void stopActiveHand() {
      if (!this.activeItemStack.isEmpty()) {
         this.activeItemStack.method32139(this.world, this, this.getItemInUseCount());
         if (this.activeItemStack.method32140()) {
            this.updateActiveHand();
         }
      }

      this.resetActiveHand();
   }

   public void resetActiveHand() {
      if (!this.world.isRemote) {
         this.setLivingFlag(1, false);
      }

      this.activeItemStack = ItemStack.EMPTY;
      this.activeItemStackUseCount = 0;
   }

   public boolean isActiveItemStackBlocking() {
      if (this.isHandActive() && !this.activeItemStack.isEmpty()) {
         Item var3 = this.activeItemStack.getItem();
         return var3.method11727(this.activeItemStack) == UseAction.BLOCK ? var3.method11728(this.activeItemStack) - this.activeItemStackUseCount >= 5 : false;
      } else {
         return false;
      }
   }

   public boolean hasStoppedClimbing() {
      return this.isSneaking();
   }

   public boolean isElytraFlying() {
      return this.getFlag(7);
   }

   @Override
   public boolean isActualySwimming() {
      return super.isActualySwimming() || !this.isElytraFlying() && this.getPose() == Pose.field13620;
   }

   public int getTicksElytraFlying() {
      return this.field5003;
   }

   public boolean attemptTeleport(double var1, double var3, double var5, boolean var7) {
      double var10 = this.getPosX();
      double var12 = this.getPosY();
      double var14 = this.getPosZ();
      double var16 = var3;
      boolean var18 = false;
      BlockPos var19 = new BlockPos(var1, var3, var5);
      World var20 = this.world;
      if (var20.method7017(var19)) {
         boolean var21 = false;

         while (!var21 && var19.getY() > 0) {
            BlockPos var22 = var19.down();
            BlockState var23 = var20.getBlockState(var22);
            if (!var23.getMaterial().blocksMovement()) {
               var16--;
               var19 = var22;
            } else {
               var21 = true;
            }
         }

         if (var21) {
            this.setPositionAndUpdate(var1, var16, var5);
            if (var20.hasNoCollisions(this) && !var20.method7014(this.getBoundingBox())) {
               var18 = true;
            }
         }
      }

      if (var18) {
         if (var7) {
            var20.setEntityState(this, (byte)46);
         }

         if (this instanceof Class1046) {
            ((Class1046)this).method4230().method21666();
         }

         return true;
      } else {
         this.setPositionAndUpdate(var10, var12, var14);
         return false;
      }
   }

   public boolean canBeHitWithPotion() {
      return true;
   }

   public boolean attackable() {
      return true;
   }

   public void setPartying(BlockPos var1, boolean var2) {
   }

   public boolean canPickUpItem(ItemStack var1) {
      return false;
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnMobPacket(this);
   }

   @Override
   public EntitySize getSize(Pose var1) {
      return var1 != Pose.field13621 ? super.getSize(var1).method32099(this.getRenderScale()) : SLEEPING_SIZE;
   }

   public ImmutableList<Pose> getAvailablePoses() {
      return ImmutableList.of(Pose.STANDING);
   }

   public AxisAlignedBB getPoseAABB(Pose var1) {
      EntitySize var4 = this.getSize(var1);
      return new AxisAlignedBB(
         (double)(-var4.field39968 / 2.0F),
         0.0,
         (double)(-var4.field39968 / 2.0F),
         (double)(var4.field39968 / 2.0F),
         (double)var4.field39969,
         (double)(var4.field39968 / 2.0F)
      );
   }

   public Optional<BlockPos> getBedPosition() {
      return this.dataManager.<Optional<BlockPos>>method35445(field4940);
   }

   public void setBedPosition(BlockPos var1) {
      this.dataManager.method35446(field4940, Optional.<BlockPos>of(var1));
   }

   public void clearBedPosition() {
      this.dataManager.method35446(field4940, Optional.<BlockPos>empty());
   }

   public boolean isSleeping() {
      return this.getBedPosition().isPresent();
   }

   public void startSleeping(BlockPos var1) {
      if (this.isPassenger()) {
         this.stopRiding();
      }

      BlockState var4 = this.world.getBlockState(var1);
      if (var4.getBlock() instanceof Class3250) {
         this.world.setBlockState(var1, var4.with(Class3250.field18714, Boolean.valueOf(true)), 3);
      }

      this.setPose(Pose.field13621);
      this.setSleepingPosition(var1);
      this.setBedPosition(var1);
      this.setMotion(Vector3d.ZERO);
      this.isAirBorne = true;
   }

   private void setSleepingPosition(BlockPos var1) {
      this.setPosition((double)var1.getX() + 0.5, (double)var1.getY() + 0.6875, (double)var1.getZ() + 0.5);
   }

   private boolean isInValidBed() {
      return this.getBedPosition().<Boolean>map(var1 -> this.world.getBlockState(var1).getBlock() instanceof Class3250).orElse(false);
   }

   public void wakeUp() {
      this.getBedPosition().filter(this.world::method7017).ifPresent(var1 -> {
         BlockState var4 = this.world.getBlockState(var1);
         if (var4.getBlock() instanceof Class3250) {
            this.world.setBlockState(var1, var4.with(Class3250.field18714, Boolean.valueOf(false)), 3);
            Vector3d var5 = Class3250.method11686(this.getType(), this.world, var1, this.rotationYaw).orElseGet(() -> {
               BlockPos var3x = var1.up();
               return new Vector3d((double)var3x.getX() + 0.5, (double)var3x.getY() + 0.1, (double)var3x.getZ() + 0.5);
            });
            Vector3d var6 = Vector3d.method11330(var1).method11336(var5).method11333();
            float var7 = (float) MathHelper.wrapDegrees(MathHelper.method37814(var6.z, var6.x) * 180.0F / (float)Math.PI - 90.0);
            this.setPosition(var5.x, var5.y, var5.z);
            this.rotationYaw = var7;
            this.rotationPitch = 0.0F;
         }
      });
      Vector3d var3 = this.getPositionVec();
      this.setPose(Pose.STANDING);
      this.setPosition(var3.x, var3.y, var3.z);
      this.clearBedPosition();
   }

   @Nullable
   public Direction getBedDirection() {
      BlockPos var3 = this.getBedPosition().orElse((BlockPos)null);
      return var3 == null ? null : Class3250.method11678(this.world, var3);
   }

   @Override
   public boolean isEntityInsideOpaqueBlock() {
      return !this.isSleeping() && super.isEntityInsideOpaqueBlock();
   }

   @Override
   public final float getEyeHeight(Pose var1, EntitySize var2) {
      return var1 != Pose.field13621 ? this.getStandingEyeHeight(var1, var2) : 0.2F;
   }

   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return super.getEyeHeight(var1, var2);
   }

   public ItemStack findAmmo(ItemStack var1) {
      return ItemStack.EMPTY;
   }

   public ItemStack onFoodEaten(World var1, ItemStack var2) {
      if (var2.method32184()) {
         var1.method6743(
            (PlayerEntity)null,
            this.getPosX(),
            this.getPosY(),
            this.getPosZ(),
            this.getEatSound(var2),
            Class2266.field14734,
            1.0F,
            1.0F + (var1.rand.nextFloat() - var1.rand.nextFloat()) * 0.4F
         );
         this.applyFoodEffects(var2, var1, this);
         if (!(this instanceof PlayerEntity) || !((PlayerEntity)this).abilities.isCreativeMode) {
            var2.shrink(1);
         }
      }

      return var2;
   }

   private void applyFoodEffects(ItemStack var1, World var2, LivingEntity var3) {
      Item var6 = var1.getItem();
      if (var6.isFood()) {
         for (Pair var8 : var6.method11745().method36162()) {
            if (!var2.isRemote && var8.getFirst() != null && var2.rand.nextFloat() < (Float)var8.getSecond()) {
               var3.addPotionEffect(new EffectInstance((EffectInstance)var8.getFirst()));
            }
         }
      }
   }

   private static byte equipmentSlotToEntityState(EquipmentSlotType var0) {
      switch (Class8717.field39334[var0.ordinal()]) {
         case 1:
            return 47;
         case 2:
            return 48;
         case 3:
            return 49;
         case 4:
            return 50;
         case 5:
            return 52;
         case 6:
            return 51;
         default:
            return 47;
      }
   }

   public void sendBreakAnimation(EquipmentSlotType var1) {
      this.world.setEntityState(this, equipmentSlotToEntityState(var1));
   }

   public void sendBreakAnimation(Hand var1) {
      this.sendBreakAnimation(var1 != Hand.MAIN_HAND ? EquipmentSlotType.OFFHAND : EquipmentSlotType.MAINHAND);
   }

   @Override
   public AxisAlignedBB getRenderBoundingBox() {
      if (this.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() != Items.field38063) {
         return super.getRenderBoundingBox();
      } else {
         float var3 = 0.5F;
         return this.getBoundingBox().method19663(0.5, 0.5, 0.5);
      }
   }
}
