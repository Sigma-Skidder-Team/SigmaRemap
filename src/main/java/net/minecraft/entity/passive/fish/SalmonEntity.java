package net.minecraft.entity.passive.fish;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class SalmonEntity extends AbstractGroupFishEntity {

    public SalmonEntity(EntityType<? extends SalmonEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public int getMaxGroupSize() {
      return 5;
   }

   @Override
   public ItemStack getFishBucket() {
      return new ItemStack(Items.SALMON_BUCKET);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.ENTITY_SALMON_AMBIENT;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.ENTITY_SALMON_DEATH;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.ENTITY_SALMON_HURT;
   }

   @Override
   public SoundEvent getFlopSound() {
      return SoundEvents.ENTITY_SALMON_FLOP;
   }
}
