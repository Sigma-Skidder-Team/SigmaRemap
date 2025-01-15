package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class Class1076 extends AbstractHorseEntity {
   private final Class2669 field5919 = new Class2669(this);
   private boolean field5920;
   private int field5921;

   public Class1076(EntityType<? extends Class1076> var1, World var2) {
      super(var1, var2);
   }

   public static MutableAttribute method4999() {
      return method4951().method21849(Attributes.MAX_HEALTH, 15.0).method21849(Attributes.MOVEMENT_SPEED, 0.2F);
   }

   @Override
   public void method4925() {
      this.getAttribute(Attributes.HORSE_JUMP_STRENGTH).method38661(this.method4972());
   }

   @Override
   public void method4929() {
   }

   @Override
   public SoundEvent getAmbientSound() {
      super.getAmbientSound();
      return !this.areEyesInFluid(FluidTags.field40469) ? SoundEvents.field27061 : SoundEvents.field27065;
   }

   @Override
   public SoundEvent getDeathSound() {
      super.getDeathSound();
      return SoundEvents.field27062;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      super.getHurtSound(var1);
      return SoundEvents.field27063;
   }

   @Override
   public SoundEvent method2859() {
      if (this.onGround) {
         if (!this.isBeingRidden()) {
            return SoundEvents.field27068;
         }

         this.field5901++;
         if (this.field5901 > 5 && this.field5901 % 3 == 0) {
            return SoundEvents.field27066;
         }

         if (this.field5901 <= 5) {
            return SoundEvents.field27068;
         }
      }

      return SoundEvents.field27064;
   }

   @Override
   public void playSwimSound(float var1) {
      if (!this.onGround) {
         super.playSwimSound(Math.min(0.1F, var1 * 25.0F));
      } else {
         super.playSwimSound(0.3F);
      }
   }

   @Override
   public void method4960() {
      if (!this.isInWater()) {
         super.method4960();
      } else {
         this.playSound(SoundEvents.field27067, 0.4F, 1.0F);
      }
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33506;
   }

   @Override
   public double method3310() {
      return super.method3310() - 0.1875;
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (this.method5000() && this.field5921++ >= 18000) {
         this.remove();
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putBoolean("SkeletonTrap", this.method5000());
      var1.putInt("SkeletonTrapTime", this.field5921);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method5001(var1.getBoolean("SkeletonTrap"));
      this.field5921 = var1.getInt("SkeletonTrapTime");
   }

   @Override
   public boolean onDeathUpdate() {
      return true;
   }

   @Override
   public float getWaterSlowDown() {
      return 0.96F;
   }

   public boolean method5000() {
      return this.field5920;
   }

   public void method5001(boolean var1) {
      if (var1 != this.field5920) {
         this.field5920 = var1;
         if (!var1) {
            this.field5600.method20003(this.field5919);
         } else {
            this.field5600.addGoal(1, this.field5919);
         }
      }
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.SKELETON_HORSE.create(var1);
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (this.method4932()) {
         if (!this.isChild()) {
            if (!var1.method2851()) {
               if (!this.isBeingRidden()) {
                  if (!var5.isEmpty()) {
                     if (var5.getItem() == Items.field37886 && !this.method4943()) {
                        this.openGUI(var1);
                        return ActionResultType.method9002(this.world.isRemote);
                     }

                     ActionResultType var6 = var5.method32125(var1, this, var2);
                     if (var6.isSuccessOrConsume()) {
                        return var6;
                     }
                  }

                  this.method4920(var1);
                  return ActionResultType.method9002(this.world.isRemote);
               } else {
                  return super.method4285(var1, var2);
               }
            } else {
               this.openGUI(var1);
               return ActionResultType.method9002(this.world.isRemote);
            }
         } else {
            return super.method4285(var1, var2);
         }
      } else {
         return ActionResultType.field14820;
      }
   }
}
