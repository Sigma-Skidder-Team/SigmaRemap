package mapped;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.passive.WolfEntity;
import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;

public class FoxEntity extends AnimalEntity {
   private static final DataParameter<Integer> field5993 = EntityDataManager.<Integer>createKey(FoxEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Byte> field5994 = EntityDataManager.<Byte>createKey(FoxEntity.class, DataSerializers.field33390);
   private static final DataParameter<Optional<UUID>> field5995 = EntityDataManager.<Optional<UUID>>createKey(FoxEntity.class, DataSerializers.field33404);
   private static final DataParameter<Optional<UUID>> field5996 = EntityDataManager.<Optional<UUID>>createKey(FoxEntity.class, DataSerializers.field33404);
   private static final Predicate<ItemEntity> field5997 = var0 -> !var0.method4135() && var0.isAlive();
   private static final Predicate<Entity> field5998 = var0 -> {
      if (!(var0 instanceof LivingEntity)) {
         return false;
      } else {
         LivingEntity var3 = (LivingEntity)var0;
         return var3.getLastAttackedEntity() != null && var3.getLastAttackedEntityTime() < var3.ticksExisted + 600;
      }
   };
   private static final Predicate<Entity> field5999 = var0 -> var0 instanceof ChickenEntity || var0 instanceof RabbitEntity;
   private static final Predicate<Entity> field6000 = var0 -> !var0.isDiscrete() && EntityPredicates.field34761.test(var0);
   private Class2595 field6001;
   private Class2595 field6002;
   private Class2595 field6003;
   private float field6004;
   private float field6005;
   private float field6006;
   private float field6007;
   private int field6008;

   public FoxEntity(EntityType<? extends FoxEntity> var1, World var2) {
      super(var1, var2);
      this.field5595 = new Class8091(this);
      this.field5596 = new Class6833(this);
      this.method4224(PathNodeType.DANGER_OTHER, 0.0F);
      this.method4224(PathNodeType.DAMAGE_OTHER, 0.0F);
      this.method4281(true);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5995, Optional.<UUID>empty());
      this.dataManager.register(field5996, Optional.<UUID>empty());
      this.dataManager.register(field5993, 0);
      this.dataManager.register(field5994, (byte)0);
   }

