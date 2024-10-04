package mapped;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.UUID;

public class Class1040 extends ZombieEntity implements Class1041 {
   private static final DataParameter<Boolean> field5769 = EntityDataManager.<Boolean>createKey(Class1040.class, DataSerializers.field33398);
   private static final DataParameter<Class7921> field5770 = EntityDataManager.<Class7921>createKey(Class1040.class, DataSerializers.field33406);
   private int field5771;
   private UUID field5772;
   private INBT field5773;
   private CompoundNBT field5774;
   private int field5775;

   public Class1040(EntityType<? extends Class1040> var1, World var2) {
      super(var1, var2);
      this.method4673(this.method4674().method26574(Registry.field16090.method9254(this.rand)));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5769, false);
      this.dataManager.register(field5770, new Class7921(Class9564.field44542, Class8395.field36011, 1));
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      Class7921.field33913
         .encodeStart(NBTDynamicOps.INSTANCE, this.method4674())
         .resultOrPartial(LOGGER::error)
         .ifPresent(var1x -> var1.put("VillagerData", var1x));
      if (this.field5774 != null) {
         var1.put("Offers", this.field5774);
      }

      if (this.field5773 != null) {
         var1.put("Gossips", this.field5773);
      }

      var1.putInt("ConversionTime", !this.method4667() ? -1 : this.field5771);
      if (this.field5772 != null) {
         var1.method104("ConversionPlayer", this.field5772);
      }

