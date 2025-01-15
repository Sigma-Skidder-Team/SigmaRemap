package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class Class1075 extends AbstractHorseEntity {
   private static String[] field5918;

   public Class1075(EntityType<? extends Class1075> var1, World var2) {
      super(var1, var2);
   }

   public static MutableAttribute method4998() {
      return method4951().method21849(Attributes.MAX_HEALTH, 15.0).method21849(Attributes.MOVEMENT_SPEED, 0.2F);
   }

   @Override
   public void method4925() {
      this.getAttribute(Attributes.HORSE_JUMP_STRENGTH).method38661(this.method4972());
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33506;
   }

   @Override
   public SoundEvent getAmbientSound() {
      super.getAmbientSound();
      return SoundEvents.field27289;
   }

   @Override
   public SoundEvent getDeathSound() {
      super.getDeathSound();
      return SoundEvents.field27290;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      super.getHurtSound(var1);
      return SoundEvents.field27291;
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.ZOMBIE_HORSE.create(var1);
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

   @Override
   public void method4929() {
   }
}
