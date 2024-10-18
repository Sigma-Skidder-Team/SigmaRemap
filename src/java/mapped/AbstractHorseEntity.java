package mapped;

import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public abstract class AbstractHorseEntity extends Class1018 implements Class1073, IJumpingMount, Class1069 {
   private static final Predicate<LivingEntity> field5879 = var0 -> var0 instanceof AbstractHorseEntity && ((AbstractHorseEntity)var0).method4940();
   private static final Class8522 field5880 = new Class8522().method30203(16.0).method30204().method30205().method30206().method30209(field5879);
   private static final Class120 field5881 = Class120.method339(
      Items.field37842,
      Items.field37936,
      Blocks.field36777.asItem(),
      Items.field37795,
      Items.field38057,
      Items.GOLDEN_APPLE,
      Items.ENCHANTED_GOLDEN_APPLE
   );
   private static final DataParameter<Byte> field5882 = EntityDataManager.<Byte>createKey(AbstractHorseEntity.class, DataSerializers.field33390);
   private static final DataParameter<Optional<UUID>> field5883 = EntityDataManager.<Optional<UUID>>createKey(AbstractHorseEntity.class, DataSerializers.field33404);
   private int field5884;
   private int field5885;
   private int field5886;
   public int field5887;
   public int field5888;
   public boolean field5889;
   public Class927 field5890;
   public int field5891;
   public float field5892;
   private boolean field5893;
   private float field5894;
   private float field5895;
   private float field5896;
   private float field5897;
   private float field5898;
   private float field5899;
   public boolean field5900 = true;
   public int field5901;

   public AbstractHorseEntity(EntityType<? extends AbstractHorseEntity> var1, World var2) {
      super(var1, var2);
      this.stepHeight = 1.0F;
      this.method4948();
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(1, new Class2747(this, 1.2));
      this.field5600.addGoal(1, new Class2762(this, 1.2));
      this.field5600.addGoal(2, new Class2785(this, 1.0, AbstractHorseEntity.class));
      this.field5600.addGoal(4, new Class2764(this, 1.0));
      this.field5600.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.7));
      this.field5600.addGoal(7, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.addGoal(8, new Class2668(this));
      this.method4929();
   }

   public void method4929() {
      this.field5600.addGoal(0, new Class2603(this));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5882, (byte)0);
      this.dataManager.register(field5883, Optional.<UUID>empty());
   }

   public boolean method4930(int var1) {
      return (this.dataManager.<Byte>method35445(field5882) & var1) != 0;
   }

   public void method4931(int var1, boolean var2) {
      byte var5 = this.dataManager.<Byte>method35445(field5882);
      if (!var2) {
         this.dataManager.method35446(field5882, (byte)(var5 & ~var1));
      } else {
         this.dataManager.method35446(field5882, (byte)(var5 | var1));
      }
   }

   public boolean method4932() {
      return this.method4930(2);
   }

   @Nullable
   public UUID method4933() {
      return this.dataManager.<Optional<UUID>>method35445(field5883).orElse((UUID)null);
   }

   public void method4934(UUID var1) {
      this.dataManager.method35446(field5883, Optional.<UUID>ofNullable(var1));
   }

   public boolean method4935() {
      return this.field5889;
   }

   public void method4936(boolean var1) {
      this.method4931(2, var1);
   }

   public void method4937(boolean var1) {
      this.field5889 = var1;
   }

   @Override
   public void method4774(float var1) {
      if (var1 > 6.0F && this.method4938()) {
         this.method4956(false);
      }
   }

   public boolean method4938() {
      return this.method4930(16);
   }

   public boolean method4939() {
      return this.method4930(32);
   }

   public boolean method4940() {
      return this.method4930(8);
   }

   public void method4941(boolean var1) {
      this.method4931(8, var1);
   }

   @Override
   public boolean method4901() {
      return this.isAlive() && !this.isChild() && this.method4932();
   }

   @Override
   public void method4942(Class2266 var1) {
      this.field5890.setInventorySlotContents(0, new ItemStack(Items.field37886));
      if (var1 != null) {
         this.world.method6744((PlayerEntity)null, this, SoundEvents.field26677, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean method4943() {
      return this.method4930(4);
   }

   public int method4944() {
      return this.field5891;
   }

   public void method4945(int var1) {
      this.field5891 = var1;
   }

   public int method4946(int var1) {
      int var4 = MathHelper.clamp(this.method4944() + var1, 0, this.method4907());
      this.method4945(var4);
      return var4;
   }

   @Override
   public boolean canBePushed() {
      return !this.isBeingRidden();
   }

   private void method4947() {
      this.method4955();
      if (!this.isSilent()) {
         SoundEvent var3 = this.method4894();
         if (var3 != null) {
            this.world
               .playSound(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  var3,
                  this.getSoundCategory(),
                  1.0F,
                  1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F
               );
         }
      }
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      if (var1 > 1.0F) {
         this.playSound(SoundEvents.field26676, 0.4F, 1.0F);
      }

      int var5 = this.calculateFallDamage(var1, var2);
      if (var5 <= 0) {
         return false;
      } else {
         this.attackEntityFrom(DamageSource.field39002, (float)var5);
         if (this.isBeingRidden()) {
            for (Entity var7 : this.method3411()) {
               var7.attackEntityFrom(DamageSource.field39002, (float)var5);
            }
         }

         this.playFallSound();
         return true;
      }
   }

   @Override
   public int calculateFallDamage(float var1, float var2) {
      return MathHelper.ceil((var1 * 0.5F - 3.0F) * var2);
   }

   public int method4891() {
      return 2;
   }

   public void method4948() {
      Class927 var3 = this.field5890;
      this.field5890 = new Class927(this.method4891());
      if (var3 != null) {
         var3.method3673(this);
         int var4 = Math.min(var3.getSizeInventory(), this.field5890.getSizeInventory());

         for (int var5 = 0; var5 < var4; var5++) {
            ItemStack var6 = var3.getStackInSlot(var5);
            if (!var6.isEmpty()) {
               this.field5890.setInventorySlotContents(var5, var6.copy());
            }
         }
      }

      this.field5890.method3672(this);
      this.method4903();
   }

   public void method4903() {
      if (!this.world.isRemote) {
         this.method4931(4, !this.field5890.getStackInSlot(0).isEmpty());
      }
   }

   @Override
   public void method4902(IInventory var1) {
      boolean var4 = this.method4943();
      this.method4903();
      if (this.ticksExisted > 20 && !var4 && this.method4943()) {
         this.playSound(SoundEvents.field26677, 0.5F, 1.0F);
      }
   }

   public double method4949() {
      return this.getAttributeValue(Attributes.HORSE_JUMP_STRENGTH);
   }

   @Nullable
   public SoundEvent method4894() {
      return null;
   }

   @Nullable
   @Override
   public SoundEvent getDeathSound() {
      return null;
   }

   @Nullable
   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      if (this.rand.nextInt(3) == 0) {
         this.method4958();
      }

      return null;
   }

   @Nullable
   @Override
   public SoundEvent getAmbientSound() {
      if (this.rand.nextInt(10) == 0 && !this.isMovementBlocked()) {
         this.method4958();
      }

      return null;
   }

   @Nullable
   public SoundEvent method4893() {
      this.method4958();
      return null;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      if (!var2.getMaterial().isLiquid()) {
         BlockState var5 = this.world.getBlockState(var1.up());
         SoundType var6 = var2.getSoundType();
         if (var5.isIn(Blocks.SNOW)) {
            var6 = var5.getSoundType();
         }

         if (this.isBeingRidden() && this.field5900) {
            this.field5901++;
            if (this.field5901 > 5 && this.field5901 % 3 == 0) {
               this.method4950(var6);
            } else if (this.field5901 <= 5) {
               this.playSound(SoundEvents.field26679, var6.getVolume() * 0.15F, var6.method29711());
            }
         } else if (var6 != SoundType.field36200) {
            this.playSound(SoundEvents.field26678, var6.getVolume() * 0.15F, var6.method29711());
         } else {
            this.playSound(SoundEvents.field26679, var6.getVolume() * 0.15F, var6.method29711());
         }
      }
   }

   public void method4950(SoundType var1) {
      this.playSound(SoundEvents.field26673, var1.getVolume() * 0.15F, var1.method29711());
   }

   public static MutableAttribute method4951() {
      return MobEntity.method4220().method21848(Attributes.HORSE_JUMP_STRENGTH).method21849(Attributes.MAX_HEALTH, 53.0).method21849(Attributes.MOVEMENT_SPEED, 0.225F);
   }

   @Override
   public int method4267() {
      return 6;
   }

   public int method4907() {
      return 100;
   }

   @Override
   public float getSoundVolume() {
      return 0.8F;
   }

   @Override
   public int method4236() {
      return 400;
   }

   public void openGUI(PlayerEntity var1) {
      if (!this.world.isRemote && (!this.isBeingRidden() || this.method3409(var1)) && this.method4932()) {
         var1.method2768(this, this.field5890);
      }
   }

   public ActionResultType method4953(PlayerEntity var1, ItemStack var2) {
      boolean var5 = this.method4892(var1, var2);
      if (!var1.abilities.isCreativeMode) {
         var2.shrink(1);
      }

      if (!this.world.isRemote) {
         return !var5 ? ActionResultType.field14820 : ActionResultType.SUCCESS;
      } else {
         return ActionResultType.field14819;
      }
   }

   public boolean method4892(PlayerEntity var1, ItemStack var2) {
      boolean var5 = false;
      float var6 = 0.0F;
      short var7 = 0;
      byte var8 = 0;
      Item var9 = var2.getItem();
      if (var9 != Items.field37842) {
         if (var9 != Items.field37936) {
            if (var9 != Blocks.field36777.asItem()) {
               if (var9 != Items.field37795) {
                  if (var9 != Items.field38057) {
                     if (var9 == Items.GOLDEN_APPLE || var9 == Items.ENCHANTED_GOLDEN_APPLE) {
                        var6 = 10.0F;
                        var7 = 240;
                        var8 = 10;
                        if (!this.world.isRemote && this.method4932() && this.method4767() == 0 && !this.method4507()) {
                           var5 = true;
                           this.method4503(var1);
                        }
                     }
                  } else {
                     var6 = 4.0F;
                     var7 = 60;
                     var8 = 5;
                     if (!this.world.isRemote && this.method4932() && this.method4767() == 0 && !this.method4507()) {
                        var5 = true;
                        this.method4503(var1);
                     }
                  }
               } else {
                  var6 = 3.0F;
                  var7 = 60;
                  var8 = 3;
               }
            } else {
               var6 = 20.0F;
               var7 = 180;
            }
         } else {
            var6 = 1.0F;
            var7 = 30;
            var8 = 3;
         }
      } else {
         var6 = 2.0F;
         var7 = 20;
         var8 = 3;
      }

      if (this.getHealth() < this.method3075() && var6 > 0.0F) {
         this.heal(var6);
         var5 = true;
      }

      if (this.isChild() && var7 > 0) {
         this.world.addParticle(ParticleTypes.field34078, this.getPosXRandom(1.0), this.getPosYRandom() + 0.5, this.getPosZRandom(1.0), 0.0, 0.0, 0.0);
         if (!this.world.isRemote) {
            this.method4769(var7);
         }

         var5 = true;
      }

      if (var8 > 0 && (var5 || !this.method4932()) && this.method4944() < this.method4907()) {
         var5 = true;
         if (!this.world.isRemote) {
            this.method4946(var8);
         }
      }

      if (var5) {
         this.method4947();
      }

      return var5;
   }

   public void method4920(PlayerEntity var1) {
      this.method4956(false);
      this.method4957(false);
      if (!this.world.isRemote) {
         var1.rotationYaw = this.rotationYaw;
         var1.rotationPitch = this.rotationPitch;
         var1.method3311(this);
      }
   }

   @Override
   public boolean isMovementBlocked() {
      return super.isMovementBlocked() && this.isBeingRidden() && this.method4943() || this.method4938() || this.method4939();
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return field5881.test(var1);
   }

   private void method4954() {
      this.field5887 = 1;
   }

   @Override
   public void dropInventory() {
      super.dropInventory();
      if (this.field5890 != null) {
         for (int var3 = 0; var3 < this.field5890.getSizeInventory(); var3++) {
            ItemStack var4 = this.field5890.getStackInSlot(var3);
            if (!var4.isEmpty() && !EnchantmentHelper.method26335(var4)) {
               this.method3302(var4);
            }
         }
      }
   }

   @Override
   public void livingTick() {
      if (this.rand.nextInt(200) == 0) {
         this.method4954();
      }

      super.livingTick();
      if (!this.world.isRemote && this.isAlive()) {
         if (this.rand.nextInt(900) == 0 && this.deathTime == 0) {
            this.heal(1.0F);
         }

         if (this.method4917()) {
            if (!this.method4938()
               && !this.isBeingRidden()
               && this.rand.nextInt(300) == 0
               && this.world.getBlockState(this.getPosition().down()).isIn(Blocks.GRASS_BLOCK)) {
               this.method4956(true);
            }

            if (this.method4938() && ++this.field5884 > 50) {
               this.field5884 = 0;
               this.method4956(false);
            }
         }

         this.method4916();
      }
   }

   public void method4916() {
      if (this.method4940() && this.isChild() && !this.method4938()) {
         LivingEntity var3 = this.world
            .<AbstractHorseEntity>method7191(
               AbstractHorseEntity.class, field5880, this, this.getPosX(), this.getPosY(), this.getPosZ(), this.getBoundingBox().grow(16.0)
            );
         if (var3 != null && this.getDistanceSq(var3) > 4.0) {
            this.field5599.method21652(var3, 0);
         }
      }
   }

   public boolean method4917() {
      return true;
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field5885 > 0 && ++this.field5885 > 30) {
         this.field5885 = 0;
         this.method4931(64, false);
      }

      if ((this.canPassengerSteer() || this.isServerWorld()) && this.field5886 > 0 && ++this.field5886 > 20) {
         this.field5886 = 0;
         this.method4957(false);
      }

      if (this.field5887 > 0 && ++this.field5887 > 8) {
         this.field5887 = 0;
      }

      if (this.field5888 > 0) {
         this.field5888++;
         if (this.field5888 > 300) {
            this.field5888 = 0;
         }
      }

      this.field5895 = this.field5894;
      if (!this.method4938()) {
         this.field5894 = this.field5894 + ((0.0F - this.field5894) * 0.4F - 0.05F);
         if (this.field5894 < 0.0F) {
            this.field5894 = 0.0F;
         }
      } else {
         this.field5894 = this.field5894 + (1.0F - this.field5894) * 0.4F + 0.05F;
         if (this.field5894 > 1.0F) {
            this.field5894 = 1.0F;
         }
      }

      this.field5897 = this.field5896;
      if (!this.method4939()) {
         this.field5893 = false;
         this.field5896 = this.field5896 + ((0.8F * this.field5896 * this.field5896 * this.field5896 - this.field5896) * 0.6F - 0.05F);
         if (this.field5896 < 0.0F) {
            this.field5896 = 0.0F;
         }
      } else {
         this.field5894 = 0.0F;
         this.field5895 = this.field5894;
         this.field5896 = this.field5896 + (1.0F - this.field5896) * 0.4F + 0.05F;
         if (this.field5896 > 1.0F) {
            this.field5896 = 1.0F;
         }
      }

      this.field5899 = this.field5898;
      if (!this.method4930(64)) {
         this.field5898 = this.field5898 + ((0.0F - this.field5898) * 0.7F - 0.05F);
         if (this.field5898 < 0.0F) {
            this.field5898 = 0.0F;
         }
      } else {
         this.field5898 = this.field5898 + (1.0F - this.field5898) * 0.7F + 0.05F;
         if (this.field5898 > 1.0F) {
            this.field5898 = 1.0F;
         }
      }
   }

   private void method4955() {
      if (!this.world.isRemote) {
         this.field5885 = 1;
         this.method4931(64, true);
      }
   }

   public void method4956(boolean var1) {
      this.method4931(16, var1);
   }

   public void method4957(boolean var1) {
      if (var1) {
         this.method4956(false);
      }

      this.method4931(32, var1);
   }

   private void method4958() {
      if (this.canPassengerSteer() || this.isServerWorld()) {
         this.field5886 = 1;
         this.method4957(true);
      }
   }

   public void method4896() {
      if (!this.method4939()) {
         this.method4958();
         SoundEvent var3 = this.method4893();
         if (var3 != null) {
            this.playSound(var3, this.getSoundVolume(), this.getSoundPitch());
         }
      }
   }

   public boolean method4959(PlayerEntity var1) {
      this.method4934(var1.getUniqueID());
      this.method4936(true);
      if (var1 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44488.method15115((ServerPlayerEntity)var1, this);
      }

      this.world.setEntityState(this, (byte)7);
      return true;
   }

   @Override
   public void travel(Vector3d var1) {
      if (this.isAlive()) {
         if (this.isBeingRidden() && this.method4277() && this.method4943()) {
            LivingEntity var4 = (LivingEntity)this.method3407();
            this.rotationYaw = var4.rotationYaw;
            this.prevRotationYaw = this.rotationYaw;
            this.rotationPitch = var4.rotationPitch * 0.5F;
            this.setRotation(this.rotationYaw, this.rotationPitch);
            this.renderYawOffset = this.rotationYaw;
            this.rotationYawHead = this.renderYawOffset;
            float var5 = var4.moveStrafing * 0.5F;
            float var6 = var4.moveForward;
            if (var6 <= 0.0F) {
               var6 *= 0.25F;
               this.field5901 = 0;
            }

            if (this.onGround && this.field5892 == 0.0F && this.method4939() && !this.field5893) {
               var5 = 0.0F;
               var6 = 0.0F;
            }

            if (this.field5892 > 0.0F && !this.method4935() && this.onGround) {
               double var7 = this.method4949() * (double)this.field5892 * (double)this.getJumpFactor();
               double var9;
               if (!this.isPotionActive(Effects.JUMP_BOOST)) {
                  var9 = var7;
               } else {
                  var9 = var7 + (double)((float)(this.getActivePotionEffect(Effects.JUMP_BOOST).method8629() + 1) * 0.1F);
               }

               Vector3d var11 = this.getMotion();
               this.setMotion(var11.x, var9, var11.z);
               this.method4937(true);
               this.isAirBorne = true;
               if (var6 > 0.0F) {
                  float var12 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0));
                  float var13 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0));
                  this.setMotion(this.getMotion().add((double)(-0.4F * var12 * this.field5892), 0.0, (double)(0.4F * var13 * this.field5892)));
               }

               this.field5892 = 0.0F;
            }

            this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;
            if (!this.canPassengerSteer()) {
               if (var4 instanceof PlayerEntity) {
                  this.setMotion(Vector3d.ZERO);
               }
            } else {
               this.setAIMoveSpeed((float)this.getAttributeValue(Attributes.MOVEMENT_SPEED));
               super.travel(new Vector3d((double)var5, var1.y, (double)var6));
            }

            if (this.onGround) {
               this.field5892 = 0.0F;
               this.method4937(false);
            }

            this.func_233629_a_(this, false);
         } else {
            this.jumpMovementFactor = 0.02F;
            super.travel(var1);
         }
      }
   }

   public void method4960() {
      this.playSound(SoundEvents.field26675, 0.4F, 1.0F);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putBoolean("EatingHaystack", this.method4938());
      var1.putBoolean("Bred", this.method4940());
      var1.putInt("Temper", this.method4944());
      var1.putBoolean("Tame", this.method4932());
      if (this.method4933() != null) {
         var1.method104("Owner", this.method4933());
      }

      if (!this.field5890.getStackInSlot(0).isEmpty()) {
         var1.put("SaddleItem", this.field5890.getStackInSlot(0).method32112(new CompoundNBT()));
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method4956(var1.getBoolean("EatingHaystack"));
      this.method4941(var1.getBoolean("Bred"));
      this.method4945(var1.getInt("Temper"));
      this.method4936(var1.getBoolean("Tame"));
      UUID var5;
      if (!var1.method106("Owner")) {
         String var4 = var1.getString("Owner");
         var5 = PreYggdrasilConverter.method33732(this.method3396(), var4);
      } else {
         var5 = var1.method105("Owner");
      }

      if (var5 != null) {
         this.method4934(var5);
      }

      if (var1.contains("SaddleItem", 10)) {
         ItemStack var6 = ItemStack.method32104(var1.getCompound("SaddleItem"));
         if (var6.getItem() == Items.field37886) {
            this.field5890.setInventorySlotContents(0, var6);
         }
      }

      this.method4903();
   }

   @Override
   public boolean method4386(Class1018 var1) {
      return false;
   }

   public boolean method4961() {
      return !this.isBeingRidden() && !this.isPassenger() && this.method4932() && !this.isChild() && this.getHealth() >= this.method3075() && this.method4507();
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return null;
   }

   public void method4962(Class1045 var1, AbstractHorseEntity var2) {
      double var5 = this.method3087(Attributes.MAX_HEALTH) + var1.method3087(Attributes.MAX_HEALTH) + (double)this.method4971();
      var2.getAttribute(Attributes.MAX_HEALTH).method38661(var5 / 3.0);
      double var7 = this.method3087(Attributes.HORSE_JUMP_STRENGTH) + var1.method3087(Attributes.HORSE_JUMP_STRENGTH) + this.method4972();
      var2.getAttribute(Attributes.HORSE_JUMP_STRENGTH).method38661(var7 / 3.0);
      double var9 = this.method3087(Attributes.MOVEMENT_SPEED) + var1.method3087(Attributes.MOVEMENT_SPEED) + this.method4973();
      var2.getAttribute(Attributes.MOVEMENT_SPEED).method38661(var9 / 3.0);
   }

   @Override
   public boolean method4277() {
      return this.method3407() instanceof LivingEntity;
   }

   public float method4963(float var1) {
      return MathHelper.lerp(var1, this.field5895, this.field5894);
   }

   public float method4964(float var1) {
      return MathHelper.lerp(var1, this.field5897, this.field5896);
   }

   public float method4965(float var1) {
      return MathHelper.lerp(var1, this.field5899, this.field5898);
   }

   @Override
   public void method4966(int var1) {
      if (this.method4943()) {
         if (var1 >= 0) {
            this.field5893 = true;
            this.method4958();
         } else {
            var1 = 0;
         }

         if (var1 < 90) {
            this.field5892 = 0.4F + 0.4F * (float)var1 / 90.0F;
         } else {
            this.field5892 = 1.0F;
         }
      }
   }

   @Override
   public boolean canJump() {
      return this.method4943();
   }

   @Override
   public void handleStartJump(int var1) {
      this.field5893 = true;
      this.method4958();
      this.method4960();
   }

   @Override
   public void handleStopJump() {
   }

   public void method4970(boolean var1) {
      Class7435 var4 = !var1 ? ParticleTypes.field34092 : ParticleTypes.field34080;

      for (int var5 = 0; var5 < 7; var5++) {
         double var6 = this.rand.nextGaussian() * 0.02;
         double var8 = this.rand.nextGaussian() * 0.02;
         double var10 = this.rand.nextGaussian() * 0.02;
         this.world.addParticle(var4, this.getPosXRandom(1.0), this.getPosYRandom() + 0.5, this.getPosZRandom(1.0), var6, var8, var10);
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 7) {
         if (var1 != 6) {
            super.handleStatusUpdate(var1);
         } else {
            this.method4970(false);
         }
      } else {
         this.method4970(true);
      }
   }

   @Override
   public void method3307(Entity var1) {
      super.method3307(var1);
      if (var1 instanceof MobEntity) {
         MobEntity var4 = (MobEntity)var1;
         this.renderYawOffset = var4.renderYawOffset;
      }

      if (this.field5897 > 0.0F) {
         float var8 = MathHelper.sin(this.renderYawOffset * (float) (Math.PI / 180.0));
         float var5 = MathHelper.cos(this.renderYawOffset * (float) (Math.PI / 180.0));
         float var6 = 0.7F * this.field5897;
         float var7 = 0.15F * this.field5897;
         var1.setPosition(
            this.getPosX() + (double)(var6 * var8),
            this.getPosY() + this.method3310() + var1.getYOffset() + (double)var7,
            this.getPosZ() - (double)(var6 * var5)
         );
         if (var1 instanceof LivingEntity) {
            ((LivingEntity)var1).renderYawOffset = this.renderYawOffset;
         }
      }
   }

   public float method4971() {
      return 15.0F + (float)this.rand.nextInt(8) + (float)this.rand.nextInt(9);
   }

   public double method4972() {
      return 0.4F + this.rand.nextDouble() * 0.2 + this.rand.nextDouble() * 0.2 + this.rand.nextDouble() * 0.2;
   }

   public double method4973() {
      return (0.45F + this.rand.nextDouble() * 0.3 + this.rand.nextDouble() * 0.3 + this.rand.nextDouble() * 0.3) * 0.25;
   }

   @Override
   public boolean isOnLadder() {
      return false;
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return var2.field39969 * 0.95F;
   }

   public boolean method4898() {
      return false;
   }

   public boolean method4899() {
      return !this.getItemStackFromSlot(EquipmentSlotType.CHEST).isEmpty();
   }

   public boolean method4900(ItemStack var1) {
      return false;
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      int var5 = var1 - 400;
      if (var5 >= 0 && var5 < 2 && var5 < this.field5890.getSizeInventory()) {
         if (var5 == 0 && var2.getItem() != Items.field37886) {
            return false;
         } else if (var5 == 1 && (!this.method4898() || !this.method4900(var2))) {
            return false;
         } else {
            this.field5890.setInventorySlotContents(var5, var2);
            this.method4903();
            return true;
         }
      } else {
         int var6 = var1 - 500 + 2;
         if (var6 >= 2 && var6 < this.field5890.getSizeInventory()) {
            this.field5890.setInventorySlotContents(var6, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public Entity method3407() {
      return !this.getPassengers().isEmpty() ? this.getPassengers().get(0) : null;
   }

   @Nullable
   private Vector3d method4974(Vector3d var1, LivingEntity var2) {
      double var5 = this.getPosX() + var1.x;
      double var7 = this.getBoundingBox().minY;
      double var9 = this.getPosZ() + var1.z;
      BlockPos.Mutable var11 = new BlockPos.Mutable();
      UnmodifiableIterator var12 = var2.getAvailablePoses().iterator();

      while (var12.hasNext()) {
         Pose var13 = (Pose)var12.next();
         var11.method8373(var5, var7, var9);
         double var14 = this.getBoundingBox().maxY + 0.75;

         do {
            double var16 = this.world.method7039(var11);
            if ((double)var11.getY() + var16 > var14) {
               break;
            }

            if (Class4527.method14423(var16)) {
               AxisAlignedBB var18 = var2.getPoseAABB(var13);
               Vector3d var19 = new Vector3d(var5, (double)var11.getY() + var16, var9);
               if (Class4527.method14424(this.world, var2, var18.offset(var19))) {
                  var2.setPose(var13);
                  return var19;
               }
            }

            var11.method8379(Direction.UP);
         } while (!((double)var11.getY() < var14));
      }

      return null;
   }

   @Override
   public Vector3d method3420(LivingEntity var1) {
      Vector3d var4 = method3419(
         (double)this.getWidth(), (double)var1.getWidth(), this.rotationYaw + (var1.getPrimaryHand() != HandSide.RIGHT ? -90.0F : 90.0F)
      );
      Vector3d var5 = this.method4974(var4, var1);
      if (var5 == null) {
         Vector3d var6 = method3419(
            (double)this.getWidth(), (double)var1.getWidth(), this.rotationYaw + (var1.getPrimaryHand() != HandSide.LEFT ? -90.0F : 90.0F)
         );
         Vector3d var7 = this.method4974(var6, var1);
         return var7 == null ? this.getPositionVec() : var7;
      } else {
         return var5;
      }
   }

   public void method4925() {
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new Class5097(0.2F);
      }

      this.method4925();
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }
}
