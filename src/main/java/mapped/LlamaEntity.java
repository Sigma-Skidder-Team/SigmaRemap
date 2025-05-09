package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Class3422;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class LlamaEntity extends Class1066 implements Class1022 {
   private static final Ingredient field5869 = Ingredient.fromItems(Items.field37842, Blocks.HAY_BLOCK.asItem());
   private static final DataParameter<Integer> field5870 = EntityDataManager.<Integer>createKey(LlamaEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field5871 = EntityDataManager.<Integer>createKey(LlamaEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> field5872 = EntityDataManager.<Integer>createKey(LlamaEntity.class, DataSerializers.VARINT);
   private boolean field5873;
   private LlamaEntity field5874;
   private LlamaEntity field5875;

   public LlamaEntity(EntityType<? extends LlamaEntity> var1, World var2) {
      super(var1, var2);
   }

   public boolean method4884() {
      return false;
   }

   private void method4885(int var1) {
      this.dataManager.set(field5870, Math.max(1, Math.min(5, var1)));
   }

   private void method4886() {
      int var3 = !(this.rand.nextFloat() < 0.04F) ? 3 : 5;
      this.method4885(1 + this.rand.nextInt(var3));
   }

   public int method4887() {
      return this.dataManager.<Integer>method35445(field5870);
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putInt("Variant", this.method4889());
      compound.putInt("Strength", this.method4887());
      if (!this.field5890.getStackInSlot(1).isEmpty()) {
         compound.put("DecorItem", this.field5890.getStackInSlot(1).method32112(new CompoundNBT()));
      }
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      this.method4885(compound.getInt("Strength"));
      super.readAdditional(compound);
      this.method4890(compound.getInt("Variant"));
      if (compound.contains("DecorItem", 10)) {
         this.field5890.setInventorySlotContents(1, ItemStack.read(compound.getCompound("DecorItem")));
      }

      this.method4903();
   }

   @Override
   public void method4219() {
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(1, new Class2762(this, 1.2));
      this.goalSelector.addGoal(2, new Class2780(this, 2.1F));
      this.goalSelector.addGoal(3, new Class2598(this, 1.25, 40, 20.0F));
      this.goalSelector.addGoal(3, new Class2747(this, 1.2));
      this.goalSelector.addGoal(4, new BreedGoal(this, 1.0));
      this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.0));
      this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.7));
      this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
      this.targetSelector.addGoal(1, new Class2705(this));
      this.targetSelector.addGoal(2, new Class2717(this));
   }

   public static MutableAttribute method4888() {
      return method4926().method21849(Attributes.FOLLOW_RANGE, 40.0);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5870, 0);
      this.dataManager.register(field5871, -1);
      this.dataManager.register(field5872, 0);
   }

   public int method4889() {
      return MathHelper.clamp(this.dataManager.<Integer>method35445(field5872), 0, 3);
   }

   public void method4890(int var1) {
      this.dataManager.set(field5872, var1);
   }

   @Override
   public int method4891() {
      return !this.method4927() ? super.method4891() : 2 + 3 * this.method4897();
   }

   @Override
   public void method3307(Entity var1) {
      if (this.method3409(var1)) {
         float var4 = MathHelper.cos(this.renderYawOffset * (float) (Math.PI / 180.0));
         float var5 = MathHelper.sin(this.renderYawOffset * (float) (Math.PI / 180.0));
         float var6 = 0.3F;
         var1.setPosition(
            this.getPosX() + (double)(0.3F * var5), this.getPosY() + this.method3310() + var1.getYOffset(), this.getPosZ() - (double)(0.3F * var4)
         );
      }
   }

   @Override
   public double method3310() {
      return (double)this.getHeight() * 0.67;
   }

   @Override
   public boolean method4277() {
      return false;
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return field5869.test(var1);
   }

   @Override
   public boolean method4892(PlayerEntity var1, ItemStack var2) {
      int var5 = 0;
      int var6 = 0;
      float var7 = 0.0F;
      boolean var8 = false;
      Item var9 = var2.getItem();
      if (var9 != Items.field37842) {
         if (var9 == Blocks.HAY_BLOCK.asItem()) {
            var5 = 90;
            var6 = 6;
            var7 = 10.0F;
            if (this.method4932() && this.method4767() == 0 && this.method4502()) {
               var8 = true;
               this.method4503(var1);
            }
         }
      } else {
         var5 = 10;
         var6 = 3;
         var7 = 2.0F;
      }

      if (this.getHealth() < this.getMaxHealth() && var7 > 0.0F) {
         this.heal(var7);
         var8 = true;
      }

      if (this.isChild() && var5 > 0) {
         this.world.addParticle(ParticleTypes.field34078, this.getPosXRandom(1.0), this.getPosYRandom() + 0.5, this.getPosZRandom(1.0), 0.0, 0.0, 0.0);
         if (!this.world.isRemote) {
            this.method4769(var5);
         }

         var8 = true;
      }

      if (var6 > 0 && (var8 || !this.method4932()) && this.method4944() < this.method4907()) {
         var8 = true;
         if (!this.world.isRemote) {
            this.method4946(var6);
         }
      }

      if (var8 && !this.isSilent()) {
         SoundEvent var10 = this.method4894();
         if (var10 != null) {
            this.world
               .playSound(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  this.method4894(),
                  this.getSoundCategory(),
                  1.0F,
                  1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F
               );
         }
      }

      return var8;
   }

   @Override
   public boolean isMovementBlocked() {
      return this.getShouldBeDead() || this.method4938();
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      this.method4886();
      int var8;
      if (!(var4 instanceof Class5101)) {
         var8 = this.rand.nextInt(4);
         var4 = new Class5101(var8);
      } else {
         var8 = ((Class5101)var4).field23198;
      }

      this.method4890(var8);
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   @Override
   public SoundEvent method4893() {
      return SoundEvents.field26735;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26734;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26739;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26737;
   }

   @Nullable
   @Override
   public SoundEvent method4894() {
      return SoundEvents.field26738;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26741, 0.15F, 1.0F);
   }

   @Override
   public void method4895() {
      this.playSound(SoundEvents.field26736, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
   }

   @Override
   public void method4896() {
      SoundEvent var3 = this.method4893();
      if (var3 != null) {
         this.playSound(var3, this.getSoundVolume(), this.getSoundPitch());
      }
   }

   @Override
   public int method4897() {
      return this.method4887();
   }

   @Override
   public boolean method4898() {
      return true;
   }

   @Override
   public boolean method4899() {
      return !this.field5890.getStackInSlot(1).isEmpty();
   }

   @Override
   public boolean method4900(ItemStack var1) {
      Item var4 = var1.getItem();
      return ItemTags.field26075.contains(var4);
   }

   @Override
   public boolean method4901() {
      return false;
   }

   @Override
   public void method4902(IInventory var1) {
      DyeColor var4 = this.method4906();
      super.method4902(var1);
      DyeColor var5 = this.method4906();
      if (this.ticksExisted > 20 && var5 != null && var5 != var4) {
         this.playSound(SoundEvents.field26742, 0.5F, 1.0F);
      }
   }

   @Override
   public void method4903() {
      if (!this.world.isRemote) {
         super.method4903();
         this.method4904(method4905(this.field5890.getStackInSlot(1)));
      }
   }

   private void method4904(DyeColor var1) {
      this.dataManager.set(field5871, var1 != null ? var1.method309() : -1);
   }

   @Nullable
   private static DyeColor method4905(ItemStack var0) {
      Block var3 = Block.method11537(var0.getItem());
      return !(var3 instanceof Class3422) ? null : ((Class3422)var3).method12077();
   }

   @Nullable
   public DyeColor method4906() {
      int var3 = this.dataManager.<Integer>method35445(field5871);
      return var3 != -1 ? DyeColor.method315(var3) : null;
   }

   @Override
   public int method4907() {
      return 30;
   }

   @Override
   public boolean method4386(AnimalEntity var1) {
      return var1 != this && var1 instanceof LlamaEntity && this.method4961() && ((LlamaEntity)var1).method4961();
   }

   public LlamaEntity method4389(ServerWorld var1, Class1045 var2) {
      LlamaEntity var5 = this.method4908();
      this.method4962(var2, var5);
      LlamaEntity var6 = (LlamaEntity)var2;
      int var7 = this.rand.nextInt(Math.max(this.method4887(), var6.method4887())) + 1;
      if (this.rand.nextFloat() < 0.03F) {
         var7++;
      }

      var5.method4885(var7);
      var5.method4890(!this.rand.nextBoolean() ? var6.method4889() : this.method4889());
      return var5;
   }

   public LlamaEntity method4908() {
      return EntityType.LLAMA.create(this.world);
   }

   private void method4909(LivingEntity var1) {
      LlamaSpitEntity var4 = new LlamaSpitEntity(this.world, this);
      double var5 = var1.getPosX() - this.getPosX();
      double var7 = var1.getPosYHeight(0.3333333333333333) - var4.getPosY();
      double var9 = var1.getPosZ() - this.getPosZ();
      float var11 = MathHelper.sqrt(var5 * var5 + var9 * var9) * 0.2F;
      var4.shoot(var5, var7 + (double)var11, var9, 1.5F, 10.0F);
      if (!this.isSilent()) {
         this.world
            .playSound(
               (PlayerEntity)null,
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               SoundEvents.field26740,
               this.getSoundCategory(),
               1.0F,
               1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F
            );
      }

      this.world.addEntity(var4);
      this.field5873 = true;
   }

   private void method4910(boolean var1) {
      this.field5873 = var1;
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      int var5 = this.calculateFallDamage(var1, var2);
      if (var5 <= 0) {
         return false;
      } else {
         if (var1 >= 6.0F) {
            this.attackEntityFrom(DamageSource.field39002, (float)var5);
            if (this.isBeingRidden()) {
               for (Entity var7 : this.method3411()) {
                  var7.attackEntityFrom(DamageSource.field39002, (float)var5);
               }
            }
         }

         this.playFallSound();
         return true;
      }
   }

   public void method4911() {
      if (this.field5874 != null) {
         this.field5874.field5875 = null;
      }

      this.field5874 = null;
   }

   public void method4912(LlamaEntity var1) {
      this.field5874 = var1;
      this.field5874.field5875 = this;
   }

   public boolean method4913() {
      return this.field5875 != null;
   }

   public boolean method4914() {
      return this.field5874 != null;
   }

   @Nullable
   public LlamaEntity method4915() {
      return this.field5874;
   }

   @Override
   public double method4773() {
      return 2.0;
   }

   @Override
   public void method4916() {
      if (!this.method4914() && this.isChild()) {
         super.method4916();
      }
   }

   @Override
   public boolean method4917() {
      return false;
   }

   @Override
   public void method4530(LivingEntity var1, float var2) {
      this.method4909(var1);
   }

   @Override
   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, 0.75 * (double)this.getEyeHeight(), (double)this.getWidth() * 0.5);
   }

   // $VF: synthetic method
   public static boolean method4918(LlamaEntity var0) {
      return var0.field5873;
   }

   // $VF: synthetic method
   public static void method4919(LlamaEntity var0, boolean var1) {
      var0.method4910(var1);
   }
}