   @Override
   public void method4219() {
      this.field6001 = new NearestAttackableTargetGoal<AnimalEntity>(this, AnimalEntity.class, 10, false, false, var0 -> var0 instanceof ChickenEntity || var0 instanceof RabbitEntity);
      this.field6002 = new NearestAttackableTargetGoal<TurtleEntity>(this, TurtleEntity.class, 10, false, false, TurtleEntity.field5963);
      this.field6003 = new NearestAttackableTargetGoal<AbstractFishEntity>(this, AbstractFishEntity.class, 20, false, false, var0 -> var0 instanceof AbstractGroupFishEntity);
      this.field5600.addGoal(0, new Class2604(this));
      this.field5600.addGoal(1, new Class2698(this));
      this.field5600.addGoal(2, new Class2750(this, 2.2));
      this.field5600.addGoal(3, new Class2786(this, 1.0));
      this.field5600
         .addGoal(
            4,
            new Class2770<PlayerEntity>(
               this, PlayerEntity.class, 16.0F, 1.6, 1.4, var1 -> field6000.test(var1) && !this.method5151(var1.getUniqueID()) && !this.isFoxAggroed()
            )
         );
      this.field5600
         .addGoal(4, new Class2770<WolfEntity>(this, WolfEntity.class, 8.0F, 1.6, 1.4, var1 -> !((WolfEntity)var1).method4393() && !this.isFoxAggroed()));
      this.field5600.addGoal(4, new Class2770<PolarBearEntity>(this, PolarBearEntity.class, 8.0F, 1.6, 1.4, var1 -> !this.isFoxAggroed()));
      this.field5600.addGoal(5, new Class2729(this));
      this.field5600.addGoal(6, new Class2755(this));
      this.field5600.addGoal(6, new Class2641(this, 1.25));
      this.field5600.addGoal(7, new Class2650(this, 1.2F, true));
      this.field5600.addGoal(7, new Class2693(this));
      this.field5600.addGoal(8, new Class2765(this, this, 1.25));
      this.field5600.addGoal(9, new Class2609(this, 32, 200));
      this.field5600.addGoal(10, new Class2636(this, 1.2F, 12, 2));
      this.field5600.addGoal(10, new Class2745(this, 0.4F));
      this.field5600.addGoal(11, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5600.addGoal(11, new Class2790(this));
      this.field5600.addGoal(12, new Class2614(this, PlayerEntity.class, 24.0F));
      this.field5600.addGoal(13, new Class2694(this));
      this.field5601
         .addGoal(3, new Class2714(LivingEntity.class, false, false, var1 -> field5998.test(var1) && !this.method5151(var1.getUniqueID())));
   }

   @Override
   public SoundEvent getEatSound(ItemStack var1) {
      return SoundEvents.field26592;
   }

   @Override
   public void livingTick() {
      if (!this.world.isRemote && this.isAlive() && this.isServerWorld()) {
         this.field6008++;
         ItemStack var3 = this.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
         if (this.method5122(var3)) {
            if (this.field6008 <= 600) {
               if (this.field6008 > 560 && this.rand.nextFloat() < 0.1F) {
                  this.playSound(this.getEatSound(var3), 1.0F, 1.0F);
                  this.world.setEntityState(this, (byte)45);
               }
            } else {
               ItemStack var4 = var3.method32111(this.world, this);
               if (!var4.isEmpty()) {
                  this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var4);
               }

               this.field6008 = 0;
            }
         }

         LivingEntity var5 = this.getAttackTarget();
         if (var5 == null || !var5.isAlive()) {
            this.method5143(false);
            this.method5144(false);
         }
      }

      if (this.isSleeping() || this.isMovementBlocked()) {
         this.isJumping = false;
         this.moveStrafing = 0.0F;
         this.moveForward = 0.0F;
      }

      super.livingTick();
      if (this.isFoxAggroed() && this.rand.nextFloat() < 0.05F) {
         this.playSound(SoundEvents.field26588, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean isMovementBlocked() {
      return this.getShouldBeDead();
   }

   private boolean method5122(ItemStack var1) {
      return var1.getItem().isFood() && this.getAttackTarget() == null && this.onGround && !this.isSleeping();
   }

   @Override
   public void method4270(Class9755 var1) {
      if (this.rand.nextFloat() < 0.2F) {
         float var4 = this.rand.nextFloat();
         ItemStack var5;
         if (!(var4 < 0.05F)) {
            if (!(var4 < 0.2F)) {
               if (!(var4 < 0.4F)) {
                  if (!(var4 < 0.6F)) {
                     if (!(var4 < 0.8F)) {
                        var5 = new ItemStack(Items.field37839);
                     } else {
                        var5 = new ItemStack(Items.LEATHER);
                     }
                  } else {
                     var5 = new ItemStack(Items.field37842);
                  }
               } else {
                  var5 = !this.rand.nextBoolean() ? new ItemStack(Items.field38081) : new ItemStack(Items.field38080);
               }
            } else {
               var5 = new ItemStack(Items.EGG);
            }
         } else {
            var5 = new ItemStack(Items.EMERALD);
         }

         this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var5);
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 45) {
         super.handleStatusUpdate(var1);
      } else {
         ItemStack var4 = this.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
         if (!var4.isEmpty()) {
            for (int var5 = 0; var5 < 8; var5++) {
               Vector3d var6 = new Vector3d(((double)this.rand.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .method11350(-this.rotationPitch * (float) (Math.PI / 180.0))
                  .method11351(-this.rotationYaw * (float) (Math.PI / 180.0));
               this.world
                  .addParticle(
                     new Class7438(ParticleTypes.field34082, var4),
                     this.getPosX() + this.getLookVec().x / 2.0,
                     this.getPosY(),
                     this.getPosZ() + this.getLookVec().z / 2.0,
                     var6.x,
                     var6.y + 0.05,
                     var6.z
                  );
            }
         }
      }
   }

   public static MutableAttribute method5123() {
      return MobEntity.method4220()
         .method21849(Attributes.MOVEMENT_SPEED, 0.3F)
         .method21849(Attributes.MAX_HEALTH, 10.0)
         .method21849(Attributes.FOLLOW_RANGE, 32.0)
         .method21849(Attributes.ATTACK_DAMAGE, 2.0);
   }

   public FoxEntity method4389(ServerWorld var1, Class1045 var2) {
      FoxEntity var5 = EntityType.FOX.create(var1);
      var5.method5126(!this.rand.nextBoolean() ? ((FoxEntity)var2).method5125() : this.method5125());
      return var5;
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      Optional var8 = var1.func_242406_i(this.getPosition());
      Class186 var9 = Class186.method571(var8);
      boolean var10 = false;
      if (!(var4 instanceof Class5100)) {
         var4 = new Class5100(var9);
      } else {
         var9 = ((Class5100)var4).field23197;
         if (((Class5100)var4).method15580() >= 2) {
            var10 = true;
         }
      }

      this.method5126(var9);
      if (var10) {
         this.method4770(-24000);
      }

      if (var1 instanceof ServerWorld) {
         this.method5124();
      }

      this.method4270(var2);
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   private void method5124() {
      if (this.method5125() != Class186.field691) {
         this.field5601.addGoal(4, this.field6003);
         this.field5601.addGoal(6, this.field6001);
         this.field5601.addGoal(6, this.field6002);
      } else {
         this.field5601.addGoal(4, this.field6001);
         this.field5601.addGoal(4, this.field6002);
         this.field5601.addGoal(6, this.field6003);
      }
   }

   @Override
   public void method4501(PlayerEntity var1, ItemStack var2) {
      if (this.method4381(var2)) {
         this.playSound(this.getEatSound(var2), 1.0F, 1.0F);
      }

      super.method4501(var1, var2);
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return !this.isChild() ? 0.4F : var2.field39969 * 0.85F;
   }

   public Class186 method5125() {
      return Class186.method570(this.dataManager.<Integer>method35445(field5993));
   }

   private void method5126(Class186 var1) {
      this.dataManager.set(field5993, var1.method568());
   }

   private List<UUID> method5127() {
      ArrayList var3 = Lists.newArrayList();
      var3.add(this.dataManager.<Optional<UUID>>method35445(field5995).orElse((UUID)null));
      var3.add(this.dataManager.<Optional<UUID>>method35445(field5996).orElse((UUID)null));
      return var3;
   }

   private void method5128(UUID var1) {
      if (!this.dataManager.<Optional<UUID>>method35445(field5995).isPresent()) {
         this.dataManager.set(field5995, Optional.<UUID>ofNullable(var1));
      } else {
         this.dataManager.set(field5996, Optional.<UUID>ofNullable(var1));
      }
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      List<UUID> var4 = this.method5127();
      ListNBT var5 = new ListNBT();

      for (UUID var7 : var4) {
         if (var7 != null) {
            var5.add(NBTUtil.valueOf(var7));
         }
      }

      compound.put("Trusted", var5);
      compound.putBoolean("Sleeping", this.isSleeping());
      compound.putString("Type", this.method5125().method567());
      compound.putBoolean("Sitting", this.method5129());
      compound.putBoolean("Crouching", this.isCrouching());
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      ListNBT var4 = compound.getList("Trusted", 11);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         this.method5128(NBTUtil.readUniqueID(var4.get(var5)));
      }

      this.method5135(compound.getBoolean("Sleeping"));
      this.method5126(Class186.method569(compound.getString("Type")));
      this.method5130(compound.getBoolean("Sitting"));
      this.method5143(compound.getBoolean("Crouching"));
      if (this.world instanceof ServerWorld) {
         this.method5124();
      }
   }

   public boolean method5129() {
      return this.method5137(1);
   }

   public void method5130(boolean var1) {
      this.method5136(1, var1);
   }

   public boolean method5131() {
      return this.method5137(64);
   }

   private void method5132(boolean var1) {
      this.method5136(64, var1);
   }

   private boolean isFoxAggroed() {
      return this.method5137(128);
   }

   private void setFoxAggroed(boolean var1) {
      this.method5136(128, var1);
   }

   @Override
   public boolean isSleeping() {
      return this.method5137(32);
   }

   private void method5135(boolean var1) {
      this.method5136(32, var1);
   }

   private void method5136(int var1, boolean var2) {
      if (!var2) {
         this.dataManager.set(field5994, (byte)(this.dataManager.<Byte>method35445(field5994) & ~var1));
      } else {
         this.dataManager.set(field5994, (byte)(this.dataManager.<Byte>method35445(field5994) | var1));
      }
   }

   private boolean method5137(int var1) {
      return (this.dataManager.<Byte>method35445(field5994) & var1) != 0;
   }

   @Override
   public boolean canPickUpItem(ItemStack var1) {
      EquipmentSlotType var4 = MobEntity.method4271(var1);
      return !this.getItemStackFromSlot(var4).isEmpty() ? false : var4 == EquipmentSlotType.MAINHAND && super.canPickUpItem(var1);
   }

   @Override
   public boolean method4252(ItemStack var1) {
      Item var4 = var1.getItem();
      ItemStack var5 = this.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
      return var5.isEmpty() || this.field6008 > 0 && var4.isFood() && !var5.getItem().isFood();
   }

   private void method5138(ItemStack var1) {
      if (!var1.isEmpty() && !this.world.isRemote) {
         ItemEntity var4 = new ItemEntity(
            this.world, this.getPosX() + this.getLookVec().x, this.getPosY() + 1.0, this.getPosZ() + this.getLookVec().z, var1
         );
         var4.method4134(40);
         var4.method4129(this.getUniqueID());
         this.playSound(SoundEvents.field26597, 1.0F, 1.0F);
         this.world.addEntity(var4);
      }
   }

   private void method5139(ItemStack var1) {
      ItemEntity var4 = new ItemEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), var1);
      this.world.addEntity(var4);
   }

   @Override
   public void method4246(ItemEntity var1) {
      ItemStack var4 = var1.method4124();
      if (this.method4252(var4)) {
         int var5 = var4.getCount();
         if (var5 > 1) {
            this.method5139(var4.split(var5 - 1));
         }

         this.method5138(this.getItemStackFromSlot(EquipmentSlotType.MAINHAND));
         this.triggerItemPickupTrigger(var1);
         this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var4.split(1));
         this.field5605[EquipmentSlotType.MAINHAND.getIndex()] = 2.0F;
         this.onItemPickup(var1, var4.getCount());
         var1.remove();
         this.field6008 = 0;
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (this.isServerWorld()) {
         boolean var3 = this.isInWater();
         if (var3 || this.getAttackTarget() != null || this.world.method6794()) {
            this.method5148();
         }

         if (var3 || this.isSleeping()) {
            this.method5130(false);
         }

         if (this.method5131() && this.world.rand.nextFloat() < 0.2F) {
            BlockPos var4 = this.getPosition();
            BlockState var5 = this.world.getBlockState(var4);
            this.world.playEvent(2001, var4, Block.getStateId(var5));
         }
      }

      this.field6005 = this.field6004;
      if (!this.method5145()) {
         this.field6004 = this.field6004 + (0.0F - this.field6004) * 0.4F;
      } else {
         this.field6004 = this.field6004 + (1.0F - this.field6004) * 0.4F;
      }

      this.field6007 = this.field6006;
      if (!this.isCrouching()) {
         this.field6006 = 0.0F;
      } else {
         this.field6006 += 0.2F;
         if (this.field6006 > 3.0F) {
            this.field6006 = 3.0F;
         }
      }
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return var1.getItem() == Items.field38170;
   }

   @Override
   public void method4284(PlayerEntity var1, MobEntity var2) {
      ((FoxEntity)var2).method5128(var1.getUniqueID());
   }

   public boolean method5140() {
      return this.method5137(16);
   }

   public void method5141(boolean var1) {
      this.method5136(16, var1);
   }

   public boolean method5142() {
      return this.field6006 == 3.0F;
   }

   public void method5143(boolean var1) {
      this.method5136(4, var1);
   }

   @Override
   public boolean isCrouching() {
      return this.method5137(4);
   }

   public void method5144(boolean var1) {
      this.method5136(8, var1);
   }

   public boolean method5145() {
      return this.method5137(8);
   }

   public float method5146(float var1) {
      return MathHelper.lerp(var1, this.field6005, this.field6004) * 0.11F * (float) Math.PI;
   }

   public float method5147(float var1) {
      return MathHelper.lerp(var1, this.field6007, this.field6006);
   }

   @Override
   public void setAttackTarget(LivingEntity entitylivingbaseIn) {
      if (this.isFoxAggroed() && entitylivingbaseIn == null) {
         this.setFoxAggroed(false);
      }

      super.setAttackTarget(entitylivingbaseIn);
   }

   @Override
   public int calculateFallDamage(float var1, float var2) {
      return MathHelper.ceil((var1 - 5.0F) * var2);
   }

   private void method5148() {
      this.method5135(false);
   }

   private void method5149() {
      this.method5144(false);
      this.method5143(false);
      this.method5130(false);
      this.method5135(false);
      this.setFoxAggroed(false);
      this.method5132(false);
   }

   private boolean method5150() {
      return !this.isSleeping() && !this.method5129() && !this.method5131();
   }

   @Override
   public void playAmbientSound() {
      SoundEvent var3 = this.getAmbientSound();
      if (var3 != SoundEvents.field26594) {
         super.playAmbientSound();
      } else {
         this.playSound(var3, 2.0F, this.getSoundPitch());
      }
   }

   @Nullable
   @Override
   public SoundEvent getAmbientSound() {
      if (!this.isSleeping()) {
         if (!this.world.method6740() && this.rand.nextFloat() < 0.1F) {
            List var3 = this.world.<Entity>getEntitiesInAABBexcluding(PlayerEntity.class, this.getBoundingBox().grow(16.0, 16.0, 16.0), EntityPredicates.field34763);
            if (var3.isEmpty()) {
               return SoundEvents.field26594;
            }
         }

         return SoundEvents.field26589;
      } else {
         return SoundEvents.field26595;
      }
   }

   @Nullable
   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26593;
   }

   @Nullable
   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26591;
   }

