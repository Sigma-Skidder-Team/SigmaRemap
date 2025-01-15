package net.minecraft.entity.player;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.SafeWalkEvent;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import mapped.*;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.boss.dragon.EnderDragonPartEntity;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.client.PlayerAbilities;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.potion.EffectInstance;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.CommandBlockTileEntity;
import net.minecraft.tileentity.JigsawTileEntity;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Predicate;

public abstract class PlayerEntity extends LivingEntity {
   public static final EntitySize field4893 = EntitySize.method32101(0.6F, 1.8F);
   private static final Map<Pose, EntitySize> field4894 = ImmutableMap.<Pose, EntitySize>builder()
      .put(Pose.STANDING, field4893)
      .put(Pose.field13621, SLEEPING_SIZE)
      .put(Pose.field13620, EntitySize.method32101(0.6F, 0.6F))
      .put(Pose.field13622, EntitySize.method32101(0.6F, 0.6F))
      .put(Pose.field13623, EntitySize.method32101(0.6F, 0.6F))
      .put(Pose.field13624, EntitySize.method32101(0.6F, 1.5F))
      .put(Pose.field13625, EntitySize.method32102(0.2F, 0.2F))
      .build();
   private static final DataParameter<Float> field4895 = EntityDataManager.<Float>createKey(PlayerEntity.class, DataSerializers.FLOAT);
   private static final DataParameter<Integer> field4896 = EntityDataManager.<Integer>createKey(PlayerEntity.class, DataSerializers.VARINT);
   public static final DataParameter<Byte> field4897 = EntityDataManager.<Byte>createKey(PlayerEntity.class, DataSerializers.field33390);
   public static final DataParameter<Byte> field4898 = EntityDataManager.<Byte>createKey(PlayerEntity.class, DataSerializers.field33390);
   public static final DataParameter<CompoundNBT> field4899 = EntityDataManager.<CompoundNBT>createKey(PlayerEntity.class, DataSerializers.field33405);
   public static final DataParameter<CompoundNBT> field4900 = EntityDataManager.<CompoundNBT>createKey(PlayerEntity.class, DataSerializers.field33405);
   private long field4901;
   public PlayerInventory inventory = new PlayerInventory(this);
   public Class980 field4903 = new Class980();
   public final PlayerContainer container;
   public Container openContainer;
   public FoodStats foodStats = new FoodStats();
   public int field4907;
   public float prevCameraYaw;
   public float cameraYaw;
   public int field4910;
   public double field4911;
   public double field4912;
   public double field4913;
   public double field4914;
   public double field4915;
   public double field4916;
   private int field4917;
   public boolean field4918;
   public final PlayerAbilities abilities = new PlayerAbilities();
   public int field4920;
   public int field4921;
   public float field4922;
   public int field4923;
   public final float field4924 = 0.02F;
   private int field4925;
   private final GameProfile field4926;
   private boolean field4927;
   private ItemStack field4928 = ItemStack.EMPTY;
   private final Class6462 field4929 = this.method2733();
   public Class904 field4930;

   public PlayerEntity(World var1, BlockPos var2, float var3, GameProfile var4) {
      super(EntityType.PLAYER, var1);
      this.setUniqueId(method2960(var4));
      this.field4926 = var4;
      this.container = new PlayerContainer(this.inventory, !var1.isRemote, this);
      this.openContainer = this.container;
      this.setLocationAndAngles((double)var2.getX() + 0.5, (double)(var2.getY() + 1), (double)var2.getZ() + 0.5, var3, 0.0F);
      this.field4978 = 180.0F;
   }

   public boolean blockActionRestricted(World var1, BlockPos var2, GameType var3) {
      if (!var3.method8156()) {
         return false;
      } else if (var3 != GameType.SPECTATOR) {
         if (this.method2935()) {
            return false;
         } else {
            ItemStack var6 = this.getHeldItemMainhand();
            return var6.isEmpty() || !var6.method32175(var1.method6817(), new CachedBlockInfo(var1, var2, false));
         }
      } else {
         return true;
      }
   }

