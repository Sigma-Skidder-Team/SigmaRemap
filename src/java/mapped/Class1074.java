package mapped;

import net.minecraft.inventory.IInventory;
import net.minecraft.util.Util;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.UUID;

public class Class1074 extends AbstractHorseEntity {
   private static final UUID field5916 = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final DataParameter<Integer> field5917 = EntityDataManager.<Integer>createKey(Class1074.class, DataSerializers.VARINT);

   public Class1074(EntityType<? extends Class1074> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4925() {
      this.getAttribute(Attributes.MAX_HEALTH).method38661((double)this.method4971());
      this.getAttribute(Attributes.MOVEMENT_SPEED).method38661(this.method4973());
      this.getAttribute(Attributes.HORSE_JUMP_STRENGTH).method38661(this.method4972());
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5917, 0);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Variant", this.method4993());
      if (!this.field5890.getStackInSlot(1).isEmpty()) {
         var1.put("ArmorItem", this.field5890.getStackInSlot(1).method32112(new CompoundNBT()));
      }
   }

   public ItemStack method4990() {
      return this.getItemStackFromSlot(EquipmentSlotType.CHEST);
   }

   private void method4991(ItemStack var1) {
      this.setItemStackToSlot(EquipmentSlotType.CHEST, var1);
      this.method4279(EquipmentSlotType.CHEST, 0.0F);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method4992(var1.getInt("Variant"));
      if (var1.contains("ArmorItem", 10)) {
         ItemStack var4 = ItemStack.read(var1.getCompound("ArmorItem"));
         if (!var4.isEmpty() && this.method4900(var4)) {
            this.field5890.setInventorySlotContents(1, var4);
         }
      }

      this.method4903();
   }

   private void method4992(int var1) {
      this.dataManager.method35446(field5917, var1);
   }

   private int method4993() {
      return this.dataManager.<Integer>method35445(field5917);
   }

   private void method4994(Class2190 var1, Class2102 var2) {
      this.method4992(var1.method8899() & 0xFF | var2.method8766() << 8 & 0xFF00);
   }

   public Class2190 method4995() {
      return Class2190.method8900(this.method4993() & 0xFF);
   }

   public Class2102 method4996() {
      return Class2102.method8767((this.method4993() & 0xFF00) >> 8);
   }

   @Override
   public void method4903() {
      if (!this.world.isRemote) {
         super.method4903();
         this.method4997(this.field5890.getStackInSlot(1));
         this.method4279(EquipmentSlotType.CHEST, 0.0F);
      }
   }

   private void method4997(ItemStack var1) {
      this.method4991(var1);
      if (!this.world.isRemote) {
         this.getAttribute(Attributes.ARMOR).method38671(field5916);
         if (this.method4900(var1)) {
            int var4 = ((Class3275)var1.getItem()).method11798();
            if (var4 != 0) {
               this.getAttribute(Attributes.ARMOR).applyNonPersistentModifier(new AttributeModifier(field5916, "Horse armor bonus", (double)var4, AttributeModifier.Operation.ADDITION));
            }
         }
      }
   }

   @Override
   public void method4902(IInventory var1) {
      ItemStack var4 = this.method4990();
      super.method4902(var1);
      ItemStack var5 = this.method4990();
      if (this.ticksExisted > 20 && this.method4900(var5) && var4 != var5) {
         this.playSound(SoundEvents.field26669, 0.5F, 1.0F);
      }
   }

   @Override
   public void method4950(SoundType var1) {
      super.method4950(var1);
      if (this.rand.nextInt(10) == 0) {
         this.playSound(SoundEvents.field26670, var1.getVolume() * 0.6F, var1.getPitch());
      }
   }

   @Override
   public SoundEvent getAmbientSound() {
      super.getAmbientSound();
      return SoundEvents.field26667;
   }

   @Override
   public SoundEvent getDeathSound() {
      super.getDeathSound();
      return SoundEvents.field26671;
   }

   @Nullable
   @Override
   public SoundEvent method4894() {
      return SoundEvents.field26672;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      super.getHurtSound(var1);
      return SoundEvents.field26674;
   }

   @Override
   public SoundEvent method4893() {
      super.method4893();
      return SoundEvents.field26668;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (!this.isChild()) {
         if (this.method4932() && var1.method2851()) {
            this.openGUI(var1);
            return ActionResultType.method9002(this.world.isRemote);
         }

         if (this.isBeingRidden()) {
            return super.method4285(var1, var2);
         }
      }

      if (!var5.isEmpty()) {
         if (this.method4381(var5)) {
            return this.method4953(var1, var5);
         }

         ActionResultType var6 = var5.method32125(var1, this, var2);
         if (var6.isSuccessOrConsume()) {
            return var6;
         }

         if (!this.method4932()) {
            this.method4896();
            return ActionResultType.method9002(this.world.isRemote);
         }

         boolean var7 = !this.isChild() && !this.method4943() && var5.getItem() == Items.field37886;
         if (this.method4900(var5) || var7) {
            this.openGUI(var1);
            return ActionResultType.method9002(this.world.isRemote);
         }
      }

      if (!this.isChild()) {
         this.method4920(var1);
         return ActionResultType.method9002(this.world.isRemote);
      } else {
         return super.method4285(var1, var2);
      }
   }

   @Override
   public boolean method4386(AnimalEntity var1) {
      if (var1 != this) {
         return !(var1 instanceof Class1067) && !(var1 instanceof Class1074) ? false : this.method4961() && ((AbstractHorseEntity)var1).method4961();
      } else {
         return false;
      }
   }

   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      AbstractHorseEntity var6;
      if (!(var2 instanceof Class1067)) {
         Class1074 var5 = (Class1074)var2;
         var6 = EntityType.HORSE.create(var1);
         int var7 = this.rand.nextInt(9);
         Class2190 var8;
         if (var7 >= 4) {
            if (var7 >= 8) {
               var8 = Util.<Class2190>getRandomObject(Class2190.values(), this.rand);
            } else {
               var8 = var5.method4995();
            }
         } else {
            var8 = this.method4995();
         }

         int var9 = this.rand.nextInt(5);
         Class2102 var10;
         if (var9 >= 2) {
            if (var9 >= 4) {
               var10 = Util.<Class2102>getRandomObject(Class2102.values(), this.rand);
            } else {
               var10 = var5.method4996();
            }
         } else {
            var10 = this.method4996();
         }

         ((Class1074)var6).method4994(var8, var10);
      } else {
         var6 = EntityType.MULE.create(var1);
      }

      this.method4962(var2, var6);
      return var6;
   }

   @Override
   public boolean method4898() {
      return true;
   }

   @Override
   public boolean method4900(ItemStack var1) {
      return var1.getItem() instanceof Class3275;
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      Class2190 var8;
      if (!(var4 instanceof Class5098)) {
         var8 = Util.<Class2190>getRandomObject(Class2190.values(), this.rand);
         var4 = new Class5098(var8);
      } else {
         var8 = ((Class5098)var4).field23195;
      }

      this.method4994(var8, Util.<Class2102>getRandomObject(Class2102.values(), this.rand));
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }
}