   private boolean method5151(UUID var1) {
      return this.method5127().contains(var1);
   }

   @Override
   public void spawnDrops(DamageSource var1) {
      ItemStack var4 = this.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
      if (!var4.isEmpty()) {
         this.method3302(var4);
         this.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);
      }

      super.spawnDrops(var1);
   }

   public static boolean method5152(FoxEntity var0, LivingEntity var1) {
      double var4 = var1.getPosZ() - var0.getPosZ();
      double var6 = var1.getPosX() - var0.getPosX();
      double var8 = var4 / var6;

      for (int var11 = 0; var11 < 6; var11++) {
         double var12 = var8 != 0.0 ? var4 * (double)((float)var11 / 6.0F) : 0.0;
         double var14 = var8 != 0.0 ? var12 / var8 : var6 * (double)((float)var11 / 6.0F);

         for (int var16 = 1; var16 < 4; var16++) {
            if (!var0.world
               .getBlockState(new BlockPos(var0.getPosX() + var14, var0.getPosY() + (double)var16, var0.getPosZ() + var12))
               .getMaterial()
               .isReplaceable()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, (double)(0.55F * this.getEyeHeight()), (double)(this.getWidth() * 0.4F));
   }

   // $VF: synthetic method
   public static boolean method5163(FoxEntity var0, UUID var1) {
      return var0.method5151(var1);
   }

   // $VF: synthetic method
   public static Random method5164(FoxEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static boolean method5165(FoxEntity var0) {
      return var0.method5150();
   }

   // $VF: synthetic method
   public static Predicate method5166() {
      return field5997;
   }

   // $VF: synthetic method
   public static void method5167(FoxEntity var0) {
      var0.method5149();
   }

   // $VF: synthetic method
   public static boolean method5168(FoxEntity var0) {
      return var0.isFoxAggroed();
   }

   // $VF: synthetic method
   public static Predicate method5169() {
      return field5999;
   }

   // $VF: synthetic method
   public static void method5170(FoxEntity var0, boolean var1) {
      var0.method5132(var1);
   }

   // $VF: synthetic method
   public static void method5171(FoxEntity var0, UUID var1) {
      var0.method5128(var1);
   }

   // $VF: synthetic method
   public static float method5172(FoxEntity var0, float var1) {
      return var0.field6006 = var1;
   }

   // $VF: synthetic method
   public static float method5173(FoxEntity var0, float var1) {
      return var0.field6007 = var1;
   }

   // $VF: synthetic method
   public static List<UUID> method5174(FoxEntity var0) {
      return var0.method5127();
   }

   // $VF: synthetic method
   public static void method5175(FoxEntity var0, boolean var1) {
      var0.setFoxAggroed(var1);
   }

   // $VF: synthetic method
   public static void method5176(FoxEntity var0) {
      var0.method5148();
   }

   // $VF: synthetic method
   public static Random method5177(FoxEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5178(FoxEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static void method5179(FoxEntity var0, boolean var1) {
      var0.method5135(var1);
   }

   public class Class2614 extends Class2612 {

      public Class2614(MobEntity var1, Class<? extends LivingEntity> var2, float var3) {
         super(var1, var2, var3);
      }

      @Override
      public boolean method10803() {
         return super.method10803() && !FoxEntity.this.method5131() && !FoxEntity.this.method5145();
      }

      @Override
      public boolean method10806() {
         return super.method10806() && !FoxEntity.this.method5131() && !FoxEntity.this.method5145();
      }
   }

   public class Class2714 extends NearestAttackableTargetGoal<LivingEntity> {
      private LivingEntity field17201;
      private LivingEntity field17202;
      private int field17203;

      public Class2714(Class<LivingEntity> var1, boolean var2, boolean var3, Predicate<LivingEntity> var4) {
         super(FoxEntity.this, var1, 10, var2, var3, var4);
      }

      @Override
      public boolean method10803() {
         if (this.field17189 > 0 && this.field17153.getRNG().nextInt(this.field17189) != 0) {
            return false;
         } else {
            for (UUID var4 : method5174(FoxEntity.this)) {
               if (var4 != null && FoxEntity.this.world instanceof ServerWorld) {
                  Entity var5 = ((ServerWorld) FoxEntity.this.world).getEntityByUuid(var4);
                  if (var5 instanceof LivingEntity) {
                     LivingEntity var6 = (LivingEntity)var5;
                     this.field17202 = var6;
                     this.field17201 = var6.getRevengeTarget();
                     int var7 = var6.getRevengeTiemr();
                     return var7 != this.field17203 && this.method10915(this.field17201, this.field17191);
                  }
               }
            }

            return false;
         }
      }

      @Override
      public void method10804() {
         this.method10923(this.field17201);
         this.field17190 = this.field17201;
         if (this.field17202 != null) {
            this.field17203 = this.field17202.getRevengeTiemr();
         }

         FoxEntity.this.playSound(SoundEvents.field26588, 1.0F, 1.0F);
         method5175(FoxEntity.this, true);
         method5176(FoxEntity.this);
         super.method10804();
      }
   }
}
