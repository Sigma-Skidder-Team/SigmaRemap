package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class ZombieEntity extends Class1009 {
   private static final UUID field5758 = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final AttributeModifier field5759 = new AttributeModifier(field5758, "Baby speed boost", 0.5, AttributeModifier.Operation.field13353);
   private static final DataParameter<Boolean> field5760 = EntityDataManager.<Boolean>createKey(ZombieEntity.class, DataSerializers.field33398);
   private static final DataParameter<Integer> field5761 = EntityDataManager.<Integer>createKey(ZombieEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Boolean> field5762 = EntityDataManager.<Boolean>createKey(ZombieEntity.class, DataSerializers.field33398);
   private static final Predicate<Difficulty> field5763 = var0 -> var0 == Difficulty.field14354;
   private final Class2643 field5764 = new Class2643(this, field5763);
   private boolean field5765;
   private int field5766;
   private int field5767;

   public ZombieEntity(EntityType<? extends ZombieEntity> var1, World var2) {
      super(var1, var2);
   }

   public ZombieEntity(World var1) {
      this(EntityType.field41107, var1);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(4, new Class2633(this, this, 1.0, 3));
      this.field5600.addGoal(8, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(8, new Class2668(this));
      this.applyEntityAI();
   }

   public void applyEntityAI() {
      this.field5600.addGoal(2, new ZombieAttackGoal(this, 1.0, false));
      this.field5600.addGoal(6, new Class2686(this, 1.0, true, 4, this::method4655));
      this.field5600.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.field5601.addGoal(1, new HurtByTargetGoal(this).method10918(ZombifiedPiglinEntity.class));
      this.field5601.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<Class1043>(this, Class1043.class, false));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<Class1058>(this, Class1058.class, true));
      this.field5601.addGoal(5, new NearestAttackableTargetGoal<Class1088>(this, Class1088.class, 10, true, false, Class1088.field5963));
   }

   public static Class7037 method4653() {
      return Class1009.method4343()
         .method21849(Attributes.field42106, 35.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.23F)
         .method21849(Attributes.field42110, 3.0)
         .method21849(Attributes.field42113, 2.0)
         .method21848(Attributes.field42116);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.getDataManager().register(field5760, false);
      this.getDataManager().register(field5761, 0);
      this.getDataManager().register(field5762, false);
   }

   public boolean method4654() {
      return this.getDataManager().<Boolean>method35445(field5762);
   }

   public boolean method4655() {
      return this.field5765;
   }

   public void method4656(boolean var1) {
      if (this.method4642() && Class8100.method28053(this)) {
         if (this.field5765 != var1) {
            this.field5765 = var1;
            ((Class6991)this.method4230()).method21682(var1);
            if (!var1) {
               this.field5600.method20003(this.field5764);
            } else {
               this.field5600.addGoal(1, this.field5764);
            }
         }
      } else if (this.field5765) {
         this.field5600.method20003(this.field5764);
         this.field5765 = false;
      }
   }

   public boolean method4642() {
      return true;
   }

   @Override
   public boolean isChild() {
      return this.getDataManager().<Boolean>method35445(field5760);
   }

   @Override
   public int getExperiencePoints(PlayerEntity var1) {
      if (this.isChild()) {
         this.field5594 = (int)((float)this.field5594 * 2.5F);
      }

      return super.getExperiencePoints(var1);
   }

   @Override
   public void method4308(boolean var1) {
      this.getDataManager().method35446(field5760, var1);
      if (this.world != null && !this.world.isRemote) {
         ModifiableAttributeInstance var4 = this.getAttribute(Attributes.MOVEMENT_SPEED);
         var4.method38670(field5759);
         if (var1) {
            var4.method38667(field5759);
         }
      }
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field5760.equals(var1)) {
         this.recalculateSize();
      }

      super.notifyDataManagerChange(var1);
   }

   public boolean shouldDrown() {
      return true;
   }

   @Override
   public void tick() {
      if (!this.world.isRemote && this.isAlive() && !this.method4305()) {
         if (!this.method4654()) {
            if (this.shouldDrown()) {
               if (!this.areEyesInFluid(FluidTags.field40469)) {
                  this.field5766 = -1;
               } else {
                  this.field5766++;
                  if (this.field5766 >= 600) {
                     this.method4657(300);
                  }
               }
            }
         } else {
            this.field5767--;
            if (this.field5767 < 0) {
               this.method4658();
            }
         }
      }

      super.tick();
   }

   @Override
   public void livingEntity() {
      if (this.isAlive()) {
         boolean var3 = this.method4660() && this.method4310();
         if (var3) {
            ItemStack var4 = this.getItemStackFromSlot(EquipmentSlotType.field13736);
            if (!var4.isEmpty()) {
               if (var4.method32115()) {
                  var4.method32118(var4.method32117() + this.rand.nextInt(2));
                  if (var4.method32117() >= var4.method32119()) {
                     this.sendBreakAnimation(EquipmentSlotType.field13736);
                     this.setItemStackToSlot(EquipmentSlotType.field13736, ItemStack.EMPTY);
                  }
               }

               var3 = false;
            }

            if (var3) {
               this.setFire(8);
            }
         }
      }

      super.livingEntity();
   }

   private void method4657(int var1) {
      this.field5767 = var1;
      this.getDataManager().method35446(field5762, true);
   }

   public void method4658() {
      this.method4659(EntityType.field41021);
      if (!this.isSilent()) {
         this.world.method6869((PlayerEntity)null, 1040, this.getPosition(), 0);
      }
   }

   public void method4659(EntityType<? extends ZombieEntity> var1) {
      ZombieEntity var4 = this.method4292(var1, true);
      if (var4 != null) {
         var4.method4662(var4.world.method6807(var4.getPosition()).method38330());
         var4.method4656(var4.method4642() && this.method4655());
      }
   }

   public boolean method4660() {
      return true;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!super.attackEntityFrom(var1, var2)) {
         return false;
      } else if (this.world instanceof ServerWorld) {
         ServerWorld var5 = (ServerWorld)this.world;
         LivingEntity var6 = this.method4232();
         if (var6 == null && var1.getTrueSource() instanceof LivingEntity) {
            var6 = (LivingEntity)var1.getTrueSource();
         }

         if (var6 != null
            && this.world.method6997() == Difficulty.field14354
            && (double)this.rand.nextFloat() < this.getAttributeValue(Attributes.field42116)
            && this.world.getGameRules().getBoolean(Class5462.field24226)) {
            int var7 = MathHelper.floor(this.getPosX());
            int var8 = MathHelper.floor(this.getPosY());
            int var9 = MathHelper.floor(this.getPosZ());
            ZombieEntity var10 = new ZombieEntity(this.world);

            for (int var11 = 0; var11 < 50; var11++) {
               int var12 = var7 + MathHelper.method37782(this.rand, 7, 40) * MathHelper.method37782(this.rand, -1, 1);
               int var13 = var8 + MathHelper.method37782(this.rand, 7, 40) * MathHelper.method37782(this.rand, -1, 1);
               int var14 = var9 + MathHelper.method37782(this.rand, 7, 40) * MathHelper.method37782(this.rand, -1, 1);
               BlockPos var15 = new BlockPos(var12, var13, var14);
               EntityType var16 = var10.getType();
               Class2068 var17 = Class6914.method21120(var16);
               if (Class8170.method28429(var17, this.world, var15, var16)
                  && Class6914.method21122(var16, var5, Class2202.field14400, var15, this.world.rand)) {
                  var10.setPosition((double)var12, (double)var13, (double)var14);
                  if (!this.world.method7187((double)var12, (double)var13, (double)var14, 7.0)
                     && this.world.checkNoEntityCollision(var10)
                     && this.world.hasNoCollisions(var10)
                     && !this.world.method7014(var10.getBoundingBox())) {
                     var10.method4233(var6);
                     var10.method4276(var5, this.world.method6807(var10.getPosition()), Class2202.field14400, (Class5093)null, (CompoundNBT)null);
                     var5.method6995(var10);
                     this.getAttribute(Attributes.field42116).method38668(new AttributeModifier("Zombie reinforcement caller charge", -0.05F, AttributeModifier.Operation.ADDITION));
                     var10.getAttribute(Attributes.field42116).method38668(new AttributeModifier("Zombie reinforcement callee charge", -0.05F, AttributeModifier.Operation.ADDITION));
                     break;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      boolean var4 = super.attackEntityAsMob(var1);
      if (var4) {
         float var5 = this.world.method6807(this.getPosition()).method38328();
         if (this.getHeldItemMainhand().isEmpty() && this.isBurning() && this.rand.nextFloat() < var5 * 0.3F) {
            var1.setFire(2 * (int)var5);
         }
      }

      return var4;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27282;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27292;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27287;
   }

   public SoundEvent method4643() {
      return SoundEvents.field27298;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(this.method4643(), 0.15F, 1.0F);
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33506;
   }

   @Override
   public void method4270(Class9755 var1) {
      super.method4270(var1);
      if (this.rand.nextFloat() < (this.world.method6997() != Difficulty.field14354 ? 0.01F : 0.05F)) {
         int var4 = this.rand.nextInt(3);
         if (var4 != 0) {
            this.setItemStackToSlot(EquipmentSlotType.field13731, new ItemStack(Items.field37821));
         } else {
            this.setItemStackToSlot(EquipmentSlotType.field13731, new ItemStack(Items.field37820));
         }
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putBoolean("IsBaby", this.isChild());
      var1.putBoolean("CanBreakDoors", this.method4655());
      var1.putInt("InWaterTime", !this.isInWater() ? -1 : this.field5766);
      var1.putInt("DrownedConversionTime", !this.method4654() ? -1 : this.field5767);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method4308(var1.getBoolean("IsBaby"));
      this.method4656(var1.getBoolean("CanBreakDoors"));
      this.field5766 = var1.getInt("InWaterTime");
      if (var1.contains("DrownedConversionTime", 99) && var1.getInt("DrownedConversionTime") > -1) {
         this.method4657(var1.getInt("DrownedConversionTime"));
      }
   }

   @Override
   public void method2927(ServerWorld var1, LivingEntity var2) {
      super.method2927(var1, var2);
      if ((var1.method6997() == Difficulty.field14353 || var1.method6997() == Difficulty.field14354) && var2 instanceof Class1042) {
         if (var1.method6997() != Difficulty.field14354 && this.rand.nextBoolean()) {
            return;
         }

         Class1042 var5 = (Class1042)var2;
         Class1040 var6 = var5.<Class1040>method4292(EntityType.field41109, false);
         var6.method4276(var1, var1.method6807(var6.getPosition()), Class2202.field14399, new Class5096(false, true), (CompoundNBT)null);
         var6.method4673(var5.method4674());
         var6.method4672((INBT)var5.method4724().method25528(NBTDynamicOps.INSTANCE).getValue());
         var6.method4671(var5.method4742().method166());
         var6.method4675(var5.method4721());
         if (!this.isSilent()) {
            var1.method6869((PlayerEntity)null, 1026, this.getPosition(), 0);
         }
      }
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return !this.isChild() ? 1.74F : 0.93F;
   }

   @Override
   public boolean method4252(ItemStack var1) {
      return var1.getItem() == Items.field37904 && this.isChild() && this.isPassenger() ? false : super.method4252(var1);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      var4 = super.method4276(var1, var2, var3, var4, var5);
      float var8 = var2.method38330();
      this.method4281(this.rand.nextFloat() < 0.55F * var8);
      if (var4 == null) {
         var4 = new Class5096(method4661(var1.method6814()), true);
      }

      if (var4 instanceof Class5096) {
         Class5096 var9 = (Class5096)var4;
         if (var9.field23189) {
            this.method4308(true);
            if (var9.field23190) {
               if (!((double)var1.method6814().nextFloat() < 0.05)) {
                  if ((double)var1.method6814().nextFloat() < 0.05) {
                     Class1089 var10 = EntityType.field41014.create(this.world);
                     var10.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, 0.0F);
                     var10.method4276(var1, var2, Class2202.field14397, (Class5093)null, (CompoundNBT)null);
                     var10.method5071(true);
                     this.method3311(var10);
                     var1.addEntity(var10);
                  }
               } else {
                  List var14 = var1.<Entity>method6772(Class1089.class, this.getBoundingBox().method19663(5.0, 3.0, 5.0), Class8088.field34759);
                  if (!var14.isEmpty()) {
                     Class1089 var11 = (Class1089)var14.get(0);
                     var11.method5071(true);
                     this.method3311(var11);
                  }
               }
            }
         }

         this.method4656(this.method4642() && this.rand.nextFloat() < var8 * 0.1F);
         this.method4270(var2);
         this.method4273(var2);
      }

      if (this.getItemStackFromSlot(EquipmentSlotType.field13736).isEmpty()) {
         LocalDate var13 = LocalDate.now();
         int var15 = var13.get(ChronoField.DAY_OF_MONTH);
         int var16 = var13.get(ChronoField.MONTH_OF_YEAR);
         if (var16 == 10 && var15 == 31 && this.rand.nextFloat() < 0.25F) {
            this.setItemStackToSlot(EquipmentSlotType.field13736, new ItemStack(!(this.rand.nextFloat() < 0.1F) ? Blocks.field36589 : Blocks.field36590));
            this.field5607[EquipmentSlotType.field13736.method8773()] = 0.0F;
         }
      }

      this.method4662(var8);
      return var4;
   }

   public static boolean method4661(Random var0) {
      return var0.nextFloat() < 0.05F;
   }

   public void method4662(float var1) {
      this.method4663();
      this.getAttribute(Attributes.field42107).method38668(new AttributeModifier("Random spawn bonus", this.rand.nextDouble() * 0.05F, AttributeModifier.Operation.ADDITION));
      double var4 = this.rand.nextDouble() * 1.5 * (double)var1;
      if (var4 > 1.0) {
         this.getAttribute(Attributes.field42106).method38668(new AttributeModifier("Random zombie-spawn bonus", var4, AttributeModifier.Operation.MULTIPLY_TOTAL));
      }

      if (this.rand.nextFloat() < var1 * 0.05F) {
         this.getAttribute(Attributes.field42116)
            .method38668(new AttributeModifier("Leader zombie bonus", this.rand.nextDouble() * 0.25 + 0.5, AttributeModifier.Operation.ADDITION));
         this.getAttribute(Attributes.field42105).method38668(new AttributeModifier("Leader zombie bonus", this.rand.nextDouble() * 3.0 + 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL));
         this.method4656(this.method4642());
      }
   }

   public void method4663() {
      this.getAttribute(Attributes.field42116).method38661(this.rand.nextDouble() * 0.1F);
   }

   @Override
   public double getYOffset() {
      return !this.isChild() ? -0.45 : 0.0;
   }

   @Override
   public void dropSpecialItems(DamageSource var1, int var2, boolean var3) {
      super.dropSpecialItems(var1, var2, var3);
      Entity var6 = var1.getTrueSource();
      if (var6 instanceof Class1081) {
         Class1081 var7 = (Class1081)var6;
         if (var7.method5026()) {
            ItemStack var8 = this.method4644();
            if (!var8.isEmpty()) {
               var7.method5027();
               this.method3302(var8);
            }
         }
      }
   }

   public ItemStack method4644() {
      return new ItemStack(Items.field38061);
   }

   // $VF: synthetic method
   public static Random method4665(ZombieEntity var0) {
      return var0.rand;
   }
}