   public static MutableAttribute method2849() {
      return LivingEntity.method2997()
         .method21849(Attributes.ATTACK_DAMAGE, 1.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.1F)
         .method21848(Attributes.ATTACK_SPEED)
         .method21848(Attributes.LUCK);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field4895, 0.0F);
      this.dataManager.register(field4896, 0);
      this.dataManager.register(field4897, (byte)0);
      this.dataManager.register(field4898, (byte)1);
      this.dataManager.register(field4899, new CompoundNBT());
      this.dataManager.register(field4900, new CompoundNBT());
   }

   @Override
   public void tick() {
      this.noClip = this.isSpectator();
      if (this.isSpectator()) {
         this.onGround = false;
      }

      if (this.field4910 > 0) {
         this.field4910--;
      }

      if (!this.isSleeping()) {
         if (this.field4917 > 0) {
            this.field4917++;
            if (this.field4917 >= 110) {
               this.field4917 = 0;
            }
         }
      } else {
         this.field4917++;
         if (this.field4917 > 100) {
            this.field4917 = 100;
         }

         if (!this.world.isRemote && this.world.method6740()) {
            this.stopSleepInBed(false, true);
         }
      }

      this.method2854();
      super.tick();
      if (!this.world.isRemote && this.openContainer != null && !this.openContainer.canInteractWith(this)) {
         this.method2772();
         this.openContainer = this.container;
      }

      this.method2856();
      if (!this.world.isRemote) {
         this.foodStats.method37571(this);
         this.method2911(Stats.field40106);
         if (this.isAlive()) {
            this.method2911(Stats.field40107);
         }

         if (this.isDiscrete()) {
            this.method2911(Stats.field40109);
         }

         if (!this.isSleeping()) {
            this.method2911(Stats.field40108);
         }
      }

      double var4 = MathHelper.clamp(this.getPosX(), -2.9999999E7, 2.9999999E7);
      double var6 = MathHelper.clamp(this.getPosZ(), -2.9999999E7, 2.9999999E7);
      if (var4 != this.getPosX() || var6 != this.getPosZ()) {
         this.setPosition(var4, this.getPosY(), var6);
      }

      this.ticksSinceLastSwing++;
      ItemStack var8 = this.getHeldItemMainhand();
      if (!ItemStack.areItemStacksEqual(this.field4928, var8)) {
         if (!ItemStack.areItemsEqualIgnoreDurability(this.field4928, var8)) {
            this.resetCooldown();
         }

         this.field4928 = var8.copy();
      }

      this.method2855();
      this.field4929.method19637();
      this.updatePose();
   }

   public boolean method2851() {
      return this.isSneaking();
   }

   public boolean method2852() {
      return this.isSneaking();
   }

   public boolean method2853() {
      return this.isSneaking();
   }

   public boolean method2854() {
      this.field4918 = this.areEyesInFluid(FluidTags.field40469);
      return this.field4918;
   }

   private void method2855() {
      ItemStack var3 = this.getItemStackFromSlot(EquipmentSlotType.HEAD);
      if (var3.getItem() == Items.field37792 && !this.areEyesInFluid(FluidTags.field40469)) {
         this.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 200, 0, false, false, true));
      }
   }

   public Class6462 method2733() {
      return new Class6462();
   }

   private void method2856() {
      this.field4911 = this.field4914;
      this.field4912 = this.field4915;
      this.field4913 = this.field4916;
      double var3 = this.getPosX() - this.field4914;
      double var5 = this.getPosY() - this.field4915;
      double var7 = this.getPosZ() - this.field4916;
      double var9 = 10.0;
      if (var3 > 10.0) {
         this.field4914 = this.getPosX();
         this.field4911 = this.field4914;
      }

      if (var7 > 10.0) {
         this.field4916 = this.getPosZ();
         this.field4913 = this.field4916;
      }

      if (var5 > 10.0) {
         this.field4915 = this.getPosY();
         this.field4912 = this.field4915;
      }

      if (var3 < -10.0) {
         this.field4914 = this.getPosX();
         this.field4911 = this.field4914;
      }

      if (var7 < -10.0) {
         this.field4916 = this.getPosZ();
         this.field4913 = this.field4916;
      }

      if (var5 < -10.0) {
         this.field4915 = this.getPosY();
         this.field4912 = this.field4915;
      }

      this.field4914 += var3 * 0.25;
      this.field4916 += var7 * 0.25;
      this.field4915 += var5 * 0.25;
   }

   public void updatePose() {
      if (this.isPoseClear(Pose.field13622)) {
         Pose var3;
         if (!this.isElytraFlying()) {
            if (!this.isSleeping()) {
               if (!this.isSwimming()) {
                  if (!this.isSpinAttacking()) {
                     if (this.isSneaking() && !this.abilities.isFlying) {
                        var3 = Pose.field13624;
                     } else {
                        var3 = Pose.STANDING;
                     }
                  } else {
                     var3 = Pose.field13623;
                  }
               } else {
                  var3 = Pose.field13622;
               }
            } else {
               var3 = Pose.field13621;
            }
         } else {
            var3 = Pose.field13620;
         }

         Pose var4;
         if (this.isSpectator() || this.isPassenger() || this.isPoseClear(var3)) {
            var4 = var3;
         } else if (!this.isPoseClear(Pose.field13624)) {
            var4 = Pose.field13622;
         } else {
            var4 = Pose.field13624;
         }

         this.setPose(var4);
      }
   }

   @Override
   public int method2858() {
      return !this.abilities.disableDamage ? 80 : 1;
   }

   @Override
   public SoundEvent method2859() {
      return SoundEvents.field26969;
   }

   @Override
   public SoundEvent method2860() {
      return SoundEvents.field26967;
   }

   @Override
   public SoundEvent getSplashSound() {
      return SoundEvents.field26968;
   }

   @Override
   public int getPortalCooldown() {
      return 10;
   }

   @Override
   public void playSound(SoundEvent var1, float var2, float var3) {
      this.world.playSound(this, this.getPosX(), this.getPosY(), this.getPosZ(), var1, this.getSoundCategory(), var2, var3);
   }

   public void method2834(SoundEvent var1, SoundCategory var2, float var3, float var4) {
   }

   @Override
   public SoundCategory getSoundCategory() {
      return SoundCategory.field14735;
   }

   @Override
   public int getFireImmuneTicks() {
      return 20;
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 9) {
         if (var1 != 23) {
            if (var1 != 22) {
               if (var1 != 43) {
                  super.handleStatusUpdate(var1);
               } else {
                  this.method2867(ParticleTypes.field34053);
               }
            } else {
               this.field4927 = true;
            }
         } else {
            this.field4927 = false;
         }
      } else {
         this.onItemUseFinish();
      }
   }

   private void method2867(IParticleData var1) {
      for (int var4 = 0; var4 < 5; var4++) {
         double var5 = this.rand.nextGaussian() * 0.02;
         double var7 = this.rand.nextGaussian() * 0.02;
         double var9 = this.rand.nextGaussian() * 0.02;
         this.world.addParticle(var1, this.getPosXRandom(1.0), this.getPosYRandom() + 1.0, this.getPosZRandom(1.0), var5, var7, var9);
      }
   }

   public void method2772() {
      this.openContainer = this.container;
   }

   @Override
   public void updateRidden() {
      if (this.method2852() && this.isPassenger()) {
         this.stopRiding();
         this.setSneaking(false);
      } else {
         double var3 = this.getPosX();
         double var5 = this.getPosY();
         double var7 = this.getPosZ();
         super.updateRidden();
         this.prevCameraYaw = this.cameraYaw;
         this.cameraYaw = 0.0F;
         this.method2920(this.getPosX() - var3, this.getPosY() - var5, this.getPosZ() - var7);
      }
   }

   @Override
   public void preparePlayerToSpawn() {
      this.setPose(Pose.STANDING);
      super.preparePlayerToSpawn();
      this.setHealth(this.method3075());
      this.deathTime = 0;
   }

   @Override
   public void updateEntityActionState() {
      super.updateEntityActionState();
      this.updateArmSwingProgress();
      this.rotationYawHead = this.rotationYaw;
   }

   @Override
   public void livingTick() {
      if (this.field4907 > 0) {
         this.field4907--;
      }

      if (this.world.method6997() == Difficulty.PEACEFUL && this.world.getGameRules().getBoolean(GameRules.field24231)) {
         if (this.getHealth() < this.method3075() && this.ticksExisted % 20 == 0) {
            this.heal(1.0F);
         }

         if (this.foodStats.method37575() && this.ticksExisted % 10 == 0) {
            this.foodStats.method37578(this.foodStats.getFoodLevel() + 1);
         }
      }

      this.inventory.method4044();
      this.prevCameraYaw = this.cameraYaw;
      super.livingTick();
      this.jumpMovementFactor = 0.02F;
      if (this.isSprinting()) {
         this.jumpMovementFactor = (float)((double)this.jumpMovementFactor + 0.005999999865889549);
      }

      this.setAIMoveSpeed((float)this.getAttributeValue(Attributes.MOVEMENT_SPEED));
      float var3;
      if (this.onGround && !this.getShouldBeDead() && !this.isSwimming()) {
         var3 = Math.min(0.1F, MathHelper.sqrt(horizontalMag(this.getMotion())));
      } else {
         var3 = 0.0F;
      }

      this.cameraYaw = this.cameraYaw + (var3 - this.cameraYaw) * 0.4F;
      if (this.getHealth() > 0.0F && !this.isSpectator()) {
         AxisAlignedBB var4;
         if (this.isPassenger() && !this.getRidingEntity().removed) {
            var4 = this.getBoundingBox().method19666(this.getRidingEntity().getBoundingBox()).grow(1.0, 0.0, 1.0);
         } else {
            var4 = this.getBoundingBox().grow(1.0, 0.5, 1.0);
         }

         List var5 = this.world.method7181(this, var4);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            Entity var7 = (Entity)var5.get(var6);
            if (!var7.removed) {
               this.method2873(var7);
            }
         }
      }

      this.method2872(this.method2969());
      this.method2872(this.method2971());
      if (!this.world.isRemote && (this.fallDistance > 0.5F || this.isInWater()) || this.abilities.isFlying || this.isSleeping()) {
         this.method2949();
      }
   }

   private void method2872(CompoundNBT var1) {
      if (var1 != null && (!var1.contains("Silent") || !var1.getBoolean("Silent")) && this.world.rand.nextInt(200) == 0) {
         String var4 = var1.getString("id");
         EntityType.method33199(var4)
            .filter(var0 -> var0 == EntityType.PARROT)
            .ifPresent(
               var1x -> {
                  if (!ParrotEntity.method4409(this.world, this)) {
                     this.world
                        .playSound(
                           (PlayerEntity)null,
                           this.getPosX(),
                           this.getPosY(),
                           this.getPosZ(),
                           ParrotEntity.method4411(this.world, this.world.rand),
                           this.getSoundCategory(),
                           1.0F,
                           ParrotEntity.method4413(this.world.rand)
                        );
                  }
               }
            );
      }
   }

   private void method2873(Entity var1) {
      var1.onCollideWithPlayer(this);
   }

   public int method2874() {
      return this.dataManager.<Integer>method35445(field4896);
   }

   public void method2875(int var1) {
      this.dataManager.method35446(field4896, var1);
   }

   public void method2876(int var1) {
      int var4 = this.method2874();
      this.dataManager.method35446(field4896, var4 + var1);
   }

   @Override
   public void onDeath(DamageSource var1) {
      super.onDeath(var1);
      this.recenterBoundingBox();
      if (!this.isSpectator()) {
         this.spawnDrops(var1);
      }

      if (var1 == null) {
         this.setMotion(0.0, 0.1, 0.0);
      } else {
         this.setMotion(
            (double)(-MathHelper.cos((this.attackedAtYaw + this.rotationYaw) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-MathHelper.sin((this.attackedAtYaw + this.rotationYaw) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      }

      this.method2911(Stats.field40134);
      this.method2777(Stats.field40104.method172(Stats.field40107));
      this.method2777(Stats.field40104.method172(Stats.field40108));
      this.extinguish();
      this.setFlag(0, false);
   }

   @Override
   public void dropInventory() {
      super.dropInventory();
      if (!this.world.getGameRules().getBoolean(GameRules.field24225)) {
         this.method2878();
         this.inventory.method4054();
      }
   }

   public void method2878() {
      for (int var3 = 0; var3 < this.inventory.getSizeInventory(); var3++) {
         ItemStack var4 = this.inventory.getStackInSlot(var3);
         if (!var4.isEmpty() && EnchantmentHelper.method26335(var4)) {
            this.inventory.removeStackFromSlot(var3);
         }
      }
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      if (var1 != DamageSource.field38994) {
         if (var1 != DamageSource.field38999) {
            return var1 != DamageSource.field39012 ? SoundEvents.field26961 : SoundEvents.field26964;
         } else {
            return SoundEvents.field26962;
         }
      } else {
         return SoundEvents.field26963;
      }
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26960;
   }

   public boolean drop(boolean var1) {
      return this.method2836(
            this.inventory
               .decrStackSize(this.inventory.currentItem, var1 && !this.inventory.method4028().isEmpty() ? this.inventory.method4028().getCount() : 1),
            false,
            true
         )
         != null;
   }

   @Nullable
   public ItemEntity dropItem(ItemStack var1, boolean var2) {
      return this.method2836(var1, false, var2);
   }

   @Nullable
   public ItemEntity method2836(ItemStack var1, boolean var2, boolean var3) {
      if (var1 == null) {
         System.out.println("ItemStack + " + var1 + " is null");
         return null;
      }

      if (!var1.isEmpty()) {
         if (this.world.isRemote) {
            this.swingArm(Hand.MAIN_HAND);
         }

         double var6 = this.getPosYEye() - 0.3F;
         ItemEntity var8 = new ItemEntity(this.world, this.getPosX(), var6, this.getPosZ(), var1);
         var8.method4134(40);
         if (var3) {
            var8.method4129(this.getUniqueID());
         }

         if (!var2) {
            float var9 = 0.3F;
            float var10 = MathHelper.sin(this.rotationPitch * (float) (Math.PI / 180.0));
            float var11 = MathHelper.cos(this.rotationPitch * (float) (Math.PI / 180.0));
            float var12 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0));
            float var13 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0));
            float var14 = this.rand.nextFloat() * (float) (Math.PI * 2);
            float var15 = 0.02F * this.rand.nextFloat();
            var8.setMotion(
               (double)(-var12 * var11 * 0.3F) + Math.cos((double)var14) * (double)var15,
               (double)(-var10 * 0.3F + 0.1F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F),
               (double)(var13 * var11 * 0.3F) + Math.sin((double)var14) * (double)var15
            );
         } else {
            float var16 = this.rand.nextFloat() * 0.5F;
            float var17 = this.rand.nextFloat() * (float) (Math.PI * 2);
            var8.setMotion((double)(-MathHelper.sin(var17) * var16), 0.2F, (double)(MathHelper.cos(var17) * var16));
         }

         return var8;
      } else {
         return null;
      }
   }

   public float method2883(BlockState var1) {
      float var4 = this.inventory.method4049(var1);
      if (var4 > 1.0F) {
         int var5 = EnchantmentHelper.method26327(this);
         ItemStack var6 = this.getHeldItemMainhand();
         if (var5 > 0 && !var6.isEmpty()) {
            var4 += (float)(var5 * var5 + 1);
         }
      }

      if (Class7182.method22536(this)) {
         var4 *= 1.0F + (float)(Class7182.method22537(this) + 1) * 0.2F;
      }

      if (this.isPotionActive(Effects.MINING_FATIGUE)) {
         float var7;
         switch (this.getActivePotionEffect(Effects.MINING_FATIGUE).getAmplifier()) {
            case 0:
               var7 = 0.3F;
               break;
            case 1:
               var7 = 0.09F;
               break;
            case 2:
               var7 = 0.0027F;
               break;
            case 3:
            default:
               var7 = 8.1E-4F;
         }

         var4 *= var7;
      }

      if (this.areEyesInFluid(FluidTags.field40469) && !EnchantmentHelper.method26331(this)) {
         var4 /= 5.0F;
      }

      if (!this.onGround) {
         var4 /= 5.0F;
      }

      return var4;
   }

   public boolean method2884(BlockState var1) {
      return !var1.method23458() || this.inventory.method4028().method32124(var1);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.setUniqueId(method2960(this.field4926));
      ListNBT var4 = var1.getList("Inventory", 10);
      this.inventory.method4051(var4);
      this.inventory.currentItem = var1.getInt("SelectedItemSlot");
      this.field4917 = var1.getShort("SleepTimer");
      this.field4922 = var1.getFloat("XpP");
      this.field4920 = var1.getInt("XpLevel");
      this.field4921 = var1.getInt("XpTotal");
      this.field4923 = var1.getInt("XpSeed");
      if (this.field4923 == 0) {
         this.field4923 = this.rand.nextInt();
      }

      this.method2875(var1.getInt("Score"));
      this.foodStats.method37572(var1);
      this.abilities.read(var1);
      this.getAttribute(Attributes.MOVEMENT_SPEED).method38661((double)this.abilities.getWalkSpeed());
      if (var1.contains("EnderItems", 9)) {
         this.field4903.method3682(var1.getList("EnderItems", 10));
      }

      if (var1.contains("ShoulderEntityLeft", 10)) {
         this.method2970(var1.getCompound("ShoulderEntityLeft"));
      }

      if (var1.contains("ShoulderEntityRight", 10)) {
         this.method2972(var1.getCompound("ShoulderEntityRight"));
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("DataVersion", SharedConstants.getVersion().getWorldVersion());
      var1.put("Inventory", this.inventory.method4050(new ListNBT()));
      var1.putInt("SelectedItemSlot", this.inventory.currentItem);
      var1.putShort("SleepTimer", (short)this.field4917);
      var1.putFloat("XpP", this.field4922);
      var1.putInt("XpLevel", this.field4920);
      var1.putInt("XpTotal", this.field4921);
      var1.putInt("XpSeed", this.field4923);
      var1.putInt("Score", this.method2874());
      this.foodStats.method37573(var1);
      this.abilities.method20712(var1);
      var1.put("EnderItems", this.field4903.method3683());
      if (!this.method2969().isEmpty()) {
         var1.put("ShoulderEntityLeft", this.method2969());
      }

      if (!this.method2971().isEmpty()) {
         var1.put("ShoulderEntityRight", this.method2971());
      }
   }

   @Override
   public boolean isInvulnerableTo(DamageSource var1) {
      if (!super.isInvulnerableTo(var1)) {
         if (var1 != DamageSource.field38999) {
            if (var1 != DamageSource.field39002) {
               return !var1.method31141() ? false : !this.world.getGameRules().getBoolean(GameRules.field24251);
            } else {
               return !this.world.getGameRules().getBoolean(GameRules.field24250);
            }
         } else {
            return !this.world.getGameRules().getBoolean(GameRules.field24249);
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (!this.isInvulnerableTo(source)) {
         if (this.abilities.disableDamage && !source.method31135()) {
            return false;
         } else {
            this.field4973 = 0;
            if (!this.getShouldBeDead()) {
               this.method2949();
               if (source.method31111()) {
                  if (this.world.method6997() == Difficulty.PEACEFUL) {
                     var2 = 0.0F;
                  }

                  if (this.world.method6997() == Difficulty.EASY) {
                     var2 = Math.min(var2 / 2.0F + 1.0F, var2);
                  }

                  if (this.world.method6997() == Difficulty.HARD) {
                     var2 = var2 * 3.0F / 2.0F;
                  }
               }

               return var2 != 0.0F ? super.attackEntityFrom(source, var2) : false;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public void blockUsingShield(LivingEntity var1) {
      super.blockUsingShield(var1);
      if (var1.getHeldItemMainhand().getItem() instanceof Class3265) {
         this.method2901(true);
      }
   }

   public boolean method2742(PlayerEntity var1) {
      Team var4 = this.getTeam();
      Team var5 = var1.getTeam();
      if (var4 != null) {
         return var4.method28592(var5) ? var4.method28578() : true;
      } else {
         return true;
      }
   }

   @Override
   public void method2886(DamageSource var1, float var2) {
      this.inventory.method4053(var1, var2);
   }

   @Override
   public void method2887(float var1) {
      if (this.activeItemStack.getItem() == Items.field38119) {
         if (!this.world.isRemote) {
            this.addStat(Stats.field40098.method172(this.activeItemStack.getItem()));
         }

         if (var1 >= 3.0F) {
            int var4 = 1 + MathHelper.floor(var1);
            Hand var5 = this.getActiveHand();
            this.activeItemStack.damageItem(var4, this, var1x -> var1x.sendBreakAnimation(var5));
            if (this.activeItemStack.isEmpty()) {
               if (var5 != Hand.MAIN_HAND) {
                  this.setItemStackToSlot(EquipmentSlotType.OFFHAND, ItemStack.EMPTY);
               } else {
                  this.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);
               }

               this.activeItemStack = ItemStack.EMPTY;
               this.playSound(SoundEvents.field27036, 0.8F, 0.8F + this.world.rand.nextFloat() * 0.4F);
            }
         }
      }
   }

   @Override
   public void damageEntity(DamageSource var1, float var2) {
      if (!this.isInvulnerableTo(var1)) {
         var2 = this.applyArmorCalculations(var1, var2);
         var2 = this.applyPotionDamageCalculations(var1, var2);
         float var5 = Math.max(var2 - this.getAbsorptionAmount(), 0.0F);
         this.setAbsorptionAmount(this.getAbsorptionAmount() - (var2 - var5));
         float var6 = var2 - var5;
         if (var6 > 0.0F && var6 < 3.4028235E37F) {
            this.addStat(Stats.field40132, Math.round(var6 * 10.0F));
         }

         if (var5 != 0.0F) {
            this.addExhaustion(var1.method31134());
            float var7 = this.getHealth();
            this.setHealth(this.getHealth() - var5);
            this.getCombatTracker().method27599(var1, var7, var5);
            if (var5 < 3.4028235E37F) {
               this.addStat(Stats.field40130, Math.round(var5 * 10.0F));
            }
         }
      }
   }

   @Override
   public boolean method2889() {
      return !this.abilities.isFlying && super.method2889();
   }

   public void method2764(Class954 var1) {
   }

   public void method2890(CommandBlockLogic var1) {
   }

   public void method2770(CommandBlockTileEntity var1) {
   }

   public void method2891(Class964 var1) {
   }

   public void method2892(JigsawTileEntity var1) {
   }

   public void method2768(AbstractHorseEntity var1, IInventory var2) {
   }

   public OptionalInt method2766(Class949 var1) {
      return OptionalInt.empty();
   }

   public void method2767(int var1, Class46 var2, int var3, int var4, boolean var5, boolean var6) {
   }

   public void method2769(ItemStack var1, Hand var2) {
   }

   public ActionResultType interactOn(Entity var1, Hand var2) {
      if (!this.isSpectator()) {
         ItemStack var5 = this.getHeldItem(var2);
         ItemStack var6 = var5.copy();
         ActionResultType var7 = var1.processInitialInteract(this, var2);
         if (!var7.isSuccessOrConsume()) {
            if (!var5.isEmpty() && var1 instanceof LivingEntity) {
               if (this.abilities.isCreativeMode) {
                  var5 = var6;
               }

               ActionResultType var8 = var5.method32125(this, (LivingEntity)var1, var2);
               if (var8.isSuccessOrConsume()) {
                  if (var5.isEmpty() && !this.abilities.isCreativeMode) {
                     this.setHeldItem(var2, ItemStack.EMPTY);
                  }

                  return var8;
               }
            }

            return ActionResultType.field14820;
         } else {
            if (this.abilities.isCreativeMode && var5 == this.getHeldItem(var2) && var5.getCount() < var6.getCount()) {
               var5.setCount(var6.getCount());
            }

            return var7;
         }
      } else {
         if (var1 instanceof Class949) {
            this.method2766((Class949)var1);
         }

         return ActionResultType.field14820;
      }
   }

   @Override
   public double getYOffset() {
      return -0.35;
   }

   @Override
   public void dismount() {
      super.dismount();
      this.rideCooldown = 0;
   }

   @Override
   public boolean isMovementBlocked() {
      return super.isMovementBlocked() || this.isSleeping();
   }

   @Override
   public boolean method2897() {
      return !this.abilities.isFlying;
   }

   @Override
   public Vector3d maybeBackOffFromEdge(Vector3d var1, MoverType var2) {
      SafeWalkEvent event = new SafeWalkEvent(true);
      Client.getInstance().getEventManager().call(event);
      if (event.getSituation() == Situation.PLAYER || !this.abilities.isFlying && (var2 == MoverType.SELF || var2 == MoverType.PLAYER) && this.method2853() && this.method2899()) {
         double var6 = var1.x;
         double var8 = var1.z;
         double var10 = 0.05;

         while (var6 != 0.0 && this.world.hasNoCollisions(this, this.getBoundingBox().offset(var6, (double)(-this.stepHeight), 0.0))) {
            if (var6 < 0.05 && var6 >= -0.05) {
               var6 = 0.0;
            } else if (!(var6 > 0.0)) {
               var6 += 0.05;
            } else {
               var6 -= 0.05;
            }
         }

         while (var8 != 0.0 && this.world.hasNoCollisions(this, this.getBoundingBox().offset(0.0, (double)(-this.stepHeight), var8))) {
            if (var8 < 0.05 && var8 >= -0.05) {
               var8 = 0.0;
            } else if (!(var8 > 0.0)) {
               var8 += 0.05;
            } else {
               var8 -= 0.05;
            }
         }

         while (var6 != 0.0 && var8 != 0.0 && this.world.hasNoCollisions(this, this.getBoundingBox().offset(var6, (double)(-this.stepHeight), var8))) {
            if (var6 < 0.05 && var6 >= -0.05) {
               var6 = 0.0;
            } else if (!(var6 > 0.0)) {
               var6 += 0.05;
            } else {
               var6 -= 0.05;
            }

            if (var8 < 0.05 && var8 >= -0.05) {
               var8 = 0.0;
            } else if (!(var8 > 0.0)) {
               var8 += 0.05;
            } else {
               var8 -= 0.05;
            }
         }

         var1 = new Vector3d(var6, var1.y, var8);
      }

      SafeWalkEvent var12 = new SafeWalkEvent(false);
      Client.getInstance().getEventManager().call(var12);
      return var1;
   }

   private boolean method2899() {
      return this.onGround
         || this.fallDistance < this.stepHeight
            && !this.world.hasNoCollisions(this, this.getBoundingBox().offset(0.0, (double)(this.fallDistance - this.stepHeight), 0.0));
   }

   public void attackTargetEntityWithCurrentItem(Entity targetEntity)
   {
      if (targetEntity.canBeAttackedWithItem())
      {
         if (!targetEntity.hitByEntity(this))
         {
            float f = (float)this.getAttributeValue(Attributes.ATTACK_DAMAGE);
            float f1;

            if (targetEntity instanceof LivingEntity)
            {
               f1 = EnchantmentHelper.getModifierForCreature(this.getHeldItemMainhand(), ((LivingEntity)targetEntity).getCreatureAttribute());
            }
            else
            {
               f1 = EnchantmentHelper.getModifierForCreature(this.getHeldItemMainhand(), CreatureAttribute.UNDEFINED);
            }

            float f2 = this.getCooledAttackStrength(0.5F);
            f = f * (0.2F + f2 * f2 * 0.8F);
            f1 = f1 * f2;
            this.resetCooldown();

            if (f > 0.0F || f1 > 0.0F)
            {
               boolean flag = f2 > 0.9F;
               boolean flag1 = false;
               int i = 0;
               i = i + EnchantmentHelper.getKnockbackModifier(this);

               if (this.isSprinting() && flag)
               {
                  this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_PLAYER_ATTACK_KNOCKBACK, this.getSoundCategory(), 1.0F, 1.0F);
                  ++i;
                  flag1 = true;
               }

               boolean flag2 = flag && this.fallDistance > 0.0F && !this.onGround && !this.isOnLadder() && !this.isInWater() && !this.isPotionActive(Effects.BLINDNESS) && !this.isPassenger() && targetEntity instanceof LivingEntity;
               flag2 = flag2 && !this.isSprinting();

               if (flag2)
               {
                  f *= 1.5F;
               }

               f = f + f1;
               boolean flag3 = false;
               double d0 = (double)(this.distanceWalkedModified - this.prevDistanceWalkedModified);

               if (flag && !flag2 && !flag1 && this.onGround && d0 < (double)this.getAIMoveSpeed())
               {
                  ItemStack itemstack = this.getHeldItem(Hand.MAIN_HAND);

                  if (itemstack.getItem() instanceof SwordItem)
                  {
                     flag3 = true;
                  }
               }

               float f4 = 0.0F;
               boolean flag4 = false;
               int j = EnchantmentHelper.getFireAspectModifier(this);

               if (targetEntity instanceof LivingEntity)
               {
                  f4 = ((LivingEntity)targetEntity).getHealth();

                  if (j > 0 && !targetEntity.isBurning())
                  {
                     flag4 = true;
                     targetEntity.setFire(1);
                  }
               }

               Vector3d vector3d = targetEntity.getMotion();
               boolean flag5 = targetEntity.attackEntityFrom(DamageSource.causePlayerDamage(this), f);

               if (flag5)
               {
                  if (i > 0)
                  {
                     if (targetEntity instanceof LivingEntity)
                     {
                        ((LivingEntity)targetEntity).applyKnockback((float)i * 0.5F, (double)MathHelper.sin(this.rotationYaw * ((float)Math.PI / 180F)), (double)(-MathHelper.cos(this.rotationYaw * ((float)Math.PI / 180F))));
                     }
                     else
                     {
                        targetEntity.addVelocity((double)(-MathHelper.sin(this.rotationYaw * ((float)Math.PI / 180F)) * (float)i * 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * ((float)Math.PI / 180F)) * (float)i * 0.5F));
                     }

                     this.setMotion(this.getMotion().mul(0.6D, 1.0D, 0.6D));
                     this.setSprinting(false);
                  }

                  if (flag3)
                  {
                     float f3 = 1.0F + EnchantmentHelper.getSweepingDamageRatio(this) * f;

                     for (LivingEntity livingentity : this.world.getEntitiesWithinAABB(LivingEntity.class, targetEntity.getBoundingBox().grow(1.0D, 0.25D, 1.0D)))
                     {
                        if (livingentity != this && livingentity != targetEntity && !this.isOnSameTeam(livingentity) && (!(livingentity instanceof ArmorStandEntity) || !((ArmorStandEntity)livingentity).hasMarker()) && this.getDistanceSq(livingentity) < 9.0D)
                        {
                           livingentity.applyKnockback(0.4F, (double)MathHelper.sin(this.rotationYaw * ((float)Math.PI / 180F)), (double)(-MathHelper.cos(this.rotationYaw * ((float)Math.PI / 180F))));
                           livingentity.attackEntityFrom(DamageSource.causePlayerDamage(this), f3);
                        }
                     }

                     this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, this.getSoundCategory(), 1.0F, 1.0F);
                     this.spawnSweepParticles();
                  }

                  if (targetEntity instanceof ServerPlayerEntity && targetEntity.velocityChanged)
                  {
                     ((ServerPlayerEntity)targetEntity).connection.sendPacket(new SEntityVelocityPacket(targetEntity));
                     targetEntity.velocityChanged = false;
                     targetEntity.setMotion(vector3d);
                  }

                  if (flag2)
                  {
                     this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_PLAYER_ATTACK_CRIT, this.getSoundCategory(), 1.0F, 1.0F);
                     this.onCriticalHit(targetEntity);
                  }

                  if (!flag2 && !flag3)
                  {
                     if (flag)
                     {
                        this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_PLAYER_ATTACK_STRONG, this.getSoundCategory(), 1.0F, 1.0F);
                     }
                     else
                     {
                        this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_PLAYER_ATTACK_WEAK, this.getSoundCategory(), 1.0F, 1.0F);
                     }
                  }

                  if (f1 > 0.0F)
                  {
                     this.onEnchantmentCritical(targetEntity);
                  }

                  this.setLastAttackedEntity(targetEntity);

                  if (targetEntity instanceof LivingEntity)
                  {
                     EnchantmentHelper.applyThornEnchantments((LivingEntity)targetEntity, this);
                  }

                  EnchantmentHelper.applyArthropodEnchantments(this, targetEntity);
                  ItemStack itemstack1 = this.getHeldItemMainhand();
                  Entity entity = targetEntity;

                  if (targetEntity instanceof EnderDragonPartEntity)
                  {
                     entity = ((EnderDragonPartEntity)targetEntity).dragon;
                  }

                  if (!this.world.isRemote && !itemstack1.isEmpty() && entity instanceof LivingEntity)
                  {
                     itemstack1.hitEntity((LivingEntity)entity, this);

                     if (itemstack1.isEmpty())
                     {
                        this.setHeldItem(Hand.MAIN_HAND, ItemStack.EMPTY);
                     }
                  }

                  if (targetEntity instanceof LivingEntity)
                  {
                     float f5 = f4 - ((LivingEntity)targetEntity).getHealth();
                     this.addStat(Stats.DAMAGE_DEALT, Math.round(f5 * 10.0F));

                     if (j > 0)
                     {
                        targetEntity.setFire(j * 4);
                     }

                     if (this.world instanceof ServerWorld && f5 > 2.0F)
                     {
                        int k = (int)((double)f5 * 0.5D);
                        ((ServerWorld)this.world).spawnParticle(ParticleTypes.DAMAGE_INDICATOR, targetEntity.getPosX(), targetEntity.getPosYHeight(0.5D), targetEntity.getPosZ(), k, 0.1D, 0.0D, 0.1D, 0.2D);
                     }
                  }

                  this.addExhaustion(0.1F);
               }
               else
               {
                  this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_PLAYER_ATTACK_NODAMAGE, this.getSoundCategory(), 1.0F, 1.0F);

                  if (flag4)
                  {
                     targetEntity.extinguish();
                  }
               }
            }
         }
      }
   }

   @Override
   public void method2900(LivingEntity var1) {
      this.attackTargetEntityWithCurrentItem(var1);
   }

   public void method2901(boolean var1) {
      float var4 = 0.25F + (float) EnchantmentHelper.method26327(this) * 0.05F;
      if (var1) {
         var4 += 0.75F;
      }

      if (this.rand.nextFloat() < var4) {
         this.method2976().method19638(Items.field38119, 100);
         this.resetActiveHand();
         this.world.setEntityState(this, (byte)30);
      }
   }

   public void onCriticalHit(Entity var1) {
   }

   public void onEnchantmentCritical(Entity var1) {
   }

   public void spawnSweepParticles() {
      double var3 = (double)(-MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0)));
      double var5 = (double) MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0));
      if (this.world instanceof ServerWorld) {
         ((ServerWorld)this.world)
            .spawnParticle(ParticleTypes.field34096, this.getPosX() + var3, this.getPosYHeight(0.5), this.getPosZ() + var5, 0, var3, 0.0, var5, 0.0);
      }
   }

   public void respawnPlayer() {
   }

   @Override
   public void remove() {
      super.remove();
      this.container.onContainerClosed(this);
      if (this.openContainer != null) {
         this.openContainer.onContainerClosed(this);
      }
   }

   public boolean method2905() {
      return false;
   }

   public GameProfile getGameProfile() {
      return this.field4926;
   }

   public Either<Class2104, Unit> method2752(BlockPos var1) {
      this.startSleeping(var1);
      this.field4917 = 0;
      return Either.right(Unit.INSTANCE);
   }

   public void stopSleepInBed(boolean var1, boolean var2) {
      super.wakeUp();
      if (this.world instanceof ServerWorld && var2) {
         ((ServerWorld)this.world).method6902();
      }

      this.field4917 = !var1 ? 100 : 0;
   }

   @Override
   public void wakeUp() {
      this.stopSleepInBed(true, true);
   }

   public static Optional<Vector3d> method2908(ServerWorld var0, BlockPos var1, float var2, boolean var3, boolean var4) {
      BlockState var7 = var0.getBlockState(var1);
      Block var8 = var7.getBlock();
      if (var8 instanceof Class3389 && var7.<Integer>get(Class3389.field19000) > 0 && Class3389.method11988(var0)) {
         Optional var11 = Class3389.method11991(EntityType.PLAYER, var0, var1);
         if (!var4 && var11.isPresent()) {
            var0.setBlockState(var1, var7.with(Class3389.field19000, Integer.valueOf(var7.<Integer>get(Class3389.field19000) - 1)), 3);
         }

         return var11;
      } else if (var8 instanceof Class3250 && Class3250.method11679(var0)) {
         return Class3250.method11686(EntityType.PLAYER, var0, var1, var2);
      } else if (!var3) {
         return Optional.<Vector3d>empty();
      } else {
         boolean var9 = var8.method11564();
         boolean var10 = var0.getBlockState(var1.up()).getBlock().method11564();
         return var9 && var10
            ? Optional.<Vector3d>of(new Vector3d((double)var1.getX() + 0.5, (double)var1.getY() + 0.1, (double)var1.getZ() + 0.5))
            : Optional.<Vector3d>empty();
      }
   }

   public boolean method2909() {
      return this.isSleeping() && this.field4917 >= 100;
   }

   public int method2910() {
      return this.field4917;
   }

   public void sendStatusMessage(ITextComponent var1, boolean var2) {
   }

   public void method2911(ResourceLocation var1) {
      this.addStat(Stats.field40104.method172(var1));
   }

   public void addStat(ResourceLocation var1, int var2) {
      this.method2776(Stats.field40104.method172(var1), var2);
   }

   public void addStat(Class9007<?> var1) {
      this.method2776(var1, 1);
   }

   public void method2776(Class9007<?> var1, int var2) {
   }

   public void method2777(Class9007<?> var1) {
   }

   public int method2778(Collection<IRecipe<?>> var1) {
      return 0;
   }

   public void method2779(ResourceLocation[] var1) {
   }

   public int method2780(Collection<IRecipe<?>> var1) {
      return 0;
   }

   @Override
   public void jump() {
      super.jump();
      this.method2911(Stats.field40125);
      if (!this.isSprinting()) {
         this.addExhaustion(0.05F);
      } else {
         this.addExhaustion(0.2F);
      }
   }

   @Override
   public void travel(Vector3d var1) {
      double var4 = this.getPosX();
      double var6 = this.getPosY();
      double var8 = this.getPosZ();
      if (this.isSwimming() && !this.isPassenger()) {
         double var10 = this.getLookVec().y;
         double var12 = !(var10 < -0.2) ? 0.06 : 0.085;
         if (var10 <= 0.0
            || this.isJumping
            || !this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() + 1.0 - 0.1, this.getPosZ())).getFluidState().isEmpty()) {
            Vector3d var14 = this.getMotion();
            this.setMotion(var14.add(0.0, (var10 - var14.y) * var12, 0.0));
         }
      }

      if (this.abilities.isFlying && !this.isPassenger()) {
         double var17 = this.getMotion().y;
         float var15 = this.jumpMovementFactor;
         this.jumpMovementFactor = this.abilities.getFlySpeed() * (float)(!this.isSprinting() ? 1 : 2);
         super.travel(var1);
         Vector3d var16 = this.getMotion();
         this.setMotion(var16.x, var17 * 0.6, var16.z);
         this.jumpMovementFactor = var15;
         this.fallDistance = 0.0F;
         this.setFlag(7, false);
      } else {
         super.travel(var1);
      }

      this.method2919(this.getPosX() - var4, this.getPosY() - var6, this.getPosZ() - var8);
   }

   @Override
   public void updateSwimming() {
      if (!this.abilities.isFlying) {
         super.updateSwimming();
      } else {
         this.setSwimming(false);
      }
   }

   public boolean method2917(BlockPos var1) {
      return !this.world.getBlockState(var1).method23437(this.world, var1);
   }

   @Override
   public float getAIMoveSpeed() {
      return (float)this.getAttributeValue(Attributes.MOVEMENT_SPEED);
   }

   public void method2919(double var1, double var3, double var5) {
      if (!this.isPassenger()) {
         if (!this.isSwimming()) {
            if (!this.areEyesInFluid(FluidTags.field40469)) {
               if (!this.isInWater()) {
                  if (!this.isOnLadder()) {
                     if (!this.onGround) {
                        if (!this.isElytraFlying()) {
                           int var9 = Math.round(MathHelper.sqrt(var1 * var1 + var5 * var5) * 100.0F);
                           if (var9 > 25) {
                              this.addStat(Stats.field40116, var9);
                           }
                        } else {
                           int var10 = Math.round(MathHelper.sqrt(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
                           this.addStat(Stats.field40122, var10);
                        }
                     } else {
                        int var11 = Math.round(MathHelper.sqrt(var1 * var1 + var5 * var5) * 100.0F);
                        if (var11 > 0) {
                           if (!this.isSprinting()) {
                              if (!this.isCrouching()) {
                                 this.addStat(Stats.field40110, var11);
                                 this.addExhaustion(0.0F * (float)var11 * 0.01F);
                              } else {
                                 this.addStat(Stats.field40111, var11);
                                 this.addExhaustion(0.0F * (float)var11 * 0.01F);
                              }
                           } else {
                              this.addStat(Stats.field40112, var11);
                              this.addExhaustion(0.1F * (float)var11 * 0.01F);
                           }
                        }
                     }
                  } else if (var3 > 0.0) {
                     this.addStat(Stats.field40115, (int)Math.round(var3 * 100.0));
                  }
               } else {
                  int var12 = Math.round(MathHelper.sqrt(var1 * var1 + var5 * var5) * 100.0F);
                  if (var12 > 0) {
                     this.addStat(Stats.field40113, var12);
                     this.addExhaustion(0.01F * (float)var12 * 0.01F);
                  }
               }
            } else {
               int var13 = Math.round(MathHelper.sqrt(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
               if (var13 > 0) {
                  this.addStat(Stats.field40117, var13);
                  this.addExhaustion(0.01F * (float)var13 * 0.01F);
               }
            }
         } else {
            int var14 = Math.round(MathHelper.sqrt(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if (var14 > 0) {
               this.addStat(Stats.field40123, var14);
               this.addExhaustion(0.01F * (float)var14 * 0.01F);
            }
         }
      }
   }

   private void method2920(double var1, double var3, double var5) {
      if (this.isPassenger()) {
         int var9 = Math.round(MathHelper.sqrt(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if (var9 > 0) {
            Entity var10 = this.getRidingEntity();
            if (!(var10 instanceof AbstractMinecartEntity)) {
               if (!(var10 instanceof BoatEntity)) {
                  if (!(var10 instanceof Class1072)) {
                     if (!(var10 instanceof AbstractHorseEntity)) {
                        if (var10 instanceof StriderEntity) {
                           this.addStat(Stats.field40124, var9);
                        }
                     } else {
                        this.addStat(Stats.field40121, var9);
                     }
                  } else {
                     this.addStat(Stats.field40120, var9);
                  }
               } else {
                  this.addStat(Stats.field40119, var9);
               }
            } else {
               this.addStat(Stats.field40118, var9);
            }
         }
      }
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      if (!this.abilities.allowFlying) {
         if (var1 >= 2.0F) {
            this.addStat(Stats.field40114, (int)Math.round((double)var1 * 100.0));
         }

         return super.onLivingFall(var1, var2);
      } else {
         return false;
      }
   }

   public boolean tryToStartFallFlying() {
      if (!this.onGround && !this.isElytraFlying() && !this.isInWater() && !this.isPotionActive(Effects.LEVITATION)) {
         ItemStack var3 = this.getItemStackFromSlot(EquipmentSlotType.CHEST);
         if (var3.getItem() == Items.field38120 && Class3256.method11698(var3)) {
            this.method2923();
            return true;
         }
      }

      return false;
   }

   public void method2923() {
      this.setFlag(7, true);
   }

   public void stopFallFlying() {
      this.setFlag(7, true);
      this.setFlag(7, false);
   }

   @Override
   public void doWaterSplashEffect() {
      if (!this.isSpectator()) {
         super.doWaterSplashEffect();
      }
   }

   @Override
   public SoundEvent getFallSound(int var1) {
      return var1 <= 4 ? SoundEvents.field26966 : SoundEvents.field26957;
   }

   @Override
   public void method2927(ServerWorld var1, LivingEntity var2) {
      this.addStat(Stats.field40102.method172(var2.getType()));
   }

   @Override
   public void setMotionMultiplier(BlockState var1, Vector3d var2) {
      if (!this.abilities.isFlying) {
         super.setMotionMultiplier(var1, var2);
      }
   }

   public void method2781(int var1) {
      this.method2876(var1);
      this.field4922 = this.field4922 + (float)var1 / (float)this.method2930();
      this.field4921 = MathHelper.clamp(this.field4921 + var1, 0, Integer.MAX_VALUE);

      while (this.field4922 < 0.0F) {
         float var4 = this.field4922 * (float)this.method2930();
         if (this.field4920 <= 0) {
            this.method2727(-1);
            this.field4922 = 0.0F;
         } else {
            this.method2727(-1);
            this.field4922 = 1.0F + var4 / (float)this.method2930();
         }
      }

      while (this.field4922 >= 1.0F) {
         this.field4922 = (this.field4922 - 1.0F) * (float)this.method2930();
         this.method2727(1);
         this.field4922 = this.field4922 / (float)this.method2930();
      }
   }

   public int method2929() {
      return this.field4923;
   }

   public void method2728(ItemStack var1, int var2) {
      this.field4920 -= var2;
      if (this.field4920 < 0) {
         this.field4920 = 0;
         this.field4922 = 0.0F;
         this.field4921 = 0;
      }

      this.field4923 = this.rand.nextInt();
   }

   public void method2727(int var1) {
      this.field4920 += var1;
      if (this.field4920 < 0) {
         this.field4920 = 0;
         this.field4922 = 0.0F;
         this.field4921 = 0;
      }

      if (var1 > 0 && this.field4920 % 5 == 0 && (float)this.field4925 < (float)this.ticksExisted - 100.0F) {
         float var4 = this.field4920 <= 30 ? (float)this.field4920 / 30.0F : 1.0F;
         this.world
            .playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.field26965, this.getSoundCategory(), var4 * 0.75F, 1.0F);
         this.field4925 = this.ticksExisted;
      }
   }

   public int method2930() {
      if (this.field4920 < 30) {
         return this.field4920 < 15 ? 7 + this.field4920 * 2 : 37 + (this.field4920 - 15) * 5;
      } else {
         return 112 + (this.field4920 - 30) * 9;
      }
   }

   public void addExhaustion(float var1) {
      if (!this.abilities.disableDamage && !this.world.isRemote) {
         this.foodStats.method37576(var1);
      }
   }

   public FoodStats getFoodStats() {
      return this.foodStats;
   }

   public boolean method2933(boolean var1) {
      return this.abilities.disableDamage || var1 || this.foodStats.method37575();
   }

   public boolean method2934() {
      return this.getHealth() > 0.0F && this.getHealth() < this.method3075();
   }

   public boolean method2935() {
      return this.abilities.allowEdit;
   }

   public boolean method2936(BlockPos var1, Direction var2, ItemStack var3) {
      if (!this.abilities.allowEdit) {
         BlockPos var6 = var1.offset(var2.getOpposite());
         CachedBlockInfo var7 = new CachedBlockInfo(this.world, var6, false);
         return var3.method32176(this.world.method6817(), var7);
      } else {
         return true;
      }
   }

   @Override
   public int getExperiencePoints(PlayerEntity var1) {
      if (!this.world.getGameRules().getBoolean(GameRules.field24225) && !this.isSpectator()) {
         int var4 = this.field4920 * 7;
         return var4 <= 100 ? var4 : 100;
      } else {
         return 0;
      }
   }

   @Override
   public boolean isPlayer() {
      return true;
   }

   @Override
   public boolean getAlwaysRenderNameTagForRender() {
      return true;
   }

   @Override
   public boolean canTriggerWalking() {
      return !this.abilities.isFlying && (!this.onGround || !this.isDiscrete());
   }

   public void method2797() {
   }

   public void method2799(GameType var1) {
   }

   @Override
   public ITextComponent getName() {
      return new StringTextComponent(this.field4926.getName());
   }

   public Class980 method2942() {
      return this.field4903;
   }

   @Override
   public ItemStack getItemStackFromSlot(EquipmentSlotType var1) {
      if (var1 != EquipmentSlotType.MAINHAND) {
         if (var1 != EquipmentSlotType.OFFHAND) {
            return var1.getSlotType() != EquipmentSlotType.Group.ARMOR ? ItemStack.EMPTY : this.inventory.field5440.get(var1.getIndex());
         } else {
            return this.inventory.field5441.get(0);
         }
      } else {
         return this.inventory.method4028();
      }
   }

   @Override
   public void setItemStackToSlot(EquipmentSlotType var1, ItemStack var2) {
      if (var1 != EquipmentSlotType.MAINHAND) {
         if (var1 != EquipmentSlotType.OFFHAND) {
            if (var1.getSlotType() == EquipmentSlotType.Group.ARMOR) {
               this.playEquipSound(var2);
               this.inventory.field5440.set(var1.getIndex(), var2);
            }
         } else {
            this.playEquipSound(var2);
            this.inventory.field5441.set(0, var2);
         }
      } else {
         this.playEquipSound(var2);
         this.inventory.field5439.set(this.inventory.currentItem, var2);
      }
   }

   public boolean method2945(ItemStack var1) {
      this.playEquipSound(var1);
      return this.inventory.method4045(var1);
   }

   @Override
   public Iterable<ItemStack> getHeldEquipment() {
      return Lists.newArrayList(new ItemStack[]{this.getHeldItemMainhand(), this.getHeldItemOffhand()});
   }

   @Override
   public Iterable<ItemStack> getArmorInventoryList() {
      return this.inventory.field5440;
   }

   public boolean method2948(CompoundNBT var1) {
      if (this.isPassenger() || !this.onGround || this.isInWater()) {
         return false;
      } else if (this.method2969().isEmpty()) {
         this.method2970(var1);
         this.field4901 = this.world.getGameTime();
         return true;
      } else if (!this.method2971().isEmpty()) {
         return false;
      } else {
         this.method2972(var1);
         this.field4901 = this.world.getGameTime();
         return true;
      }
   }

   public void method2949() {
      if (this.field4901 + 20L < this.world.getGameTime()) {
         this.method2950(this.method2969());
         this.method2970(new CompoundNBT());
         this.method2950(this.method2971());
         this.method2972(new CompoundNBT());
      }
   }

   private void method2950(CompoundNBT var1) {
      if (!this.world.isRemote && !var1.isEmpty()) {
         EntityType.method33217(var1, this.world).ifPresent(var1x -> {
            if (var1x instanceof TameableEntity) {
               ((TameableEntity)var1x).method4398(this.entityUniqueID);
            }

            var1x.setPosition(this.getPosX(), this.getPosY() + 0.7F, this.getPosZ());
            ((ServerWorld)this.world).method6917(var1x);
         });
      }
   }

   @Override
   public abstract boolean isSpectator();

   @Override
   public boolean isSwimming() {
      return !this.abilities.isFlying && !this.isSpectator() && super.isSwimming();
   }

   public abstract boolean isCreative();

   @Override
   public boolean method2952() {
      return !this.abilities.isFlying;
   }

   public Scoreboard method2953() {
      return this.world.method6805();
   }

   @Override
   public ITextComponent getDisplayName() {
      IFormattableTextComponent var3 = ScorePlayerTeam.method28577(this.getTeam(), this.getName());
      return this.method2955(var3);
   }

   private IFormattableTextComponent method2955(IFormattableTextComponent var1) {
      String var4 = this.getGameProfile().getName();
      return var1.modifyStyle(
         var2 -> var2.setClickEvent(new ClickEvent(ClickEvent$Action.SUGGEST_COMMAND, "/tell " + var4 + " "))
               .setHoverEvent(this.method3388())
               .setInsertion(var4)
      );
   }

   @Override
   public String method2956() {
      return this.getGameProfile().getName();
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      switch (Class9138.field41992[var1.ordinal()]) {
         case 1:
         case 2:
         case 3:
            return 0.4F;
         case 4:
            return 1.27F;
         default:
            return 1.62F;
      }
   }

   @Override
   public void setAbsorptionAmount(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.getDataManager().method35446(field4895, var1);
   }

   @Override
   public float getAbsorptionAmount() {
      return this.getDataManager().<Float>method35445(field4895);
   }

   public static UUID method2960(GameProfile var0) {
      UUID var3 = var0.getId();
      if (var3 == null) {
         var3 = method2961(var0.getName());
      }

      return var3;
   }

   public static UUID method2961(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   public boolean method2962(Class2318 var1) {
      return (this.getDataManager().<Byte>method35445(field4897) & var1.method9090()) == var1.method9090();
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      if (var1 >= 0 && var1 < this.inventory.field5439.size()) {
         this.inventory.setInventorySlotContents(var1, var2);
         return true;
      } else {
         EquipmentSlotType var5;
         if (var1 != 100 + EquipmentSlotType.HEAD.getIndex()) {
            if (var1 != 100 + EquipmentSlotType.CHEST.getIndex()) {
               if (var1 != 100 + EquipmentSlotType.LEGS.getIndex()) {
                  if (var1 != 100 + EquipmentSlotType.FEET.getIndex()) {
                     var5 = null;
                  } else {
                     var5 = EquipmentSlotType.FEET;
                  }
               } else {
                  var5 = EquipmentSlotType.LEGS;
               }
            } else {
               var5 = EquipmentSlotType.CHEST;
            }
         } else {
            var5 = EquipmentSlotType.HEAD;
         }

         if (var1 == 98) {
            this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var2);
            return true;
         } else if (var1 != 99) {
            if (var5 == null) {
               int var6 = var1 - 200;
               if (var6 >= 0 && var6 < this.field4903.getSizeInventory()) {
                  this.field4903.setInventorySlotContents(var6, var2);
                  return true;
               } else {
                  return false;
               }
            } else {
               if (!var2.isEmpty()) {
                  if (!(var2.getItem() instanceof ArmorItem) && !(var2.getItem() instanceof Class3256)) {
                     if (var5 != EquipmentSlotType.HEAD) {
                        return false;
                     }
                  } else if (MobEntity.method4271(var2) != var5) {
                     return false;
                  }
               }

               this.inventory.setInventorySlotContents(var5.getIndex() + this.inventory.field5439.size(), var2);
               return true;
            }
         } else {
            this.setItemStackToSlot(EquipmentSlotType.OFFHAND, var2);
            return true;
         }
      }
   }

   public boolean hasReducedDebug() {
      return this.field4927;
   }

   public void method2965(boolean var1) {
      this.field4927 = var1;
   }

   @Override
   public void forceFireTicks(int var1) {
      super.forceFireTicks(!this.abilities.disableDamage ? var1 : Math.min(var1, 1));
   }

   @Override
   public HandSide getPrimaryHand() {
      return this.dataManager.<Byte>method35445(field4898) != 0 ? HandSide.RIGHT : HandSide.LEFT;
   }

   public void method2968(HandSide var1) {
      this.dataManager.method35446(field4898, (byte)(var1 != HandSide.LEFT ? 1 : 0));
   }

   public CompoundNBT method2969() {
      return this.dataManager.<CompoundNBT>method35445(field4899);
   }

   public void method2970(CompoundNBT var1) {
      this.dataManager.method35446(field4899, var1);
   }

   public CompoundNBT method2971() {
      return this.dataManager.<CompoundNBT>method35445(field4900);
   }

   public void method2972(CompoundNBT var1) {
      this.dataManager.method35446(field4900, var1);
   }

   public float method2973() {
      return (float)(1.0 / this.getAttributeValue(Attributes.ATTACK_SPEED) * 20.0);
   }

   public float getCooledAttackStrength(float var1) {
      return MathHelper.clamp(((float)this.ticksSinceLastSwing + var1) / this.method2973(), 0.0F, 1.0F);
   }

   public void resetCooldown() {
      this.ticksSinceLastSwing = 0;
   }

   public Class6462 method2976() {
      return this.field4929;
   }

   @Override
   public float getSpeedFactor() {
      return !this.abilities.isFlying && !this.isElytraFlying() ? super.getSpeedFactor() : 1.0F;
   }

   public float method2978() {
      return (float)this.getAttributeValue(Attributes.LUCK);
   }

   public boolean canUseCommandBlock() {
      return this.abilities.isCreativeMode && this.method2807() >= 2;
   }

   @Override
   public boolean canPickUpItem(ItemStack var1) {
      EquipmentSlotType var4 = MobEntity.method4271(var1);
      return this.getItemStackFromSlot(var4).isEmpty();
   }

   @Override
   public EntitySize getSize(Pose var1) {
      return field4894.getOrDefault(var1, field4893);
   }

   @Override
   public ImmutableList<Pose> getAvailablePoses() {
      return ImmutableList.of(Pose.STANDING, Pose.field13624, Pose.field13622);
   }

   @Override
   public ItemStack findAmmo(ItemStack var1) {
      if (!(var1.getItem() instanceof Class3262)) {
         return ItemStack.EMPTY;
      } else {
         Predicate var4 = ((Class3262)var1.getItem()).method11751();
         ItemStack var5 = Class3262.method11774(this, var4);
         if (!var5.isEmpty()) {
            return var5;
         } else {
            var4 = ((Class3262)var1.getItem()).method11752();

            for (int var6 = 0; var6 < this.inventory.getSizeInventory(); var6++) {
               ItemStack var7 = this.inventory.getStackInSlot(var6);
               if (var4.test(var7)) {
                  return var7;
               }
            }

            return !this.abilities.isCreativeMode ? ItemStack.EMPTY : new ItemStack(Items.field37797);
         }
      }
   }

   @Override
   public ItemStack onFoodEaten(World var1, ItemStack var2) {
      this.getFoodStats().method37570(var2.getItem(), var2);
      this.addStat(Stats.field40098.method172(var2.getItem()));
      var1.playSound(
         (PlayerEntity)null,
         this.getPosX(),
         this.getPosY(),
         this.getPosZ(),
         SoundEvents.field26959,
         SoundCategory.field14735,
         0.5F,
         var1.rand.nextFloat() * 0.1F + 0.9F
      );
      if (this instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44490.method15174((ServerPlayerEntity)this, var2);
      }

      return super.onFoodEaten(var1, var2);
   }

   @Override
   public boolean method2985(BlockState var1) {
      return this.abilities.isFlying || super.method2985(var1);
   }

   @Override
   public Vector3d getLeashPosition(float var1) {
      double var4 = 0.22 * (this.getPrimaryHand() != HandSide.RIGHT ? 1.0 : -1.0);
      float var6 = MathHelper.lerp(var1 * 0.5F, this.rotationPitch, this.prevRotationPitch) * (float) (Math.PI / 180.0);
      float var7 = MathHelper.lerp(var1, this.prevRenderYawOffset, this.renderYawOffset) * (float) (Math.PI / 180.0);
      if (this.isElytraFlying() || this.isSpinAttacking()) {
         Vector3d var8 = this.getLook(var1);
         Vector3d var9 = this.getMotion();
         double var21 = Entity.horizontalMag(var9);
         double var12 = Entity.horizontalMag(var8);
         float var14;
         if (var21 > 0.0 && var12 > 0.0) {
            double var17 = (var9.x * var8.x + var9.z * var8.z) / Math.sqrt(var21 * var12);
            double var19 = var9.x * var8.z - var9.z * var8.x;
            var14 = (float)(Math.signum(var19) * Math.acos(var17));
         } else {
            var14 = 0.0F;
         }

         return this.method3288(var1).add(new Vector3d(var4, -0.11, 0.85).method11352(-var14).method11350(-var6).method11351(-var7));
      } else if (!this.isActualySwimming()) {
         double var15 = this.getBoundingBox().method19677() - 1.0;
         double var10 = !this.isCrouching() ? 0.07 : -0.2;
         return this.method3288(var1).add(new Vector3d(var4, var15, var10).method11351(-var7));
      } else {
         return this.method3288(var1).add(new Vector3d(var4, 0.2, -0.15).method11350(-var6).method11351(-var7));
      }
   }
}
