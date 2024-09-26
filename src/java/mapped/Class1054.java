package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class Class1054 extends Class1049 {
   private static final DataParameter<Integer> field5820 = EntityDataManager.<Integer>createKey(Class1054.class, DataSerializers.VARINT);
   private int field5821;
   private int field5822;
   private static final Predicate<LivingEntity> field5823 = var0 -> {
      if (var0 == null) {
         return false;
      } else {
         return !(var0 instanceof PlayerEntity) || !var0.isSpectator() && !((PlayerEntity)var0).isCreative() ? var0.getCreatureAttribute() != CreatureAttribute.field33509 : false;
      }
   };

   public Class1054(EntityType<? extends Class1054> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5820, 0);
   }

   public int method4828() {
      return this.dataManager.<Integer>method35445(field5820);
   }

   public void method4829(int var1) {
      this.dataManager.method35446(field5820, var1);
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field5820.equals(var1)) {
         this.recalculateSize();
      }

      super.notifyDataManagerChange(var1);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("PuffState", this.method4828());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method4829(var1.getInt("PuffState"));
   }

   @Override
   public ItemStack getFishBucket() {
      return new ItemStack(Items.field37892);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(1, new Class2767(this));
   }

   @Override
   public void tick() {
      if (!this.world.isRemote && this.isAlive() && this.isServerWorld()) {
         if (this.field5821 <= 0) {
            if (this.method4828() != 0) {
               if (this.field5822 > 60 && this.method4828() == 2) {
                  this.playSound(SoundEvents.field26980, this.getSoundVolume(), this.getSoundPitch());
                  this.method4829(1);
               } else if (this.field5822 > 100 && this.method4828() == 1) {
                  this.playSound(SoundEvents.field26980, this.getSoundVolume(), this.getSoundPitch());
                  this.method4829(0);
               }

               this.field5822++;
            }
         } else {
            if (this.method4828() != 0) {
               if (this.field5821 > 40 && this.method4828() == 1) {
                  this.playSound(SoundEvents.field26981, this.getSoundVolume(), this.getSoundPitch());
                  this.method4829(2);
               }
            } else {
               this.playSound(SoundEvents.field26981, this.getSoundVolume(), this.getSoundPitch());
               this.method4829(1);
            }

            this.field5821++;
         }
      }

      super.tick();
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (this.isAlive() && this.method4828() > 0) {
         for (MobEntity var4 : this.world.method6772(MobEntity.class, this.getBoundingBox().method19664(0.3), field5823)) {
            if (var4.isAlive()) {
               this.method4830(var4);
            }
         }
      }
   }

   private void method4830(MobEntity var1) {
      int var4 = this.method4828();
      if (var1.attackEntityFrom(DamageSource.method31115(this), (float)(1 + var4))) {
         var1.addPotionEffect(new EffectInstance(Effects.POISON, 60 * var4, 0));
         this.playSound(SoundEvents.field26985, 1.0F, 1.0F);
      }
   }

   @Override
   public void onCollideWithPlayer(PlayerEntity var1) {
      int var4 = this.method4828();
      if (var1 instanceof ServerPlayerEntity && var4 > 0 && var1.attackEntityFrom(DamageSource.method31115(this), (float)(1 + var4))) {
         if (!this.isSilent()) {
            ((ServerPlayerEntity)var1).field4855.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24569, 0.0F));
         }

         var1.addPotionEffect(new EffectInstance(Effects.POISON, 60 * var4, 0));
      }
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26979;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26982;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26984;
   }

   @Override
   public SoundEvent getFlopSound() {
      return SoundEvents.field26983;
   }

   @Override
   public EntitySize getSize(Pose var1) {
      return super.getSize(var1).method32099(method4831(this.method4828()));
   }

   private static float method4831(int var0) {
      switch (var0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   // $VF: synthetic method
   public static Predicate method4833() {
      return field5823;
   }

   // $VF: synthetic method
   public static int method4834(Class1054 var0, int var1) {
      return var0.field5821 = var1;
   }

   // $VF: synthetic method
   public static int method4835(Class1054 var0, int var1) {
      return var0.field5822 = var1;
   }
}