      var1.putInt("Xp", this.field5775);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("VillagerData", 10)) {
         DataResult<Class7921> var4 = Class7921.field33913.parse(new Dynamic<>(NBTDynamicOps.INSTANCE, var1.method116("VillagerData")));
         var4.resultOrPartial(LOGGER::error).ifPresent(this::method4673);
      }

      if (var1.contains("Offers", 10)) {
         this.field5774 = var1.getCompound("Offers");
      }

      if (var1.contains("Gossips", 10)) {
         this.field5773 = var1.method131("Gossips", 10);
      }

      if (var1.contains("ConversionTime", 99) && var1.getInt("ConversionTime") > -1) {
         this.method4668(!var1.method106("ConversionPlayer") ? null : var1.method105("ConversionPlayer"), var1.getInt("ConversionTime"));
      }

      if (var1.contains("Xp", 3)) {
         this.field5775 = var1.getInt("Xp");
      }
   }

   @Override
   public void tick() {
      if (!this.world.isRemote && this.isAlive() && this.method4667()) {
         int var3 = this.method4670();
         this.field5771 -= var3;
         if (this.field5771 <= 0) {
            this.method4669((ServerWorld)this.world);
         }
      }

      super.tick();
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() != Items.GOLDEN_APPLE) {
         return super.method4285(var1, var2);
      } else if (!this.isPotionActive(Effects.WEAKNESS)) {
         return ActionResultType.field14819;
      } else {
         if (!var1.abilities.isCreativeMode) {
            var5.shrink(1);
         }

         if (!this.world.isRemote) {
            this.method4668(var1.getUniqueID(), this.rand.nextInt(2401) + 3600);
         }

         return ActionResultType.SUCCESS;
      }
   }

   @Override
   public boolean shouldDrown() {
      return false;
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method4667() && this.field5775 == 0;
   }

   public boolean method4667() {
      return this.getDataManager().<Boolean>method35445(field5769);
   }

   private void method4668(UUID var1, int var2) {
      this.field5772 = var1;
      this.field5771 = var2;
      this.getDataManager().method35446(field5769, true);
      this.removeEffects(Effects.WEAKNESS);
      this.addPotionEffect(new EffectInstance(Effects.STRENGTH, var2, Math.min(this.world.method6997().getId() - 1, 0)));
      this.world.setEntityState(this, (byte)16);
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 16) {
         super.handleStatusUpdate(var1);
      } else if (!this.isSilent()) {
         this.world
            .method6745(
               this.getPosX(),
               this.getPosYEye(),
               this.getPosZ(),
               SoundEvents.field27301,
               this.getSoundCategory(),
               1.0F + this.rand.nextFloat(),
               this.rand.nextFloat() * 0.7F + 0.3F,
               false
            );
      }
   }

   private void method4669(ServerWorld var1) {
      Class1042 var4 = this.<Class1042>method4292(EntityType.field41098, false);

      for (EquipmentSlotType var8 : EquipmentSlotType.values()) {
         ItemStack var9 = this.getItemStackFromSlot(var8);
         if (!var9.isEmpty()) {
            if (!EnchantmentHelper.method26334(var9)) {
               double var10 = (double)this.method4269(var8);
               if (var10 > 1.0) {
                  this.method3302(var9);
               }
            } else {
               var4.method2963(var8.getIndex() + 300, var9);
            }
         }
      }

      var4.method4695(this.method4674());
      if (this.field5773 != null) {
         var4.method4725(this.field5773);
      }

      if (this.field5774 != null) {
         var4.method4706(new Class46(this.field5774));
      }

      var4.method4722(this.field5775);
      var4.method4276(var1, var1.method6807(var4.getPosition()), Class2202.field14399, (Class5093)null, (CompoundNBT)null);
      if (this.field5772 != null) {
         PlayerEntity var12 = var1.method7196(this.field5772);
         if (var12 instanceof ServerPlayerEntity) {
            CriteriaTriggers.field44482.method15121((ServerPlayerEntity)var12, this, var4);
            var1.method6959(Class8214.field35285, var12, var4);
         }
      }

      var4.addPotionEffect(new EffectInstance(Effects.NAUSEA, 200, 0));
      if (!this.isSilent()) {
         var1.method6869((PlayerEntity)null, 1027, this.getPosition(), 0);
      }
   }

   private int method4670() {
      int var3 = 1;
      if (this.rand.nextFloat() < 0.01F) {
         int var4 = 0;
         BlockPos.Mutable var5 = new BlockPos.Mutable();

         for (int var6 = (int)this.getPosX() - 4; var6 < (int)this.getPosX() + 4 && var4 < 14; var6++) {
            for (int var7 = (int)this.getPosY() - 4; var7 < (int)this.getPosY() + 4 && var4 < 14; var7++) {
               for (int var8 = (int)this.getPosZ() - 4; var8 < (int)this.getPosZ() + 4 && var4 < 14; var8++) {
                  Block var9 = this.world.getBlockState(var5.setPos(var6, var7, var8)).getBlock();
                  if (var9 == Blocks.IRON_BARS || var9 instanceof Class3250) {
                     if (this.rand.nextFloat() < 0.3F) {
                        var3++;
                     }

                     var4++;
                  }
               }
            }
         }
      }

      return var3;
   }

   @Override
   public float getSoundPitch() {
      return !this.isChild()
         ? (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F
         : (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 2.0F;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27299;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27303;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27302;
   }

   @Override
   public SoundEvent method4643() {
      return SoundEvents.field27304;
   }

   @Override
   public ItemStack method4644() {
      return ItemStack.EMPTY;
   }

   public void method4671(CompoundNBT var1) {
      this.field5774 = var1;
   }

   public void method4672(INBT var1) {
      this.field5773 = var1;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      this.method4673(this.method4674().method26573(Class9564.method37068(var1.method7178(this.getPosition()))));
      return super.method4276(var1, var2, var3, var4, var5);
   }

   public void method4673(Class7921 var1) {
      Class7921 var4 = this.method4674();
      if (var4.method26571() != var1.method26571()) {
         this.field5774 = null;
      }

      this.dataManager.method35446(field5770, var1);
   }

   @Override
   public Class7921 method4674() {
      return this.dataManager.<Class7921>method35445(field5770);
   }

   public void method4675(int var1) {
      this.field5775 = var1;
   }
}
