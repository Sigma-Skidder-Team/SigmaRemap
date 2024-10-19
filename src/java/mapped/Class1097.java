package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
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
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Predicate;

public class Class1097 extends Class1018 {
   private static final DataParameter<Integer> field6017 = EntityDataManager.<Integer>createKey(Class1097.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field6018 = EntityDataManager.<Integer>createKey(Class1097.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field6019 = EntityDataManager.<Integer>createKey(Class1097.class, DataSerializers.VARINT);
   private static final DataParameter<Byte> field6020 = EntityDataManager.<Byte>createKey(Class1097.class, DataSerializers.field33390);
   private static final DataParameter<Byte> field6021 = EntityDataManager.<Byte>createKey(Class1097.class, DataSerializers.field33390);
   private static final DataParameter<Byte> field6022 = EntityDataManager.<Byte>createKey(Class1097.class, DataSerializers.field33390);
   private static final Class8522 field6023 = new Class8522().method30203(8.0).method30205().method30204();
   private boolean field6024;
   private boolean field6025;
   public int field6026;
   private Vector3d field6027;
   private float field6028;
   private float field6029;
   private float field6030;
   private float field6031;
   private float field6032;
   private float field6033;
   private Class2616 field6034;
   private static final Predicate<ItemEntity> field6035 = var0 -> {
      Item var3 = var0.method4124().getItem();
      return (var3 == Blocks.field37009.asItem() || var3 == Blocks.field36591.asItem()) && var0.isAlive() && !var0.method4135();
   };

   public Class1097(EntityType<? extends Class1097> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6834(this);
      if (!this.isChild()) {
         this.method4281(true);
      }
   }

   @Override
   public boolean canPickUpItem(ItemStack var1) {
      EquipmentSlotType var4 = MobEntity.method4271(var1);
      return !this.getItemStackFromSlot(var4).isEmpty() ? false : var4 == EquipmentSlotType.MAINHAND && super.canPickUpItem(var1);
   }

   public int method5186() {
      return this.dataManager.<Integer>method35445(field6017);
   }

   public void method5187(int var1) {
      this.dataManager.method35446(field6017, var1);
   }

   public boolean method5188() {
      return this.method5206(2);
   }

   public boolean method5189() {
      return this.method5206(8);
   }

   public void method5190(boolean var1) {
      this.method5207(8, var1);
   }

   public boolean method5191() {
      return this.method5206(16);
   }

   public void method5192(boolean var1) {
      this.method5207(16, var1);
   }

   public boolean method5193() {
      return this.dataManager.<Integer>method35445(field6019) > 0;
   }

   public void method5194(boolean var1) {
      this.dataManager.method35446(field6019, !var1 ? 0 : 1);
   }

   private int method5195() {
      return this.dataManager.<Integer>method35445(field6019);
   }

   private void method5196(int var1) {
      this.dataManager.method35446(field6019, var1);
   }

   public void method5197(boolean var1) {
      this.method5207(2, var1);
      if (!var1) {
         this.method5199(0);
      }
   }

   public int method5198() {
      return this.dataManager.<Integer>method35445(field6018);
   }

   public void method5199(int var1) {
      this.dataManager.method35446(field6018, var1);
   }

   public Class2293 method5200() {
      return Class2293.method9046(this.dataManager.<Byte>method35445(field6020));
   }

   public void method5201(Class2293 var1) {
      if (var1.method9042() > 6) {
         var1 = Class2293.method9048(this.rand);
      }

      this.dataManager.method35446(field6020, (byte)var1.method9042());
   }

   public Class2293 method5202() {
      return Class2293.method9046(this.dataManager.<Byte>method35445(field6021));
   }

   public void method5203(Class2293 var1) {
      if (var1.method9042() > 6) {
         var1 = Class2293.method9048(this.rand);
      }

      this.dataManager.method35446(field6021, (byte)var1.method9042());
   }

   public boolean method5204() {
      return this.method5206(4);
   }

   public void method5205(boolean var1) {
      this.method5207(4, var1);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6017, 0);
      this.dataManager.register(field6018, 0);
      this.dataManager.register(field6020, (byte)0);
      this.dataManager.register(field6021, (byte)0);
      this.dataManager.register(field6022, (byte)0);
      this.dataManager.register(field6019, 0);
   }

   private boolean method5206(int var1) {
      return (this.dataManager.<Byte>method35445(field6022) & var1) != 0;
   }

   private void method5207(int var1, boolean var2) {
      byte var5 = this.dataManager.<Byte>method35445(field6022);
      if (!var2) {
         this.dataManager.method35446(field6022, (byte)(var5 & ~var1));
      } else {
         this.dataManager.method35446(field6022, (byte)(var5 | var1));
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putString("MainGene", this.method5200().method9043());
      var1.putString("HiddenGene", this.method5202().method9043());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method5201(Class2293.method9047(var1.getString("MainGene")));
      this.method5203(Class2293.method9047(var1.getString("HiddenGene")));
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      Class1097 var5 = EntityType.PANDA.create(var1);
      if (var2 instanceof Class1097) {
         var5.method5225(this, (Class1097)var2);
      }

      var5.method5227();
      return var5;
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(2, new Class2748(this, 2.0));
      this.field5600.addGoal(2, new Class2788(this, this, 1.0));
      this.field5600.addGoal(3, new Class2649(this, 1.2F, true));
      this.field5600.addGoal(4, new Class2680(this, 1.0, Class120.method339(Blocks.field37009.asItem()), false));
      this.field5600.addGoal(6, new Class2771<PlayerEntity>(this, PlayerEntity.class, 8.0F, 2.0, 2.0));
      this.field5600.addGoal(6, new Class2771<MonsterEntity>(this, MonsterEntity.class, 4.0F, 2.0, 2.0));
      this.field5600.addGoal(7, new Class2623(this));
      this.field5600.addGoal(8, new Class2689(this));
      this.field5600.addGoal(8, new Class2769(this));
      this.field6034 = new Class2616(this, PlayerEntity.class, 6.0F);
      this.field5600.addGoal(9, this.field6034);
      this.field5600.addGoal(10, new Class2668(this));
      this.field5600.addGoal(12, new Class2732(this));
      this.field5600.addGoal(13, new Class2764(this, 1.25));
      this.field5600.addGoal(14, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5601.addGoal(1, new Class2706(this).method10918(new Class[0]));
   }

   public static MutableAttribute method5208() {
      return MobEntity.method4220().method21849(Attributes.MOVEMENT_SPEED, 0.15F).method21849(Attributes.ATTACK_DAMAGE, 6.0);
   }

   public Class2293 method5209() {
      return Class2293.method9050(this.method5200(), this.method5202());
   }

   public boolean method5210() {
      return this.method5209() == Class2293.field15235;
   }

   public boolean method5211() {
      return this.method5209() == Class2293.field15236;
   }

   public boolean method5212() {
      return this.method5209() == Class2293.field15237;
   }

   public boolean method5213() {
      return this.method5209() == Class2293.field15239;
   }

   @Override
   public boolean method4307() {
      return this.method5209() == Class2293.field15240;
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return false;
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      this.playSound(SoundEvents.field26879, 1.0F, 1.0F);
      if (!this.method4307()) {
         this.field6025 = true;
      }

      return super.attackEntityAsMob(var1);
   }

   @Override
   public void tick() {
      super.tick();
      if (this.method5211()) {
         if (this.world.method6794() && !this.isInWater()) {
            this.method5190(true);
            this.method5194(false);
         } else if (!this.method5193()) {
            this.method5190(false);
         }
      }

      if (this.method4232() == null) {
         this.field6024 = false;
         this.field6025 = false;
      }

      if (this.method5186() > 0) {
         if (this.method4232() != null) {
            this.method4262(this.method4232(), 90.0F, 90.0F);
         }

         if (this.method5186() == 29 || this.method5186() == 14) {
            this.playSound(SoundEvents.field26875, 1.0F, 1.0F);
         }

         this.method5187(this.method5186() - 1);
      }

      if (this.method5188()) {
         this.method5199(this.method5198() + 1);
         if (this.method5198() <= 20) {
            if (this.method5198() == 1) {
               this.playSound(SoundEvents.field26869, 1.0F, 1.0F);
            }
         } else {
            this.method5197(false);
            this.method5224();
         }
      }

      if (!this.method5204()) {
         this.field6026 = 0;
      } else {
         this.method5223();
      }

      if (this.method5189()) {
         this.rotationPitch = 0.0F;
      }

      this.method5217();
      this.method5215();
      this.method5218();
      this.method5219();
   }

   public boolean method5214() {
      return this.method5211() && this.world.method6794();
   }

   private void method5215() {
      if (!this.method5193()
         && this.method5189()
         && !this.method5214()
         && !this.getItemStackFromSlot(EquipmentSlotType.MAINHAND).isEmpty()
         && this.rand.nextInt(80) == 1) {
         this.method5194(true);
      } else if (this.getItemStackFromSlot(EquipmentSlotType.MAINHAND).isEmpty() || !this.method5189()) {
         this.method5194(false);
      }

      if (this.method5193()) {
         this.method5216();
         if (!this.world.isRemote && this.method5195() > 80 && this.rand.nextInt(20) == 1) {
            if (this.method5195() > 100 && this.method5229(this.getItemStackFromSlot(EquipmentSlotType.MAINHAND))) {
               if (!this.world.isRemote) {
                  this.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);
               }

               this.method5190(false);
            }

            this.method5194(false);
            return;
         }

         this.method5196(this.method5195() + 1);
      }
   }

   private void method5216() {
      if (this.method5195() % 5 == 0) {
         this.playSound(
            SoundEvents.field26873, 0.5F + 0.5F * (float)this.rand.nextInt(2), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F
         );

         for (int var3 = 0; var3 < 6; var3++) {
            Vector3d var4 = new Vector3d(
               ((double)this.rand.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.rand.nextFloat() - 0.5) * 0.1
            );
            var4 = var4.method11350(-this.rotationPitch * (float) (Math.PI / 180.0));
            var4 = var4.method11351(-this.rotationYaw * (float) (Math.PI / 180.0));
            double var5 = (double)(-this.rand.nextFloat()) * 0.6 - 0.3;
            Vector3d var7 = new Vector3d(((double)this.rand.nextFloat() - 0.5) * 0.8, var5, 1.0 + ((double)this.rand.nextFloat() - 0.5) * 0.4);
            var7 = var7.method11351(-this.renderYawOffset * (float) (Math.PI / 180.0));
            var7 = var7.add(this.getPosX(), this.getPosYEye() + 1.0, this.getPosZ());
            this.world
               .addParticle(
                  new Class7438(ParticleTypes.field34082, this.getItemStackFromSlot(EquipmentSlotType.MAINHAND)),
                  var7.x,
                  var7.y,
                  var7.z,
                  var4.x,
                  var4.y + 0.05,
                  var4.z
               );
         }
      }
   }

   private void method5217() {
      this.field6029 = this.field6028;
      if (!this.method5189()) {
         this.field6028 = Math.max(0.0F, this.field6028 - 0.19F);
      } else {
         this.field6028 = Math.min(1.0F, this.field6028 + 0.15F);
      }
   }

   private void method5218() {
      this.field6031 = this.field6030;
      if (!this.method5191()) {
         this.field6030 = Math.max(0.0F, this.field6030 - 0.19F);
      } else {
         this.field6030 = Math.min(1.0F, this.field6030 + 0.15F);
      }
   }

   private void method5219() {
      this.field6033 = this.field6032;
      if (!this.method5204()) {
         this.field6032 = Math.max(0.0F, this.field6032 - 0.19F);
      } else {
         this.field6032 = Math.min(1.0F, this.field6032 + 0.15F);
      }
   }

   public float method5220(float var1) {
      return MathHelper.lerp(var1, this.field6029, this.field6028);
   }

   public float method5221(float var1) {
      return MathHelper.lerp(var1, this.field6031, this.field6030);
   }

   public float method5222(float var1) {
      return MathHelper.lerp(var1, this.field6033, this.field6032);
   }

   private void method5223() {
      this.field6026++;
      if (this.field6026 <= 32) {
         if (!this.world.isRemote) {
            Vector3d var3 = this.getMotion();
            if (this.field6026 != 1) {
               if ((float)this.field6026 != 7.0F && (float)this.field6026 != 15.0F && (float)this.field6026 != 23.0F) {
                  this.setMotion(this.field6027.x, var3.y, this.field6027.z);
               } else {
                  this.setMotion(0.0, !this.onGround ? var3.y : 0.27, 0.0);
               }
            } else {
               float var4 = this.rotationYaw * (float) (Math.PI / 180.0);
               float var5 = !this.isChild() ? 0.2F : 0.1F;
               this.field6027 = new Vector3d(
                  var3.x + (double)(-MathHelper.sin(var4) * var5), 0.0, var3.z + (double)(MathHelper.cos(var4) * var5)
               );
               this.setMotion(this.field6027.add(0.0, 0.27, 0.0));
            }
         }
      } else {
         this.method5205(false);
      }
   }

   private void method5224() {
      Vector3d var3 = this.getMotion();
      this.world
         .addParticle(
            ParticleTypes.field34093,
            this.getPosX() - (double)(this.getWidth() + 1.0F) * 0.5 * (double) MathHelper.sin(this.renderYawOffset * (float) (Math.PI / 180.0)),
            this.getPosYEye() - 0.1F,
            this.getPosZ() + (double)(this.getWidth() + 1.0F) * 0.5 * (double) MathHelper.cos(this.renderYawOffset * (float) (Math.PI / 180.0)),
            var3.x,
            0.0,
            var3.z
         );
      this.playSound(SoundEvents.field26870, 1.0F, 1.0F);

      for (Class1097 var5 : this.world.<Class1097>getEntitiesWithinAABB(Class1097.class, this.getBoundingBox().grow(10.0))) {
         if (!var5.isChild() && var5.onGround && !var5.isInWater() && var5.method5230()) {
            var5.jump();
         }
      }

      if (!this.world.isRemote() && this.rand.nextInt(700) == 0 && this.world.getGameRules().getBoolean(GameRules.field24227)) {
         this.entityDropItem(Items.field37901);
      }
   }

   @Override
   public void method4246(ItemEntity var1) {
      if (this.getItemStackFromSlot(EquipmentSlotType.MAINHAND).isEmpty() && field6035.test(var1)) {
         this.triggerItemPickupTrigger(var1);
         ItemStack var4 = var1.method4124();
         this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var4);
         this.field5605[EquipmentSlotType.MAINHAND.getIndex()] = 2.0F;
         this.onItemPickup(var1, var4.getCount());
         var1.remove();
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      this.method5190(false);
      return super.attackEntityFrom(source, var2);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      this.method5201(Class2293.method9048(this.rand));
      this.method5203(Class2293.method9048(this.rand));
      this.method5227();
      if (var4 == null) {
         var4 = new Class5097(0.2F);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   public void method5225(Class1097 var1, Class1097 var2) {
      if (var2 != null) {
         if (!this.rand.nextBoolean()) {
            this.method5201(var2.method5226());
            this.method5203(var1.method5226());
         } else {
            this.method5201(var1.method5226());
            this.method5203(var2.method5226());
         }
      } else if (!this.rand.nextBoolean()) {
         this.method5201(Class2293.method9048(this.rand));
         this.method5203(var1.method5226());
      } else {
         this.method5201(var1.method5226());
         this.method5203(Class2293.method9048(this.rand));
      }

      if (this.rand.nextInt(32) == 0) {
         this.method5201(Class2293.method9048(this.rand));
      }

      if (this.rand.nextInt(32) == 0) {
         this.method5203(Class2293.method9048(this.rand));
      }
   }

   private Class2293 method5226() {
      return !this.rand.nextBoolean() ? this.method5202() : this.method5200();
   }

   public void method5227() {
      if (this.method5213()) {
         this.getAttribute(Attributes.MAX_HEALTH).method38661(10.0);
      }

      if (this.method5210()) {
         this.getAttribute(Attributes.MOVEMENT_SPEED).method38661(0.07F);
      }
   }

   private void method5228() {
      if (!this.isInWater()) {
         this.method4243(0.0F);
         this.method4230().method21666();
         this.method5190(true);
      }
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (!this.method5214()) {
         if (this.method5191()) {
            this.method5192(false);
            return ActionResultType.method9002(this.world.isRemote);
         } else if (!this.method4381(var5)) {
            return ActionResultType.field14820;
         } else {
            if (this.method4232() != null) {
               this.field6024 = true;
            }

            if (!this.isChild()) {
               if (!this.world.isRemote && this.method4767() == 0 && this.method4502()) {
                  this.method4501(var1, var5);
                  this.method4503(var1);
               } else {
                  if (this.world.isRemote || this.method5189() || this.isInWater()) {
                     return ActionResultType.field14820;
                  }

                  this.method5228();
                  this.method5194(true);
                  ItemStack var6 = this.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
                  if (!var6.isEmpty() && !var1.abilities.isCreativeMode) {
                     this.method3302(var6);
                  }

                  this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(var5.getItem(), 1));
                  this.method4501(var1, var5);
               }
            } else {
               this.method4501(var1, var5);
               this.method4768((int)((float)(-this.method4767() / 20) * 0.1F), true);
            }

            return ActionResultType.SUCCESS;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   @Nullable
   @Override
   public SoundEvent getAmbientSound() {
      if (!this.method4307()) {
         return !this.method5211() ? SoundEvents.field26871 : SoundEvents.field26877;
      } else {
         return SoundEvents.field26876;
      }
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26874, 0.15F, 1.0F);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return var1.getItem() == Blocks.field37009.asItem();
   }

   private boolean method5229(ItemStack var1) {
      return this.method4381(var1) || var1.getItem() == Blocks.field36591.asItem();
   }

   @Nullable
   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26872;
   }

   @Nullable
   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26878;
   }

   public boolean method5230() {
      return !this.method5191() && !this.method5214() && !this.method5193() && !this.method5204() && !this.method5189();
   }

   // $VF: synthetic method
   public static Random method5232(Class1097 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5233(Class1097 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5234(Class1097 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5235(Class1097 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5236(Class1097 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Class8522 method5237() {
      return field6023;
   }

   // $VF: synthetic method
   public static Class2616 method5238(Class1097 var0) {
      return var0.field6034;
   }

   // $VF: synthetic method
   public static boolean method5239(Class1097 var0) {
      return var0.field6024;
   }

   // $VF: synthetic method
   public static boolean method5240(Class1097 var0) {
      return var0.field6025;
   }

   // $VF: synthetic method
   public static Random method5241(Class1097 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5242(Class1097 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Predicate method5243() {
      return field6035;
   }

   // $VF: synthetic method
   public static Random method5244(Class1097 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5245(Class1097 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static void method5246(Class1097 var0) {
      var0.method5228();
   }

   // $VF: synthetic method
   public static Random method5247(Class1097 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method5248(Class1097 var0) {
      return var0.rand;
   }
}
