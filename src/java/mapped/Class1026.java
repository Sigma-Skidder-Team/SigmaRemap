package mapped;

import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.raid.Raid;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Predicate;

public abstract class Class1026 extends PillagerEntity {
   public static final DataParameter<Boolean> field5712 = EntityDataManager.<Boolean>createKey(Class1026.class, DataSerializers.field33398);
   private static final Predicate<ItemEntity> field5713 = var0 -> !var0.method4135()
         && var0.isAlive()
         && ItemStack.areItemStacksEqual(var0.method4124(), Raid.method25421());
   public Raid field5714;
   private int field5715;
   private boolean field5716;
   private int field5717;

   public Class1026(EntityType<? extends Class1026> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(1, new Class2671<Class1026>(this, this));
      this.field5600.addGoal(3, new Class2730<Class1026>(this));
      this.field5600.addGoal(4, new Class2610(this, 1.05F, 1));
      this.field5600.addGoal(5, new Class2728(this, this));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5712, false);
   }

   public abstract void method4545(int var1, boolean var2);

   public boolean method4547() {
      return this.field5716;
   }

   public void method4548(boolean var1) {
      this.field5716 = var1;
   }

   @Override
   public void livingTick() {
      if (this.world instanceof ServerWorld && this.isAlive()) {
         Raid var3 = this.method4551();
         if (this.method4547()) {
            if (var3 != null) {
               LivingEntity var4 = this.method4232();
               if (var4 != null && (var4.getType() == EntityType.PLAYER || var4.getType() == EntityType.IRON_GOLEM)) {
                  this.idleTime = 0;
               }
            } else if (this.world.getGameTime() % 20L == 0L) {
               Raid var5 = ((ServerWorld)this.world).method6957(this.getPosition());
               if (var5 != null && Class7531.method24612(this, var5)) {
                  var5.method25414(var5.method25396(), this, (BlockPos)null, true);
               }
            }
         }
      }

      super.livingTick();
   }

   @Override
   public void method4338() {
      this.idleTime += 2;
   }

   @Override
   public void onDeath(DamageSource var1) {
      if (this.world instanceof ServerWorld) {
         Entity var4 = var1.getTrueSource();
         Raid var5 = this.method4551();
         if (var5 != null) {
            if (this.method4577()) {
               var5.method25427(this.method4554());
            }

            if (var4 != null && var4.getType() == EntityType.PLAYER) {
               var5.method25437(var4);
            }

            var5.method25419(this, false);
         }

         if (this.method4577() && var5 == null && ((ServerWorld)this.world).method6957(this.getPosition()) == null) {
            ItemStack var6 = this.getItemStackFromSlot(EquipmentSlotType.HEAD);
            PlayerEntity var7 = null;
            if (!(var4 instanceof PlayerEntity)) {
               if (var4 instanceof WolfEntity) {
                  WolfEntity var8 = (WolfEntity)var4;
                  LivingEntity var9 = var8.method4400();
                  if (var8.method4393() && var9 instanceof PlayerEntity) {
                     var7 = (PlayerEntity)var9;
                  }
               }
            } else {
               var7 = (PlayerEntity)var4;
            }

            if (!var6.isEmpty() && ItemStack.areItemStacksEqual(var6, Raid.method25421()) && var7 != null) {
               EffectInstance var11 = var7.getActivePotionEffect(Effects.BAD_OMEN);
               int var12 = 1;
               if (var11 == null) {
                  var12--;
               } else {
                  var12 += var11.getAmplifier();
                  var7.removeActivePotionEffect(Effects.BAD_OMEN);
               }

               var12 = MathHelper.clamp(var12, 0, 4);
               EffectInstance var10 = new EffectInstance(Effects.BAD_OMEN, 120000, var12, false, false, true);
               if (!this.world.getGameRules().getBoolean(GameRules.field24246)) {
                  var7.addPotionEffect(var10);
               }
            }
         }
      }

      super.onDeath(var1);
   }

   @Override
   public boolean method4549() {
      return !this.method4552();
   }

   public void method4550(Raid var1) {
      this.field5714 = var1;
   }

   @Nullable
   public Raid method4551() {
      return this.field5714;
   }

   public boolean method4552() {
      return this.method4551() != null && this.method4551().method25433();
   }

   public void method4553(int var1) {
      this.field5715 = var1;
   }

   public int method4554() {
      return this.field5715;
   }

   public boolean method4555() {
      return this.dataManager.<Boolean>method35445(field5712);
   }

   public void method4556(boolean var1) {
      this.dataManager.method35446(field5712, var1);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Wave", this.field5715);
      var1.putBoolean("CanJoinRaid", this.field5716);
      if (this.field5714 != null) {
         var1.putInt("RaidId", this.field5714.method25430());
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field5715 = var1.getInt("Wave");
      this.field5716 = var1.getBoolean("CanJoinRaid");
      if (var1.contains("RaidId", 3)) {
         if (this.world instanceof ServerWorld) {
            this.field5714 = ((ServerWorld)this.world).method6956().method24610(var1.getInt("RaidId"));
         }

         if (this.field5714 != null) {
            this.field5714.method25425(this.field5715, this, false);
            if (this.method4577()) {
               this.field5714.method25426(this.field5715, this);
            }
         }
      }
   }

   @Override
   public void method4246(ItemEntity var1) {
      ItemStack var4 = var1.method4124();
      boolean var5 = this.method4552() && this.method4551().method25422(this.method4554()) != null;
      if (this.method4552() && !var5 && ItemStack.areItemStacksEqual(var4, Raid.method25421())) {
         EquipmentSlotType var6 = EquipmentSlotType.HEAD;
         ItemStack var7 = this.getItemStackFromSlot(var6);
         double var8 = (double)this.method4269(var6);
         if (!var7.isEmpty() && (double)Math.max(this.rand.nextFloat() - 0.1F, 0.0F) < var8) {
            this.method3302(var7);
         }

         this.triggerItemPickupTrigger(var1);
         this.setItemStackToSlot(var6, var4);
         this.onItemPickup(var1, var4.getCount());
         var1.remove();
         this.method4551().method25426(this.method4554(), this);
         this.method4576(true);
      } else {
         super.method4246(var1);
      }
   }

   @Override
   public boolean method4254(double var1) {
      return this.method4551() != null ? false : super.method4254(var1);
   }

   @Override
   public boolean method4255() {
      return super.method4255() || this.method4551() != null;
   }

   public int method4557() {
      return this.field5717;
   }

   public void method4558(int var1) {
      this.field5717 = var1;
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (this.method4552()) {
         this.method4551().method25415();
      }

      return super.attackEntityFrom(source, var2);
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      this.method4548(this.getType() != EntityType.WITCH || var3 != SpawnReason.field14391);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   public abstract SoundEvent method4546();

   // $VF: synthetic method
   public static Random method4560(Class1026 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static float method4561(Class1026 var0) {
      return var0.getSoundVolume();
   }

   // $VF: synthetic method
   public static float method4562(Class1026 var0) {
      return var0.getSoundPitch();
   }

   // $VF: synthetic method
   public static Random method4563(Class1026 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4564(Class1026 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4565(Class1026 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Predicate method4566() {
      return field5713;
   }
}
