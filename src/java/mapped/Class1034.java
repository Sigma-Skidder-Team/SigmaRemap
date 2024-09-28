package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
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
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Class1034 extends Class1035 implements Class1023 {
   private static final DataParameter<Boolean> field5741 = EntityDataManager.<Boolean>createKey(Class1034.class, DataSerializers.field33398);
   private static final DataParameter<Boolean> field5742 = EntityDataManager.<Boolean>createKey(Class1034.class, DataSerializers.field33398);
   private static final DataParameter<Boolean> field5743 = EntityDataManager.<Boolean>createKey(Class1034.class, DataSerializers.field33398);
   private static final UUID field5744 = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final AttributeModifier field5745 = new AttributeModifier(field5744, "Baby speed boost", 0.2F, AttributeModifier.Operation.field13353);
   private final Class927 field5746 = new Class927(8);
   private boolean field5747 = false;
   public static final ImmutableList<Class7963<? extends Class7882<? super Class1034>>> field5748 = ImmutableList.of(
      Class7963.field34239, Class7963.field34240, Class7963.field34238, Class7963.field34242, Class7963.field34247
   );
   public static final ImmutableList<Class8830<?>> field5749 = ImmutableList.of(
      Class8830.field39825,
      Class8830.field39833,
      Class8830.field39818,
      Class8830.field39819,
      Class8830.field39822,
      Class8830.field39823,
      Class8830.field39862,
      Class8830.field39861,
      Class8830.field39847,
      Class8830.field39835,
      Class8830.field39836,
      Class8830.field39824,
      new Class8830[]{
         Class8830.field39841,
         Class8830.field39826,
         Class8830.field39827,
         Class8830.field39828,
         Class8830.field39831,
         Class8830.field39849,
         Class8830.field39850,
         Class8830.field39837,
         Class8830.field39851,
         Class8830.field39852,
         Class8830.field39854,
         Class8830.field39853,
         Class8830.field39856,
         Class8830.field39857,
         Class8830.field39855,
         Class8830.field39859,
         Class8830.field39848,
         Class8830.field39865,
         Class8830.field39830,
         Class8830.field39866,
         Class8830.field39867,
         Class8830.field39858,
         Class8830.field39860,
         Class8830.field39868,
         Class8830.field39869,
         Class8830.field39870
      }
   );

   public Class1034(EntityType<? extends Class1035> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.isChild()) {
         var1.putBoolean("IsBaby", true);
      }

      if (this.field5747) {
         var1.putBoolean("CannotHunt", true);
      }

      var1.put("Inventory", this.field5746.method3683());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method4308(var1.getBoolean("IsBaby"));
      this.method4617(var1.getBoolean("CannotHunt"));
      this.field5746.method3682(var1.method131("Inventory", 10));
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

   public static Class7037 method4614() {
      return Class1009.method4343().method21849(Attributes.field42105, 16.0).method21849(Attributes.MOVEMENT_SPEED, 0.35F).method21849(Attributes.ATTACK_DAMAGE, 5.0);
   }

   public static boolean method4615(EntityType<Class1034> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      return !var1.getBlockState(var3.down()).isIn(Blocks.field36891);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      if (var3 != Class2202.field14394) {
         if (!(var1.method6814().nextFloat() < 0.2F)) {
            if (this.method4635()) {
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
      if (this.method4635()) {
         this.method4616(EquipmentSlotType.HEAD, new ItemStack(Items.field37860));
         this.method4616(EquipmentSlotType.CHEST, new ItemStack(Items.field37861));
         this.method4616(EquipmentSlotType.LEGS, new ItemStack(Items.field37862));
         this.method4616(EquipmentSlotType.FEET, new ItemStack(Items.field37863));
      }
   }

   private void method4616(EquipmentSlotType var1, ItemStack var2) {
      if (this.world.rand.nextFloat() < 0.1F) {
         this.setItemStackToSlot(var1, var2);
      }
   }

   @Override
   public Class6971<Class1034> getBrainCodec() {
      return Brain.<Class1034>method21400(field5749, field5748);
   }

   @Override
   public Brain<?> createBrain(Dynamic<?> var1) {
      return Class4388.method13798(this, this.getBrainCodec().method21513(var1));
   }

   @Override
   public Brain<Class1034> getBrain() {
      return (Brain<Class1034>)super.getBrain();
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ActionResultType var5 = super.method4285(var1, var2);
      if (!var5.isSuccessOrConsume()) {
         if (!this.world.isRemote) {
            return Class4388.method13833(this, var1, var2);
         } else {
            boolean var6 = Class4388.method13834(this, var1.getHeldItem(var2)) && this.method4622() != Class2172.field14262;
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
      this.getDataManager().method35446(field5741, var1);
      if (!this.world.isRemote) {
         ModifiableAttributeInstance var4 = this.getAttribute(Attributes.MOVEMENT_SPEED);
         var4.method38670(field5745);
         if (var1) {
            var4.method38667(field5745);
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
   public int getExperiencePoints(PlayerEntity var1) {
      return this.field5594;
   }

   @Override
   public void method4619(ServerWorld var1) {
      Class4388.method13818(this);
      this.field5746.method3674().forEach(this::method3302);
      super.method4619(var1);
   }

   private ItemStack method4620() {
      return !((double)this.rand.nextFloat() < 0.5) ? new ItemStack(Items.field37815) : new ItemStack(Items.CROSSBOW);
   }

   private boolean method4621() {
      return this.dataManager.<Boolean>method35445(field5742);
   }

   @Override
   public void method4535(boolean var1) {
      this.dataManager.method35446(field5742, var1);
   }

   @Override
   public void method4537() {
      this.field4973 = 0;
   }

   @Override
   public Class2172 method4622() {
      if (!this.method4623()) {
         if (Class4388.method13827(this.getHeldItemOffhand().getItem())) {
            return Class2172.field14262;
         } else if (this.method4307() && this.method4636()) {
            return Class2172.field14259;
         } else if (this.method4621()) {
            return Class2172.field14261;
         } else {
            return this.method4307() && this.method3092(Items.CROSSBOW) ? Class2172.field14260 : Class2172.field14264;
         }
      } else {
         return Class2172.field14263;
      }
   }

   public boolean method4623() {
      return this.dataManager.<Boolean>method35445(field5743);
   }

   public void method4624(boolean var1) {
      this.dataManager.method35446(field5743, var1);
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      boolean var5 = super.attackEntityFrom(var1, var2);
      if (!this.world.isRemote) {
         if (var5 && var1.getTrueSource() instanceof LivingEntity) {
            Class4388.method13835(this, (LivingEntity)var1.getTrueSource());
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
      return this.world.getGameRules().getBoolean(Class5462.field24224) && this.method4280() && Class4388.method13826(this, var1);
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
            return this.method4635() && var1.getItem() != Items.CROSSBOW && var2.getItem() == Items.CROSSBOW
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
      if (this.isChild() && var1.getType() == EntityType.field41037) {
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
   public void method4630() {
      this.method4629(SoundEvents.field26938);
   }
}
