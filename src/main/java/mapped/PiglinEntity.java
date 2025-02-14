package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class PiglinEntity extends AbstractPiglinEntity implements ICrossbowUser {
   private static final DataParameter<Boolean> field5741 = EntityDataManager.<Boolean>createKey(PiglinEntity.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> field5742 = EntityDataManager.<Boolean>createKey(PiglinEntity.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> field5743 = EntityDataManager.<Boolean>createKey(PiglinEntity.class, DataSerializers.BOOLEAN);
   private static final UUID field5744 = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final AttributeModifier field5745 = new AttributeModifier(field5744, "Baby speed boost", 0.2F, AttributeModifier.Operation.field13353);
   private final Class927 field5746 = new Class927(8);
   private boolean field5747 = false;
   public static final ImmutableList<SensorType<? extends Sensor<? super PiglinEntity>>> field5748 = ImmutableList.of(
      SensorType.field34239, SensorType.field34240, SensorType.field34238, SensorType.field34242, SensorType.field34247
   );
   public static final ImmutableList<MemoryModuleType<?>> field5749 = ImmutableList.of(
      MemoryModuleType.field39825,
      MemoryModuleType.field39833,
      MemoryModuleType.field39818,
      MemoryModuleType.field39819,
      MemoryModuleType.field39822,
      MemoryModuleType.field39823,
      MemoryModuleType.field39862,
      MemoryModuleType.field39861,
      MemoryModuleType.field39847,
      MemoryModuleType.field39835,
      MemoryModuleType.field39836,
      MemoryModuleType.field39824,
      new MemoryModuleType[]{
         MemoryModuleType.field39841,
         MemoryModuleType.ATTACK_TARGET,
         MemoryModuleType.field39827,
         MemoryModuleType.field39828,
         MemoryModuleType.field39831,
         MemoryModuleType.field39849,
         MemoryModuleType.field39850,
         MemoryModuleType.field39837,
         MemoryModuleType.field39851,
         MemoryModuleType.field39852,
         MemoryModuleType.field39854,
         MemoryModuleType.field39853,
         MemoryModuleType.field39856,
         MemoryModuleType.field39857,
         MemoryModuleType.field39855,
         MemoryModuleType.field39859,
         MemoryModuleType.field39848,
         MemoryModuleType.field39865,
         MemoryModuleType.field39830,
         MemoryModuleType.field39866,
         MemoryModuleType.field39867,
         MemoryModuleType.field39858,
         MemoryModuleType.field39860,
         MemoryModuleType.field39868,
         MemoryModuleType.field39869,
         MemoryModuleType.field39870
      }
   );

   public PiglinEntity(EntityType<? extends AbstractPiglinEntity> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      if (this.isChild()) {
         compound.putBoolean("IsBaby", true);
      }

      if (this.field5747) {
         compound.putBoolean("CannotHunt", true);
      }

      compound.put("Inventory", this.field5746.method3683());
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.method4308(compound.getBoolean("IsBaby"));
      this.method4617(compound.getBoolean("CannotHunt"));
      this.field5746.method3682(compound.getList("Inventory", 10));
   }

   @Override
   public void dropSpecialItems(DamageSource var1, int var2, boolean var3) {
      super.dropSpecialItems(var1, var2, var3);
      this.field5746.method3674().forEach(this::method3302);
   }

   public ItemStack method4612(ItemStack var1) {
      return this.field5746.method3676(var1);
   }

   public boolean method4613(ItemStack var1) {
      return this.field5746.method3677(var1);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5741, false);
      this.dataManager.register(field5742, false);
      this.dataManager.register(field5743, false);
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      super.notifyDataManagerChange(var1);
      if (field5741.equals(var1)) {
         this.recalculateSize();
      }
   }

   public static MutableAttribute method4614() {
      return MonsterEntity.method4343().method21849(Attributes.MAX_HEALTH, 16.0).method21849(Attributes.MOVEMENT_SPEED, 0.35F).method21849(Attributes.ATTACK_DAMAGE, 5.0);
   }

   public static boolean method4615(EntityType<PiglinEntity> var0, IWorld var1, SpawnReason var2, BlockPos var3, Random var4) {
      return !var1.getBlockState(var3.down()).isIn(Blocks.NETHER_WART_BLOCK);
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      if (var3 != SpawnReason.field14394) {
         if (!(var1.method6814().nextFloat() < 0.2F)) {
            if (this.func_242337_eM()) {
               this.setItemStackToSlot(EquipmentSlotType.MAINHAND, this.method4620());
            }
         } else {
            this.method4308(true);
         }
      }

      Class4388.method13799(this);
      this.method4270(var2);
      this.method4273(var2);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method4256() {
      return false;
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method4282();
   }

   @Override
   public void method4270(Class9755 var1) {
      if (this.func_242337_eM()) {
         this.method4616(EquipmentSlotType.HEAD, new ItemStack(Items.field37860));
         this.method4616(EquipmentSlotType.CHEST, new ItemStack(Items.field37861));
         this.method4616(EquipmentSlotType.LEGS, new ItemStack(Items.GOLDEN_LEGGINGS));
         this.method4616(EquipmentSlotType.FEET, new ItemStack(Items.field37863));
      }
   }

   private void method4616(EquipmentSlotType var1, ItemStack var2) {
      if (this.world.rand.nextFloat() < 0.1F) {
         this.setItemStackToSlot(var1, var2);
      }
   }

   @Override
   public Class6971<PiglinEntity> getBrainCodec() {
      return Brain.<PiglinEntity>createCodec(field5749, field5748);
   }

   @Override
   public Brain<?> createBrain(Dynamic<?> var1) {
      return Class4388.method13798(this, this.getBrainCodec().deserialize(var1));
   }

   @Override
   public Brain<PiglinEntity> getBrain() {
      return (Brain<PiglinEntity>)super.getBrain();
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ActionResultType var5 = super.method4285(var1, var2);
      if (!var5.isSuccessOrConsume()) {
         if (!this.world.isRemote) {
            return Class4388.method13833(this, var1, var2);
         } else {
            boolean var6 = Class4388.method13834(this, var1.getHeldItem(var2)) && this.func_234424_eM_() != PiglinAction.field14262;
            return !var6 ? ActionResultType.field14820 : ActionResultType.SUCCESS;
         }
      } else {
         return var5;
      }
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return !this.isChild() ? 1.74F : 0.93F;
   }

   @Override
   public double method3310() {
      return (double)this.getHeight() * 0.92;
   }

   @Override
   public void method4308(boolean var1) {
      this.getDataManager().set(field5741, var1);
      if (!this.world.isRemote) {
         ModifiableAttributeInstance var4 = this.getAttribute(Attributes.MOVEMENT_SPEED);
         var4.removeModifier(field5745);
         if (var1) {
            var4.applyNonPersistentModifier(field5745);
         }
      }
   }

   @Override
   public boolean isChild() {
      return this.getDataManager().<Boolean>method35445(field5741);
   }

   private void method4617(boolean var1) {
      this.field5747 = var1;
   }

   @Override
   public boolean method4618() {
      return !this.field5747;
   }

   @Override
   public void updateAITasks() {
      this.world.getProfiler().startSection("piglinBrain");
      this.getBrain().method21432((ServerWorld)this.world, this);
      this.world.getProfiler().endSection();
      Class4388.method13812(this);
      super.updateAITasks();
   }

   @Override
   public int getExperiencePoints(PlayerEntity player) {
      return this.field5594;
   }

   @Override
   public void method4619(ServerWorld var1) {
      Class4388.method13818(this);
      this.field5746.method3674().forEach(this::method3302);
      super.method4619(var1);
   }

   private ItemStack method4620() {
      return !((double)this.rand.nextFloat() < 0.5) ? new ItemStack(Items.GOLDEN_SWORD) : new ItemStack(Items.CROSSBOW);
   }

   private boolean method4621() {
      return this.dataManager.<Boolean>method35445(field5742);
   }

   @Override
   public void method4535(boolean var1) {
      this.dataManager.set(field5742, var1);
   }

   @Override
   public void method4537() {
      this.idleTime = 0;
   }

   @Override
   public PiglinAction func_234424_eM_() {
      if (!this.method4623()) {
         if (Class4388.method13827(this.getHeldItemOffhand().getItem())) {
            return PiglinAction.field14262;
         } else if (this.method4307() && this.func_242338_eO()) {
            return PiglinAction.field14259;
         } else if (this.method4621()) {
            return PiglinAction.field14261;
         } else {
            return this.method4307() && this.method3092(Items.CROSSBOW) ? PiglinAction.field14260 : PiglinAction.field14264;
         }
      } else {
         return PiglinAction.field14263;
      }
   }

   public boolean method4623() {
      return this.dataManager.<Boolean>method35445(field5743);
   }

   public void method4624(boolean var1) {
      this.dataManager.set(field5743, var1);
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      boolean var5 = super.attackEntityFrom(source, var2);
      if (!this.world.isRemote) {
         if (var5 && source.getTrueSource() instanceof LivingEntity) {
            Class4388.method13835(this, (LivingEntity) source.getTrueSource());
         }

         return var5;
      } else {
         return false;
      }
   }

   @Override
   public void method4530(LivingEntity var1, float var2) {
      this.method4538(this, 1.6F);
   }

   @Override
   public void method4536(LivingEntity var1, ItemStack var2, ProjectileEntity var3, float var4) {
      this.method4539(this, var1, var3, var4, 1.6F);
   }

   @Override
   public boolean method4234(Class3262 var1) {
      return var1 == Items.CROSSBOW;
   }

   public void method4625(ItemStack var1) {
      this.method4248(EquipmentSlotType.MAINHAND, var1);
   }

   public void method4626(ItemStack var1) {
      if (var1.getItem() != Class4388.field21458) {
         this.method4248(EquipmentSlotType.OFFHAND, var1);
      } else {
         this.setItemStackToSlot(EquipmentSlotType.OFFHAND, var1);
         this.method4249(EquipmentSlotType.OFFHAND);
      }
   }

   @Override
   public boolean method4253(ItemStack var1) {
      return this.world.getGameRules().getBoolean(GameRules.field24224) && this.method4280() && Class4388.method13826(this, var1);
   }

   public boolean method4627(ItemStack var1) {
      EquipmentSlotType var4 = MobEntity.method4271(var1);
      ItemStack var5 = this.getItemStackFromSlot(var4);
      return this.method4250(var1, var5);
   }

   @Override
   public boolean method4250(ItemStack var1, ItemStack var2) {
      if (EnchantmentHelper.method26334(var2)) {
         return false;
      } else {
         boolean var5 = Class4388.method13827(var1.getItem()) || var1.getItem() == Items.CROSSBOW;
         boolean var6 = Class4388.method13827(var2.getItem()) || var2.getItem() == Items.CROSSBOW;
         if (var5 && !var6) {
            return true;
         } else if (!var5 && var6) {
            return false;
         } else {
            return this.func_242337_eM() && var1.getItem() != Items.CROSSBOW && var2.getItem() == Items.CROSSBOW
               ? false
               : super.method4250(var1, var2);
         }
      }
   }

   @Override
   public void method4246(ItemEntity var1) {
      this.triggerItemPickupTrigger(var1);
      Class4388.method13814(this, var1);
   }

   @Override
   public boolean startRiding(Entity var1, boolean var2) {
      if (this.isChild() && var1.getType() == EntityType.HOGLIN) {
         var1 = this.method4628(var1, 3);
      }

      return super.startRiding(var1, var2);
   }

   private Entity method4628(Entity var1, int var2) {
      List var5 = var1.getPassengers();
      return var2 != 1 && !var5.isEmpty() ? this.method4628((Entity)var5.get(0), var2 - 1) : var1;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return !this.world.isRemote ? Class4388.method13837(this).orElse((SoundEvent)null) : null;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26935;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26933;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26937, 0.15F, 1.0F);
   }

   public void method4629(SoundEvent var1) {
      this.playSound(var1, this.getSoundVolume(), this.getSoundPitch());
   }

   @Override
   public void func_241848_eP() {
      this.method4629(SoundEvents.field26938);
   }
}
